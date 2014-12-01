package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class MethodParamPad {
    private final int x;

    /**
     * Creates a new instance of {@link MethodParamPad}.
     *
     * @param x
     *            number
     */
    public MethodParamPad(final int x) {
        this.x = x;
    }

    /**
     * Do sth.
     */
    public void method () {
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