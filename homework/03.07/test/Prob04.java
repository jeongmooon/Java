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
		
		System.out.print("�й��� �Է��ϼ��� : ");
		ssl.setStdNum(keyboard.nextLine());
		System.out.print("���� ������ �Է��ϼ��� : ");
		ssl.setKor(keyboard.nextInt());
		System.out.print("���� ������ �Է��ϼ��� : ");
		ssl.setMath(keyboard.nextInt());
		System.out.print("���� ������ �Է��ϼ��� : ");
		ssl.setEng(keyboard.nextInt());
		System.out.print("�ڹ� ������ �Է��ϼ��� : ");
		ssl.setJava(keyboard.nextInt());
		ssl.scoreSum();
		ssl.scoreAvg();
		
		Prob04 prob04 = new Prob04();		
		ssl.setGrade(prob04.checkGrade(ssl.getAvg()));
		
		System.out.println(ssl);
				
		String str = null;
		BufferedWriter bw = null;
		bw = new BufferedWriter(new FileWriter("src/grade.txt",true));
		
		bw.write("-------------------\n�й� : "+ssl.getStdNum()+"\n"+
				"-------------------\n"+"���� : "+ssl.getKor()+"\n���� : "+ssl.getMath()+"\n���� : "+ssl.getEng()+"\n�ڹ� : "+ssl.getJava()+"\n"+
				"-------------------\n"+"���� : "+ssl.getSum()+"\n��� : "+ssl.getAvg()+"\n���� : "+ssl.getGrade()+"\n-------------------");
		
		keyboard.close();
		bw.close();
	}

}
