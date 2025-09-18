==============================
 COMPILADOR P3
=================

Autor: Ricardo Farinha Gomes da Silva

Descrição:
------------------------------
Este projeto consiste na construção de um compilador para a linguagem **MOCC (Mini-Orientada a Código Compilado)**, 
definida no livro *Computer Architecture: Digital Circuits to Microprocessors* de Guilherme Arroz e José Monteiro.

O compilador foi implementado em **Java** com recurso à ferramenta **ANTLR v4.13.2**.  
Realiza a análise léxica, sintática e a geração de código intermédio (**TAC – Three Address Code**), 
suportando variáveis, expressões aritméticas, leitura, escrita e estruturas de controlo (`if`, `while`, `for`).  

O destino final é a geração de **código Assembly P3**, totalmente compatível com um simulador, por exemplo **[P3JS](https://github.com/goncalobaltzar/p3js)**, 
que é um assembler e simulador open source para o processador P3 que corre diretamente no browser ou em Node.js.

## Principais Funcionalidades
- Análise léxica e sintática com ANTLR.
- Análise semântica via Visitor.
- Geração de **Three Address Code (TAC)**.
- Otimização básica de código.
- Backend para **Assembly P3** (simulado no P3JS).

## Exemplo de utilização
```bash
# Compilar
javac -cp .:antlr-4.13.2-complete.jar src/*.java

# Executar compilador
java -cp .:antlr-4.13.2-complete.jar src/MainMOC examples/exemplo1.moc > out.asm

# Simular no P3JS
# Abrir o P3JS no browser e carregar out.asm

Conteúdo do Projeto
------------------------------------------

Este projeto implementa um compilador funcional para a linguagem **MOCC**, dividido em várias fases:

1. **Análise Léxica e Sintática** com ANTLR  
2. **Verificação Semântica** com visitante próprio  
3. **Geração de Código Intermédio (TAC)**  
4. **Geração de Código Final para Assembly P3**

---

Estrutura de Pastas relevantes para este fólio
----------------------------------------------------

eFolioG
│
├── MOC.g4                  # Gramática ANTLR da linguagem MOC
├── MOCLexer.java           # Lexer gerado
├── MOCParser.java          # Parser gerado
├── MOCVisitorImpl.java     # Visitante semântico (com validações)
├── CodeGenP3.java          # Gerador de código assembly P3
├── MainMOC.java            # Classe principal do compilador
├── ProgramasExemplo/       # Programas de teste (.moc)
│   ├── exemplo_if.moc
│   ├── exemplo_while.moc
│   └── exemplo_read_write.moc
│   
│
├── programa.as             # Código Assembly P3 gerado
└── README.txt


Testes Realizados
--------------------------------------------------------------------------
Os seguintes exemplos foram testados com sucesso:

---------------------------------------------------------------------------------
Programa	              Descrição	                      Funcional
--------------------------------------------------------------------------------
exemplo_if.moc	          Instrução if (a > b)	                Sim
exemplo_while.moc	  Ciclo while (i <= 5)	                Sim
exemplo_read_write.moc	  Leitura e escrita com read/write	Simulado
--------------------------------------------------------------------------

========================================================================================
O resultado final de cada programa pode ser visualizado no simulador online P3JS:
https://p3js.goncalomb.com
===============================================================

Requisitos
------------------------------------------------------
Java 8 ou superior

ANTLR 4.13.2 (antlr-4.13.2-complete.jar)
Download do ANTLR:
https://www.antlr.org/download/antlr-4.13.2-complete.jar

Editor de texto (VSCode recomendado)



Compilar e correr
---------------------------------------------------------------
1. Gerar os ficheiros ANTLR
antlr4 MOC.g4
javac MOC*.java

2. Compilar o projeto
javac -cp ".;C:\javalib\antlr-4.13.2-complete.jar" *.java

3. Executar o compilador
java -cp ".;C:\javalib\antlr-4.13.2-complete.jar" MainMOC ProgramasExemplo/exemplo.moc
java -cp ".;C:\javalib\antlr-4.13.2-complete.jar" MainMOC ProgramasExemplo/exemplo_if.moc
java -cp ".;C:\javalib\antlr-4.13.2-complete.jar" MainMOC ProgramasExemplo/exemplo_while.moc
java -cp ".;C:\javalib\antlr-4.13.2-complete.jar" MainMOC ProgramasExemplo/exemplo_read_write.moc


Notas sobre read() e write()
-------------------------------------------------------------------------------
Devido às limitações do simulador P3JS, as instruções read e write foram simuladas da seguinte forma:

read(x) --> MOV R1, 7 (valor fixo simulado) --> MOV M[x], R1

write(expr) --> resultado é colocado em R1 (valor visível no simulador)

Estas instruções não geram READ nem WRITE reais, uma vez que o P3JS não os suporta. O valor final é observado diretamente no registo R1.



Limitações e opções de projecto
-----------------------------------------------------------------------------
Não foi implementada geração de código intermédio para read()/write()

Estas instruções foram geridas diretamente no CodeGenP3.java

A escolha por simulação direta garantiu compatibilidade total com o simulador P3JS e simplicidade de testes



Conclusão
-------------------------------------------------------------------
O compilador desenvolvido cobre todas as fases essenciais:

Análise léxica e sintática com ANTLR

Verificação semântica mínima (com detecção de erros)

Geração funcional de código P3 para ciclos, condições e I/O simulada


Criação de ficheiro executável (.jar)
---------------------------------------------------------------
Para permitir testes em ambientes sem recompilação Java, o compilador está empacotado num ficheiro executável `compilador-moc.jar`.

1. Compilar os ficheiros Java:
   javac -cp ".;C:\javalib\antlr-4.13.2-complete.jar" *.java

2. Criar um ficheiro MANIFEST.MF com o conteúdo:
   Main-Class: MainMOC
   Class-Path: antlr-4.13.2-complete.jar

   (Terminar com uma linha em branco.)

3. Gerar o `.jar` executável:
   jar cfm compilador-moc.jar MANIFEST.MF *.class

4. Executar:
   java -cp "compilador-moc.jar;antlr-4.13.2-complete.jar" MainMOC ProgramasExemplo/exemplo_if.moc

Este método garante portabilidade do compilador, mesmo sem recompilação manual.
