package ua.khnue.Sheiko02;

/**
 * The ArtPub class provides the possibility to create an artistic publication.
 *
 */
class ArtPub extends Book {
	
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
	 * @param f - publication format
	 */
	public final void setFormat(final String f) {
		format = f;
	}
	
	/**
	 * Sets illustration quantity.
	 * @param i - illustration quantity
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
	 * ArtPub  class constructor.
	 * 
	 * @param a - author
	 * @param b - book name
	 * @param pY - publication year
	 * @param p - price
	 * @param f - format
	 * @param i - illustration quantity
	 */
	ArtPub(final String a, final String b,
			final int pY, final float p,
			final String f, final int i) {
		super(a, b, pY, p);
		format = f;
		illQ = i;
		System.out.println("class ArtPub: constructor initialized.");	
	}

}
