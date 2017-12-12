package ru.itis.TaskFrom11To20;

import java.util.Scanner;

/**
 * 05.11.2017
 * Task14
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = toArray(n, k);
        int mult = 1;

        if (isPowClear(k)) {
            for (int i = 0; i < array.length; i++) {
                array[i] = n % k;
                n = n / k;
                mult = mult * array[i];

            }
            System.out.println(mult);
        }
    }

    public static int[] toArray(int n, int k) {
        int m = n;
        int counOfArray = 0;
        while (m > 0) {
            m = m / k;
            counOfArray++;
        }
        int[] array = new int[counOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = n % k;
            n = n / k;
        }
        return array;
    }

    public static boolean isPowClear(int n) {
        if (n > 1 && n <= 10) {
            return true;
        } else
            return false;
    }
}
