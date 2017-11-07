package ru.itis.TasksFrom1To10;

import java.io.IOException;

import java.util.Scanner;

/**
 * 17.10.2017
 * Task1
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task1 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведите координату 'y' :");
        String string = scanner.nextLine();
        System.out.print("Ведите координату 'x' :");
        int x = scanner.nextInt();
        char y = string.charAt(0);

        if ((x >= 0) && (x <= 8) && (y >= 'a') && (y <= 'h')) {
            if ((x + y) % 2 == 1) {
                System.out.print("BLACK");
            } else {
                System.out.print("WHITE");
            }
        } else {
            System.err.println("Таких координат не существует");
        }
    }
}
