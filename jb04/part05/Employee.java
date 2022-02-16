public class Emplyee {
	//Field
	String part,name;
	int age, baseSalary;

	//Constructor
	public Employee(){
		System.out.println("Emp�� default Constructor");
	}
	public Employee(String name){
		this.name = name;
		System.out.println("Emp�� name�� �޴� Constructor);
	}
	public Employee(String name, String part){
		this(name);
		this.part=part;
		System.out.println("Emp�� name,part�� �޴� Constructor);
	}
	public Employee(String name, String part, int age){
		this(name, part);
		this.age = age;
		System.out.println("Emp�� name,part,age�� �޴� Constructor);
	}
	
	//Method
	public int salary(){
		System.out.println("Emp�� salary() method");
		baseSalary = 100;
		return baseSalary;
	}
}//end of class
