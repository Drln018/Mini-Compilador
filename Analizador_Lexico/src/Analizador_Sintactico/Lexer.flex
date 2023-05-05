package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexeme=yytext(); return Comillas;}

/* Tipos de datos */
( byte | int | char | long | float | double ) {lexeme=yytext(); return T_dato;}

/* Tipo de dato String */
( String ) {lexeme=yytext(); return Cadena;}

/* Palabra reservada If */
( if ) {lexeme=yytext(); return If;}

/* Palabra reservada Else */
( else ) {lexeme=yytext(); return Else;}

/* Palabra reservada Do */
( do ) {lexeme=yytext(); return Do;}

/* Palabra reservada While */
( while ) {lexeme=yytext(); return While;}

/* Palabra reservada For */
( for ) {lexeme=yytext(); return For;}

/* Operador Igual */
( "=" ) {lexeme=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexeme=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexeme=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexeme=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {lexeme=yytext(); return Division;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexeme=yytext(); return Op_logico;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexeme = yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexeme = yytext(); return Op_incremento;}

/*Operadores Booleanos*/
(true | false)      {lexeme = yytext(); return Op_booleano;}

/* Parentesis de apertura */
( "(" ) {lexeme=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {lexeme=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {lexeme=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexeme=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexeme = yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexeme = yytext(); return Corchete_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexeme=yytext(); return Main;}

/* Punto y coma */
( ";" ) {lexeme=yytext(); return P_coma;}

/* Identificador */
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}

/* Identificador */
\${Identificador} { return token(yytext(), "IDENTIFICADOR", yyline, yycolumn); }

/* Tipos de dato */
número |
color { return token(yytext(), "TIPO_DATO", yyline, yycolumn); }

/* Número */
{Numero} { return token(yytext(), "NUMERO", yyline, yycolumn); }

/* Colores */
#[{Letra}{Digito}]{6} { return token(yytext(), "COLOR", yyline, yycolumn); }

/* Operadores de agrupación */
"(" { return token(yytext(), "PARENTESIS_A", yyline, yycolumn); }
")" { return token(yytext(), "PARENTESIS_C", yyline, yycolumn); }
"{" { return token(yytext(), "LLAVE_A", yyline, yycolumn); }
"}" { return token(yytext(), "LLAVE_C", yyline, yycolumn); }

/* Signos de puntuación */
"," { return token(yytext(), "COMA", yyline, yycolumn); }
";" { return token(yytext(), "PUNTO_COMA", yyline, yycolumn); }

/* Operador de asignación */
--> { return token (yytext(), "OP_ASIG", yyline, yycolumn); }

/* Movimiento */
adelante |
atrás |
izquierda |
derecha |
norte |
sur |
este |
oeste { return token(yytext(), "MOVIMIENTO", yyline, yycolumn); }

/* Pintar */
pintar { return token(yytext(), "PINTAR", yyline, yycolumn); }

/* Detener pintar */
detenerPintar { return token(yytext(), "DETENER_PINTAR", yyline, yycolumn); }

/* Tomar */
tomar |
poner { return token(yytext(), "TOMAR", yyline, yycolumn); }

/* Lanzar Moneda */
lanzarMoneda { return token(yytext(), "LANZAR_MONEDA", yyline, yycolumn); }

/* Ver */
izquierdaEsObstáculo |
izquierdaEsClaro |
izquierdaEsBaliza |
izquierdaEsBlanco |
izquierdaEsNegro |
frenteEsObstáculo |
frenteEsClaro |
frenteEsBaliza |
frenteEsBlanco |
frenteEsNegro |
derechaEsObstáculo |
derechaEsClaro |
derechaEsBaliza |
derechaEsBlanco |
derechaEsNegro { return token(yytext(), "VER", yyline, yycolumn); }

/* Repetir */
repetir |
repetirMientras { return token(yytext(), "REPETIR", yyline, yycolumn); }

/* Detener repetir */
interrumpir { return token(yytext(), "DETENER_REPETIR", yyline, yycolumn); }

/* Estructura si */
si |
sino { return token(yytext(), "ESTRUCTURA_SI", yyline, yycolumn); }

/* Operadores lógicos */
"&" |
"|" { return token(yytext(), "OP_LOGICO", yyline, yycolumn); }

/* Final */
final { return token(yytext(), "FINAL", yyline, yycolumn); }

/* Errores */
// Número erróneo
0 {Numero}+ { return token(yytext(), "ERROR_1", yyline, yycolumn); }
// Identificador sin $
{Identificador} { return token(yytext(), "ERROR_2", yyline, yycolumn); }

