public class Developer1  
{
	String name ="ȫ�浿";
	String job = "������";
	int avglncome = 100;
	int projectCareer;

	public void participateProject() {
		System.out.println("���α׷����߷� ��������, ��½���");
		avglncome++;
		projectCareer++;
	}

	public participateProject(String project){
		Systme.out.println(project+"==> project ������ ��������, ��½���");
		avglncome++;
		projectCareer++;
	}

	public void instruct(){
		System.out.println("���Ǹ� ���� ��������");
		avglncome++;
	}

	public void instruct(int lectureCount){
		System.out.println(lectureCount+"�� ���Ǹ� ���� ��������");
		avglncome+=lectureCount;
	}
}//class
