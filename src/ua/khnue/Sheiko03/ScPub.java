package ua.khnue.Sheiko03;

/**
 * The ScPub class provides the possibility to create a scientific publication.
 * 
 */
public class ScPub extends Book {

	/**
	 * UDK-code for publication.
	 */
	private String codeUdk;

	/**
	 * Sets UDK-code.
	 * 
	 * @param c
	 *            UDK-code for publication.
	 */
	public final void setCode(final String c) {
		codeUdk = c;
	}

	/**
	 * 
	 * @return UDK-code for publication
	 */
	public final String getCode() {
		return codeUdk;
	}

	/**
	 * ScPub class constructor.
	 * 
	 * @param a
	 *            - author
	 * @param b
	 *            - book name
	 * @param pY
	 *            - publication year
	 * @param p
	 *            - price
	 * @param c
	 *            - UDK-code
	 */
	ScPub(final String a, final String b, final int pY, final double p, final String c) {
		super(a, b, pY, p);
		System.out.println("class ScPub: constructor is initialized.");
		codeUdk = c;
		System.out.println("Scientific publication is created.");
	}

	public void getObjInfo() {
		System.out.printf("Scientific publication info:\n\tAuthor: %s\n\t" + "Book name: %s\n\tPublication year: %s\n\t"
				+ "Price: %s\n\tUDK: %s\n\n", getAuthor(), getBookName(), getPubYear(), getPrice(), getCode());
	}
}
