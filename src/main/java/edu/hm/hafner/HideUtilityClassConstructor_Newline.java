package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class HideUtilityClassConstructor_Newline {
    /**
     * Adds some numbers.
     *
     * @param numbers
     *            numbers
     * @return the sum
     */
    public static int addNumbers(final int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}
