package ru.itis.prak4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 26.06.2018
 * Main
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("in.txt"));

        String s = bufferedReader.readLine();
        String[] strings = s.split(" ");
        int k = Integer.parseInt(strings[0]);
        bufferedReader.close();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() >= k) {
                list.add(strings[i]);
            }
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));

        while (k > 0) {
            Collections.sort(list, new ComparatorForString(k-1));
            k--;
            bufferedWriter.write(list.toString() + "\n");
        }
        bufferedWriter.close();
    }
}
