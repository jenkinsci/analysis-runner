package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class LocalFinalVariableName {
    private final int number;
    private final String text;

    /**
     * Creates a new instance of {@link LocalFinalVariableName}.
     *
     * @param number
     *            number
     * @param text
     *            text
     */
    public LocalFinalVariableName(final int number, final String text) {
        final int SomeNumber = 2;
        this.number = SomeNumber + number;
        this.text = text;
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