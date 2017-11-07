package ru.itis.TaskFrom11To20;

import java.util.Scanner;

/**
 * 07.11.2017
 * Task16
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (isPowClear(k)) {
            int[] array = convertToArray(n);
            System.out.println(longerNull(array));
        } else {
            System.err.println("Power is not correct");
        }
    }

    public static int[] convertToArray(int m) {
        int p = m;
        int count = 0;
        while (p > 0) {
            p = p / 2;
            count++;
        }
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = m % 2;
            m = m / 2;
        }
        return array;
    }

    public static boolean isPowClear(int n) {
        if (n == 2) {
            return true;
        } else
            return false;
    }

    public static int longerNull(int[] array) {
        int temp = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0) {
                if (array[i] == array[i + 1]) {
                    temp++;
                }
            }
        }
        return temp;
    }
}
