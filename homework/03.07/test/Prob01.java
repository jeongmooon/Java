package h0307.test;

import java.util.Vector;

import h0307.Book;
import h0307.DataFormatException;

public class Prob01 {
	
	private static Book makeBook(String bookData) {
		if(bookData.split(" : ").length != 3) {
			throw new DataFormatException(bookData.split(" : ")[0]+"å ������ ��ȯ�� �� ���� ������ ���� �Դϴ�.");
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
			bookList.add(makeBook("Java Programming ���� : ��ǻ�� : 35000"));
			bookList.add(makeBook("�ʺ��ڸ� ���� SQL : ��ǻ�� : 28000"));
			bookList.add(makeBook("HTML5 API �Ұ� : ��ǻ�� : 58000"));
			
			//Case1
			bookList.add(makeBook("JDBC Programming ���� : ��ǻ�� : 45000"));
			
			//Case2
			//bookList.add(makeBook("JDBC Programming ���� : ��ǻ��"));
			bookList.add(makeBook("JSP PRogramming ��� : ��ǻ�� : 56000"));
			System.out.println("<<å ���>>");
			printBookList(bookList);
			
		}catch (DataFormatException e) {
			System.out.println(e.getMessage());
		} 
	}

}
