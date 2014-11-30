package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class HiddenField {
    private final int number;

    /**
     * Creates a new instance of {@link HiddenField}.
     *
     * @param number
     *            number
     */
    public HiddenField(final int number) {
        this.number = number;
    }

    /**
     * Calculates sth.
     *
     * @param number
     *            number
     * @return Returns the sum
     */
    public int calc(final int number) {
        return this.number + number;
    }
}