package ua.khnue.Sheiko02;
/**
 * The Book class provides the possibility to create a book.
 * 
 */
public class Book {
	
	/**
	 * The name of author.
	 */
	private String author;
	
	/**
	 * The name of book.
	 */
	private String bookName;
	
	/**
	 * Publication year.
	 */
	private int pubYear;
	
	/**
	 * Price of the book in $ USA.
	 */
	private float price;
	
	/**
	 * Sets the value for author name.
	 * @param a - name of author
	 */
	public final void setAuthor(final String a) {
		author = a;
	}
	
	/**
	 * Sets the value for book name.
	 * @param b - book name
	 */
	public final void setBookName(final String b) {
		bookName = b;
	}
	/**
	 * Sets the value for publication year.
	 * @param pY - publication year
	 */
	public final void setPubYear(final int pY) {
		pubYear = pY;
	}
	
	/**
	 * Sets the value for price.
	 * @param p - price
	 */
	public final void setPrice(final float p) {
		price = p;
	}
	
	/**
	 * 
	 * @return author name
	 */
	public final String getAuthor() {
		return author;
	}
	
	/**
	 * 
	 * @return book name
	 */
	public final String getBookName() {
		return bookName;
	}
	
	/**
	 * 
	 * @return publication year
	 */
	public final int getPubYear() {
		return pubYear;
	}
	
	/**
	 * 
	 * @return price
	 */
	public final float getPrice() {
		return price;
	}
	
	Book(){
		
	}
	
	/**
	 * Book class constructor.
	 * 
	 * @param a - author
	 * @param b - book name
	 * @param pY - publication year
	 * @param p - price
	 */
	Book(final String a, final String b, final int pY, final float p) {
		author = a;
		bookName = b;
		pubYear = pY;
		price = p;
		System.out.println("class Book: constructor initialized.");
	}
	
}
