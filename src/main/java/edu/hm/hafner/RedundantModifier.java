package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public interface RedundantModifier {
    
    /**
     * Add two numbers.
     * 
     * @param x
     *            number
     * @param y
     *            number
     * @return sum of x and y
     */
    public int add(int x, int y);
    
    /**
     * Prints sth out.
     * 
     * @param s
     *            the text which should be printed
     */
    void print(String s);
}