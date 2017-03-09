
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\064\000\002\014\004\000\002\002\004\000\002\014" +
    "\003\000\002\011\007\000\002\011\014\000\002\012\003" +
    "\000\002\012\007\000\002\013\003\000\002\013\002\000" +
    "\002\015\005\000\002\015\003\000\002\016\005\000\002" +
    "\016\002\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\006\007\000\002\006\012\000\002\006\014" +
    "\000\002\006\005\000\002\007\005\000\002\007\005\000" +
    "\002\007\003\000\002\026\005\000\002\025\005\000\002" +
    "\025\003\000\002\025\002\000\002\024\005\000\002\024" +
    "\004\000\002\024\007\000\002\030\005\000\002\030\003" +
    "\000\002\032\005\000\002\027\005\000\002\027\003\000" +
    "\002\027\002\000\002\031\003\000\002\031\003\000\002" +
    "\010\003\000\002\010\003\000\002\010\003\000\002\010" +
    "\003\000\002\010\003\000\002\023\003\000\002\017\003" +
    "\000\002\017\003\000\002\021\003\000\002\021\003\000" +
    "\002\022\003\000\002\022\003\000\002\020\003\000\002" +
    "\020\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\144\000\006\046\007\047\004\001\002\000\004\005" +
    "\135\001\002\000\010\002\133\046\007\047\004\001\002" +
    "\000\004\035\011\001\002\000\004\035\ufffc\001\002\000" +
    "\010\002\uffff\046\uffff\047\uffff\001\002\000\010\005\015" +
    "\026\ufff9\036\ufff9\001\002\000\006\026\123\036\122\001" +
    "\002\000\010\005\015\026\ufffa\036\ufffa\001\002\000\010" +
    "\005\ufff3\026\ufff3\036\ufff3\001\002\000\004\025\020\001" +
    "\002\000\004\007\017\001\002\000\010\005\ufff2\026\ufff2" +
    "\036\ufff2\001\002\000\020\014\021\015\034\016\022\020" +
    "\027\021\033\023\023\027\026\001\002\000\014\006\uffd1" +
    "\007\uffd1\024\uffd1\034\uffd1\040\uffd1\001\002\000\014\006" +
    "\uffd4\007\uffd4\024\uffd4\034\uffd4\040\uffd4\001\002\000\004" +
    "\037\073\001\002\000\014\006\uffd3\007\uffd3\024\uffd3\034" +
    "\uffd3\040\uffd3\001\002\000\014\006\uffd2\007\uffd2\024\uffd2" +
    "\034\uffd2\040\uffd2\001\002\000\004\037\054\001\002\000" +
    "\014\006\uffce\007\uffce\024\uffce\034\uffce\040\uffce\001\002" +
    "\000\012\006\uffd6\007\uffd6\024\uffd6\040\uffd6\001\002\000" +
    "\014\006\uffd5\007\uffd5\024\uffd5\034\uffd5\040\uffd5\001\002" +
    "\000\006\006\035\007\uffee\001\002\000\014\006\uffd0\007" +
    "\uffd0\024\uffd0\034\uffd0\040\uffd0\001\002\000\014\006\uffcf" +
    "\007\uffcf\024\uffcf\034\uffcf\040\uffcf\001\002\000\010\033" +
    "\042\044\036\045\040\001\002\000\030\007\uffdd\010\uffdd" +
    "\011\uffdd\012\uffdd\013\uffdd\022\uffdd\024\uffdd\025\uffdd\034" +
    "\uffdd\036\uffdd\042\uffdd\001\002\000\016\007\ufff1\010\047" +
    "\011\050\012\044\013\051\022\046\001\002\000\030\007" +
    "\uffdc\010\uffdc\011\uffdc\012\uffdc\013\uffdc\022\uffdc\024\uffdc" +
    "\025\uffdc\034\uffdc\036\uffdc\042\uffdc\001\002\000\020\007" +
    "\uffeb\010\uffeb\011\uffeb\012\uffeb\013\uffeb\022\uffeb\034\uffeb" +
    "\001\002\000\010\033\042\044\036\045\040\001\002\000" +
    "\016\010\047\011\050\012\044\013\051\022\046\034\045" +
    "\001\002\000\010\033\uffd9\044\uffd9\045\uffd9\001\002\000" +
    "\020\007\uffec\010\uffec\011\uffec\012\uffec\013\uffec\022\uffec" +
    "\034\uffec\001\002\000\010\033\uffd7\044\uffd7\045\uffd7\001" +
    "\002\000\010\033\uffdb\044\uffdb\045\uffdb\001\002\000\010" +
    "\033\uffda\044\uffda\045\uffda\001\002\000\010\033\uffd8\044" +
    "\uffd8\045\uffd8\001\002\000\010\033\042\044\036\045\040" +
    "\001\002\000\020\007\uffed\010\047\011\050\012\044\013" +
    "\051\022\046\034\uffed\001\002\000\014\014\021\015\034" +
    "\016\022\020\027\021\033\001\002\000\004\040\056\001" +
    "\002\000\004\006\057\001\002\000\006\031\060\041\062" +
    "\001\002\000\004\005\071\001\002\000\004\007\uffe2\001" +
    "\002\000\012\024\uffde\042\uffde\044\036\045\040\001\002" +
    "\000\004\007\ufff0\001\002\000\006\024\066\042\067\001" +
    "\002\000\006\024\uffdf\042\uffdf\001\002\000\006\044\036" +
    "\045\040\001\002\000\004\007\uffe3\001\002\000\006\024" +
    "\uffe0\042\uffe0\001\002\000\004\031\072\001\002\000\004" +
    "\007\uffe1\001\002\000\014\014\021\015\034\016\022\020" +
    "\027\021\033\001\002\000\004\024\075\001\002\000\014" +
    "\014\021\015\034\016\022\020\027\021\033\001\002\000" +
    "\004\040\077\001\002\000\004\006\100\001\002\000\004" +
    "\035\102\001\002\000\004\007\uffef\001\002\000\014\024" +
    "\uffe7\035\106\036\uffe7\044\036\045\040\001\002\000\006" +
    "\024\uffe8\036\uffe8\001\002\000\006\024\117\036\116\001" +
    "\002\000\004\025\114\001\002\000\010\036\107\044\036" +
    "\045\040\001\002\000\006\024\uffe5\036\uffe5\001\002\000" +
    "\004\025\111\001\002\000\006\044\036\045\040\001\002" +
    "\000\004\036\113\001\002\000\006\024\uffe4\036\uffe4\001" +
    "\002\000\006\044\036\045\040\001\002\000\006\024\uffe6" +
    "\036\uffe6\001\002\000\004\007\uffea\001\002\000\010\035" +
    "\106\044\036\045\040\001\002\000\006\024\uffe9\036\uffe9" +
    "\001\002\000\010\005\ufff4\026\ufff4\036\ufff4\001\002\000" +
    "\004\007\132\001\002\000\004\005\124\001\002\000\004" +
    "\007\125\001\002\000\004\036\126\001\002\000\004\025" +
    "\127\001\002\000\014\014\021\015\034\016\022\020\027" +
    "\021\033\001\002\000\004\007\131\001\002\000\010\002" +
    "\ufffd\046\ufffd\047\ufffd\001\002\000\010\002\ufffe\046\ufffe" +
    "\047\ufffe\001\002\000\004\002\000\001\002\000\010\002" +
    "\001\046\001\047\001\001\002\000\004\033\136\001\002" +
    "\000\010\005\137\024\ufff5\034\ufff5\001\002\000\004\025" +
    "\145\001\002\000\006\024\142\034\143\001\002\000\006" +
    "\024\ufff7\034\ufff7\001\002\000\010\005\137\024\ufff5\034" +
    "\ufff5\001\002\000\004\035\ufffb\001\002\000\006\024\ufff8" +
    "\034\ufff8\001\002\000\014\014\021\015\034\016\022\020" +
    "\027\021\033\001\002\000\006\024\ufff6\034\ufff6\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\144\000\010\011\007\012\005\014\004\001\001\000" +
    "\002\001\001\000\006\011\133\012\005\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\012\002" +
    "\012\003\013\006\015\013\011\001\001\000\002\001\001" +
    "\000\006\003\120\006\015\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\014" +
    "\017\027\020\024\021\030\022\023\023\031\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\007\036\031" +
    "\040\001\001\000\002\001\001\000\004\010\051\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\007\042\031" +
    "\040\001\001\000\004\010\051\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\007\052\031\040" +
    "\001\001\000\004\010\051\001\001\000\014\017\027\020" +
    "\024\021\030\022\023\023\054\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\030\062\032\060\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\027\063\031\064" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\031\067\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\014\017" +
    "\027\020\024\021\030\022\023\023\073\001\001\000\002" +
    "\001\001\000\014\017\027\020\024\021\030\022\023\023" +
    "\075\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\026\100\001\001\000\002\001\001\000\010\024\102\025" +
    "\103\031\104\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\031\107\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\031\111\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\031\114\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\024\117\031\104" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\014\017\027\020\024\021\030\022" +
    "\023\023\127\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\015\137\016\140\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\016" +
    "\143\001\001\000\002\001\001\000\002\001\001\000\012" +
    "\017\145\020\024\021\030\022\023\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
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
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return lexer.next_token(); 
    }



    public boolean syntaxErrors;
    public void syntax_error(Symbol current_token) {
        report_error(
            "Syntax error at line " + (current_token.left+1) + ", column "
    + current_token.right + "\n", null
        );
    }

  private boolean debug = false;
  public boolean  debug()         {return debug;}
  public void     debug(boolean b){debug = b;}

  static class Node {
    public ArrayList<Node> children;
    private static int globalCounter = 0;

    public int counter;
    private Object value;

    public Node(Object value){
      Node.globalCounter += 1;
      this.counter = Node.globalCounter;
      this.value = value;
      this.children = new ArrayList<Node>();
    }

    public void addChild(Node n){ children.add(n); }

    public String toString(){
      String ret = "";
      ret += String.format("%d [label=\"%s\"];\n",
                            counter, value.toString());
      for(Node n: children){
        ret += String.format("%d -> %d;\n", this.counter, n.counter);
        ret += n.toString();
      }
      return ret;
    }
  }

  private Lexer lexer;

  public Parser(Lexer lex) {
    super(lex);
    lexer = lex;
  }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // methods ::= methods method_declaration 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("methods",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= methods EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // methods ::= method_declaration 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("methods",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // method_declaration ::= method_header LPAREN_CURLY method_body RPAREN_CURLY SEMICOL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("method_declaration",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // method_declaration ::= method_header LPAREN_CURLY method_body RETURN IDENTIFIER SEMICOL RPAREN_CURLY COL type SEMICOL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("method_declaration",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // method_header ::= MAIN_FUNC 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("method_header",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // method_header ::= METHOD_DECLARATOR IDENTIFIER LPAREN parameter_list RPAREN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("method_header",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // method_body ::= statements 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("method_body",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // method_body ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("method_body",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // parameter_list ::= parameter_list COMMA parameter 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameter_list",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // parameter_list ::= parameter 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameter_list",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // parameter ::= IDENTIFIER COL primitive_type 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameter",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // parameter ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameter",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // statements ::= statements statement 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statements",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // statements ::= statement 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statements",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // statement ::= full_exp SEMICOL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // full_exp ::= IDENTIFIER COL type EQUAL simple_exp 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("full_exp",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // full_exp ::= IDENTIFIER COL SEQ LPAREN_TRI type RPAREN_TRI EQUAL array 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("full_exp",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // full_exp ::= IDENTIFIER COL DICT LPAREN_TRI type COMMA type RPAREN_TRI EQUAL dictionary_structure 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("full_exp",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // full_exp ::= IDENTIFIER COL type 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("full_exp",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // simple_exp ::= simple_exp operator_binary simple_exp 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // simple_exp ::= LPAREN simple_exp RPAREN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // simple_exp ::= value 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // dictionary_structure ::= LPAREN_CURLY dictionary_list RPAREN_CURLY 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("dictionary_structure",20, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // dictionary_list ::= dictionary_list COMMA dictionary_value 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("dictionary_list",19, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // dictionary_list ::= dictionary_value 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("dictionary_list",19, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // dictionary_list ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("dictionary_list",19, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // dictionary_value ::= value COL value 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("dictionary_value",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // dictionary_value ::= LPAREN_CURLY RPAREN_CURLY 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("dictionary_value",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // dictionary_value ::= LPAREN_CURLY value COL value RPAREN_CURLY 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("dictionary_value",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // array ::= LPAREN_SQ list RPAREN_SQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("array",22, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // array ::= string 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("array",22, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // string ::= QUOTE IDENTIFIER QUOTE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("string",24, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // list ::= list COMMA value 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("list",21, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // list ::= value 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("list",21, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // list ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("list",21, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // value ::= INTEGER_LITERAL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",23, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // value ::= CHARACTER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",23, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // operator_binary ::= PLUS 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator_binary",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // operator_binary ::= MINUS 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator_binary",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // operator_binary ::= MULT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator_binary",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // operator_binary ::= DIV 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator_binary",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // operator_binary ::= POW 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator_binary",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // type ::= primitive_type 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // primitive_type ::= numeric_type 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("primitive_type",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // primitive_type ::= BOOL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("primitive_type",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // numeric_type ::= integer_type 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("numeric_type",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // numeric_type ::= floating_point_type 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("numeric_type",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // integer_type ::= INT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("integer_type",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // integer_type ::= CHAR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("integer_type",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // floating_point_type ::= FLOAT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("floating_point_type",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // floating_point_type ::= RAT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("floating_point_type",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}