package h0303;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileCompareUtil {
	public void printFile(String fstFileName, String scdFileName) throws Exception {
		
		for (String value : compareFile(fstFileName, scdFileName)) {		
			System.out.println(value);
		}
	}
	
	public ArrayList<String> compareFile(String fstFileName, String scdFileName) throws Exception {
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		br1 = new BufferedReader(new FileReader(fstFileName));
		br2 = new BufferedReader(new FileReader(scdFileName));
		
		String str = null;
		String str1 = null;
		int c = 1;
		ArrayList<String> al = new ArrayList<String>();
		while ((str=br1.readLine()) != null) {
			if(!(str.equals(str1=br2.readLine()))){
				al.add("Line "+c+":"+str1);
			}
			c++;
		}
		
		br1.close();
		br2.close();
		
		return al;
	}

	public static void main(String[] args) throws Exception {
		FileCompareUtil util = new FileCompareUtil();
		//System.out.println(util.compareFile("./files/fstFile.txt", "./files/scdFile.txt"));		
		util.printFile("./files/fstFile.txt", "./files/scdFile.txt");
		System.out.println("Successfull!!");
	}

}
