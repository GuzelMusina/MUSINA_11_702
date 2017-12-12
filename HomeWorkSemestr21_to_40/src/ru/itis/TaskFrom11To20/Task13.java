package ru.itis.TaskFrom11To20;

import java.util.Scanner;

/**
 * 05.11.2017
 * Task13
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int sum=0;
        int m =n;
        int counOfArray=0;
        while (m > 0) {
            m = m / k;
            counOfArray++;
        }

        int[] array = new int[counOfArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = n % k;
            n = n / k;
            sum = sum+array[i];

        }
        System.out.println(sum);
    }
}
