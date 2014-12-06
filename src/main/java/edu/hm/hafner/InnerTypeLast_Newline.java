package edu.hm.hafner;

import java.util.Date;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class InnerTypeLast_Newline {

    private final Date date;
    private final int number;
    private final String text;

    /**
     * Creates a new instance of {@link InnerTypeLast_Newline}.
     *
     * @param date
     *            Date
     * @param number
     *            number
     * @param text
     *            Text
     */
    public InnerTypeLast_Newline(final Date date, final int number, final String text) {
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
    *
    * Inner-Class.
    *
    * @author Christian M&ouml;stl
    */
   class InnerClass {
       void doSth() {
           System.out.println("Hello");
       }
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