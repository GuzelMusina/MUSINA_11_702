package ru.itis.TaskFrom1To10;

import java.util.Scanner;

/**
 * 01.11.2017
 * Task1
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum=0;

        while (n>0){
            n--;
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
