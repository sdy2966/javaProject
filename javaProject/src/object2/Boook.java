package object2;

public class Boook {
	private String bookTitle;
	private String bookwriter;
	private String bookp;
	private int bookPrice;
	public Boook(String bookTitle, String bookwriter, String bookp,  int bookPrice) {
		super();
		this.bookTitle = bookTitle;
		this.bookwriter = bookwriter;
		this.bookp = bookp;
		this.bookPrice = bookPrice;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookwriter() {
		return bookwriter;
	}
	public void setBookwriter(String bookwriter) {
		this.bookwriter = bookwriter;
	}
	public String getBookp() {
		return bookp;
	}
	public void setBookp(String bookp) {
		this.bookp = bookp;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	
}
