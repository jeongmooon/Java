public class Developer2Test
{
	public static void main(String[] args) 
	{
		Developer2 developer = new Developer2();

		System.out.println("이름 : "+developer.name);
		System.out.println("직업 : "+developer.job);
		System.out.println("평균수입은 : "+developer.avglncome);
		System.out.println("PTJ경력은 : "+developer.projectCareer);

		System.out.println("==================================");
		
		// method를 호출하여 행위를 통해 상태값 받아 출력
		String name = devloper.getName();
		String job = devloper.getJob();
		int avglncome = devloper.getAvglncome();
		System.out.println("이름 : "+name);
		System.out.println("직업 : "+job);
		System.out.println("평균수입은 : "+avglncome);
		System.out.println("PTJ경력은 : "+projectCareer);
	}// main
}// class
