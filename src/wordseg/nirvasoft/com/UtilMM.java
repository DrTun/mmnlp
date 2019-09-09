package wordseg.nirvasoft.com;

public class UtilMM {
	static boolean ismmSar(String s) { 
		if (s==null || s.length()==0 ) return false;
		else if (ismmSar(s.charAt(0))!=null) return true;
		else return false;
	}
	static boolean ismmNumber(String s) { 
		if (s==null || s.length()==0 ) return false;
		else if (ismmNumber(s.charAt(0))) return true;
		else return false;
	}
	static String ismmSar(char c) { 
		if (ismmConsonant(c)) return "C";
		else if (ismmMedial(c)) return "M";
		else if (ismmNumber(c)) return "N"; 
		else if (ismmAthut(c)) return "A";
		else if (ismmStack(c)) return "S";
		else if (ismmVowel(c)) return "V";
		else return null ;
	}
	static boolean ismmConsonant(char c) {if ((c>=h2c("1000") && c<=h2c("102a")) ||(c>=h2c("104c") && c<=h2c("104f")) || c==h2c("103f")) return true;else return false;}
	static boolean ismmMedial(char c) {if (c>=h2c("103b") && c<=h2c("103e")) return true;else return false;}
	static boolean ismmVowel(char c) {if (c>=h2c("102b") && c<=h2c("103a")) return true;else return false;}
	static boolean ismmAthut(char c) {if (c==h2c("103a")) return true;else return false;}
	static boolean ismmStack(char c) {if (c==h2c("1039")) return true;else return false;}
	static boolean ismmNumber(char c) {if (c>=h2c("1040") && c<=h2c("1049")) return true;else return false;}
	static boolean ismmPunctuation(char c) {if (c>=h2c("104A") && c<=h2c("104B")) return true;else return false;}
	static boolean isDash(char c) {if (c==h2c("2d")) return true;else return false;} //45
	static boolean isSpace(char c) {if (c==h2c("20")) return true;else return false;} //32
	static boolean isSlash(char c) {if (c==h2c("2f")) return true;else return false;} //47  
	static int h2i(String s) {return Integer.parseInt(s, 16);}
	static char h2c(String s) {return (char) Integer.parseInt(s, 16);}
	static String i2h(int i) {return Integer.toHexString(i);}
	static String c2h(char c) {return  Integer.toHexString((int) c);}
	static String debugUni(String s) {
		StringBuffer sb = new StringBuffer();
		char c = 'A'; 
		for (int i=0;i<s.length();i++) {
			c = s.charAt(i);
			sb.append( Character.toString(c)+" " + i2h(c) +  " ("+(int) c+") " + (ismmSar(c)) + " | "); 
		}
		return sb.toString();
	}
}