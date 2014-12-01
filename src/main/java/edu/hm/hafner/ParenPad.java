package edu.hm.hafner;

import java.util.Date;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class ParenPad {
    private Date date;
    private int number;
    private final String text;
    
    /**
     * Creates a new instance of {@link ParenPad}.
     *
     * @param date
     *            Date
     * @param number
     *            number
     * @param text
     *            Text
     */
    public ParenPad(final Date date, final int number, final String text) {
        this.date = date;
        this.number = number;
        this.text = text;
    }
    
    /**
     * Do sth...
     * 
     * @param one
     *            number
     * @param two
     *            number
     * @param three
     *            number
     * @param four
     *            number
     * @param five
     *            number
     * @param six
     *            number
     * @param seven
     *            number
     */
    public void anything(int one, int two, int three, int four, int five, int six, int seven) {
        int result = one + two + three + four + five + six + seven;
        doSth(3 );
        
        System.out.println(result);
    }
    
    /**
     * Do sth...
     * 
     * @param a
     *            number
     */
    public void doSth(int a) {
        int b = 0;
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