/**
 * The program implements an application that 
 * get the possibility to perform a third task.
 * 
 * @author Sheiko Artem
 * @version 1.0
 * @since 2016-03-11
 * 
 * TODO see: vogella.com
 */
package ua.khnue.Sheiko03;

import java.text.ParseException;
import java.util.Scanner;


/**
 * The Library class provides the possibility to create a library.
 */
public final class Library {

	/**
	 *  Default Library class constructor.
	 *  Prevents the default parameter-less constructor from
	 *  being used elsewhere in code.
	 */
	private Library() {
		
	}
	
	public static final int NUM_PUBLICATIONS = 3;
	
	/**
	 * Entry point.
	 * 
	 * @param args - args are args that are transmetted from console
	 * @throws ParseException - thrown when an error occurs
	 * when date is in process of parsing
	 */
	public static void main(final String[] args) throws ParseException {
		
		int pressed;
			
		
		Reader libraryReader = new Reader("Artem Sheiko",
				"Paris, 15", "+33 970 463 990");		
		System.out.println("Выберите вариант:\n 1.Ручной ввод 2.Автоматическое создание\n");
		Scanner sc = new Scanner(System.in);
		while (true) {
			pressed = sc.nextInt();
			if (pressed == 1) {
				for (int i = 0; i < NUM_PUBLICATIONS; i++) {
					libraryReader.manualGeneration(sc);	
				}
				break;
			} else if (pressed == 2) {
				for (int i = 0; i < NUM_PUBLICATIONS; i++) {
					libraryReader.autoGeneration();	
				}
				libraryReader.getAlreadyRead().get(1).getObjInfo();
				break;
			} else {
				System.out.print("Неверный формат ввода. Попробуйте еще раз\n");
			}
		}
		
		libraryReader.getAlreadyRead().forEach((k,v) -> {
			System.out.printf("Book id: %s;\nBook info:\n", k);
			v.getObjInfo();
		});
		
		/*
		// Task 2 rerun (method getObjInfo() is added)
		
		Book fB = new Book("John Tolkien", "The Hobbit", 1937, 10.5f);
		fB.getObjInfo();
		
		Book sB = new Book("Dan Brown", "The Da Vinci Code",
				2003, 19.5f);
		System.out.printf("\nLet's try to change book's price. "
				+ "Current price: %s\nChangeing price...\n", sB.getPrice());
		sB.setPrice(15.7f);
		System.out.printf("New price: %s\n\n", sB.getPrice());
		
		ScPub scPub = new ScPub("Stephen Hawking", "A Brief History of Time",
				1988, 21.3f, "381.15.24");
		scPub.getObjInfo();
		
		ArtPub artPub = new ArtPub("Astrid Ericsson", "Pippi Longstocking",
				1945, 9.5f, "Children's book", 25);
		artPub.getObjInfo();
		
		System.out.printf("%s has just married. ", artPub.getAuthor());
		artPub.setAuthor("Astrid Lindgren");
		System.out.printf("Now her name is %s.\n\n", artPub.getAuthor());
		artPub.getObjInfo();
		
		Reader reader = new Reader("Artem Sheiko",
				"Paris, 15", "+33 970 463 990");
		reader.getObjInfo();
		
	    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yy hh:mm");
	    Date dateUse = df.parse("12-03-16 9:00");
        Date dateReturn = df.parse("12-03-16 16:30");
		LibTicket fLT = new LibTicket(reader, scPub, dateUse, dateReturn);
		fLT.getObjInfo();*/

		
	}
}
