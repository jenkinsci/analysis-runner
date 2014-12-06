package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class InnerAssignment_Newline {
    private final String s;
    private int a;

    /**
     * Creates a new instance of {@link InnerAssignment_Newline}.
     *
     * @param s
     *            text
     * @param a
     *            number
     */
    public InnerAssignment_Newline(final String s, final int a) {
        this.s = s;
        this.a = a;
    }

    String doSth() {
    	
    	
    	
    	
    	
        return Integer.toString(a = 2);
        
        
        
        
        
    }

    /**
     * Returns the s.
     *
     * @return the s
     */
    public String getS() {
        return s;
    }

    /**
     * Returns the a.
     *
     * @return the a
     */
    public int getA() {
        return a;
    }
}