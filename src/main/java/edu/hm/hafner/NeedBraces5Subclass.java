package edu.hm.hafner;

import java.util.Date;

/**
 * Document type NeedBraces5Subclass.
 *
 * @author Christian M&ouml;stl
 */
public class NeedBraces5Subclass extends NeedBraces5Superclass {
	private final Date date;
	private final int number;
	private final String text;
	
	/**
	 * Creates a new instance of {@link NeedBraces5Subclass}.
	 *
	 * @param date
	 *            Date
	 * @param number
	 *            number
	 * @param text
	 *            Text
	 */
	public NeedBraces5Subclass(final Date date, final int number, final String text) {
		this.date = date;
		this.number = number;
		this.text = text;
	}
	
	/**
	 * Returns the date.
	 *
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	
	/**
	 * Returns the number.
	 *
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * Returns the text.
	 *
	 * @return the text
	 */
	public String getText() {
		return text;
	}
}