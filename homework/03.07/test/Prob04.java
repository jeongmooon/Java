package h0307.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

import h0307.StudentScoreList;

public class Prob04 {
	public static char checkGrade(double avg) {
		char grade = 'F';
		
		switch ((int)avg/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
		default:
			break;
		}
		
		return grade;
	}
	
	public static void main(String[] args) throws Exception {		
				
		Scanner keyboard = new Scanner(System.in);
		StudentScoreList ssl = new StudentScoreList();
		
		System.out.print("학번을 입력하세요 : ");
		ssl.setStdNum(keyboard.nextLine());
		System.out.print("국어 성적을 입력하세요 : ");
		ssl.setKor(keyboard.nextInt());
		System.out.print("수학 성적을 입력하세요 : ");
		ssl.setMath(keyboard.nextInt());
		System.out.print("영어 성적을 입력하세요 : ");
		ssl.setEng(keyboard.nextInt());
		System.out.print("자바 성적을 입력하세요 : ");
		ssl.setJava(keyboard.nextInt());
		ssl.scoreSum();
		ssl.scoreAvg();
		
		Prob04 prob04 = new Prob04();		
		ssl.setGrade(prob04.checkGrade(ssl.getAvg()));
		
		System.out.println(ssl);
				
		String str = null;
		BufferedWriter bw = null;
		bw = new BufferedWriter(new FileWriter("src/grade.txt",true));
		
		bw.write("-------------------\n학번 : "+ssl.getStdNum()+"\n"+
				"-------------------\n"+"국어 : "+ssl.getKor()+"\n수학 : "+ssl.getMath()+"\n영어 : "+ssl.getEng()+"\n자바 : "+ssl.getJava()+"\n"+
				"-------------------\n"+"총점 : "+ssl.getSum()+"\n평균 : "+ssl.getAvg()+"\n학점 : "+ssl.getGrade()+"\n-------------------");
		
		keyboard.close();
		bw.close();
	}

}
