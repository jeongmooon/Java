package h0307;

public class Book {
	//Field
	private String title;
	private String kind;
	private int retanllPrice;
	
	//Constructor
	public Book() {
	}	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", kind=" + kind + ", retanllPrice=" + retanllPrice + "]";
	}

	//getter
	public String getTitle() {
		return title;
	}

	public String getKind() {
		return kind;
	}

	public int getRetanllPrice() {
		return retanllPrice;
	}
	
	//setter
	public void setTitle(String title) {
		this.title = title;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setRetanllPrice(int retanllPrice) {
		this.retanllPrice = retanllPrice;
	}
	

}
