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
		son.setName("ȫ�浿�� �Ƶ�");
		son.setAge(50);
		son.setJob("�������غ���");
		son.setSchool("��Ʈ��������");

		System.out.println("�̸� : "+ Son.getName());
		System.out.println("���� : "+ Son.getAge());
		System.out.println("���� : "+ Son.getJob());
		System.out.println("������� : "+ Son.getSchool());
		*/
	}//main
}//class
