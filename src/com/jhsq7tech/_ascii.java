package com.jhsq7tech;



import java.util.ArrayList;


public abstract class _ascii {
	
	private boolean isDeBug = false;
	
	public final int _NUL = 0;   // Null char
	public final int _SOH = 1;   // Start of Heading
	public final int _STX = 2;   // Start of Text
	public final int _ETX = 3;   // End of Text
	public final int _EOT = 4;   // End of Transmission
	public final int _ENQ = 5;   // Enquiry
	public final int _ACK = 6;   // Acknowledgment
	public final int _BEL = 7;   // Bell
	public final int _BSP = 8;   // Back Space
	public final int _HTB = 9;   // Horizontal Tab
	public final int _LNF = 10;  // Line Feed
	public final int _VTB = 11;  // Vertical Tab
	public final int _FMF = 12;  // Form Feed
	public final int _CGR = 13;  // Carriage Return
	public final int _SHO = 14;  // Shift Out / X-On
	public final int _SHI = 15;  // Shift In / X-Off
	public final int _DLE = 16;  // Data Line Escape
	public final int _DC1 = 17;  // Device Control 1 (oft. XON)
	public final int _DC2 = 18;  // Device Control 2
	public final int _DC3 = 19;  // Device Control 3 (oft. XOFF)
	public final int _DC4 = 20;  // Device Control 4
	public final int _NAK = 21;  // Negative Acknowledgement
	public final int _SYN = 22;  // Synchronous Idle
	public final int _ETB = 23;  // End of Transmit Block
	public final int _CNX = 24;  // Cancel
	public final int _EMD = 25;  // End of Medium
	public final int _SUB = 26;  // Substitute
	public final int _ESC = 27;  // Escape
	public final int _FSP = 28;  // File Separator
	public final int _GSP = 29;  // Group Separator
	public final int _RSP = 30;  // Record Separator
	public final int _USP = 31;  // Unit Separator
	public final int cSPC = 32;  // Space
	public final int cEXC = 33;  // Exclamation mark !
	public final int cDDQ = 34;  // Double quotes (or speech marks) "
	public final int cNUM = 35;  // Number #
	public final int cDOL = 36;  // Dollar $
	public final int cPCT = 37;  // Per cent sign %
	public final int cAMP = 38;  // Ampersand &
	public final int cSGQ = 39;  // Single quote '
	public final int cOBR = 40;  // Open parenthesis (
	public final int cCBR = 41;  // Close parenthesis )
	public final int cAST = 42;  // Asterisk *
	public final int cPLS = 43;  // Plus +
	public final int cCOM = 44;  // Comma ,
	public final int cHYP = 45;  // Hyphen -
	public final int cDOT = 46;  // Period .
	public final int cFSL = 47;  // Forward slash /
	public final int c_00 = 48;  // Zero
	public final int c_01 = 49;  // One
	public final int c_02 = 50;  // Two
	public final int c_03 = 51;  // Three
	public final int c_04 = 52;  // Four
	public final int c_05 = 53;  // Five
	public final int c_06 = 54;  // Six
	public final int c_07 = 55;  // Seven
	public final int c_08 = 56;  // Eight
	public final int c_09 = 57;  // Nine
	public final int cCOL = 58;  // Colon :
	public final int cSCL = 59;  // Semicolon ;
	public final int cLTN = 60;  // Less than <
	public final int cEQL = 61;  // Equals =
	public final int cGTN = 62;  // Greater >
	public final int cQUM = 63;  // Question mark ?
	public final int cATS = 64;  // At symbol @
	public final int c_AA = 65;  // Uppercase A
	public final int c_BB = 66;  // Uppercase B
	public final int c_CC = 67;  // Uppercase C
	public final int c_DD = 68;  // Uppercase D
	public final int c_EE = 69;  // Uppercase E
	public final int c_FF = 70;  // Uppercase F
	public final int c_GG = 71;  // Uppercase G
	public final int c_HH = 72;  // Uppercase H
	public final int c_II = 73;  // Uppercase I
	public final int c_JJ = 74;  // Uppercase J
	public final int c_KK = 75;  // Uppercase K
	public final int c_LL = 76;  // Uppercase L
	public final int c_MM = 77;  // Uppercase M
	public final int c_NN = 78;  // Uppercase N
	public final int c_OO = 79;  // Uppercase O
	public final int c_PP = 80;  // Uppercase P
	public final int c_QQ = 81;  // Uppercase Q
	public final int c_RR = 82;  // Uppercase R
	public final int c_SS = 83;  // Uppercase S
	public final int c_TT = 84;  // Uppercase T
	public final int c_UU = 85;  // Uppercase U
	public final int c_VV = 86;  // Uppercase V
	public final int c_WW = 87;  // Uppercase W
	public final int c_XX = 88;  // Uppercase X
	public final int c_YY = 89;  // Uppercase Y
	public final int c_ZZ = 90;  // Uppercase Z
	public final int cOBK = 91;  // Opening bracket [
	public final int cBSL = 92;  // Backslash \
	public final int cCBK = 93;  // Closing bracket ]
	public final int cCAR = 94;  // Caret ^
	public final int cUDR = 95;  // Underscore _
	public final int cGRA = 96;  // Grave accent `
	public final int c_Aa = 97;  // Lowercase a
	public final int c_Bb = 98;  // Lowercase b
	public final int c_Cc = 99;  // Lowercase c
	public final int c_Dd = 100; // Lowercase d
	public final int c_Ee = 101; // Lowercase e
	public final int c_Ff = 102; // Lowercase f
	public final int c_Gg = 103; // Lowercase g
	public final int c_Hh = 104; // Lowercase h
	public final int c_Ii = 105; // Lowercase i
	public final int c_Jj = 106; // Lowercase j
	public final int c_Kk = 107; // Lowercase k
	public final int c_Ll = 108; // Lowercase l
	public final int c_Mm = 109; // Lowercase m
	public final int c_Nn = 110; // Lowercase n
	public final int c_Oo = 111; // Lowercase o
	public final int c_Pp = 112; // Lowercase p
	public final int c_Qq = 113; // Lowercase q
	public final int c_Rr = 114; // Lowercase r
	public final int c_Ss = 115; // Lowercase s
	public final int c_Tt = 116; // Lowercase t
	public final int c_Uu = 117; // Lowercase u
	public final int c_Vv = 118; // Lowercase v
	public final int c_Ww = 119; // Lowercase w
	public final int c_Xx = 120; // Lowercase x
	public final int c_Yy = 121; // Lowercase y
	public final int c_Zz = 122; // Lowercase z
	public final int cOBC = 123; // Opening brace {
	public final int cVBR = 124; // Vertical bar |
	public final int cCBC = 125; // Closing brace }
	public final int cTIL = 126; // Equivalency sign - tilde ~
	public final int _DEL = 127; // Delete
	
