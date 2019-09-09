package wordseg.nirvasoft.com;

import java.util.ArrayList;

public class WordMM {

	static ArrayList<String> sMerge(ArrayList<String> ar){
		ArrayList<String> arr = new ArrayList<String>();
		String s="";
		boolean ismm=false;
		for (int i=0;i<ar.size();i++) {
			s=ar.get(i);
			ismm = UtilMM.ismmSar(s);
			if (i==ar.size()-1 || //if last char, no need to check next
					ismm==(UtilMM.ismmSar(ar.get(i+1))) ){// same language with next -carry on 
				if (i==ar.size()-1) // last 
					arr.add(s);
				else {
					boolean longer=true; 
					while (longer) {
						if (inDic(s+ar.get(i+1))){
							s=s+ar.get(i+1);
							i++;
						} else {
							arr.add(s);
							longer=false;
						}
					} 
				}
			} else {
				if (ar.size()>0) { // if not empty, push to array
					arr.add(s);
					s= "";
				}
			}
		} 
		return arr;
	}
	static boolean inDic(String s) {
		boolean result=false;
		ArrayList<String> d =dic();
		for (int i=0;i<d.size();i++) {
			if (d.get(i).toLowerCase().startsWith(s)) {
				result=true;
				break;
			}
		}
		return result;
	}
	static ArrayList<String> dic(){
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("နေကောင်းလား");
		arr.add("ကမ္ဘာကြီး");
		arr.add("မသိဘူး");
		arr.add("ဟာဟ");
		arr.add("မတတ်ဘူး");
		return arr;
	}
}
