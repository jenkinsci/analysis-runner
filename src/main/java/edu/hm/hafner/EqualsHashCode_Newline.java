package edu.hm.hafner;

/**
 * Document type EqualsHashCode.
 *
 * @author Christian M&ouml;stl
 */
public class EqualsHashCode_Newline {
    private int a;
    private int b;
    private int c;

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
        EqualsHashCode_Newline other = (EqualsHashCode_Newline)obj;
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