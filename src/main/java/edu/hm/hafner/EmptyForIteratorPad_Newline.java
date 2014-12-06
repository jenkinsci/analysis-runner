package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class EmptyForIteratorPad_Newline {
    private final int result;

    /**
     * Creates a new instance of {@link EmptyForIteratorPad_Newline}.
     *
     * @param number
     *            number
     */
    public EmptyForIteratorPad_Newline(final int number) {
        int r = 0;
        
        
        
        
        
        for (int i = 0; i < number; ) {
        	
        	
        	
        	
        	
            r += i;
        }
        result = r;
    }

    /**
     * Returns the result.
     *
     * @return the result
     */
    public int getResult() {
        return result;
    }
}