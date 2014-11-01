package edu.hm.hafner;

/**
 * Test.
 *
 * @author Christian M&ouml;stl
 */
public class WhitespaceInIf {

    /**
     * Testmethode.
     *
     * @param a
     *            a number
     * @return <code>true</code>, falls a > 0, sonst <code>false</code>.
     */
    public int doSth(final int a) {
        if(a > 0) {
            return a;
        }
        return 0;
    }
}
