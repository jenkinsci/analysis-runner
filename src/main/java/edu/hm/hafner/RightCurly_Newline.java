package edu.hm.hafner;

import java.util.Date;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class RightCurly_Newline {
    private Date date;
    private int number;
    private final String text;
    
    /**
     * Creates a new instance of {@link RightCurly_Newline}.
     *
     * @param date
     *            Date
     * @param number
     *            number
     * @param text
     *            Text
     */
    public RightCurly_Newline(final Date date, final int number, final String text) {
        this.date = date;
        this.number = number;
        this.text = text;
    }
    
    /**
     * Do sth...
     * 
     * @param a
     *            number
     */
    public void doSth(int a) {
        int b = 0;
        if (a < 0) {
        	
        	
        	
        	
        	
        	
            System.out.println("a<0"); }
        
        
        
        
        
        
        if (a > 0) {
            System.out.println(">0");
            if (a == 1) {
                ++b;
                System.out.println("a=1");
            }
        }
        System.out.println(b);
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