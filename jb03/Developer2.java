public class Developer2
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
	
	/*======�߰� method(OverLoading Method)=========
	* project�� �����Ͽ� ������ ���� �� ����� ������ ��Ÿ���� method
	*1. income �� 1����
	*2. projectCareer�� 1����
	*/
	public participateProject(String project){
		Systme.out.println(project+"==> project ������ ��������, ��½���");
		avglncome++;
		projectCareer++;
	}
	
	public void instruct(){
		System.out.println("���Ǹ� ���� ��������");
		avglncome++;
	}
	
	/*=========�߰� method======================================*/
	public void instruct(int lectureCount){
		System.out.println(lectureCount+"�� ���Ǹ� ���� ��������");
		avglncome+=lectureCount;
	}
	
	///////////////////////// �߰��� �κ�/////////////////////////////
	public String getName(){
		System.out.println("getName() method");
		return name;
	}
	public String getJob(){
		System.out.println("getJob() method)");
		return job;
	}
	public int getAvlncome(){
		System.out.println("getAvlncome() method)");
		return avlncome;
	}
	public int getProjectCareer(){
		System.out.println("getprojectCareer() method");
		return projectCareer;
	}

}//class
