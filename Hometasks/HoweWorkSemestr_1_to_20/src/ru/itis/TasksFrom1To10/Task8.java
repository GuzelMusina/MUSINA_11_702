package ru.itis.TasksFrom1To10;

import java.util.Scanner;

/**
 * 18.10.2017
 * Task8
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Write y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Write radius1: ");
        int radius1 = scanner.nextInt();
        System.out.print("Write x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Write y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Write radius2: ");
        int radius2 = scanner.nextInt();

        double d = Math.sqrt((x1 * x1 - x2 * x2) + (y1 * y1 - y2 * y2));
        if ((radius1 + radius2) >= d) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
