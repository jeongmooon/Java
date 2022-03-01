package h0302;

public class Prob02 {
	
	public static String getParameter(String url, String paramName) {
		//String a[] =url.split("\\?");		
		//String[] b = a[1].split("&");
		
		String[] b = url.split("\\?")[1].split("&");
		String result = "";
		
		for(int i=0; i<b.length; i++) {
			if(b[i].contains(paramName)) {
				result = b[i].split("=")[1];				
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		String url1
			= "http://localhost/order?prodid=PROD-001&prodName=������3&price=980000";
		
		String prodName = getParameter(url1,"prodName");
		System.out.println("��ǰ �̸� : "+prodName);
		
		String url2
			= "http://localhost/registUser?userId=USER-001&userName=ȫ�浿&address=����� ������&userAge=26";
		
		String userAddress = getParameter(url2,"address");
		System.out.println("ȸ�� �ּ� : "+userAddress);
	}

}
