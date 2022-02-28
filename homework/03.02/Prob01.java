package h0302;

import sun.awt.SunHints.Value;

public class Prob01 {
	
	public String toEncoding(String str) {
		
		String result = "";
		for(int i=0; i<str.length(); i++) {
			if('A'<str.charAt(i)&&str.charAt(i)<'z') {
				result +=str.charAt(i);
			} else if(str.charAt(i)<='9' && '0'<= str.charAt(i)) {
				result += str.charAt(i);				
			} else {
				String p ="";
				p +=str.charAt(i);				
				byte[] b = p.getBytes();
				
				String o ="";
				for(int j=0; j<b.length; j++) {
					o += Integer.toHexString(b[j]);
				}
				result += o.replace("ffffff", "%").replace("20", " ").toUpperCase();
//				System.out.println(s);
			} 
		}
		
		return result;
	}

	public static void main(String[] args) {
		Prob01 p1 = new Prob01();
		
		System.out.println("입력 : Korea");
		System.out.println("출력 : "+p1.toEncoding("Korea"));
		System.out.println("입력 : 홍길동");
		System.out.println("출력 : "+p1.toEncoding("홍길동"));
		System.out.println("입력 : 홍 길 동");
		System.out.println("출력 : "+p1.toEncoding("홍 길 동"));
		System.out.println("입력 : Hong 길 동");
		System.out.println("출력 : "+p1.toEncoding("Hong 길 동"));
		System.out.println("입력 : 0319");
		System.out.println("출력 : "+p1.toEncoding("0319"));		

	}

}
