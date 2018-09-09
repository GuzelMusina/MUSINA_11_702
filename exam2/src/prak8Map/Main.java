package prak8Map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 23.06.2018
 * Main
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        HashMap<Integer, Integer> map = new HashMap();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int readN = scanner.nextInt();
            if (!map.containsValue(readN)) {
                map.put(readN, 1);
            } else {
                map.put(readN, map.get(readN) + 1);
            }
        }
        map.entrySet().forEach(System.out::println);
    }
}
