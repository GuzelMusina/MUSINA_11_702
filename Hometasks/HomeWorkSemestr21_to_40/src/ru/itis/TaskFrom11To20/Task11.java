package ru.itis.TaskFrom11To20;

import java.util.Scanner;

/**
 * 05.11.2017
 * Task11
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int div = scanner.nextInt();

        if (Integer.parseInt(n,2) % div == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
