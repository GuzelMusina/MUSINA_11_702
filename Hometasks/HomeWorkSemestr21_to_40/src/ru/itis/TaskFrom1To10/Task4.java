package ru.itis.TaskFrom1To10;

import java.util.Scanner;

/**
 * 01.11.2017
 * Task4
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int f = scanner.nextInt();
        int s = scanner.nextInt();
        int n = scanner.nextInt();

        double count = ((double)(n - f) / s) + 1.0;

        if (count % 1 != 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}
