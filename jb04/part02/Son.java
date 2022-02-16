public class Son extends Iam {
	//Field
	String school;

	//Constructor
	public Son(){
		System.out.println("Son class default Constructor");
	}

	//Method(setter method)
	public void setSchool(String str){
		school = str;
	}

	//getter method
	public String getSchool(){
		return school;
	}

	public static void main(String[] args) {
		Son son = new Son();

		/*
		son.setName("홍길동의 아들");
		son.setAge(50);
		son.setJob("개발자준비중");
		son.setSchool("비트교육센터");

		System.out.println("이름 : "+ Son.getName());
		System.out.println("나이 : "+ Son.getAge());
		System.out.println("직업 : "+ Son.getJob());
		System.out.println("교육기관 : "+ Son.getSchool());
		*/
	}//main
}//class
