public class Prob02 {
	public String leftPad(String str, int size, char padChar){
		if(str.length()>size){
			return str;
		}
		int c = size-str.length();
		String b ="";
		for(int i=0; i<c; i++){
			b += padChar;
		}

		return b+" "+str;
	}
	//main
	public static void main(String[] args) {
		Prob02 prob03 = new Prob02();

		System.out.println(prob03.leftPad("ABC",6,'#'));
		System.out.println(prob03.leftPad("ABC",5,'$'));
		System.out.println(prob03.leftPad("ABC",2,'&'));
	}
}
