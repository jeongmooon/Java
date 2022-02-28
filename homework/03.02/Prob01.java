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
		
		System.out.println("�Է� : Korea");
		System.out.println("��� : "+p1.toEncoding("Korea"));
		System.out.println("�Է� : ȫ�浿");
		System.out.println("��� : "+p1.toEncoding("ȫ�浿"));
		System.out.println("�Է� : ȫ �� ��");
		System.out.println("��� : "+p1.toEncoding("ȫ �� ��"));
		System.out.println("�Է� : Hong �� ��");
		System.out.println("��� : "+p1.toEncoding("Hong �� ��"));
		System.out.println("�Է� : 0319");
		System.out.println("��� : "+p1.toEncoding("0319"));		

	}

}
