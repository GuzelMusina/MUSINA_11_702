package ru.itis.TaskFrom1To10;

import java.util.Scanner;

/**
 * 01.11.2017
 * Task3
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a0 = scanner.nextInt();
        int a1 = scanner.nextInt();
        int n = scanner.nextInt();
        int d = 0;
        int sum = 0;

        d = a1 - a0;
        sum = (2 * a0 + (n - 1) * d) / 2 * n;

        System.out.println(sum);

    }
}
