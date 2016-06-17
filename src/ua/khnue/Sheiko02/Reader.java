package ua.khnue.Sheiko02;

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
	 * Sets reader's name.
	 * @param n - reader's name
	 */
	public final void setName(final String n) {
		name = n;
	}
	
	/**
	 * Sets reader's adress.
	 * @param a - reader's adress
	 */
	public final void setAdress(final String a)	{
		adress = a;
	}
	
	/**
	 * Sets reader's phone.
	 * @param p - phone number
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
	public  final String getPhone() {
		return phone;
	}
	
	Reader() {

	}
	
	/**
	 * Reader class constructor.
	 * 
	 * @param n - reader's name
	 * @param a - reader's adress
	 * @param p - reader's phone number
	 */
	Reader(final String n, final String a, final String p) {
		name = n;
		adress = a;
		phone = p;
		System.out.println("class Reader: constructor initialized.");
	}
	
}
