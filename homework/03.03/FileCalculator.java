package h0303;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileCalculator {
	
	public void addCalculateResult(String inputFileName) throws Exception {
		BufferedReader br = null;
		String str = null;
		ArrayList<String> arl = new ArrayList<String>();
		br = new BufferedReader(new FileReader(inputFileName));
		
		while ((str=br.readLine()) != null) {
			arl.add(str);
		}
		int sum =0;
		int multi = 1;
		
		
		for (String string : arl) {			
			sum += Integer.parseInt(string);
			multi *= Integer.parseInt(string);
		}

		br.close();
		
		BufferedWriter bw = null;
		bw = new BufferedWriter(new FileWriter(inputFileName, true));
		
		if(sum !=0 && multi != 1) {
			bw.newLine();
			bw.write(Integer.toString(sum));
			bw.newLine();
			bw.write(Integer.toString(multi));
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		FileCalculator fc = new FileCalculator();
		fc.addCalculateResult("D:\\test.txt");
	}

}
