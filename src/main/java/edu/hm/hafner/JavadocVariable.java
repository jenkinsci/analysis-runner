package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class JavadocVariable {

    public int number = 1;
    private final String text;

    /**
     * Creates a new instance of {@link JavadocVariable}.
     *
     * @param text
     *            Text
     */
    public JavadocVariable(final String text) {
        this.text = text;
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