package h0228;

public class Prob01 {
	
	public static String[] stringSplit(String str, String str2) {
		int c = 1;
		//만들어야하는 배열 갯수 카운트하기
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==str2.charAt(0)) {
				c++;
			}
		}
		
		// 카운트한 배열갯수로 배열만들기
		String[] sArr = new String[c];
		
		// 사용 변수 선언
		String s = "";
		int a = 0;
		
		// 배열에 넣기
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==str2.charAt(0)) {
				s="";
				a++;
			} else {
				s += str.charAt(i);
				sArr[a] = s;
			}
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

