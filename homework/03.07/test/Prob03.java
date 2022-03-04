package h0307.test;

import java.util.Vector;

import h0307.FileUtil;
import h0307.User;

public class Prob03 {

	public static void main(String[] args) throws Exception {
		//고객(유저) 정보를 갖는 FileName 선언
		String pathName = "./src/data1.txt";
		
		//data.txt 내용 출력
		FileUtil.fileToPrint(pathName);
		
		System.out.println("==========================");
		//data.txt 내용중 서울 거주자 검색, 결과를 담은 Vector 인스턴스 받기
		System.out.println("파일 내용중 서울 정보 검색");
		Vector<User> vector = FileUtil.fileFindAddres(pathName, "서울");
		for (User user : vector) {
			System.out.println(user);
		}
		
		System.out.println("==========================");
		//data.txt 내용중 경주 거주자 검색, 결과를 담은 Vector 인스턴스 받기
		System.out.println("파일 내용중 경주 정보 검색");
		Vector<User> vector1 = FileUtil.fileFindAddres(pathName, "경주");
		for (User user : vector1) {
			System.out.println(user);
		}
		
		System.out.println("==========================");
		//data.txt 내용중 경기도 거주자 검색, 결과를 담은 Vector 인스턴스 받기
		System.out.println("파일 내용중 경기도 정보 검색");
		Vector<User> vector2 = FileUtil.fileFindAddres(pathName, "경기도");
		for (User user : vector2) {
			System.out.println(user);
		}
	}

}
