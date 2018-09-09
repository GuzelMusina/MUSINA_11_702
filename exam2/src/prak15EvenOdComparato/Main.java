package prak15EvenOdComparato;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 25.06.2018
 * Main
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s ;

        while (!(s = bufferedReader.readLine()).equals("-1")){
            String[] strings = s.split(" ");
            for(int i = 0; i<strings.length; i++){
                int n = Integer.parseInt(strings[i]);
                numbers.add(n);
            }
        }
        bufferedReader.close();

        Collections.sort(numbers, new EvenOddComparator());
        System.out.println(numbers.toString());
    }
}
