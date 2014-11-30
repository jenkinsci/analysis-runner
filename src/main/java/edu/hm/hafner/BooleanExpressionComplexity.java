package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class BooleanExpressionComplexity {

    /**
     * This method do sth.
     *
     * @param number
     *            number
     * @return value
     */
    public int toManyBooleanCompares(final int number) {
        if (number > 0 && number < 10 || number > 20 && number < 30 || number == 100) {
            return number;
        }
        else {
            return -1;
        }
    }
}