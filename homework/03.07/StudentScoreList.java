package h0307;

public class StudentScoreList {
	//Filed
	private String stdNum;
	private int kor;
	private int math;
	private int eng;
	private int java;	
	private int sum;
	private double avg;
	private char grade;
	
	public StudentScoreList() {
	}

	public StudentScoreList(String stdNum, int kor, int math, int eng, int java, int sum, double avg, char grade) {
		super();
		this.stdNum = stdNum;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.java = java;
		this.sum = sum;
		this.avg = avg;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "-------------------\n학번 : "+stdNum+"\n"+
				"-------------------\n"+"국어 : "+kor+"\n수학 : "+math+"\n영어 : "+eng+"\n자바 : "+java+"\n"+
				"-------------------\n"+"총점 : "+sum+"\n평균 : "+avg+"\n학점 : "+grade+"\n-------------------";
	}
	
	//getter
	public String getStdNum() {
		return stdNum;
	}

	public int getKor() {
		return kor;
	}

	public int getMath() {
		return math;
	}

	public int getEng() {
		return eng;
	}

	public int getJava() {
		return java;
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}

	public char getGrade() {
		return grade;
	}
	
	//setter
	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void scoreSum() {
		sum = kor+math+eng+java;
	}
	
	public void scoreAvg() {
		avg = ((double)(kor+math+eng+java))/4;
	}
	
	
}
