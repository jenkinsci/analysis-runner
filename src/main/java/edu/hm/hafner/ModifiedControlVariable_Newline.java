package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class ModifiedControlVariable_Newline {
    private final int x;

    /**
     * Creates a new instance of {@link ModifiedControlVariable_Newline}.
     *
     * @param x
     *            number
     */
    public ModifiedControlVariable_Newline(final int x) {
        this.x = x;
        for (int i = 0; i < x; i++) {
        	
        	
        	
        	
        	
            i++;
            
            
            
            
            
            
        }
        System.out.println("Vorheriges sollte vermieden werden.");
    }

    /**
     * Do sth.
     */
    public void method() {
        System.out.println("prints sth...");
    }

    /**
     * Returns the x.
     *
     * @return the x
     */
    public int getX() {
        return x;
    }
}