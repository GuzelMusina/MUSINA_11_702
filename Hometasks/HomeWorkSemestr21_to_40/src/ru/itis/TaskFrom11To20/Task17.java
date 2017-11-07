package ru.itis.TaskFrom11To20;

import java.util.Scanner;

/**
 * 07.11.2017
 * Task17
 * Длина самой большой неубывающей цепочки цифр
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */


public class Task17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (isPowClear(k)) {
            int[] array = convertToArray(n,k);
            System.out.println(longerLine(array));
        } else {
            System.err.println("Power is not correct");
        }
    }

    public static boolean isPowClear(int n) {
        if (n >1 && n<=10) {
            return true;
        } else
            return false;
    }

    public static int[] convertToArray(int m, int k) {
        int n = m;
        int count = 0;
        while (n > 0) {
            n = n / k;
            count++;
        }
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = m % k;
            m = m / k;
        }
        return array;
    }

    public static int longerLine(int[] array) {
        int temp = 1;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] >= array[i + 1]) {
                temp++;
            }
        }
        return temp;
    }
}
