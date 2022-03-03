package h0304.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Vector;

import h0304.SubTest;


public class Prob03 {
	
	public List<SubTest> getList() throws Exception{
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = null; 
		String str = null;
		List<SubTest> vs = new Vector<SubTest>();
				
		System.out.print("경로와 파일이름을 입력하세요 : ");
		try{
			br = new BufferedReader(new FileReader(kb.readLine()));
					
			while((str=br.readLine()) != null) {
				SubTest sb = new SubTest();
				sb.inputScoreList(str);
				vs.add(sb);
			}
		}catch(Exception e) {
			System.out.println(e.getClass() + e.getMessage());
		}
		
		return vs;
	}
	
	public static void main(String[] args) throws Exception {
		Prob03 e = new Prob03();
		List<SubTest> scores = e.getList();
		for (SubTest subTest : scores) {
			System.out.println(subTest);
		}
	}

}
