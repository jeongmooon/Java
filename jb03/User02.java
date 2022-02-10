/*
	:: Constructor�ǹ� ����
	1. �ν��Ͻ� ������ new A()�� �ǹ��� ����
	2. new�� ���� ���Ǵ� Ư���������� �ϴ� method����
	3. Constructor �� �۾�, �뵵��?
	=========================================
	==> �����ڴ� �ν��Ͻ� ������ ȣ��ȴ�.
	==> �� �۾��� Field variable �ʱ�ȭ �۾�(���°� ����)
	==> ������ ���¸� ���� �ν��Ͻ� ����
*/
public class User02 {
	String name;
	int javaLevel;

	//Constructor
	public User02(){
		System.out.println("Constructor Method");
		name = "ȫ�浿";
		javaLevel = 0;
	}

	//Method
	//getter Method definition
	public String getName(){
		return name;
	}
	public String getJavaLevel(){
		return javaLevel;
	}

	//main method
	public static void main(String[] args) {
		System.out.println("======================================");
		User02 user = new User02();
		System.out.println("======================================");

		System.out.println("name : "+user.getName());
		System.out.println("javaLevel : "+user.getJavaLevel());
	}// main
}// class