	private final int[] aLowerCase = {
			97, 98, 99, 100, 101, 102
			, 103, 104, 105, 106, 107, 108, 109
			, 110, 111, 112, 113, 114, 115, 116
			, 117, 118, 119, 120, 121, 122
	};
	
	private final int[] aUpperCase = {
			65, 66, 67, 68, 69, 70
			, 71, 72, 73, 74, 75, 76, 77
			, 78, 79, 80, 81, 82, 83, 84
			, 85, 86, 87, 88, 89, 90
	};
	
	private final int[] aNumeric = {
			48, 50, 51, 52
			, 53, 54, 55, 56, 57
	};
	
	private final int[] aForbidden = {
			0, 1, 2, 3, 4, 5, 6
			, 7, 8, 9, 10, 11, 12
			, 13, 14, 15, 16, 17, 18
			, 19, 20, 21, 22, 23, 24
			, 25, 26, 27, 28, 29, 30, 31, 127
	};
	
	private final int[] aPunctuation = {
			32, 33, 46, 58, 59, 63
	};
	
	private final int[] aSymbol = {
			35, 36, 38, 64
	};
	
	private final int[] aMathSymbol = {
			37, 42, 43, 45, 47, 60, 61, 62
	};
	
	private char Delimiter;
	
	public char getDelimiter() {
		return this.Delimiter;
	}
	
	public void setDelimiter(char cDelimiter) {
		
		this.Delimiter = cDelimiter;
		
	}
	
	private char Enclosure;
	
	public char getEnclosure() {
		
		return this.Enclosure;
		
	}
	
