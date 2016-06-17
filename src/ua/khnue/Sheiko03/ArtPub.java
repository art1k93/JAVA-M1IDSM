package ua.khnue.Sheiko03;

/**
 * The ArtPub class provides the possibility to create an artistic publication.
 *
 */
public class ArtPub extends Book {

	/**
	 * Publication format.
	 */
	private String format;

	/**
	 * Illustration quantity.
	 */
	private int illQ;

	/**
	 * Sets publication format.
	 * 
	 * @param f
	 *            - publication format
	 */
	public final void setFormat(final String f) {
		format = f;
	}

	/**
	 * Sets illustration quantity.
	 * 
	 * @param i
	 *            - illustration quantity
	 */
	public final void setIllQ(final int i) {
		illQ = i;
	}

	/**
	 * 
	 * @return publication format
	 */
	public final String getFormat() {
		return format;
	}

	/**
	 * 
	 * @return illustration quantity
	 */
	public final int getIllQ() {
		return illQ;
	}

	/**
	 * ArtPub class constructor.
	 * 
	 * @param a
	 *            - author
	 * @param b
	 *            - book name
	 * @param pY
	 *            - publication year
	 * @param p
	 *            - price
	 * @param f
	 *            - format
	 * @param i
	 *            - illustration quantity
	 */
	ArtPub(final String a, final String b, final int pY, final double p, final String f, final int i) {
		super(a, b, pY, p);
		System.out.println("class ArtPub: constructor is initialized.");
		format = f;
		illQ = i;
		System.out.println("Artistic publication is created.");
	}

	public void getObjInfo() {
		System.out.printf(
				"Artistic publication info:\n" + "\tAuthor: %s\n" + "\tBook name: %s\n\tPublication year: %s\n"
						+ "\tPrice: %s\n" + "\tFormat: %s\n" + "\tNumber of illustrations: %s\n\n",
				getAuthor(), getBookName(), getPubYear(), getPrice(), getFormat(), getIllQ());
	}

}
