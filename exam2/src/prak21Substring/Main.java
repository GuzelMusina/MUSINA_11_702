package prak21Substring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 24.06.2018
 * Main
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        List<String> list = new ArrayList<>();

        while (!n.equals("-1")){
            list.add(n);
            n = scanner.next();
        }

        Collections.sort(list,new ComparatorSubstring());
        System.out.println(list.toString());

    }
}
