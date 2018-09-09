package prak24CountOfNon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 23.06.2018
 * Main
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        int n = scanner.nextInt();

        while (n!=-1){
            numbers.add(n);
            n= scanner.nextInt();
        }

        Collections.sort(numbers, new ComparatorByCount());
        System.out.println(numbers.toString());
    }
}


