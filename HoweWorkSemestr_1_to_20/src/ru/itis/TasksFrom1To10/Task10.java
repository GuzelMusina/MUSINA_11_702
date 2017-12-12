package ru.itis.TasksFrom1To10;

import java.util.Scanner;

/**
 * 18.10.2017
 * Task10
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print three numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double x1;
        double x2;
        double discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("1st row: " + x1 + "; 2nd row: " + x2 + "; count of rows :" + 2);
        }
        if (discriminant == 0) {
            x1 = (-b) / 2 * a;
            System.out.println("1st row: " + x1 + "; count of rows :" + 1);
        }
        if (discriminant < 0) {
            System.out.println(-1);

        }
    }
}
