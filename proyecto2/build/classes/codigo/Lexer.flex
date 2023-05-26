package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens

%{
    public String lexeme;
%}
%%
"int" { lexeme=yytext(); return INT; }
"float" { lexeme=yytext(); return FLOAT; }
"bool" { lexeme=yytext(); return BOOL; }
"char" { lexeme=yytext(); return CHAR; }
"string" { lexeme=yytext(); return STRING; }
"if" { lexeme=yytext(); return IF; }
"elif" { lexeme=yytext(); return ELIF; }
"else" { lexeme=yytext(); return ELSE; }
"while" { lexeme=yytext(); return WHILE; }
"for" { lexeme=yytext(); return FOR; }
"do" { lexeme=yytext(); return DO; }
"return" { lexeme=yytext(); return RETURN; }
"read" { lexeme=yytext(); return LECTURA; }
"print" { lexeme=yytext(); return ESCRITURA; }
"main" { lexeme=yytext(); return MAIN; }
"true" { lexeme=yytext(); return TRUE; }
"break" { lexeme=yytext(); return BREAK; }
"false" { lexeme=yytext(); return FALSE; }
"not" { lexeme=yytext(); return NEGACION; }
"++" {  lexeme=yytext(); return OPERADOR_UNARIO; }
"--" { lexeme=yytext(); return OPERADOR_UNARIO; }
"+" { lexeme=yytext(); return SUMA; }
"-" { lexeme=yytext(); return RESTA; }
"\n" { lexeme=yytext(); return LINEA; }
"[" { lexeme=yytext(); return CORCHETE_ABIERTO; }
"]" { lexeme=yytext(); return CORCHETE_CERRADO; }
"*" { lexeme=yytext(); return MULTIPLICACION; }
"/" { lexeme=yytext(); return DIVISION; }
"**" { lexeme=yytext(); return POTENCIA; }
"~" { lexeme=yytext(); return MODULO; }
"(" { lexeme=yytext(); return PARENTESIS_ABIERTO; }
")" { lexeme=yytext(); return PARENTESIS_CERRADO; }
"{" { lexeme=yytext(); return LLAVE_ABIERTA; }
"}" { lexeme=yytext(); return LLAVE_CERRADA; }
"<" { lexeme=yytext(); return MENOR_QUE; }
"<=" { lexeme=yytext(); return MENOR_IGUAL; }
">" { lexeme=yytext(); return MAYOR_QUE; }
">=" { lexeme=yytext(); return MAYOR_IGUAL; }
"==" { lexeme=yytext(); return IGUALES; }
"!=" { lexeme=yytext(); return DIFERENTES; }
"^" { lexeme=yytext(); return CONJUNCION; }
"#" { lexeme=yytext(); return DISYUNCION; }
"!" { lexeme=yytext(); return NEGACION; }
"not" { lexeme=yytext(); return NEGACION; }
"," { lexeme=yytext(); return COMA; }
"$" { lexeme=yytext(); return DOLAR; }
";" { lexeme=yytext(); return PUNTO_COMA; }
"=" { lexeme=yytext(); return IGUAL; }
"@[^\n]*\n" { lexeme=yytext(); return COMENTARIO_LINEA; }
"/_" [^_]* "_/" {  lexeme=yytext(); return COMENTARIO_BLOQUE; }
@[^\n]* {  lexeme=yytext(); return COMENTARIO_LINEA; }
[a-zA-Z_][a-zA-Z0-9_]* { lexeme=yytext(); return IDENTIFICADOR; }
("(-"[0-9]+".")|[0-9]+"."[0-9]+ { lexeme=yytext(); return LITERAL_FLOAT; }
[0-9]+ { lexeme=yytext(); return LITERAL_INT; }
\'([^\'\\]|\\.)\' { lexeme=yytext(); return LITERAL_CHAR; }
\"([^\"\\]|\\.)*\" { lexeme=yytext(); return LITERAL_STRING; }
[ \t\r\n]+ { /* Ignore */ }
. { return ERROR; }