package edu.hm.hafner;

import java.util.Date;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class WhitespaceAfter_Newline {
    private final Date date;
    private final int number;
    private final String text;
    
    /**
     * Creates a new instance of {@link WhitespaceAfter_Newline}.
     *
     * @param date
     *            Date
     * @param number
     *            number
     * @param text
     *            Text
     */
    public WhitespaceAfter_Newline(final Date date, final int number, final String text) {
        this.date = date;
        this.number = number;
        this.text = text;
    }
    
    /**
     * Do sth...
     * @param a number
     */
    public void doSth(int a) {
        if (a > 0) {
            System.out.println(">0");
            if (a == 1) {
            	
            	
            	
            	
            	
            	
            	
                int[] array = {1,2, 3};
                
                
                
                
                
                
                
                System.out.println(array[0]);
                System.out.println("a=1");
                if (a == 2) {
                    System.out.println("a=2");
                }
            }
        }
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