package ru.itis.TasksFrom11To20;

import java.util.Scanner;


/**
 * 22.10.2017
 * Task20
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int[] a1 = new int[6];
        for (int i = a1.length - 1; i >= 0; i--) {
            a1[i] = number1 % 10;
            number1 = number1 / 10;
        }
        int number2 = scanner.nextInt();
        int[] a2 = new int[6];
        for (int i = a2.length - 1; i >= 0; i--) {
            a2[i] = number2 % 10;
            number2 = number2 / 10;
        }
        if (((a1[0]+a2[0])%10)==((a1[5]+a2[5])%10) && ((a1[1]+a2[1])%10)==((a1[4]+a2[4])%10)
                && ((a1[2]+a2[2])%10)==((a1[3]+a2[3])%10)) {
            System.out.println("JUST HAPPY");
        } else System.out.println("NOT HAPPY");
    }
}