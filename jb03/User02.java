/*
	:: Constructor의미 이해
	1. 인스턴스 새성시 new A()의 의미의 이해
	2. new와 같이 사용되는 특수한행위를 하는 method이해
	3. Constructor 주 작업, 용도는?
	=========================================
	==> 생성자는 인스턴스 생성시 호출된다.
	==> 주 작업은 Field variable 초기화 작업(상태값 설정)
	==> 생성시 상태를 갖는 인스턴스 생성
*/
public class User02 {
	String name;
	int javaLevel;

	//Constructor
	public User02(){
		System.out.println("Constructor Method");
		name = "홍길동";
		javaLevel = 0;
	}

	//Method
	//getter Method definition
	public String getName(){
		return name;
	}
	public int getJavaLevel(){
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
