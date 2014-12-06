package edu.hm.hafner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class NestedTryDepth_Newline {
    private final Date date;
    private final int number;
    
    /**
     * Creates a new instance of {@link NestedTryDepth_Newline}.
     *
     * @param date
     *            Date
     * @param number
     *            number
     */
    public NestedTryDepth_Newline(final Date date, final int number) {
        this.date = date;
        this.number = number;
    }
    
    /**
     * Do sth..
     */
    public void doSthWithNestedTry() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("")));
            try {
                bufferedReader.close();
            }
            catch (IOException exception2) {
                exception2.printStackTrace();
            }
            try {
                bufferedReader.read();
                
                
                
                
                
                try {
                	
                	
                	
                	
                	
                	
                    Cipher.getInstance("AES/CBC/PKCS5Padding").doFinal();
                }
                catch (IllegalBlockSizeException exception) {
                    exception.printStackTrace();
                }
                catch (BadPaddingException exception) {
                    exception.printStackTrace();
                }
                catch (NoSuchAlgorithmException exception) {
                    exception.printStackTrace();
                }
                catch (NoSuchPaddingException exception) {
                    exception.printStackTrace();
                }
            }
            catch (IOException exception1) {
                exception1.printStackTrace();
            }
        }
        catch (FileNotFoundException exception) {
            exception.printStackTrace();
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
}