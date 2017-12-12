package ru.itis.TaskFrom11To20;

import java.util.Scanner;

/**
 * 05.11.2017
 * Task15
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 19;
        int k = 2;

        if (isPowClear(k)) {
            int[] array = toArray(n, k);
            System.out.println(findNumber(array));

        } else {
            System.err.println("Power is not correct");
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
        if (n > 1 && n < 6) {
            return true;
        } else
            return false;
    }

    public static int findNumber(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) continue;
                if (array[i] == array[j]) {
                    temp = array[i];
                }
            }
        }
        return temp;
    }
}
