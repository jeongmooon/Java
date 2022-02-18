class School {
	//Field
	private String name;
	private int age;
	
	//Constructor
	public School(String str, int i){
		name = str;
		age = i;
	}

	//setter
	public void setName(String str){
		name = str;
	}
	public void setAge(int i){
		age = i;
	}

	//getter
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}// class

class Student extends School {

	//Field
	private int id;

	//Constructor
	public Student(String str, int age, int id){
		super(str, age);
		this.id = id;
	}

	//setter
	public void setId(int id){
		this.id = id;
	}

	//getter
	public int getId(){
		return id;
	}

	//method
	public void print(){
		System.out.println("이\t름 : "+getName()+"\t\t나\t이 : "+getAge()+"\t\t학\t번 : "+id);
	}
}

class Teacher extends School {

	//Field
	private String subject;

	//Constructor
	public Teacher(String str, int age,  String subject){
		super(str, age);
		this.subject = subject;
	}

	//setter
	public void setId(String subject){
		this.subject = subject;
	}

	//getter
	public String getSubject(){
		return subject;
	}

	//method
	public void print(){
		System.out.println("이\t름 : "+getName()+"\t\t나\t이 : "+getAge()+"\t\t담당  과목 : "+subject);
	}
}

class Employee extends School {

	//Field
	private String dept;

	//Constructor
	public Employee(String str, int age,  String dept){
		super(str, age);
		this.dept = dept;
	}

	//setter
	public void setId(String dept){
		this.dept = dept;
	}

	//getter
	public String getDept(){
		return dept;
	}

	//method
	public void print(){
		System.out.println("이\t름 : "+getName()+"\t\t나\t이 : "+getAge()+"\t\t부\t서 : "+dept);
	}
}

public class Prob02 {
	public static void main(String[] args) {

		Student s = new Student("홍길동", 20 , 200201);
		Teacher t = new Teacher("이순신", 30, "Java");
		Employee e = new Employee("유관순", 40, "교무과");
		
		s.print();
		t.print();
		e.print();
	}
}
