package h0303;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Grade {
	
	public void printGrade(String fileName) throws Exception {
		BufferedReader br = null;
		String str = null;
		
		br = new BufferedReader(new FileReader(fileName));
		
		ArrayList<String> arl = new ArrayList<String>();
		
		while ((str=br.readLine()) != null) {
			arl.add(str);
		}
		
		int sum =0;
		int avg =sum/arl.size();
		
		for (String string : arl) {			
			System.out.println(string.split(",")[0]+"�� ������ "+string.split(",")[1]+"�� �Դϴ�.");
			sum += Integer.parseInt(string.split(",")[1]);
			avg =sum/arl.size();
		}
		
		System.out.println("����� ������ "+sum+"�� �Դϴ�.");
		System.out.println("����� ����� "+avg+"�� �Դϴ�.");
		
		br.close();
	}

	public static void main(String[] args) throws Exception {
		Grade grade = new Grade();
		String fileName = "score.txt";
		grade.printGrade(fileName);
	}

}
