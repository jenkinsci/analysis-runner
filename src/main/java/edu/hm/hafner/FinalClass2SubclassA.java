package edu.hm.hafner;

/**
 * Document type FinalClass2SubclassA.
 *
 * @author Christian M&ouml;stl
 */
public class FinalClass2SubclassA extends FinalClass2Superclass {
	private int x;
	
	private FinalClass2SubclassA() {
		
	}
	
	/**
	 * Do sth.
	 * 
	 * @param number
	 *            number
	 */
	public static void doSth(final int number) {
		System.out.println("Hello");
		int a = 3;
		int b = 7;
		int result = a + b;
		System.out.println(number + result);
	}
}