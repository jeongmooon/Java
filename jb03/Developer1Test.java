public class Developer1Test
{
	public static void main(String[] args) 
	{
		Developer developer = new Developer();

		System.out.println("이름 : "+developer.name);
		System.out.println("직업 : "+developer.job);
		System.out.println("평균수입은 : "+developer.avglncome);
		System.out.println("PTJ경력은 : "+developer.projectCareer);

		System.out.println("==================================");

		developer.participateProject();
		System.out.println("평균수입은 : "+developer.avglncome);
		System.out.println("project참여 경력은 : "+developer.projectCareer);

		System.out.println("==================================");

		developer.instruct();
		System.out.println("평균수입은 : "+developer.avglncome);

		System.out.println("==================================");

		//홍길동이 한미은행 project참여
		String projectName = "한미은행";
		developer.participateProject(projectName);
		//==> 위의 두라인을 아래와 같이 표현함
		//hong1.participateProject("한미은행);
		System.out.println("평균수입은 :"+developer.avglncome);
		System.out.println("project참여 경력은 :"+developer.projectCareer);

		System.out.println("==================================");

		//홍길동이 2개 과목을 강의
		int lectureCount = 2;
		developer.instruct(lectureCount);
		//==>위의 두라인을 아래와 같이 표현함
		//hong1.instruct(2);
		System.out.println("평균수입은 :"+developer.avglncome);
	}// main
}// class
