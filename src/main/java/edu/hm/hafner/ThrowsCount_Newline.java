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
public class ThrowsCount_Newline {
    private final Date date;
    private final int number;
    
    /**
     * Creates a new instance of {@link ThrowsCount_Newline}.
     *
     * @param date
     *            Date
     * @param number
     *            number
     */
    public ThrowsCount_Newline(final Date date, final int number) {
        this.date = date;
        this.number = number;
    }
    
    /**
     * Do sth..
     * 
     * @throws IOException
     *             Throws...
     * @throws NoSuchPaddingException
     *             Throws...
     * @throws NoSuchAlgorithmException
     *             Throws...
     * @throws BadPaddingException
     *             Throws...
     * @throws IllegalBlockSizeException
     *             Throws...
     */
    
    
    
    
    
    
    public void doSthWithNestedTry() throws IOException, IllegalBlockSizeException, BadPaddingException,
            NoSuchAlgorithmException, NoSuchPaddingException {
    	
    	
    	
    	
    	
    	
    	
    	
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("")));
        bufferedReader.close();
        bufferedReader.read();
        Cipher.getInstance("AES/CBC/PKCS5Padding").doFinal();
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