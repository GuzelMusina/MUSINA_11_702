package ru.itis.TasksFrom1To10;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 17.10.2017
 * Task2
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task2 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        char y1 = 0;
        char y2 = 0;

        System.out.print("Ведите координату 'y1' :");
        String string1 = scanner.nextLine();
        if (string1.length() == 1) {
            y1 = string1.charAt(0);
        }else
            System.err.println("Неправильно введена координата");


        System.out.print("Ведите координату 'y2' :");
        String string2 = scanner.nextLine();
        if (string2.length() == 1) {
            y2 = string2.charAt(0);
        }else
            System.err.println("Неправильно введена координата");


        System.out.print("Ведите координату 'x1' :");
        int x1 = scanner.nextInt();
        System.out.print("Ведите координату 'x2' :");
        int x2 = scanner.nextInt();


        if ((x1 >= 0) && (x1 <= 8) && (y1 >= 'a') && (y1 <= 'h') &&
                ((x2 >= 0) && (x2 <= 8) && (y2 >= 'a') && (y2 <= 'h'))) {
            if (x1 == x2) {
                if (y1 == 'b') {
                    if ((y2 - y1) == 1 || (y2 - y1) == 2) {
                        System.out.println("YES");
                    }
                } else {
                    if ((y2 - y1) == 1) {
                        System.out.println("YES");
                    } else System.out.println("NO");
                }
            } else {
                System.err.println("Пешка не может ходить по диагонали!");
            }
        } else
            System.err.println("Таких координат не существует");
    }
}
