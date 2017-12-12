package ru.itis.TasksFrom11To20;

import java.util.Scanner;

/**
 * 19.10.2017
 * Task17
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] a = new int[6];
        for (int i = a.length-1; i >=0; i--) {
            a[i] = number%10;
            number=number/10;
        }

        if(Math.abs((a[0]+a[2]+a[4])-(a[1]+a[3]+a[5]))==1){
            System.out.println("JUST HAPPY");
        }else System.out.println("NOT HAPPY");
    }
}
