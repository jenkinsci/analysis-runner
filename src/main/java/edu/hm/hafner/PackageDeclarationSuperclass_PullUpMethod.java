package edu.hm.hafner;

/**
 * Document type PackageDeclarationSuperclass_PullUpMethod.
 *
 * @author Christian M&ouml;stl
 */
public class PackageDeclarationSuperclass_PullUpMethod {
    /**
     * Do sth...
     * @param a number
     */
    public void doSth(int a) {
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
}