package ru.itis.TasksFrom11To20;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * 19.10.2017
 * Task13
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] a = new int[6];
        for (int i = a.length-1; i >=0; i--) {
            a[i] = number%10;
            number=number/10;
        }
        if ((a[0] == a[5]) && (a[1] == a[4]) && (a[2] == a[3])) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

