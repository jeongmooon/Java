package h0304;

import java.io.Serializable;

public class Score implements Serializable {
	//Field
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	
	//Constructor
	public Score() {
	}
	public Score(String name, int kor, int eng, int math, int sum) {
		this.name =name;
		this.kor = kor;
		this.eng = eng;
		this.math =math;
		this.sum = sum;
	}
	
	@Override
	public String toString() {
		return  name + " : " + kor + " " + eng + " " + math + " " + sum;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getSum() {
		return sum;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}

}
