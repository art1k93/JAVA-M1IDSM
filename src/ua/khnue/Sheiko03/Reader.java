package ua.khnue.Sheiko03;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * The ScPub class provides the possibility to create a library's reader.
 *
 */
public class Reader {

	/**
	 * Reader's name.
	 */
	private String name;

	/**
	 * Reader's adress.
	 */
	private String adress;

	/**
	 * Reader's phone number.
	 */
	private String phone;
	
	/**
	 * Array od already read books
	 */
	Map<Integer, Book> alreadyRead = null;

	/**
	 * Sets reader's name.
	 * 
	 * @param n
	 *            - reader's name
	 */
	public final void setName(final String n) {
		name = n;
	}

	/**
	 * Sets reader's adress.
	 * 
	 * @param a
	 *            - reader's adress
	 */
	public final void setAdress(final String a) {
		adress = a;
	}

	/**
	 * Sets reader's phone.
	 * 
	 * @param p
	 *            - phone number
	 */
	public final void setPhone(final String p) {
		phone = p;
	}

	/**
	 * 
	 * @return reader's name.
	 */
	public final String getName() {
		return name;
	}

	/**
	 * 
	 * @return reader's adress.
	 */
	public final String getAdress() {
		return adress;
	}

	/**
	 * 
	 * @return reader's phone.
	 */
	public final String getPhone() {
		return phone;
	}
	
	/**
	 * 
	 * @return reader's phone.
	 */
	public final Map<Integer, Book> getAlreadyRead() {
		return alreadyRead;
	}

	/**
	 * Reader class constructor.
	 * 
	 * @param n
	 *            - reader's name
	 * @param a
	 *            - reader's adress
	 * @param p
	 *            - reader's phone number
	 */
	Reader(final String n, final String a, final String p) {
		System.out.println("class Reader: constructor is initialized.");
		name = n;
		adress = a;
		phone = p;
		alreadyRead = new HashMap<Integer, Book>();
		System.out.println("Reader is created.");
	}
	
	public void getObjInfo() {
		
	}
	
	/*public static manualGeneration() {
		Map<Integer, Book> = new HashMap<Integer, Book>();
	}*/
	
	public void autoGeneration() {
		Random r = new Random();
		int rand = r.nextInt(2) + 1;
		
		if (rand == 1) {
			Book pub = new ScPub(
					(String)Helpers.getRndValue("String", 10),
					(String)Helpers.getRndValue("String", 10),
					(int)Helpers.getRndValue("int", 4),
					(Double)Helpers.getRndValue("double", 4),
					(String)Helpers.getRndValue("String", 10));
			alreadyRead.put(alreadyRead.size()+1, pub);
			
		} else if (rand == 2) {
			Book pub = new ArtPub(
					(String)Helpers.getRndValue("String", 10),
					(String)Helpers.getRndValue("String", 10),
					(int)Helpers.getRndValue("int", 4),
					(Double)Helpers.getRndValue("double", 4),
					(String)Helpers.getRndValue("String", 10),
					(int)Helpers.getRndValue("int", 4));
			alreadyRead.put(alreadyRead.size()+1, pub);
		}
	}
	
	public void manualGeneration(Scanner sc) {
		
		String author, bookName; int pubYear; double price; // simple book
		String codeUdk; // scientific publication
		String format; int illQ; // artistic publication
		
		Random r = new Random();
		int rand = r.nextInt(2) + 1;
		
		if (rand == 1) {
			System.out.println("Научное издание");
			System.out.println("Автор:");
			author = sc.next();
			System.out.println("Название:");
			bookName = sc.next();
			System.out.println("Год издания:");
			pubYear = sc.nextInt();
			System.out.println("Цена:");
			price = sc.nextDouble();
			System.out.println("Код УДК:");
			codeUdk = sc.next();
			Book pub = new ScPub(author, bookName, pubYear, price, codeUdk);
			alreadyRead.put(alreadyRead.size()+1, pub);
		} else if (rand == 2) {
			System.out.println("Художественное издание");
			System.out.println("Автор:");
			author = sc.next();
			System.out.println("Название:");
			bookName = sc.next();
			System.out.println("Год издания:");
			pubYear = sc.nextInt();
			System.out.println("Цена:");
			price = sc.nextDouble();
			System.out.println("Формат:");
			format = sc.next();
			System.out.println("Колличество иллюстрациций:");
			illQ = sc.nextInt();
			Book pub = new ArtPub(author, bookName, pubYear, price, format, illQ);
			alreadyRead.put(alreadyRead.size()+1, pub);
		}
	}

}
