class Book {
	//Field
	private String title;
	private int price;

	//Constructor
	public Book(){
	}

	public Book(String title, int price){
		this.title = title;
		this.price = price;
	}

	//setter
	public void setTitle(String title){
		this.title = title;
	}
	public void setPrice(int price){
		this.price = price;
	}

	//getter
	public String getTitle(){
		return title;
	}
	public int getPrice(){
		return price;
	}
}//class

class BookMgr{
	//Field
	private String[] booklist;

	public BooktMgr(String book){
		booklist = book;
	}
}
public class Prob01 {
	public static void main(String[] args) {
		Book[] booklist = new Book[5];

		Book book1 = new Book{"Java Program", 25000};
		Book book2 = new Book{"JSP Program", 15000};
		Book book3 = new Book{"SQL Fundamentals", 30000};
		Book book4 = new Book{"JDBC Program", 28000};
		Book book5 = new Book{};
		book5.setTitle{"EJB Program"};
		book5.setPrice{34000};

		BookMgr mgr = new BookMgr(booklist);

		System.out.println("=== Ã¥ ¸ñ·Ï ===");
		mgr.printBooklist();
		System.out.println("");

		System.out.println("=== cor rkrurdml chdgkq ===");
		mgr.printTotalPrice();
	}
}
