package edu.hm.hafner;

/**
 * Document type MethodName6_InlineMethod.
 *
 * @author Christian M&ouml;stl
 */
public class MethodName6_InlineMethod {
	private MethodName6_InlineMethod() {
		
	}
	
	/**
	 * Do sth...
	 * 
	 * @param a
	 *            number
	 */
	public void DoSth(int a) {
		int b = 0;
		if (a > 0) {
			System.out.println(">0");
			if (a == 1) {
				++b;
				System.out.println("a=1");
				if (a == 2) {
					System.out.println("a=2");
				}
			}
		}
		System.out.println(b);
	}
	
	/**
	 * Do sth..
	 */
	public void doSth2() {
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}