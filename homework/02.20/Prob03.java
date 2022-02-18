class Student {

	//Field
	private String name;
	private int age;
	private int id;


	//Constructor
	public Student(String name, int age, int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}

	//setter
	public void setName(String str){
		name = str;
	}
	public void setAge(int i){
		age = i;
	}
	public void setId(int id){
		this.id = id;
	}

	//getter
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getId(){
		return id;
	}

	//method
	public void print(){
		System.out.println("��\t�� : "+getName()+"\t\t��\t�� : "+getAge()+"\t\t��\t�� : "+id);
	}
}

class Teacher {

	//Field
	private String name;
	private int age;
	private String subject;

	//Constructor
	public Teacher(String name, int age,  String subject){
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

	//setter
	public void setName(String str){
		name = str;
	}
	public void setAge(int i){
		age = i;
	}
	public void setId(String subject){
		this.subject = subject;
	}

	//getter
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getSubject(){
		return subject;
	}

	//method
	public void print(){
		System.out.println("��\t�� : "+getName()+"\t\t��\t�� : "+getAge()+"\t\t���  ���� : "+subject);
	}
}

class Employee {

	//Field
	private String name;
	private int age;
	private String dept;

	//Constructor
	public Employee(String name, int age,  String dept){
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	//setter
	public void setName(String str){
		name = str;
	}
	public void setAge(int i){
		age = i;
	}
	public void setId(String dept){
		this.dept = dept;
	}

	//getter
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getDept(){
		return dept;
	}

	//method
	public void print(){
		System.out.println("��\t�� : "+getName()+"\t\t��\t�� : "+getAge()+"\t\t��\t�� : "+dept);
	}
}

public class Prob03 {
	public static void main(String[] args) {

		Student s = new Student("ȫ�浿", 20 , 200201);
		Teacher t = new Teacher("�̼���", 30, "Java");
		Employee e = new Employee("������", 40, "������");
		
		s.print();
		t.print();
		e.print();
	}
}
