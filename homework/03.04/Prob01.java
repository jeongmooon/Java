package h0304;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;
import java.util.List;

public class Prob01 {

	public List<String> getList() throws Exception{
		BufferedReader br = null; 
		String str = null;
		List<String> vs = new Vector<String>();
		br = new BufferedReader(new FileReader("src/list.txt"));
		
		while((str=br.readLine()) != null) {
			String pf = "";
			if(str.split("/")[1].toUpperCase().equals("JAVA")) {
				if(Integer.parseInt(str.split("/")[2])>=80) {
					pf = "수료";
				} else {
					pf = "미수료";
				}
			} else if(str.split("/")[1].toUpperCase().equals("SQL")) {
				if(Integer.parseInt(str.split("/")[2])>=90) {
					pf = "수료";
				} else {
					pf = "미수료";
				}
			} else {
				pf ="미수료";
			}
			vs.add("["+str.split("/")[0]+", "+str.split("/")[1]+", "+str.split("/")[2]+", "+pf+"]");
		}
		br.close();
		
		return vs;
	}

	public static void main(String[] args) throws Exception {
		Prob01 e = new Prob01();
		List<String> scores = e.getList();
		for (String string : scores) {
			System.out.println(string);
		}
	}	
}
