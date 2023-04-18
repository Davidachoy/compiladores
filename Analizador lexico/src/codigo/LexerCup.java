/* The following code was generated by JFlex 1.4.3 on 4/17/23, 6:34 PM */


package codigo;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/17/23, 6:34 PM from the specification file
 * <tt>C:/Users/david/OneDrive/Desktop/compiladores-main/Analizador lexico/src/codigo/LexerCup</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 51, 42,  0,  0, 51,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    51, 35, 50, 37, 39,  0,  0, 48, 28, 29, 25, 21, 38, 22, 46, 26, 
    45, 47, 47, 47, 47, 47, 47, 47, 47, 47,  0, 40, 32, 33, 34,  0, 
    41, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 
    44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 23, 49, 24, 36, 43, 
     0,  7,  8,  9, 16, 14,  4, 13, 10,  1, 44, 20,  5, 19,  2,  6, 
    18, 44, 11, 12,  3, 17, 44, 15, 44, 44, 44, 30,  0, 31, 27,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\16\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\1"+
    "\1\27\1\30\1\31\2\1\1\2\1\32\14\2\1\33"+
    "\2\2\1\34\1\35\1\30\1\36\2\0\1\37\1\40"+
    "\1\41\1\42\7\0\1\43\1\44\1\21\2\2\1\45"+
    "\14\2\3\0\1\46\1\47\1\50\2\2\1\51\1\2"+
    "\1\52\1\2\1\53\1\2\1\54\1\55\2\2\1\56"+
    "\1\27\1\46\1\0\1\57\1\60\1\61\2\2\1\62"+
    "\1\63\1\0\1\64\1\65\1\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[127];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8\0\u030c"+
    "\0\u0340\0\u0374\0\64\0\64\0\u03a8\0\u03dc\0\64\0\u0410"+
    "\0\64\0\64\0\64\0\u0444\0\u0478\0\u04ac\0\u04e0\0\64"+
    "\0\64\0\64\0\64\0\64\0\u0514\0\u0548\0\u057c\0\u05b0"+
    "\0\u05e4\0\u0618\0\u064c\0\u0138\0\u0680\0\u06b4\0\u06e8\0\u071c"+
    "\0\u0750\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888\0\u08bc"+
    "\0\u0138\0\u08f0\0\u0924\0\64\0\64\0\u0958\0\64\0\u098c"+
    "\0\u09c0\0\64\0\64\0\64\0\64\0\u09f4\0\u057c\0\u0a28"+
    "\0\u0a5c\0\u0a90\0\u0618\0\u0ac4\0\64\0\u0138\0\u0138\0\u0af8"+
    "\0\u0b2c\0\u0138\0\u0b60\0\u0b94\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64"+
    "\0\u0c98\0\u0ccc\0\u0d00\0\u0d34\0\u0d68\0\u0d9c\0\u0dd0\0\u0e04"+
    "\0\u0e38\0\u0a28\0\64\0\u0138\0\u0e6c\0\u0ea0\0\u0138\0\u0ed4"+
    "\0\u0138\0\u0f08\0\u0138\0\u0f3c\0\u0138\0\u0138\0\u0f70\0\u0fa4"+
    "\0\u0138\0\64\0\64\0\u0fd8\0\u0138\0\u0138\0\u0138\0\u100c"+
    "\0\u1040\0\u0138\0\u0138\0\u1074\0\u0138\0\u0138\0\u10a8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[127];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\3\7\1\10\1\11"+
    "\1\7\1\12\1\13\1\7\1\14\1\15\1\16\1\7"+
    "\1\17\1\20\1\7\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\2\7\1\47\1\2\1\50\1\51\1\2\1\52"+
    "\1\46\65\0\1\7\1\53\1\7\1\54\20\7\26\0"+
    "\3\7\1\0\1\7\5\0\5\7\1\55\16\7\26\0"+
    "\3\7\1\0\1\7\5\0\12\7\1\56\11\7\26\0"+
    "\3\7\1\0\1\7\5\0\4\7\1\57\1\60\1\61"+
    "\15\7\26\0\3\7\1\0\1\7\5\0\24\7\26\0"+
    "\3\7\1\0\1\7\5\0\5\7\1\62\4\7\1\63"+
    "\11\7\26\0\3\7\1\0\1\7\5\0\11\7\1\64"+
    "\12\7\26\0\3\7\1\0\1\7\5\0\15\7\1\65"+
    "\6\7\26\0\3\7\1\0\1\7\5\0\2\7\1\66"+
    "\21\7\26\0\3\7\1\0\1\7\5\0\4\7\1\67"+
    "\17\7\26\0\3\7\1\0\1\7\5\0\11\7\1\70"+
    "\12\7\26\0\3\7\1\0\1\7\5\0\5\7\1\71"+
    "\16\7\26\0\3\7\1\0\1\7\5\0\12\7\1\72"+
    "\11\7\26\0\3\7\1\0\1\7\5\0\6\7\1\73"+
    "\15\7\26\0\3\7\1\0\1\7\31\0\1\74\64\0"+
    "\1\75\30\0\1\76\35\0\1\77\105\0\1\100\36\0"+
    "\1\101\76\0\1\102\63\0\1\103\63\0\1\104\63\0"+
    "\1\105\51\0\1\106\106\0\1\46\10\0\1\46\55\0"+
    "\1\107\1\110\1\107\61\0\1\50\1\110\1\50\4\0"+
    "\60\111\1\0\1\112\2\111\61\113\1\114\1\115\1\113"+
    "\1\0\2\7\1\116\21\7\26\0\3\7\1\0\1\7"+
    "\5\0\2\7\1\117\21\7\26\0\3\7\1\0\1\7"+
    "\5\0\20\7\1\120\3\7\26\0\3\7\1\0\1\7"+
    "\5\0\5\7\1\121\16\7\26\0\3\7\1\0\1\7"+
    "\5\0\12\7\1\122\11\7\26\0\3\7\1\0\1\7"+
    "\5\0\4\7\1\123\17\7\26\0\3\7\1\0\1\7"+
    "\5\0\5\7\1\124\16\7\26\0\3\7\1\0\1\7"+
    "\5\0\15\7\1\125\6\7\26\0\3\7\1\0\1\7"+
    "\5\0\6\7\1\126\15\7\26\0\3\7\1\0\1\7"+
    "\5\0\2\7\1\127\3\7\1\130\15\7\26\0\3\7"+
    "\1\0\1\7\5\0\12\7\1\131\11\7\26\0\3\7"+
    "\1\0\1\7\5\0\1\132\12\7\1\133\10\7\26\0"+
    "\3\7\1\0\1\7\5\0\1\134\23\7\26\0\3\7"+
    "\1\0\1\7\5\0\1\135\23\7\26\0\3\7\1\0"+
    "\1\7\5\0\1\136\23\7\26\0\3\7\1\0\1\7"+
    "\61\0\1\76\1\0\1\76\4\0\53\100\1\137\10\100"+
    "\55\0\1\140\1\0\1\140\50\0\1\141\74\0\1\142"+
    "\1\0\1\142\64\0\1\143\3\0\52\111\1\0\11\111"+
    "\52\113\1\0\11\113\1\0\15\7\1\144\6\7\26\0"+
    "\3\7\1\0\1\7\5\0\6\7\1\145\15\7\26\0"+
    "\3\7\1\0\1\7\5\0\13\7\1\146\10\7\26\0"+
    "\3\7\1\0\1\7\5\0\4\7\1\147\17\7\26\0"+
    "\3\7\1\0\1\7\5\0\6\7\1\150\15\7\26\0"+
    "\3\7\1\0\1\7\5\0\12\7\1\151\11\7\26\0"+
    "\3\7\1\0\1\7\5\0\20\7\1\152\3\7\26\0"+
    "\3\7\1\0\1\7\5\0\17\7\1\153\4\7\26\0"+
    "\3\7\1\0\1\7\5\0\1\154\23\7\26\0\3\7"+
    "\1\0\1\7\5\0\3\7\1\155\20\7\26\0\3\7"+
    "\1\0\1\7\5\0\15\7\1\156\6\7\26\0\3\7"+
    "\1\0\1\7\5\0\4\7\1\157\17\7\26\0\3\7"+
    "\1\0\1\7\5\0\1\7\1\160\22\7\26\0\3\7"+
    "\1\0\1\7\5\0\1\7\1\161\22\7\26\0\3\7"+
    "\1\0\1\7\36\0\1\162\106\0\1\140\1\163\1\140"+
    "\56\0\1\164\12\0\2\7\1\165\21\7\26\0\3\7"+
    "\1\0\1\7\5\0\15\7\1\166\6\7\26\0\3\7"+
    "\1\0\1\7\5\0\23\7\1\167\26\0\3\7\1\0"+
    "\1\7\5\0\12\7\1\170\11\7\26\0\3\7\1\0"+
    "\1\7\5\0\1\7\1\171\22\7\26\0\3\7\1\0"+
    "\1\7\5\0\15\7\1\172\6\7\26\0\3\7\1\0"+
    "\1\7\5\0\2\7\1\173\21\7\26\0\3\7\1\0"+
    "\1\7\34\0\1\174\34\0\1\7\1\175\22\7\26\0"+
    "\3\7\1\0\1\7\5\0\14\7\1\176\7\7\26\0"+
    "\3\7\1\0\1\7\35\0\1\177\104\0\1\162\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4316];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\20\1\2\11\2\1\1\11\1\1\3\11"+
    "\4\1\5\11\27\1\2\11\1\1\1\11\2\0\4\11"+
    "\7\0\1\11\21\1\3\0\1\1\1\11\16\1\2\11"+
    "\1\0\7\1\1\0\2\1\1\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[127];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
        }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
        }
    private Symbol symbol(int type, int yychar1, int yyline1, Object value){
        return new Symbol(type, yyline, yycolumn, value);
        }        
        


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 41: 
          { return symbol(sym.BOOL, yychar, yyline, yytext());
          }
        case 54: break;
        case 25: 
          { return symbol(sym.ARRAY_NUMBER, yychar, yyline, yytext());
          }
        case 55: break;
        case 28: 
          { return symbol(sym.INCREMENTO, yychar, yyline, yytext());
          }
        case 56: break;
        case 7: 
          { return symbol(sym.MULTIPLICACION, yychar, yyline, yytext());
          }
        case 57: break;
        case 18: 
          { return symbol(sym.CONJUNCION, yychar, yyline, yytext());
          }
        case 58: break;
        case 14: 
          { return symbol(sym.MENOR_QUE, yychar, yyline, yytext());
          }
        case 59: break;
        case 31: 
          { return symbol(sym.MENOR_IGUAL, yychar, yyline, yytext());
          }
        case 60: break;
        case 5: 
          { return symbol(sym.CORCHETE_ABIERTO, yychar, yyline, yytext());
          }
        case 61: break;
        case 33: 
          { return symbol(sym.MAYOR_IGUAL, yychar, yyline, yytext());
          }
        case 62: break;
        case 29: 
          { return symbol(sym.DECREMENTO, yychar, yyline, yytext());
          }
        case 63: break;
        case 6: 
          { return symbol(sym.CORCHETE_CERRADO, yychar, yyline, yytext());
          }
        case 64: break;
        case 46: 
          { return symbol(sym.MAIN, yychar, yyline, yytext());
          }
        case 65: break;
        case 8: 
          { return symbol(sym.DIVISION, yychar, yyline, yytext());
          }
        case 66: break;
        case 36: 
          { return symbol(sym.INT, yychar, yyline, yytext());
          }
        case 67: break;
        case 19: 
          { return symbol(sym.DISYUNCION, yychar, yyline, yytext());
          }
        case 68: break;
        case 23: 
          { /* Ignore */
          }
        case 69: break;
        case 32: 
          { return symbol(sym.IGUALES, yychar, yyline, yytext());
          }
        case 70: break;
        case 22: 
          { return symbol(sym.PUNTO_COMA, yychar, yyline, yytext());
          }
        case 71: break;
        case 12: 
          { return symbol(sym.LLAVE_ABIERTA, yychar, yyline, yytext());
          }
        case 72: break;
        case 34: 
          { return symbol(sym.DIFERENTES, yychar, yyline, yytext());
          }
        case 73: break;
        case 48: 
          { return symbol(sym.FALSE, yychar, yyline, yytext());
          }
        case 74: break;
        case 1: 
          { return symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 75: break;
        case 53: 
          { return symbol(sym.STRING, yychar, yyline, yytext());
          }
        case 76: break;
        case 50: 
          { return symbol(sym.WHILE, yychar, yyline, yytext());
          }
        case 77: break;
        case 21: 
          { return symbol(sym.DOLAR, yychar, yyline, yytext());
          }
        case 78: break;
        case 3: 
          { return symbol(sym.SUMA, yychar, yyline, yytext());
          }
        case 79: break;
        case 13: 
          { return symbol(sym.LLAVE_CERRADA, yychar, yyline, yytext());
          }
        case 80: break;
        case 15: 
          { return symbol(sym.IGUAL, yychar, yyline, yytext());
          }
        case 81: break;
        case 35: 
          { return symbol(sym.LITERAL_STRING, yychar, yyline, yytext());
          }
        case 82: break;
        case 27: 
          { return symbol(sym.DO, yychar, yyline, yytext());
          }
        case 83: break;
        case 47: 
          { return symbol(sym.FLOAT, yychar, yyline, yytext());
          }
        case 84: break;
        case 24: 
          { return symbol(sym.LITERAL_INT, yychar, yyline, yytext());
          }
        case 85: break;
        case 37: 
          { return symbol(sym.FOR, yychar, yyline, yytext());
          }
        case 86: break;
        case 9: 
          { return symbol(sym.MODULO, yychar, yyline, yytext());
          }
        case 87: break;
        case 20: 
          { return symbol(sym.COMA, yychar, yyline, yytext());
          }
        case 88: break;
        case 52: 
          { return symbol(sym.RETURN, yychar, yyline, yytext());
          }
        case 89: break;
        case 40: 
          { return symbol(sym.TRUE, yychar, yyline, yytext());
          }
        case 90: break;
        case 38: 
          { return symbol(sym.LITERAL_FLOAT, yychar, yyline, yytext());
          }
        case 91: break;
        case 49: 
          { return symbol(sym.BREAK, yychar, yyline, yytext());
          }
        case 92: break;
        case 10: 
          { return symbol(sym.PARENTESIS_ABIERTO, yychar, yyline, yytext());
          }
        case 93: break;
        case 2: 
          { return symbol(sym.IDENTIFICADOR, yychar, yyline, yytext());
          }
        case 94: break;
        case 44: 
          { return symbol(sym.ELIF, yychar, yyline, yytext());
          }
        case 95: break;
        case 11: 
          { return symbol(sym.PARENTESIS_CERRADO, yychar, yyline, yytext());
          }
        case 96: break;
        case 17: 
          { return symbol(sym.NEGACION, yychar, yyline, yytext());
          }
        case 97: break;
        case 45: 
          { return symbol(sym.ELSE, yychar, yyline, yytext());
          }
        case 98: break;
        case 43: 
          { return symbol(sym.READ, yychar, yyline, yytext());
          }
        case 99: break;
        case 39: 
          { return symbol(sym.LITERAL_CHAR, yychar, yyline, yytext());
          }
        case 100: break;
        case 51: 
          { return symbol(sym.PRINT, yychar, yyline, yytext());
          }
        case 101: break;
        case 16: 
          { return symbol(sym.MAYOR_QUE, yychar, yyline, yytext());
          }
        case 102: break;
        case 26: 
          { return symbol(sym.IF, yychar, yyline, yytext());
          }
        case 103: break;
        case 30: 
          { return symbol(sym.POTENCIA, yychar, yyline, yytext());
          }
        case 104: break;
        case 4: 
          { return symbol(sym.RESTA, yychar, yyline, yytext());
          }
        case 105: break;
        case 42: 
          { return symbol(sym.CHAR, yychar, yyline, yytext());
          }
        case 106: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
