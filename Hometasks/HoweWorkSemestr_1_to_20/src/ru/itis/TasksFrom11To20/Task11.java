package ru.itis.TasksFrom11To20;

import java.util.Scanner;

/**
 * 18.10.2017
 * Task11
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double a = Math.sqrt(Math.abs((x1 - x2) * (x1 - x2)) + Math.abs((y1 - y2) * (y1 - y2)));
        double b = Math.sqrt(Math.abs((x3 - x2) * (x3 - x2)) + Math.abs((y3 - y2) * (y3 - y2)));
        double c = Math.sqrt(Math.abs((x1 - x3) * (x1 - x3)) + Math.abs((y1 - y3) * (y1 - y3)));

        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(s);
    }
}
