public class Iam extends Human {
	//Field
	String job;

	//Constructor
	public Iam(){
		System.out.println("lam class default Constructor");
	}

	//Method
	//setter method
	public void setJob(String str){
		job = str;
	}
	//getter method
	public String getJob(){
		return job;
	}

	//main method
	public static void main(String[] args){
		// 1. �Ʒ��� �ν��Ͻ� ������ ��°���� Ȯ��, �����ϰ�
		// 2. OOP�� �Ϲ�ȭ������ ����(�Ӽ�,����)�� OOPL���� ��� �����ϴ����� �����Ұ�
		// 3. �Ʒ��� �ּ��� Ǯ�� �Ӽ�, ������ ������ Ȯ���Ѵ�.
		Iam iam = new Iam();

		/*
		iam.setName("ȫ�浿");
		iam.setAge(100);
		iam.setJob("������");

		System.out.println("�̸� : "+ iam.getName());
		System.out.println("���� : "+ iam.getAge());
		System.out.println("���� : "+ iam.getJob());
		*/
	}//main
}//class
