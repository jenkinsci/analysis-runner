package edu.hm.hafner;

import java.util.Date;
import java.util.Random;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class NestedForDepth {
    
    private final Date date;
    private final int number;
    private final String text;
    
    /**
     * Creates a new instance of {@link NestedForDepth}.
     *
     * @param date
     *            Date
     * @param number
     *            number
     * @param text
     *            Text
     */
    public NestedForDepth(final Date date, final int number, final String text) {
        this.date = date;
        this.number = number;
        this.text = text;
    }
    
    /**
     * Do sth...
     */
    public void doSth() {
        int[][] board = new int[8][2];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                for (int r = 0; r < board[row].length; r++) {
                    board[row][col] = new Random().nextInt(101) + r;
                    for (int k = 0; k < 23; k++) {
                        System.out.println(k);
                    }
                }
            }
        }
    }
    
    /**
     * Returns the date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }
    
    /**
     * Returns the number.
     *
     * @return the number
     */
    public int getNumber() {
        return number;
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