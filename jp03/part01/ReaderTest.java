package jp03.part01;

import java.io.*;
/*
	1. java.io packag : 프로그램 외부로 자원을 받거나, 전달 경우에 사용
	2. keyboard로 부터 data를 읽어 들이면.........
	==========================================================
	InputStream은 한글처리(2byte)가 되지 않는다.
	문자를 처리하는 Reader 계열로 바꾸면
*/
public class ReaderTest {
	//main
	public static void main(String[] args) throws IOException {		


			//InputStream :: 표준입력장치 추상화한 class
			//InputStream inputStream = System.in;
			//InputStream을 Reader로 변경(byte처리 ==> 문자처리 변경)
			Reader reader = new InputStreamReader(System.in);

			System.out.println("입력을 기다립니다...........");

			// 값을 읽어들이는 무한 loop시작
			while(true){
				//1. java.io는 지연(block)될 수 있다.
				int i;
				i = reader.read();
				char c = (char)i;

				//2. java.io는 FIFO의 구조
				System.out.println("입력하신 값 : "+c);

				//==> char 'x'가 입력되면 while 종료
				if(c == 'x'){
					reader.close();
					break;
				}
				//한글 입력시 깨짐 한글 1EA당 2개 생기는 것을 확인
			}
		
	}
}

