package jp03.part02;

import java.io.*;
/*
	1. byte처리를 위한 Stream인 input/output Stream을 이용하여
		keyboard로 입력, monitor로 출력하는 예.....
	2. 한글처리(문자처리)를 위하여 Reader/Writer계열로 바꾸어 입력,출력
*/
public class WriterTest {
	//main
	public static void main(String[] args) {		

		try{

			//InputStream :: 표준입력장치 추상화한 class
			InputStream inputStream = System.in;
			//InputStream을 Reader로 변경(byte처리 ==> 문자처리 변경)
			Reader reader = new InputStreamReader(inputStream);

			//OutputStream :: 표준출력장치 추상화한 class
			OutputStream outputStream = System.out;
			//문자 처리를 위한 Writer로 변경
			Writer writer = new OutputStreamWriter(outputStream);

			System.out.println("입력을 기다립니다...........");

			// 값을 읽어들이는 무한 loop시작
			while(true){

				int i = reader.read();
				writer.write(i);
				writer.flush();

				if((char)i == 'x'){
					break;
				}
			}
			//==> while문 내부의 flush()와 밖의 flush의 의미는?
			//w.flush();

			//Stream close()
			reader.close();
			writer.close();

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
