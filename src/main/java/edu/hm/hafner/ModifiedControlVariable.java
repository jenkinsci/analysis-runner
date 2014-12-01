package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class ModifiedControlVariable {
    private final int x;

    /**
     * Creates a new instance of {@link ModifiedControlVariable}.
     *
     * @param x
     *            number
     */
    public ModifiedControlVariable(final int x) {
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