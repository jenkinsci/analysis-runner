package edu.hm.hafner;

import java.util.Date;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class NeedBraces2_ExtractMethod {
	private final Date date;
	private final int number;
	private final String text;
	
	/**
	 * Creates a new instance of {@link NeedBraces2_ExtractMethod}.
	 *
	 * @param date
	 *            Date
	 * @param number
	 *            number
	 * @param text
	 *            Text
	 */
	public NeedBraces2_ExtractMethod(final Date date, final int number, final String text) {
		this.date = date;
		this.number = number;
		this.text = text;
	}
	
	/**
	 * Do sth.
	 * 
	 * @param a
	 *            number
	 * @return return sth.
	 */
	public int doSth(final int a) {
		System.out.println(a);
		int x = 3;
		x = extractMethod(a, x);
		
		return x;
	}

	private int extractMethod(final int a, int x) {
		if (a < 0)
			x = x - a;
		else {
			x = x + a;
		}
		return x;
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