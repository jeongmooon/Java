public class Human {
	//Field
	String name;
	int age;

	//Constructor
	public Human(){
		System.out.println("Human class default Constructor");
	}
	public Human(String str){
		System.out.println("Human class의 name을 받은 Constructor");
		name =str;
	}

	//Method
	//setter method
	public void setName(String str){
		name = str;
	}
	public void setAge(int b){
		age =b;
	}
	//getter method
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}//class
