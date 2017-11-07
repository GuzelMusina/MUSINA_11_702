package ru.itis.TaskFrom1To10;

import java.util.Scanner;

/**
 * 02.11.2017
 * Task10
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 1000000000) {
            while (n > 0) {
                System.out.print(n % 2);
                n = n / 2;
            }
        }
    }
}
