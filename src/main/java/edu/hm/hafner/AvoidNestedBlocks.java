package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class AvoidNestedBlocks {
    /**
     * Do sth.
     */
    public void guessTheOutput() {
        int result = 0;
        {
            int x = 2;
            result = result + x;
        }
        System.out.println("value = " + result);
    }
}