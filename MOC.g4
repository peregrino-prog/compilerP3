// MOC.g4

grammar MOC;

// Palavras-chave
INT : 'int' ;
DOUBLE : 'double' ;
VOID : 'void' ;
READ : 'read' ;
READC : 'readc' ;
READS : 'reads' ;
WRITE : 'write' ;
WRITEC : 'writec' ;
WRITEV : 'writev' ;
WRITES : 'writes' ;
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
FOR : 'for' ;

// Operadores
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
MOD : '%' ;
ASSIGN : '=' ;

// Delimitadores
LPAREN : '(' ;
RPAREN : ')' ;
LBRACE : '{' ;
RBRACE : '}' ;
SEMI : ';' ;
COMMA : ',' ;

// Identificadores e números
ID : [a-zA-Z][a-zA-Z0-9]* ;
NUM_INT : [0-9]+ ;
NUM_DOUBLE : [0-9]+ '.' [0-9]+ ;

// Ignorar espaços e comentários
WS : [ \t\r\n]+ -> skip ;
LINE_COMMENT : '/*' .*? '*/' -> skip ;

// Programa principal
programa : decls main ;

// Declarações
decls : (decl SEMI)* ;

// Declaração de variáveis
decl : tipo listaVar ;

tipo : INT | DOUBLE ;

listaVar : varInit (COMMA varInit)* ;

varInit : ID (ASSIGN expr)? ;

// Função main obrigatória
main : VOID 'main' LPAREN VOID RPAREN bloco ;

// Bloco de instruções
bloco : LBRACE (instr)* RBRACE ;

// Instruções
instr : atribuicao SEMI
      | leitura SEMI
      | escrita SEMI
      | ifelse
      | whileloop
      | forloop
      ;

// Atribuição
atribuicao : ID ASSIGN expr ;

// Leitura
leitura : ID ASSIGN (READ LPAREN RPAREN 
                   | READC LPAREN RPAREN 
                   | READS LPAREN RPAREN ) ;

// Escrita
escrita : (WRITE | WRITEC | WRITEV | WRITES) LPAREN expr RPAREN ;

// Estruturas de controlo
ifelse : IF LPAREN condicao RPAREN bloco (ELSE bloco)? ;

whileloop : WHILE LPAREN condicao RPAREN bloco ;

forloop : FOR LPAREN atribuicao SEMI condicao SEMI atribuicao RPAREN bloco ;

// Condições
condicao : expr (OPCOND expr)? ;

OPCOND : '==' | '!=' | '<' | '<=' | '>' | '>=' ;

// Expressões
expr : expr op= (ADD | SUB) expr
     | expr op= (MUL | DIV | MOD) expr
     | LPAREN expr RPAREN
     | ID
     | NUM_INT
     | NUM_DOUBLE
     | readFunc
     ;
readFunc : READ LPAREN RPAREN
          | READC LPAREN RPAREN
          | READS LPAREN RPAREN
          ;       
    

// Fim do parser