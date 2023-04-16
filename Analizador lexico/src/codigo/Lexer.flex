package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens

%{
    public String lexeme;
%}
%%
"int" { lexeme=yytext(); return TIPO; }
"float" { lexeme=yytext(); return TIPO; }
"bool" { lexeme=yytext(); return TIPO; }
"char" { lexeme=yytext(); return TIPO; }
"string" { lexeme=yytext(); return TIPO; }
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
"true" { lexeme=yytext(); return LITERAL_BOOL; }
"false" { lexeme=yytext(); return LITERAL_BOOL; }
"not" { lexeme=yytext(); return NEGACION; }
"++" { return OPERADOR_UNARIO; }
"--" { return OPERADOR_UNARIO; }
"+" { return OPERADOR; }
"-" { return OPERADOR; }
"*" { return OPERADOR; }
"/" { return OPERADOR; }
"%" { return OPERADOR; }
"(" { return PARENTESIS_ABIERTO; }
")" { return PARENTESIS_CERRADO; }
"{" { lexeme=yytext();return LLAVE_ABIERTA; }
"}" { lexeme=yytext();return LLAVE_CERRADA; }
"<" { return EXPRESION_RELACIONAL; }
"<=" { return EXPRESION_RELACIONAL; }
">" { return EXPRESION_RELACIONAL; }
">=" { return EXPRESION_RELACIONAL; }
"==" { return EXPRESION_RELACIONAL; }
"!=" { return EXPRESION_RELACIONAL; }
"^" { return OPERADOR_LOGICO; }
"#" { return OPERADOR_LOGICO; }
"!" { return NEGACION; }
"@" { return COMENTARIO_UNA_LINEA; }
"/" { return COMENTARIO_MULTI_LINEA; }
"," { return COMA; }
";" { return PUNTO_COMA; }
"=" { return IGUAL; }
[a-zA-Z_][a-zA-Z0-9_]* { lexeme=yytext(); return IDENTIFICADOR; }
("(-"[0-9]+".")|[0-9]+"."[0-9]+ { lexeme=yytext(); return LITERAL_FLOAT; }
[0-9]+ { lexeme=yytext(); return LITERAL_INT; }
"\"" [a-zA-Z]? "\"" { lexeme=yytext(); return LITERAL_CHAR; }
"\"" [a-zA-Z]* "\"" { lexeme=yytext(); return LITERAL_STRING; }
[ ,\t,\r,\n]+ { /* Ignore */ }
. { return ERROR; }


