//   CodeGenP3.java

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CodeGenP3 {
    private Set<String> variaveis = new TreeSet<>();

    public void emitirPrograma(List<String> tac, String ficheiroSaida) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ficheiroSaida))) {

            // Cabeçalho de dados
            writer.write(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n");
            writer.write("; ZONA DE DADOS\n");
            writer.write(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n");
            writer.write("ORIG 8000h\n");

            // Recolhe variáveis
            for (String linha : tac) {
                extrairVariaveis(linha);
            }
            for (String var : variaveis) {
                writer.write(var + " WORD 0\n");
            }

            writer.write("\n;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n");
            writer.write("; ZONA DE CÓDIGO\n");
            writer.write(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n");
            writer.write("ORIG 0000h\n");

            // Geração de código
            for (String linha : tac) {
                traduzirInstrucao(linha.trim(), writer);
            }

            // Fecha com loop infinito
            writer.write("FIM: BR FIM\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void extrairVariaveis(String linha) {
        String[] partes = linha.split("=");
        for (String parte : partes) {
            String[] tokens = parte.replaceAll("[+\\-*/%]", " ").split("\\s+");
            for (String t : tokens) {
                if (t.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
                    // Ignora rótulos e palavras-chave de controlo de fluxo
                    if (!t.equals("if") && !t.equals("goto") && !t.startsWith("L")
                        && !t.equals("IF_FALSE") && !t.equals("FIM")) {
                        variaveis.add(t);
                    }
                }
            }
        }
    }

    private void traduzirInstrucao(String linha, BufferedWriter writer) throws IOException {
        linha = linha.trim(); // remove espaços em branco

        if (linha.isEmpty()) return;


        // TRADUÇÃO PARA tX = READ()
        if (linha.matches("t\\d+ = READ\\(\\)")) {
            String destino = linha.split("=")[0].trim();
            writer.write("MOV R1, 7\n"); // simulação de leitura
            writer.write("MOV M[" + destino + "], R1\n");
            return;
        }


        if (linha.endsWith(":")) {
            if (linha.startsWith("WHILE_BEGIN")) {
                 writer.write("; início do while\n");
                writer.write("WHILE:\n");
            } else if (linha.trim().equalsIgnoreCase("Fim:")) {
                writer.write("FIM:\n");
            }
            return;
        }
        if (linha.startsWith("read(")) {
        // Extrai a variável: read(x)
            String var = linha.substring(linha.indexOf('(') + 1, linha.indexOf(')')).trim();
            writer.write("MOV R1, 7\n"); // simula input 
            writer.write("MOV M[" + var + "], R1\n");
            return;
        }

        if (linha.startsWith("write(")) {
            // Extrai a expressão: write(x + y)
            String expr = linha.substring(linha.indexOf('(') + 1, linha.indexOf(')')).trim();
            String[] tokens = expr.split(" ");

            if (tokens.length == 1) {
                String origem = tokens[0];
            if (origem.matches("\\d+")) {
            writer.write("MOV R1, " + origem + "\n");
            } else {
                writer.write("MOV R1, M[" + origem + "]\n");
            }
        } else if (tokens.length == 3) {
        String op1 = tokens[0], op = tokens[1], op2 = tokens[2];
        writer.write("MOV R1, " + (op1.matches("\\d+") ? op1 : "M[" + op1 + "]") + "\n");
        String instr = switch (op) {
            case "+" -> "ADD";
            case "-" -> "SUB";
            case "*" -> "MUL";
            case "/" -> "DIV";
            case "%" -> "MOD";
            default -> throw new IllegalArgumentException("Operador inválido: " + op);
        };
        writer.write(instr + " R1, " + (op2.matches("\\d+") ? op2 : "M[" + op2 + "]") + "\n");
    }

    // Não escreve WRITE — observação directa em R1
    return;
}


        if (linha.startsWith("if")) {
            // ex: if x > y goto L1
            String[] partes = linha.split(" ");
            String op1 = partes[1], op = partes[2], op2 = partes[3];
            String destino = "FIM";

            writer.write("MOV R1, M[" + op1 + "]\n");
            writer.write("CMP R1, M[" + op2 + "]\n");

            switch (op) {
                case "<"  -> writer.write("BR.N " + destino + "\n");
                case ">"  -> writer.write("BR.P " + destino + "\n");
                case "<=" -> writer.write("BR.NP " + destino + "\n");
                case ">=" -> writer.write("BR.ZP " + destino + "\n");
                case "==" -> writer.write("BR.Z " + destino + "\n");
                case "!=" -> writer.write("BR.NZ " + destino + "\n");
            }
            return;
        }

        if (linha.startsWith("IF_FALSE")) {
    String[] partes = linha.split(" ");
    String op1 = partes[1], op = partes[2], op2 = partes[3];
    String destino = "FIM";

    writer.write("MOV R1, M[" + op1 + "]\n");
    writer.write("CMP R1, " + (op2.matches("\\d+") ? op2 : "M[" + op2 + "]") + "\n");

    switch (op) {
        case "<=" -> writer.write("BR.P " + destino + "\n");
        case ">=" -> writer.write("BR.N " + destino + "\n");
        case ">"  -> {
            writer.write("BR.Z " + destino + "\n");
            writer.write("MOV R1, M[" + op1 + "]\n");
            writer.write("CMP R1, " + (op2.matches("\\d+") ? op2 : "M[" + op2 + "]") + "\n");
            writer.write("BR.N " + destino + "\n");
        }
        case "<"  -> {
            writer.write("BR.Z " + destino + "\n");
            writer.write("MOV R1, M[" + op1 + "]\n");
            writer.write("CMP R1, " + (op2.matches("\\d+") ? op2 : "M[" + op2 + "]") + "\n");
            writer.write("BR.P " + destino + "\n");
        }
        case "==" -> writer.write("BR.NZ " + destino + "\n");
        case "!=" -> writer.write("BR.Z "  + destino + "\n");
    }
    return;
}


       if (linha.startsWith("goto")) {
    String destino = linha.split(" ")[1];
    if (destino.equals("WHILE_BEGIN")) {
        writer.write("JMP WHILE\n"); // voltar ao início do ciclo
    } else {
        writer.write("JMP " + destino + "\n");
    }
    return;
}


        // ex: x = y + z
        String[] partes = linha.split("=");
        if (partes.length < 2) return; // segurança extra
        String destino = partes[0].trim();
        String expressao = partes[1].trim();

        String[] tokens = expressao.split(" ");
        if (tokens.length == 1) {
            String origem = tokens[0];
            if (origem.matches("\\d+")) {
                writer.write("MOV R1, " + origem + "\n");
            } else {
                writer.write("MOV R1, M[" + origem + "]\n");
            }
        } else if (tokens.length == 3) {
            String op1 = tokens[0], op = tokens[1], op2 = tokens[2];
            writer.write("MOV R1, " + (op1.matches("\\d+") ? op1 : "M[" + op1 + "]") + "\n");
            String instr = switch (op) {
                case "+" -> "ADD";
                case "-" -> "SUB";
                case "*" -> "MUL";
                case "/" -> "DIV";
                case "%" -> "MOD";
                default -> throw new IllegalArgumentException("Operador inválido: " + op);
            };
            writer.write(instr + " R1, " + (op2.matches("\\d+") ? op2 : "M[" + op2 + "]") + "\n");
        }

        writer.write("MOV M[" + destino + "], R1\n");
    }
}
