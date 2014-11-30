package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class MemberName {
    private final int Number;
    private final String text;

    /**
     * Creates a new instance of {@link MemberName}.
     *
     * @param number
     *            number
     * @param text
     *            text
     */
    public MemberName(final int number, final String text) {
        int someNumber = 2;
        Number = someNumber + number;
        this.text = text;
    }

    /**
     * Returns the number.
     *
     * @return the number
     */
    public int getNumber() {
        return Number;
    }

    /**
     * Returns the text.
     *
     * @return the text
     */
    public String getText() {
        return text;
    }
}