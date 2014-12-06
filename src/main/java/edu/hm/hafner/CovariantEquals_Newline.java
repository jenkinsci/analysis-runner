package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class CovariantEquals_Newline {
    private int x;
    private int y;
    private int z;
    private String s;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((s == null) ? 0 : s.hashCode());
        result = prime * result + x;
        result = prime * result + y;
        result = prime * result + z;
        return result;
    }

    /**
     * Wrong equals..
     *
     * @param b
     *            b
     * @return true or false
     */
    
    
    
    
    
    public boolean equals(final boolean b) {
    	
    	
    	
    	
    	
        return b;
    }
}