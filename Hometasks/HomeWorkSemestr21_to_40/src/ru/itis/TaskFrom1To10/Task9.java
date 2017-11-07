package ru.itis.TaskFrom1To10;

import java.util.Scanner;

/**
 * 02.11.2017
 * Task9
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counOfArray = 0;
        int count = 0;
        int m = n;

        while (m > 0) {
            m = m / 2;
            counOfArray++;
        }


        int[] array = new int[counOfArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = n % 2;
            n = n / 2;

            if (array[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
