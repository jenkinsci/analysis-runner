package edu.hm.hafner;

import java.util.Date;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class ParameterName {
    private Date date;
    private int number;
    private final String text;
    
    /**
     * Creates a new instance of {@link ParameterName}.
     *
     * @param date
     *            Date
     * @param number
     *            number
     * @param text
     *            Text
     */
    public ParameterName(final Date date, final int number, final String text) {
        this.date = date;
        this.number = number;
        this.text = text;
    }
    
    /**
     * Do sth...
     * 
     * @param A
     *            number
     */
    public void doSth(int A) {
        int b = 0;
        if (A > 0) {
            System.out.println(">0");
            if (A == 1) {
                ++b;
                System.out.println("a=1");
                if (A == 2) {
                    System.out.println("a=2");
                }
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