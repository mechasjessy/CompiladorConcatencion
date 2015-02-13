/*Codigo de Usuario*/

package analizadores;
import java_cup.runtime.*;
import java.io.Reader;
      
%% //inicio nueva seccion
   
/*Seccion de opciones y declaraciones de JFlex */  
   
/*  
    %class AnalizadorLexico = Colocamos el nombre de la clase java con
                              que se va a crear el Analizador Lexico
    Activar el contador de lineas, variable yyline
    Activar el contador de columna, variable yycolumn
*/
%class AnalizadorLexico
%line
%column  
%cup
   
%{
   
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}
   
Salto = \r|\n|\r\n
Espacio     = {Salto} | [ \t\f]
Dig = 0 | [1-9][0-9]*
Letras = [a-zA-Z_]

%% //fin de opciones
/*Seccion de reglas lexicas*/
   
<YYINITIAL> {
   
"+" {return new Symbol(sym.MAS);}
"(" {return new Symbol(sym.ABPARENT);}
")" {return new Symbol(sym.CEPARENT);}
({Letras}|{Dig})*{Letras} |({Letras}|{Dig})*{Dig} {return symbol(sym.PALABRA, new String(yytext()));}
{Espacio} { /* ignora el espacio */ }
}
[^]    { throw new Error("Caracter ilegal <"+yytext()+">"); }
