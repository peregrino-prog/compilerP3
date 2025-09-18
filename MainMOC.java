//MainMOC.java

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.List;

public class MainMOC {

    public static void main(String[] args) throws Exception {

        if (args.length < 1) {
            System.err.println("Erro: Indique o ficheiro .moc a testar.");
            return;
        }

        // Ler o ficheiro
        CharStream input = CharStreams.fromFileName(args[0]);

        // Lexer
        MOCLexer lexer = new MOCLexer(input);

        // Tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Parser
        MOCParser parser = new MOCParser(tokens);

        // Adicionar o ErrorListener personalizado
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListenerMOC());

        // Parse Tree
        ParseTree tree = parser.programa();

        // Visitante para análise semântica
        MOCVisitorImpl visitor = new MOCVisitorImpl();
        visitor.visit(tree);

        // Geração de código intermédio
        CodeGenFinal codeGen = new CodeGenFinal();
        MOCParser.ProgramaContext prog = (MOCParser.ProgramaContext) tree;
        codeGen.visitPrograma(prog);

        // Mostrar código intermédio
        System.out.println("Código Intermédio:");
        List<String> codigoIntermedio = codeGen.getCode();
        for (String line : codigoIntermedio) {
            System.out.println(line);
        }

        // Geração de código final em P3
        System.out.println("\nA gerar ficheiro P3...");
        CodeGenP3 geradorP3 = new CodeGenP3();
        geradorP3.emitirPrograma(codigoIntermedio, "programa.as");

        System.out.println("Ficheiro 'programa.as' gerado com sucesso.");
    }
}
