package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class AnonInnerLength_Newline {
	
	
	
	
	

    private final HelloWorld hello = new HelloWorld() {

    	
    	
    	
    	
    	
        @Override
        public String greet() {
            String sayHello = "Hallo";
            String name = "Christian";

            return sayHello + name;
        }

        @Override
        public int calcSth(final int a, final int b) {
            return a + b;
        }
    };

    /**
     * Returns the hello.
     *
     * @return the hello
     */
    public HelloWorld getHello() {
        return hello;
    }

    /**
     * Test.
     *
     * @author Christian M&ouml;stl
     */
    interface HelloWorld {
        /**
         * Test.
         *
         * @return test
         */
        String greet();

        /**
         * Calcs sth.
         *
         * @param a
         *            number
         * @param b
         *            number
         * @return result
         */
        int calcSth(int a, int b);
    }
}