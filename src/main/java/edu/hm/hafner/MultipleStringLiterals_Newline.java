package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class MultipleStringLiterals_Newline {
    private int a;
    private int b;
    private int c;

    /**
     * Prints sth...
     */
    public void doSth() {
    	
    	
    	
    	
    	
    	
        System.out.println("Dieser String kommt mehrmals vor");
        
        
        
        
        
        
        System.out.println("------");
        System.out.println("Dieser String kommt mehrmals vor");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + a;
        result = prime * result + b;
        result = prime * result + c;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        MultipleStringLiterals_Newline other = (MultipleStringLiterals_Newline)obj;
        if (a != other.a) {
            return false;
        }
        if (b != other.b) {
            return false;
        }
        if (c != other.c) {
            return false;
        }
        return true;
    }


}