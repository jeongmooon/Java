public class Developer  
{
	String name ="홍길동";
	String job = "개발자";
	int avglncome = 100;
	int projectCareer;

	public void participateProject() {
		System.out.println("프로그램개발로 수입증가, 경력쌓음");
		avglncome++;
		projectCareer++;
	}// participateProject

	public void instruct(){
		System.out.println("강의를 통한 수입증가");
		avglncome++;
	}
}//class
