package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class MultipleVariableDeclarations {
    private final int number; private final int x;
    private final String text;

    /**
     * Creates a new instance of {@link MultipleVariableDeclarations}.
     *
     * @param number
     *            number
     * @param text
     *            text
     * @param x
     *            number
     */
    public MultipleVariableDeclarations(final int number, final String text, final int x) {
        int someNumber = 2;
        this.number = someNumber + number;
        this.text = text;
        this.x = x;
    }

    /**
     * Returns the x.
     *
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the number.
     *
     * @return the number
     */
    public int getNumber() {
        return number;
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