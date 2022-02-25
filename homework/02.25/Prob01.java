package h0225;

public class Prob01 {
	public static String myReplace(String str,char oldChar, char newChar){
		String result = "";
		//System.out.println(newChar);
		for(int i=0; i<str.length(); i++){
				if(oldChar == str.charAt(i)){					
					result += newChar;
				} else {
					result += str.charAt(i);
				}					
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("문자열에 특정문자 변경하는 테스트");
		System.out.println("-------Sample 1--------");
		String str1 = myReplace("hello world",'l','*');
		System.out.println(str1);

		System.out.println("-------Sample 2--------");
		String str2 = myReplace("hello world",' ','-');
		System.out.println(str2);

		System.out.println("-------Sample 1--------");
		String str3 = myReplace("hello world",'a','*');
		System.out.println(str3);
	}
}
