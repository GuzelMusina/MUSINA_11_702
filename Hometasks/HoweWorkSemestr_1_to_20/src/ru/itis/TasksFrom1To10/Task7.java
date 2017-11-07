package ru.itis.TasksFrom1To10;

import java.util.Scanner;

/**
 * 18.10.2017
 * Task7
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print three numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a>0 && b>0 && c>0 && ((a+b)>c) &&((a+c)>b) && ((b+c)>a)){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
