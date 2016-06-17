/**
 * The tasktwo program implements an application that 
 * get the possibility to perform a second task.
 * 
 * @author Sheiko Artem
 * @version 1.0
 * @since 2016-03-11
 * 
 * TODO see: vogella.com
 */
package ua.khnue.Sheiko02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * The Library class provides the possibility to create a library.
 * 
 * Class final, so that it can't be extended in subclasses,
 * which is a best practice for utility classes.
 */
public final class Library {

	/**
	 *  Default Library class constructor.
	 *  Prevents the default parameter-less constructor from
	 *  being used elsewhere in code.
	 */
	private Library() {
		
	}
		
	
	/**
	 * Entry point.
	 * 
	 * @param args - args are args that are transmetted from console
	 * @throws ParseException - thrown when an error occurs
	 * when date is in process of parsing
	 */
	public static void main(final String[] args) throws ParseException {
		
		Book fB = new Book("John Tolkien", "The Hobbit", 1937, 10.5f);
		System.out.println("First book is created.");
		System.out.printf("First book info:\n\tAuthor: %s\n\t"
				+ "Book name: %s\n\tPublication year: %s\n\tPrice: %s\n\n",
				fB.getAuthor(), fB.getBookName(), fB.getPubYear(),
				fB.getPrice());
		
		
		Book sB = new Book("Dan Brown", "The Da Vinci Code",
				2003, 19.5f);
		System.out.printf("Second book is created. Let's try "
				+ "to change book price. Current price: %s\n", sB.getPrice());
		System.out.println("Changeing price...");
		sB.setPrice(15.7f);
		System.out.printf("New price: %s\n\n", sB.getPrice());
		
		ScPub scPub = new ScPub("Stephen Hawking", "A Brief History of Time",
				1988, 21.3f, "381.15.24");
		System.out.println("Science publication is created.");
		System.out.printf("Science publication info:\n\tAuthor: %s\n\t"
				+ "Book name: %s\n\tPublication year: %s\n\t"
				+ "Price: %s\n\tUDK: %s\n\n",
				scPub.getAuthor(), scPub.getBookName(), scPub.getPubYear(),
				scPub.getPrice(), scPub.getCode());
		
		ArtPub artPub = new ArtPub("Astrid Ericsson", "Pippi Longstocking",
				1945, 9.5f, "Сhildren's book", 25);
		System.out.println("Artistic publication is created.");
		System.out.printf("Artistic publication info:\n\tAuthor: %s\n\t"
				+ "Book name: %s\n\tPublication year: %s\n\t"
				+ "Price: %s\n\tFormat: %s\n\tNumber of illustrations: %s\n\n",
				artPub.getAuthor(), artPub.getBookName(), artPub.getPubYear(),
				artPub.getPrice(), artPub.getFormat(), artPub.getIllQ());
		System.out.printf("%s is just married. ", artPub.getAuthor());
		artPub.setAuthor("Astrid Lindgren");
		System.out.printf("Now her name is %s.\n\n", artPub.getAuthor());
		
		Reader reader = new Reader("Artem Sheiko",
				"Paris, 15", "+33 970 463 990");
		System.out.println("Reader is created.");
		System.out.printf("Hello!\nMy name is %s. Let's go to the library. "
				+ "I'm looking for some book. "
				+ "Let's see what can I take to read.\n\n", reader.getName());
		
	    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yy hh:mm");
	    Date dateUse = df.parse("12-03-16 9:00");
        Date dateReturn = df.parse("12-03-16 16:30");
		LibTicket fLT = new LibTicket(reader, scPub, dateUse, dateReturn);
		System.out.println("Library ticket is created.");
		System.out.printf("Library ticket info:\n\tWho took a book: %s\n\t"
				+ "What book was tacken: %s (author: %s)\n\t"
				+ "Term of use: %s\n\tTerm of return: %s\n\n",
				fLT.getUser().getName(), fLT.getUserBook().getBookName(),
				fLT.getUserBook().getAuthor(), fLT.getTermUse(),
				fLT.getTermReturn());
	}
}
