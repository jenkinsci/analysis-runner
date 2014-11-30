package edu.hm.hafner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public final class IllegalCatch {

    private IllegalCatch() {

    }

    /**
     * Reads sth from a file.
     *
     * @param file
     *            the file
     */
    public static void read(final File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            reader.read();
            reader.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}