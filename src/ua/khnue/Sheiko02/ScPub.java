package ua.khnue.Sheiko02;
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
	 * @param c UDK-code for publication.
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
	 * @param a - author
	 * @param b - book name
	 * @param pY - publication year
	 * @param p - price
	 * @param c - UDK-code
	 */
	ScPub(final String a, final String b, final int pY,
			final float p, final String c) {
		super(a, b, pY, p);
		codeUdk = c;
		System.out.println("class ScPub: constructor initialized.");
	}
	
}
