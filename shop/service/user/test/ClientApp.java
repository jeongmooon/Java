package shop.service.user.test;

import shop.service.user.Client;

public class ClientApp {

	public static void main(String[] args) {
		
		Client c = new Client("ȫ�浿","010","������",false);
		
		System.out.println("�̸� : "+c.getName());
		System.out.println(c);
	}

}
