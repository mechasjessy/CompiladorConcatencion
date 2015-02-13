
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Feb 13 08:27:02 COT 2015
//----------------------------------------------------

package analizadores;

import java_cup.runtime.*;
import java.io.FileReader;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Feb 13 08:27:02 COT 2015
  */
public class AnalizadorSintac extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public AnalizadorSintac() {super();}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintac(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintac(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\006\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\005\000\002\005\005\000\002\004\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\014\000\004\005\004\001\002\000\004\007\011\001" +
    "\002\000\006\002\uffff\005\uffff\001\002\000\006\002\010" +
    "\005\004\001\002\000\006\002\001\005\001\001\002\000" +
    "\004\002\000\001\002\000\006\004\ufffc\006\ufffc\001\002" +
    "\000\004\006\016\001\002\000\004\004\014\001\002\000" +
    "\004\007\011\001\002\000\004\006\ufffd\001\002\000\006" +
    "\002\ufffe\005\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\014\000\006\002\005\003\004\001\001\000\006\004" +
    "\012\005\011\001\001\000\002\001\001\000\004\003\006" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\004\014" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalizadorSintac$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalizadorSintac$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$AnalizadorSintac$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    
    /* Reporte de error encontrado. */
    public void report_error(String message, Object info) {
        StringBuilder m = new StringBuilder("Error");
        if (info instanceof java_cup.runtime.Symbol) {
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
            if (s.left >= 0) {                
                m.append(" in line "+(s.left+1));
                if (s.right >= 0)
                    m.append(", column "+(s.right+1));
            }
        }
	    if("#5".equals(info.toString())){
                message=("Revice PARENTESIS del INICIO");
            }
            if("#0".equals(info.toString())){
                message=("Revice PARENTESIS del FINAL");
            }
            if("#4".equals(info.toString())){
                message=("No hay como concatenar hay una sola palabra");
            }
            
        m.append(" : "+message);
        System.err.println(m);
    }

    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$AnalizadorSintac$actions {
  private final AnalizadorSintac parser;

  /** Constructor */
  CUP$AnalizadorSintac$actions(AnalizadorSintac parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintac$do_action(
    int                        CUP$AnalizadorSintac$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintac$parser,
    java.util.Stack            CUP$AnalizadorSintac$stack,
    int                        CUP$AnalizadorSintac$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalizadorSintac$result;

      /* select the action based on the action number */
      switch (CUP$AnalizadorSintac$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // palabra ::= PALABRA 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintac$stack.peek()).value;
		
                    RESULT = e;
                  
              CUP$AnalizadorSintac$result = parser.getSymbolFactory().newSymbol("palabra",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= palabra MAS palabra 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.elementAt(CUP$AnalizadorSintac$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.elementAt(CUP$AnalizadorSintac$top-2)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintac$stack.elementAt(CUP$AnalizadorSintac$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintac$stack.peek()).value;
		
				  System.out.print("Concatenado: "+e+v);
                  
              CUP$AnalizadorSintac$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.elementAt(CUP$AnalizadorSintac$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr_part ::= ABPARENT expr CEPARENT 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.elementAt(CUP$AnalizadorSintac$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.elementAt(CUP$AnalizadorSintac$top-1)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintac$stack.elementAt(CUP$AnalizadorSintac$top-1)).value;
		
				  System.out.println("");
                  
              CUP$AnalizadorSintac$result = parser.getSymbolFactory().newSymbol("expr_part",1, ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.elementAt(CUP$AnalizadorSintac$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr_list ::= expr_part 
            {
              Object RESULT =null;

              CUP$AnalizadorSintac$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr_list EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.elementAt(CUP$AnalizadorSintac$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.elementAt(CUP$AnalizadorSintac$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintac$stack.elementAt(CUP$AnalizadorSintac$top-1)).value;
		RESULT = start_val;
              CUP$AnalizadorSintac$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.elementAt(CUP$AnalizadorSintac$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$AnalizadorSintac$parser.done_parsing();
          return CUP$AnalizadorSintac$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr_list ::= expr_list expr_part 
            {
              Object RESULT =null;

              CUP$AnalizadorSintac$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.elementAt(CUP$AnalizadorSintac$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintac$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintac$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
