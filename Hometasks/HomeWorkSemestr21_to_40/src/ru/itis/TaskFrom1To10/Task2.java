package ru.itis.TaskFrom1To10;

import java.util.Scanner;

/**
 * 01.11.2017
 * Task2
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a0 = scanner.nextInt();
        int a1 = scanner.nextInt();
        int k = scanner.nextInt();
        int d = 0;
        int ak = 0;

        d = a1 - a0;
        ak = a0 + ((k - 1) * d);

        System.out.println(ak);
    }
}
