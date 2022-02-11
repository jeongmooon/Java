/*
	:: Constructor의미 이해
	1. 인스턴스 새성시 new A()의 의미의 이해
	2. new와 같이 사용되는 특수한행위를 하는 method이해
	3. Constructor 주 작업, 용도는?
	=========================================
	==> 생성자는 인스턴스 생성시 호출된다.
	==> 주 작업은 Field variable 초기화 작업(상태값 설정)
	==> 생성시 상태를 갖는 인스턴스 생성
	=========================================
	==> Method OverLoading : Method 다양한 활용
	==> Constructor Method OverLoading : Constructor Method 다양한 활용
	==> 생성시 다양한 상태를 갖는 객체를 생성한다.
*/
public class User03 {
	String name;
	int javaLevel;

	//Constructor
	public User03(){
		System.out.println("나는 생성자");
		name = "홍길동";
		javaLevel = 0;
	}
	
	// 인스턴스 생성시 name 상태값을 설정하는(초기화) 생성자
	public User03(String str){
		System.out.println("나는 String을 인자로 받아 name을 초기화하는 생성자");
		name = str;
	}

	// 인스턴스 생성시 javaLevel 상태값을 설정하는(초기화) 생성자
	public User03(int i){
		System.out.println("나는 int를 인자로 받아 javaLevel을 초기화하는 생성자");
		javaLevel = i;
	}

	//인스턴스 생성시 name, javaLevel 상태값을 설정하는(초기화) 생성자
	public User03(String str, int i){
		System.out.println("나는 String, int를 인자로 받아 name,javaLevel을 초기화하는 생성자");
		name = str;
		javaLevel=i;
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

		//==> 각각의 오버로딩된 생성자를 호출시 상태값을 출력해 보면
		System.out.println("======================================");
		User03 user01 = new User03();
		System.out.println("name :"+user01.getName());
		System.out.println("javaLevel :"+user01.getJavaLevel());

		System.out.println("======================================");
		User03 user02 = new User03("홍길순");
		// 상태값을 설정하지 않은(초기화안한) javaLevel 출력 값은?
		System.out.println("name : "+user02.getName());
		System.out.println("javaLevel : "+user02.getJavaLevel());

		System.out.println("======================================");
		User03 user03 = new User03(100);
		// 상태값을 설정하지 않은(초기화안한) name 출력 값은?
		System.out.println("name : "+user03.getName());
		System.out.println("javaLevel : "+user03.getJavaLevel());

		System.out.println("======================================");
		User03 user04 = new User03("이순신", 200);
		// 상태값을 설정하지 않은(초기화안한) javaLevel 출력 값은?
		System.out.println("name : "+user04.getName());
		System.out.println("javaLevel : "+user04.getJavaLevel());
	}// main
}// class
