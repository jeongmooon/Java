public class Manager extends Employee {
	//Field
	int salary;

	//Constructor
	public Manager(){
		System.out.println("Manager의 default Constructor");
	}
	public Manager(String name){
		super(name);
		System.out.println("Manager의 name을 받는 Constructor");
	}
	public Manager(String name, String part){
		super(name);
		this.part = part;
		System.out.println("Manager의 name,part를 받는 Constructor");
	}
	public Manager(String name, String part, int age){
		super(name, part);
		this.age = age;
		System.out.println("Manager의 name,part,age를 Constructor");
	}
	public Manager(String name, String part, int age, int slary){
		super(name, part, age);
		this.salary = salary;
		System.out.println("Manager의 name,part,age,salary를 Constructor");
	}

	//Method
	public int salary(){
		System.out.println("Manager의 salary method");
		baseSalary = 200;
		return baseSalary;
	}

	public void callSalary(){
		System.out.println("Employee의 기본급은 : "+super.salary());
		System.out.println("Manager의 기본급은 1: "+this.salary());
		System.out.println("Manager의 기본급은 2: "+salary());
	}

	//Main Method
	public static void main(String[] args) {
		Manager m1 = new Manager("홍길동");
		/*
		Manager m2 = new Manager("홍길동"."EJB");
		Manager m3 = new Manager("홍길동","EJB",25);
		Manager m4 = new Manager("홍길동","EJB",25,300);
		System.out.print("\n");

		System.out.println("overriding된 salary호출 : "+m4.salary());
		m4.callSalary();
		*/
	}//main
}//class
