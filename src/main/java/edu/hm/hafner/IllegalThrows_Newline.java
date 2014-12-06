package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public final class IllegalThrows_Newline {

    private IllegalThrows_Newline() {

    }
    /**
     * Do sth.
     *
     * @param number
     *            number
     * @throws RuntimeException if number < 0
     */
    
    
    
    
    
    
    public static void doSth(final int number) throws RuntimeException {
    	
    	
    	
    	
    	
    	
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        else {
            System.out.println(number);
        }
    }
}