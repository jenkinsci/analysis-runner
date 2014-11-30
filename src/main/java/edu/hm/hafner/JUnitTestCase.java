package edu.hm.hafner;

import org.junit.Test;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class JUnitTestCase {

    /**
     * SetUp-Method.
     */
    @Test
    public void setup() {
        System.out.println("do something for starting...");
    }

    /**
     * The JUnit-tearDown()-method.
     */
    public void tearDown() {
        System.out.println("finishing....");
    }
}