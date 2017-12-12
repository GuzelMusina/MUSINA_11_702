package ru.itis;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 14.11.2017
 * MyScanner
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class MyScanner {

    private FileInputStream input;

    public MyScanner(String name) throws IOException {
        try {
            input = new FileInputStream(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String nextLine() throws IOException {
        byte bytes[] = new byte[100];
        int length = input.read(bytes);
        String string = null;
        for (int i = 0; i < length - 1; ++i) {
            if (((bytes[i] >= 65 && bytes[i] <= 90) || (bytes[i] >= 97 && bytes[i] <= 122)) != true) {
                bytes[i] = 0;
            }
        }
        string = new String(bytes);
        return string;
    }

    public int nextInt() throws IOException {
        byte bytes[] = new byte[100];
        int length = input.read(bytes);
        int n = 0;
        double count = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (bytes[i] >= 48 && bytes[i] <= 57) {
                n = n + ((int) (((char) bytes[i] - '0') * Math.pow(10.0, count)));
                count++;
            }
        }
        return n;
    }

}
