package h0228;

public class Prob01 {
	
	public static String[] stringSplit(String str, String str2) {
		String[] arr = str.split(str2);
		return arr;
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
