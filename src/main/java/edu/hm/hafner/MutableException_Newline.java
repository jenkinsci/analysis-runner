package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class MutableException_Newline extends Exception {
    
    private static final long serialVersionUID = 1L;
    
    
    
    
    
    
    private String two;
    
    
    
    
    
    
    /**
     * Creates a new instance of {@link MutableException_Newline}.
     * 
     * @param s
     *            text
     * @param two
     *            text
     */
    public MutableException_Newline(String s, String two) {
        super(s);
    }
    
    /**
     * Returns the two.
     * 
     * @return the two
     */
    public String getTwo() {
        return two;
    }
}