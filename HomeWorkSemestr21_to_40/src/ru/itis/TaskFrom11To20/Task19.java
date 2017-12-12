package ru.itis.TaskFrom11To20;

import java.util.Scanner;

/**
 * 07.11.2017
 * Task19
 * Из 16 в 'k' систему счисления
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (isPowClear(k)) {
            int temp = convertTo10(n, k);
            int[] array = convertToK(temp, k);
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } else {
            System.err.println("Power is not correct");
        }
    }

    public static int[] convertToK(int n, int k) {
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

    public static int convertTo10(int n, int k) {
        int temp = 0;
        int pow = 0;
        while (n > 0) {
            temp = temp + ((n % 10) * (int) Math.pow(k, pow));
            pow++;
            n = n / 10;
        }
        return temp;
    }

    public static boolean isPowClear(int n) {
        if (n >= 1 && n <= 10) {
            return true;
        } else
            return false;
    }
}
