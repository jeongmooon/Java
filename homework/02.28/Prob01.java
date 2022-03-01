//package h0228;

public class Prob01 {
	
	public static String[] stringSplit(String str, String str2) {
		int c = 1;
		//char[] cArr = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			//cArr[i] = str.charAt(i);
			if(str.charAt(i)==str2.charAt(0)) {
				c++;
			}
		}
		
		String[] sArr = new String[c];
		
		
		int a = 0;
		for(int j=0; j<str.length(); j++) {
			String s = "";
			if(str.charAt(j)==str2.charAt(0)) {
				sArr[a] = s;
				a++;
			} else {
				s += str.charAt(j);
				System.out.print(s);
			}
			//s += str.charAt(j);
			//System.out.println(str.charAt(j));	
		}
		System.out.println(c);
		
		//String[] arr = str.split(str2);
		return sArr;
	}

	//main
	public static void main(String[] args) {
		
		String str = "PROD-001#X-note#Samsug#3#6000000";
		String[] strs = stringSplit(str,"#");
		System.out.println("=== 문자열 처리 결과 ===");
		for(int i=0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

}
