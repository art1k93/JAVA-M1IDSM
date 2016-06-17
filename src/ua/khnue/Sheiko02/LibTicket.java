package ua.khnue.Sheiko02;
import java.util.Date;

/**
 * The LibTicket class provides the possibility
 * to create a library ticket for reader.
 *
 */
public class LibTicket {
	
	/**
	 * Reader's name.
	 */
	private Reader user;
	
	/**
	 * What book was tacken by reader.
	 */
	private Book userBook;
	
	/**
	 * Term of use.
	 */
	private Date termUse;
	
	/**
	 * Term of return.
	 */
	private Date termReturn;
	
	/**
	 * Sets reader.
	 * @param u - reader's name
	 */
	public final void setUser(final Reader u) {
		user = u;
	}
	
	/**
	 * Sets book witch have been tacken by reader.
	 * @param ur - what book was tacken by reader
	 */
	public final void setUserBook(final Book ur) {
		userBook = ur;
	}
	
	/**
	 * Sets last term of use.
	 * @param tu - term of use
	 */
	public final void setTermUse(final Date tu) {
		termUse = tu;
	}
	
	/**
	 * Sets term of return.
	 * @param tr - term of return
	 */
	public final void setTermReturn(final Date tr) {
		termReturn = tr;
	}
	
	/**
	 * 
	 * @return reader
	 */
	public final Reader getUser() {
		return user;
	}
	
	/**
	 * 
	 * @return book
	 */
	public final Book getUserBook() {
		return userBook;
	}
	
	/**
	 * 
	 * @return term of use
	 */
	public final Date getTermUse() {
		return termUse;
	}
	
	/**
	 * 
	 * @return term of return
	 */
	public final Date getTermReturn() {
		return termReturn;
	}
	
	/**
	 * LibTicket class constructor.
	 * 
	 * @param u - reader's name
	 * @param ub - what book was tacken by reader
	 * @param tu - term of use
	 * @param tr - term of return
	 */
	LibTicket(final Reader u, final Book ub, final Date tu, final Date tr) {
		user = u;
		userBook = ub;
		termUse = tu;
		termReturn = tr;
		System.out.println("class LibTicket: constructor initialized.");
	}

}
