public class DeveloperTest
{
	public static void main(String[] args) 
	{
		Developer developer = new Developer();

		System.out.println("�̸� : "+developer.name);
		System.out.println("���� : "+developer.job);
		System.out.println("��ռ����� : "+developer.avglncome);
		System.out.println("PTJ����� : "+developer.projectCareer);

		System.out.println("==================================");

		developer.participateProject();
		System.out.println("��ռ����� : "+developer.avglncome);
		System.out.println("project���� ����� : "+developer.projectCareer);

		System.out.println("==================================");

		developer.instruct();
		System.out.println("��ռ����� : "+developer.avglncome);
	}// main
}// class