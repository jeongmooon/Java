package h0307.test;

import java.util.Vector;

import h0307.Book;
import h0307.DataFormatException;

public class Prob01 {
	
	private static Book makeBook(String bookData) {
		if(bookData.split(" : ").length != 3) {
			throw new DataFormatException(bookData.split(" : ")[0]+"책 정보는 변환할 수 없는 데이터 포맷 입니다.");
		}
		
		Book book = new Book();		
		//System.out.println(bookData.split(" : ")[2]);
		book.setTitle(bookData.split(" : ")[0]);
		book.setKind(bookData.split(" : ")[1]);
		book.setRetanllPrice(Integer.parseInt(bookData.split(" : ")[2]));
		
		return book;
		
	}
	private static void printBookList(Vector<Book> bookList) {
		for (Object object : bookList) {
			System.out.println(object);
		}
	}
	
	public static void main(String[] args) {
		Vector<Book> bookList = new Vector<Book>();		
		try {
			bookList.add(makeBook("Java Programming 기초 : 컴퓨터 : 35000"));
			bookList.add(makeBook("초보자를 위한 SQL : 컴퓨터 : 28000"));
			bookList.add(makeBook("HTML5 API 소개 : 컴퓨터 : 58000"));
			
			//Case1
			bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터 : 45000"));
			
			//Case2
			//bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터"));
			bookList.add(makeBook("JSP PRogramming 고급 : 컴퓨터 : 56000"));
			System.out.println("<<책 목록>>");
			printBookList(bookList);
			
		}catch (DataFormatException e) {
			System.out.println(e.getMessage());
		} 
	}

}
