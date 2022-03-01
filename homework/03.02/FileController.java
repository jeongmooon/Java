package h0302;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;

public class FileController {
	public void reverseLine(String oldf, String newf) throws Exception{
		//String[] a = oldf.split("\n");
		//System.out.println(a[0]);
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		br = new BufferedReader(new FileReader(oldf));		
		bw = new BufferedWriter(new FileWriter(newf));
		
		
		String source = null;
		String str = "";
		while ((source=br.readLine()) != null) {			
			str += source+"\n";
		}
		
		
		String[] a = str.split("\n");
		
		
		for(int i=0; i<a.length; i++) {
			bw.write(a[a.length-i-1]);
			bw.newLine();
		}		
		
		bw.flush();
		
		bw.close();
		br.close();
	}

	public static void main(String[] args) throws Exception {
		FileController c = new FileController();
		String oldf ="files/oldf.txt";
		String newf ="files/newf.txt";
		c.reverseLine(oldf,newf);

	}

}
