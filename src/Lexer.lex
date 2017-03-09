import java_cup.runtime.*;

%%
%class Lexer
%unicode
%cup
%line
%column

%{
  private boolean debug_mode;
  public  boolean debug()            { return debug_mode; }
  public  void    debug(boolean mode){ debug_mode = mode; }

  private void print_lexeme(int type, Object value){
    if(!debug()){ return; }

    System.out.print("<");
    switch(type){
      case sym.INT:
        System.out.print("INT"); break;
      case sym.BOOL:
        System.out.print("BOOL"); break;
      case sym.RAT:
        System.out.print("RAT"); break;
      case sym.CHAR:
        System.out.print("CHAR"); break;
      case sym.TOP:
        System.out.print("TOP"); break;
      case sym.FLOAT:
        System.out.print("FLOAT"); break;
      case sym.EQUAL:
        System.out.print(":="); break;
      case sym.SEMICOL:
        System.out.print(";"); break;
      case sym.PLUS:
        System.out.print("+"); break;
      case sym.MINUS:
        System.out.print("-"); break;
      case sym.MULT:
        System.out.print("*"); break;
      case sym.DIV:
        System.out.print("/"); break;
      case sym.LPAREN:
        System.out.print("("); break;
      case sym.RPAREN:
        System.out.print(")"); break;
      case sym.INTEGER:
        System.out.printf("INT %d", value); break;
      case sym.IDENTIFIER:
        System.out.printf("IDENT %s", value); break;
    }
    System.out.print(">  ");
  }

  private Symbol symbol(int type) {
    print_lexeme(type, null);
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    print_lexeme(type, value);
    return new Symbol(type, yyline, yycolumn, value);
  }

%}

Whitespace = \r|\n|\r\n|" "|"\t"
Comment = "/#" [^#] ~"#/" | "/#" "#"+ "/"
Letter = [a-zA-Z]

Digit = [0-9]
IdChar = {Letter} | {Digit} | "_"
Identifier = {Letter}{IdChar}*
Integer = [-+]?(0|[1-9]{Digit}*)

%%

<YYINITIAL>   "main"  { return symbol(sym.MAIN_FUNC);    }
<YYINITIAL>   "fdef"  { return symbol(sym.METHOD_DECLARATOR);    }
<YYINITIAL>   "int"  { return symbol(sym.INT);    }
<YYINITIAL>   "bool"  { return symbol(sym.BOOL);    }
<YYINITIAL>   "rat"  { return symbol(sym.RAT);    }
<YYINITIAL>   "float"  { return symbol(sym.FLOAT);    }
<YYINITIAL>   "char"  { return symbol(sym.CHAR);    }
<YYINITIAL>   "top"  { return symbol(sym.TOP);    }
<YYINITIAL>   "dict"  { return symbol(sym.DICT);    }
<YYINITIAL>   "return"  { return symbol(sym.RETURN);    }
<YYINITIAL>   "seq"  { return symbol(sym.SEQ);    }
<YYINITIAL>   "alias"  { return symbol(sym.ALIAS);    }


<YYINITIAL> {

  {Integer}     { return symbol(sym.INTEGER_LITERAL,
                                Integer.parseInt(yytext())); }
  {Identifier}  { return symbol(sym.IDENTIFIER, yytext());   }

  {Whitespace}  { /* do nothing */               }
  {Comment}     { /* do nothing */               }
  "#".*         { /* do nothing */               }
  ":="          { return symbol(sym.EQUAL);      }
  ";"           { return symbol(sym.SEMICOL);    }
  ":"           { return symbol(sym.COL);    }
  "+"           { return symbol(sym.PLUS);       }
  "-"           { return symbol(sym.MINUS);      }
  "^"           { return symbol(sym.POW);        }
  "*"           { return symbol(sym.MULT);       }
  "/"           { return symbol(sym.DIV);        }
  "("           { return symbol(sym.LPAREN);     }
  ")"           { return symbol(sym.RPAREN);     }

  "<"           { return symbol(sym.LPAREN_TRI);     }
  ">"           { return symbol(sym.RPAREN_TRI);     }
  "["           { return symbol(sym.LPAREN_SQ);     }
  "]"           { return symbol(sym.RPAREN_SQ);     }

   ","          { return symbol(sym.COMMA);      }
   "{"         { return symbol(sym.LPAREN_CURLY);     }
   "}"         { return symbol(sym.RPAREN_CURLY);     }
}

[^]  {
  System.out.println("file:" + (yyline+1) +
    ":0: Error: Invalid input '" + yytext()+"'");
  return symbol(sym.BADCHAR);
}