	public void setEnclosure(char enclosure) {
		
		this.Enclosure = enclosure;
		
	}
	
	public boolean isAlphabet(char c) {
		
		if (isMatch(c, aLowerCase) || isMatch(c, aUpperCase) || isMatch(c, aNumeric)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean isLowerCase(char c) {
		return isMatch(c, aLowerCase);
	}
	
	public boolean isUpperCase(char c) {
		return isMatch(c, aUpperCase);
	}
	
	public boolean isNumeric(char c) {
		return isMatch(c, aNumeric);
	}
	
	public boolean isForbidden(char c) {
		return isMatch(c, aForbidden);
	}
	
	public boolean isPunctuation(char c) {
		return isMatch(c, aPunctuation);
	}
	
	public boolean isSymbol(char c) {
		return isMatch(c, aSymbol);
	}
	
	public boolean isMathSymbol(char c) {
		return isMatch(c, aMathSymbol);
	}
	
	
	
	
	public int ColumnCount = 0;
	
	public int ColumnNULL = 0;
	
	ArrayList<String> CellData = new ArrayList<>();
	
	ArrayList<Character> ChrData = new ArrayList<>();
	
	boolean setEnclosure = false;
	
	public String[] getLineFeed(String _feed) {
		
		if (0 == this.Enclosure || 0 == this.Delimiter) {
			
			String[] error = {"#ERROR", "No Enclosure", "No Delimiter"};
			
			return error;
			
		}
		
		ColumnCount = 0;
		
		CellData.clear(); ChrData.clear();
		
		char[] c = _feed.toCharArray();
		
		if (isDeBug) System.out.printf("%s\n", _feed);
		
		int isFirstChar = 0;
		
		int isLastChar = (c.length - 1);
		
		for (int pos = 0; pos < c.length; pos++) {
			
			char thisChar = c[pos]; char nextChar = 0;
			
			if( pos != isLastChar ){ nextChar = c[ (pos + 1) ]; }
			
			if( !isMatch( thisChar , aForbidden) ){
				
				if ( isFirstChar == pos || isLastChar == pos ) {
					
					if( thisChar != this.Delimiter && thisChar != this.Enclosure ){
						
						ChrData.add(thisChar);
						
					}
					
					if( isLastChar == pos && ChrData.size() > 0 ){
						
						addDataChar( CellData , ChrData );
						
					} else if (isLastChar == pos){
						
						CellData.add(" ");
						addDataChar( CellData , ChrData );
					}
					
				} else if ( thisChar == this.Delimiter ) {
					
					if( ChrData.size() > 0 && !setEnclosure ){
						
						addDataChar( CellData , ChrData );
						
					} else if(ChrData.size() > 0 && setEnclosure) {
						
						ChrData.add(thisChar);
						
					} else if(ChrData.size() == 0 ){
						
						//CellData.add(Character.toString(_NUL)); ColumnNULL++;
						CellData.add(" ");
					}
					
				} else if ( thisChar == this.Enclosure ) {
					
					if( ChrData.size() == 0 ){
						
						setEnclosure = true;
						
					} else if( setEnclosure && nextChar == this.Delimiter ){
						
						//addDataChar( CellData , ChrData );
						
						setEnclosure = false;
						
					} else if( nextChar != this.Enclosure ) {
						
						//ChrData.add(thisChar);
						
					}
					
				} else {
					
					ChrData.add(thisChar);
					
				}
				
			} /* if( !isMatch( thisChar , aForbidden) ){ */
		} /* for (int pos = 0; pos < c.length; pos++) { */
		
		return CellData.toArray(new String[0]);
	}
	
	
	private void addDataChar(ArrayList<String> _CellData , ArrayList<Character> _ChrData ){
		
		String ln = "";
		
		for (int m = 0; m < _ChrData.size(); m++) ln = ln + _ChrData.get(m);
		
		_CellData.add(ln);
		
		if (isDeBug) System.out.printf("DataCell Content: %s\n", ln);
		
		_ChrData.clear();
		
		ColumnCount++;
		
	}
	
	
	
	
	private boolean isMatch(char c, int[] arr) {
		for (int xyz = 0; xyz < arr.length; xyz++) {
			if (arr[xyz] == c) {
				return true;
			}
		}
		return false;
	}
	
	
}















