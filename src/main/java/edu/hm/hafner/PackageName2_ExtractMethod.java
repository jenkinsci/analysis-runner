package Edu.hm.hafner;

import java.util.Date;

/**
 * Document type PackageName2_ExtractMethod.
 *
 * @author Christian M&ouml;stl
 */
public class PackageName2_ExtractMethod {
	private Date date; 
    private int number;
    private final String text;
    
    /**
     * Creates a new instance of {@link PackageName2_ExtractMethod}.
     *
     * @param date
     *            Date
     * @param number
     *            number
     * @param text
     *            Text
     */
    public PackageName2_ExtractMethod(final Date date, final int number, final String text) {
        this.date = date;
        this.number = number;
        this.text = text;
    }
        
    /**
     * Do sth...
     * @param a number
     */
    public void doSth(int a) {
        int b = 0;
        b = extractMethod(a, b);
        System.out.println(b);
    }

	private int extractMethod(int a, int b) {
		if (a > 0) {
            System.out.println(">0");
            if (a == 1) {
                ++b;
                System.out.println("a=1");
                if (a == 2) {
                    System.out.println("a=2");
                }
            }
        }
		return b;
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