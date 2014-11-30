package edu.hm.hafner;

import java.util.Random;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class JavaNCSS {
    /**
     * Do sth.
     *
     * @param a
     *            number
     * @param b
     *            number
     * @return Return a number
     */
    public int veryComplexStupidMethod(final int a, final int b) {
        int result = 0;
        for (int i = 0; i < 100; i++) {
            if (a > 0) {
                for (int n = 0; n < i; n++) {
                    if (n % b == 0) {
                        result += b;
                    }
                }
                for (int n = 2; n < b; n += 2) {
                    result = result + n;
                }
                if (i == (a - b)) {
                    --result;
                }
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(result);
        System.out.println("Das wird eine lange und unschoene Methode");

        int[][] board = new int[8][2];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = new Random().nextInt(101);
            }
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.println(board[row][col]);
            }
        }

        System.out.println("Immer noch nicht lange genug....");
        System.out.println("Schreibe sinnloses Zeug...");
        System.out.println("Was ist e^(i*pi())?");
        System.out.println("Weißt du es?");
        System.out.println("Die Antwort lautet natürlich -1");
        System.out.println("-2 kann man auch anders darstellen");
        System.out.println("nämlich:");
        System.out.println("-2 =");
        System.out.println("2 * e^(i*pi())");
        System.out.println("Das ist klar, weil 2 * (-1) = -2");
        System.out.println("Bald ist die Methode fertig");
        System.out.println("Noch ein paar Zeilen");
        System.out.println("counter zählt abwärts...");
        System.out.println("15");
        System.out.println("14");
        System.out.println("13");
        System.out.println("12");
        System.out.println("11");
        System.out.println("10");
        System.out.println("9");
        System.out.println("8");
        System.out.println("7");
        System.out.println("6");
        System.out.println("5");
        System.out.println("4");
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");

        return result;
    }
}