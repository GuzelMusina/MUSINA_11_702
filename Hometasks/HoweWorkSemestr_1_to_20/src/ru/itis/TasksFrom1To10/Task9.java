package ru.itis.TasksFrom1To10;

import java.util.Scanner;

/**
 * 18.10.2017
 * Task9
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print three numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a != 0 && b != 0 && c != 0) {
            System.out.println(a + "x^2" + sign(b) + Math.abs(b) + "x" + sign(c) + Math.abs(c));
        }
        if (a != 0 && b != 0 && c == 0) {
            System.out.println(a + "x^2" + sign(b) + Math.abs(b) + "x");
        }
        if (a != 0 && b == 0 && c != 0) {
            System.out.println(a + "x^2" + sign(c) + Math.abs(c));
        }
        if (a != 0 && b == 0 && c == 0) {
            System.out.println(a + "x^2");
        }
        if (a == 0 && b != 0 && c != 0) {
            System.out.println(b + "x" + sign(c) + Math.abs(c));
        }
        if (a == 0 && b != 0 && c == 0) {
            System.out.println(b + "x");
        }
        if (a == 0 && b == 0 && c != 0) {
            System.out.println(c);
        }
        if (a == 0 && b == 0 && c == 0) {
            System.out.println(0);
        }

    }

    public static String sign(int x) {
        if (x > 0) {
            return "+";
        } else {
            return "-";
        }
    }
}

