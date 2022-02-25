package shop.service.user.test;

import shop.service.user.Client;

public class ClientApp {

	public static void main(String[] args) {
		
		Client c = new Client("홍길동","010","개발자",false);
		
		System.out.println("이름 : "+c.getName());
		System.out.println(c);
	}

}
