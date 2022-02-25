package jp03.part05;
import java.io.*;

public class FileWriterTestFilter02 {

	public static void main(String[] args) throws IOException {

		//필요객체 Stream/String 인스턴스 declaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		//keyboard로 입력받기위한 Sink Stream Reader 및
		//1개의 line을 읽기편한 readLine() method를 제공하는 BufferedReader 생성
		//Reader r = new InputStreamReader(System.in);
		//br = new  BufferedReader(r);
		br = new BufferedReader(new InputStreamReader(System.in));
		
		//File에 글으 스기위한 FileWriter 및 BufferWriter 생성
		//FileWriter fw = new FileWriter("test.txt");
		//bw = new BufferedWriter(fw);
		bw = new BufferedWriter(new FileWriter("test.txt"));
		//bw = new BufferedWriter(new FileWriter("test.txt",true));
		
		System.out.println("파일에 저장하실 글을 입력하세요");
		while (true) {
			String str = br.readLine();
			if(str.equals("끝")) {
				break;
			}
			bw.write(str,0,str.length());	// API확인하자
			bw.newLine();					// API확인하자
		}
		bw.flush(); //==> 잊지말것
		
		//Stream close()
		bw.close();
		br.close();
	

	}

}
