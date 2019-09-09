package wordseg.nirvasoft.com;
import java.util.ArrayList;
public class SyllableMM {

	static ArrayList<String> sBreak(String s){
		ArrayList<String> ar = new ArrayList<String>();
		StringBuffer sb = new StringBuffer(); 
		boolean ismm=false;
		char c = 'A'; 
		for (int i=0;i<s.length();i++) {
			c = s.charAt(i);
			ismm=(UtilMM.ismmSar(c)!=null); 
			//if (!isSpace(c)) sb.append(c);  // append to buffer if not space
			sb.append(c);
			if (i==s.length()-1 || //if last char, no need to check next
				ismm==(UtilMM.ismmSar(s.charAt(i+1))!=null) ){// same language with next -carry on 
				
					if (i==s.length()-1) // if last char, push to array
						ar.add(sb.toString()); 
					else if ( // WHEN TO BREAK
							i<s.length()-1 &&
							
							(UtilMM.ismmConsonant(s.charAt(i+1)) && // NEXT Consonant BUT
							((i<=s.length()-2 && !UtilMM.ismmAthut(s.charAt(i+2)) && !UtilMM.ismmStack(s.charAt(i+2))))) && //NOT Athut/Stack
							(!UtilMM.ismmNumber(s.charAt(i+1)) && !UtilMM.ismmNumber(c))  // NOT NRIC and Alpha Numeric

						) { // next consonant and not Athut or Stacker
						ar.add(sb.toString());
						sb= new StringBuffer();
					}
					
			} else { // not last char or different language
				//if (
				//		s.charAt(i+1)=='/' || c=='/' ||
				//		s.charAt(i+1)=='-' || c=='-' ||
				//		s.charAt(i+1)=='(' || c=='(' ||
				//		s.charAt(i+1)==')' || c==')' 
				//) {
				//}else 
				if (sb.length()>0) { // if not empty, push to array
					ar.add(sb.toString());
					sb= new StringBuffer();
				}
			} 
		} 
		return ar;
	}

}
