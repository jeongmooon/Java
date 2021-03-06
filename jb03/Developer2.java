public class Developer2
{
	String name ="홍길동";
	String job = "개발자";
	int avglncome = 100;
	int projectCareer;

	public void participateProject() {
		System.out.println("프로그램개발로 수입증가, 경력쌓음");
		avglncome++;
		projectCareer++;
	}
	
	/*======추가 method(OverLoading Method)=========
	* project에 참여하여 수입의 증가 및 경력을 쌓음을 나타내는 method
	*1. income 을 1증가
	*2. projectCareer를 1증가
	*/
	public void participateProject(String project){
		System.out.println(project+"==> project 참여로 수입증가, 경력쌓음");
		avglncome++;
		projectCareer++;
	}
	
	public void instruct(){
		System.out.println("강의를 통한 수입증가");
		avglncome++;
	}
	
	/*=========추가 method======================================*/
	public void instruct(int lectureCount){
		System.out.println(lectureCount+"개 강의를 통한 수입증가");
		avglncome+=lectureCount;
	}
	
	///////////////////////// 추가된 부분/////////////////////////////
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
		return avglncome;
	}
	public int getProjectCareer(){
		System.out.println("getprojectCareer() method");
		return projectCareer;
	}

	public static void main(String[] args) 
	{
		Developer2 developer = new Developer2();

		System.out.println("이름 : "+developer.name);
		System.out.println("직업 : "+developer.job);
		System.out.println("평균수입은 : "+developer.avglncome);
		System.out.println("PTJ경력은 : "+developer.projectCareer);

		System.out.println("==================================");
		
		// method를 호출하여 행위를 통해 상태값 받아 출력
		String name = developer.getName();
		String job = developer.getJob();
		int avglncome = developer.getAvlncome();
		int projectCareer = developer.getProjectCareer();
		System.out.println("이름 : "+name);
		System.out.println("직업 : "+job);
		System.out.println("평균수입은 : "+avglncome);
		System.out.println("PTJ경력은 : "+projectCareer);
	}// main


}//class
