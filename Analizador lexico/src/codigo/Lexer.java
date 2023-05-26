/* The following code was generated by JFlex 1.4.3 on 5/8/23, 2:09 PM */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 5/8/23, 2:09 PM from the specification file
 * <tt>C:/Users/david/OneDrive/Desktop/compiladores-main/Analizador lexico/src/codigo/Lexer.flex</tt>
 */
class Lexer {

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
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\62\1\27\2\0\1\62\22\0\1\62\1\44\1\61\1\46"+
    "\1\50\2\0\1\57\1\35\1\36\1\32\1\25\1\47\1\26\1\56"+
    "\1\33\12\55\1\0\1\51\1\41\1\42\1\43\1\0\1\52\32\54"+
    "\1\30\1\60\1\31\1\45\1\53\1\0\1\7\1\10\1\11\1\20"+
    "\1\16\1\4\1\15\1\12\1\1\1\54\1\24\1\5\1\23\1\2"+
    "\1\6\1\22\1\54\1\13\1\14\1\3\1\21\1\54\1\17\3\54"+
    "\1\37\1\0\1\40\1\34\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\16\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\2\1\1\32\1\2\1\33\14\2\1\34"+
    "\2\2\1\35\1\36\2\0\1\37\1\40\1\41\1\42"+
    "\2\30\5\0\1\43\1\44\1\22\2\2\1\45\14\2"+
    "\2\0\1\30\1\46\1\47\1\50\2\2\1\51\1\2"+
    "\1\52\1\2\1\53\1\2\1\54\1\55\2\2\1\56"+
    "\1\57\1\46\1\0\1\60\1\61\1\62\2\2\1\63"+
    "\1\64\1\0\1\65\1\66\1\0\1\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[126];
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
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\u0132\0\u0165"+
    "\0\u0198\0\u01cb\0\u01fe\0\u0231\0\u0264\0\u0297\0\u02ca\0\u02fd"+
    "\0\u0330\0\u0363\0\u0396\0\63\0\63\0\u03c9\0\u03fc\0\63"+
    "\0\u042f\0\63\0\63\0\63\0\u0462\0\u0495\0\u04c8\0\u04fb"+
    "\0\63\0\63\0\63\0\63\0\63\0\u052e\0\u0561\0\u0594"+
    "\0\u05c7\0\u0396\0\u05fa\0\u0132\0\u062d\0\u0660\0\u0693\0\u06c6"+
    "\0\u06f9\0\u072c\0\u075f\0\u0792\0\u07c5\0\u07f8\0\u082b\0\u085e"+
    "\0\u0132\0\u0891\0\u08c4\0\63\0\63\0\u08f7\0\u092a\0\63"+
    "\0\63\0\63\0\63\0\u095d\0\u0990\0\u09c3\0\u09f6\0\u0a29"+
    "\0\u05c7\0\u0a5c\0\63\0\u0132\0\u0132\0\u0a8f\0\u0ac2\0\u0132"+
    "\0\u0af5\0\u0b28\0\u0b5b\0\u0b8e\0\u0bc1\0\u0bf4\0\u0c27\0\u0c5a"+
    "\0\u0c8d\0\u0cc0\0\u0cf3\0\u0d26\0\u0d59\0\u0d8c\0\u0dbf\0\u09c3"+
    "\0\63\0\u0132\0\u0df2\0\u0e25\0\u0132\0\u0e58\0\u0132\0\u0e8b"+
    "\0\u0132\0\u0ebe\0\u0132\0\u0132\0\u0ef1\0\u0f24\0\u0132\0\63"+
    "\0\63\0\u0f57\0\u0132\0\u0132\0\u0132\0\u0f8a\0\u0fbd\0\u0132"+
    "\0\u0132\0\u0ff0\0\u0132\0\u0132\0\u1023\0\63";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[126];
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
    "\1\46\2\7\1\47\1\2\1\50\1\2\1\51\1\52"+
    "\64\0\1\7\1\53\1\7\1\54\20\7\26\0\3\7"+
    "\6\0\5\7\1\55\16\7\26\0\3\7\6\0\12\7"+
    "\1\56\11\7\26\0\3\7\6\0\4\7\1\57\1\60"+
    "\1\61\15\7\26\0\3\7\6\0\24\7\26\0\3\7"+
    "\6\0\5\7\1\62\4\7\1\63\11\7\26\0\3\7"+
    "\6\0\11\7\1\64\12\7\26\0\3\7\6\0\15\7"+
    "\1\65\6\7\26\0\3\7\6\0\2\7\1\66\21\7"+
    "\26\0\3\7\6\0\4\7\1\67\17\7\26\0\3\7"+
    "\6\0\11\7\1\70\12\7\26\0\3\7\6\0\5\7"+
    "\1\71\16\7\26\0\3\7\6\0\12\7\1\72\11\7"+
    "\26\0\3\7\6\0\6\7\1\73\15\7\26\0\3\7"+
    "\32\0\1\74\63\0\1\74\63\0\1\52\32\0\1\52"+
    "\32\0\1\75\103\0\1\76\35\0\1\77\76\0\1\100"+
    "\62\0\1\101\62\0\1\102\62\0\1\103\20\0\27\104"+
    "\1\0\1\105\32\104\55\0\1\47\1\106\4\0\57\107"+
    "\1\0\1\110\2\107\60\111\1\112\1\113\1\111\1\0"+
    "\2\7\1\114\21\7\26\0\3\7\6\0\2\7\1\115"+
    "\21\7\26\0\3\7\6\0\20\7\1\116\3\7\26\0"+
    "\3\7\6\0\5\7\1\117\16\7\26\0\3\7\6\0"+
    "\12\7\1\120\11\7\26\0\3\7\6\0\4\7\1\121"+
    "\17\7\26\0\3\7\6\0\5\7\1\122\16\7\26\0"+
    "\3\7\6\0\15\7\1\123\6\7\26\0\3\7\6\0"+
    "\6\7\1\124\15\7\26\0\3\7\6\0\2\7\1\125"+
    "\3\7\1\126\15\7\26\0\3\7\6\0\12\7\1\127"+
    "\11\7\26\0\3\7\6\0\1\130\12\7\1\131\10\7"+
    "\26\0\3\7\6\0\1\132\23\7\26\0\3\7\6\0"+
    "\1\133\23\7\26\0\3\7\6\0\1\134\23\7\26\0"+
    "\3\7\5\0\53\76\1\135\7\76\55\0\1\136\5\0"+
    "\27\104\1\0\62\104\1\0\15\104\1\137\15\104\55\0"+
    "\1\140\64\0\1\141\3\0\27\107\1\0\33\107\27\111"+
    "\1\0\33\111\1\0\15\7\1\142\6\7\26\0\3\7"+
    "\6\0\6\7\1\143\15\7\26\0\3\7\6\0\13\7"+
    "\1\144\10\7\26\0\3\7\6\0\4\7\1\145\17\7"+
    "\26\0\3\7\6\0\6\7\1\146\15\7\26\0\3\7"+
    "\6\0\12\7\1\147\11\7\26\0\3\7\6\0\20\7"+
    "\1\150\3\7\26\0\3\7\6\0\17\7\1\151\4\7"+
    "\26\0\3\7\6\0\1\152\23\7\26\0\3\7\6\0"+
    "\3\7\1\153\20\7\26\0\3\7\6\0\15\7\1\154"+
    "\6\7\26\0\3\7\6\0\4\7\1\155\17\7\26\0"+
    "\3\7\6\0\1\7\1\156\22\7\26\0\3\7\6\0"+
    "\1\7\1\157\22\7\26\0\3\7\40\0\1\160\104\0"+
    "\1\136\1\161\4\0\27\104\1\162\33\104\1\0\2\7"+
    "\1\163\21\7\26\0\3\7\6\0\15\7\1\164\6\7"+
    "\26\0\3\7\6\0\23\7\1\165\26\0\3\7\6\0"+
    "\12\7\1\166\11\7\26\0\3\7\6\0\1\7\1\167"+
    "\22\7\26\0\3\7\6\0\15\7\1\170\6\7\26\0"+
    "\3\7\6\0\2\7\1\171\21\7\26\0\3\7\36\0"+
    "\1\172\32\0\1\7\1\173\22\7\26\0\3\7\6\0"+
    "\14\7\1\174\7\7\26\0\3\7\37\0\1\175\57\0"+
    "\1\176\33\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4182];
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
    "\1\0\1\11\21\1\2\11\2\1\1\11\1\1\3\11"+
    "\4\1\5\11\26\1\2\11\2\0\4\11\2\1\5\0"+
    "\1\11\21\1\2\0\2\1\1\11\16\1\2\11\1\0"+
    "\7\1\1\0\2\1\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[126];
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
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 130) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
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
        case 28: 
          { lexeme=yytext(); return DO;
          }
        case 55: break;
        case 52: 
          { lexeme=yytext(); return ESCRITURA;
          }
        case 56: break;
        case 35: 
          { lexeme=yytext(); return LITERAL_STRING;
          }
        case 57: break;
        case 36: 
          { lexeme=yytext(); return INT;
          }
        case 58: break;
        case 17: 
          { lexeme=yytext(); return MAYOR_QUE;
          }
        case 59: break;
        case 45: 
          { lexeme=yytext(); return ELSE;
          }
        case 60: break;
        case 18: 
          { lexeme=yytext(); return NEGACION;
          }
        case 61: break;
        case 11: 
          { lexeme=yytext(); return PARENTESIS_ABIERTO;
          }
        case 62: break;
        case 43: 
          { lexeme=yytext(); return LECTURA;
          }
        case 63: break;
        case 8: 
          { lexeme=yytext(); return MULTIPLICACION;
          }
        case 64: break;
        case 22: 
          { lexeme=yytext(); return DOLAR;
          }
        case 65: break;
        case 49: 
          { lexeme=yytext(); return FALSE;
          }
        case 66: break;
        case 47: 
          { lexeme=yytext(); return COMENTARIO_BLOQUE;
          }
        case 67: break;
        case 40: 
          { lexeme=yytext(); return TRUE;
          }
        case 68: break;
        case 10: 
          { lexeme=yytext(); return MODULO;
          }
        case 69: break;
        case 12: 
          { lexeme=yytext(); return PARENTESIS_CERRADO;
          }
        case 70: break;
        case 23: 
          { lexeme=yytext(); return PUNTO_COMA;
          }
        case 71: break;
        case 38: 
          { lexeme=yytext(); return LITERAL_FLOAT;
          }
        case 72: break;
        case 30: 
          { lexeme=yytext(); return POTENCIA;
          }
        case 73: break;
        case 32: 
          { lexeme=yytext(); return IGUALES;
          }
        case 74: break;
        case 53: 
          { lexeme=yytext(); return RETURN;
          }
        case 75: break;
        case 41: 
          { lexeme=yytext(); return BOOL;
          }
        case 76: break;
        case 37: 
          { lexeme=yytext(); return FOR;
          }
        case 77: break;
        case 27: 
          { lexeme=yytext(); return IF;
          }
        case 78: break;
        case 26: 
          { /* Ignore */
          }
        case 79: break;
        case 20: 
          { lexeme=yytext(); return DISYUNCION;
          }
        case 80: break;
        case 4: 
          { lexeme=yytext(); return RESTA;
          }
        case 81: break;
        case 13: 
          { lexeme=yytext(); return LLAVE_ABIERTA;
          }
        case 82: break;
        case 31: 
          { lexeme=yytext(); return MENOR_IGUAL;
          }
        case 83: break;
        case 54: 
          { lexeme=yytext(); return STRING;
          }
        case 84: break;
        case 25: 
          { lexeme=yytext(); return LITERAL_INT;
          }
        case 85: break;
        case 6: 
          { lexeme=yytext(); return CORCHETE_ABIERTO;
          }
        case 86: break;
        case 29: 
          { lexeme=yytext(); return OPERADOR_UNARIO;
          }
        case 87: break;
        case 24: 
          { lexeme=yytext(); return COMENTARIO_LINEA;
          }
        case 88: break;
        case 14: 
          { lexeme=yytext(); return LLAVE_CERRADA;
          }
        case 89: break;
        case 46: 
          { lexeme=yytext(); return MAIN;
          }
        case 90: break;
        case 7: 
          { lexeme=yytext(); return CORCHETE_CERRADO;
          }
        case 91: break;
        case 16: 
          { lexeme=yytext(); return IGUAL;
          }
        case 92: break;
        case 34: 
          { lexeme=yytext(); return DIFERENTES;
          }
        case 93: break;
        case 48: 
          { lexeme=yytext(); return FLOAT;
          }
        case 94: break;
        case 51: 
          { lexeme=yytext(); return WHILE;
          }
        case 95: break;
        case 39: 
          { lexeme=yytext(); return LITERAL_CHAR;
          }
        case 96: break;
        case 2: 
          { lexeme=yytext(); return IDENTIFICADOR;
          }
        case 97: break;
        case 50: 
          { lexeme=yytext(); return BREAK;
          }
        case 98: break;
        case 1: 
          { return ERROR;
          }
        case 99: break;
        case 42: 
          { lexeme=yytext(); return CHAR;
          }
        case 100: break;
        case 19: 
          { lexeme=yytext(); return CONJUNCION;
          }
        case 101: break;
        case 5: 
          { lexeme=yytext(); return LINEA;
          }
        case 102: break;
        case 21: 
          { lexeme=yytext(); return COMA;
          }
        case 103: break;
        case 15: 
          { lexeme=yytext(); return MENOR_QUE;
          }
        case 104: break;
        case 44: 
          { lexeme=yytext(); return ELIF;
          }
        case 105: break;
        case 9: 
          { lexeme=yytext(); return DIVISION;
          }
        case 106: break;
        case 3: 
          { lexeme=yytext(); return SUMA;
          }
        case 107: break;
        case 33: 
          { lexeme=yytext(); return MAYOR_IGUAL;
          }
        case 108: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
