public class Prob02 {
	public String encoded(String sourceString){
		String str = "";
		for(int i=0; i<sourceString.length(); i++){
			int a = sourceString.charAt(i)+3;
			if(a>122){
				a -= 26;
				char b = (char)a;
				str += b;
			}else if(a == 35){
				str += " ";
			}else {
				char b = (char)a;
				str += b;
			}
		}
		return str;
	}

	public String decoded(String encodedeString){
		String str = "";
		for(int i=0; i<encodedeString.length(); i++){
			int a = encodedeString.charAt(i)-3;
			if(93<a && a<97){
				a += 26;
				char b = (char)a;
				str += b;
			} else if(a == 29){
				str += " ";
			} else {
				char b = (char)a;
				str += b;
			}
		}
		return str;
	}

	public static void main(String[] args) {

		String sourceString = "everyday we have is one more than we deserve";
		String encodedeString = "";
		String decodedString = "";
		
		Prob02 str = new Prob02();
		encodedeString = str.encoded(sourceString);
		System.out.println(encodedeString);
		
		decodedString = str.decoded(encodedeString);
		System.out.println(decodedString);
		//	sourceString.length();
		//¾Æ½ºÅ±Å¸ÀÔ
	}
}
