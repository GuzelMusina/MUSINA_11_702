package ru.itis.TaskFrom11To20;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * 05.11.2017
 * Task12
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int n1 = scanner.nextInt();
        int k1 = scanner.nextInt();


        int pow = 0;
        int temp=0;
        while(n>0){
            temp = temp + ((n%10)*(int)Math.pow(k,pow));
            pow++;
            n=n/10;
        }

        int pow1 = 0;
        int temp1=0;
        while(n1>0){
            temp1 = temp1+ ((n1%10)*(int)Math.pow(k1,pow1));
            pow1++;
            n1=n1/10;
        }

        System.out.println(temp);
        System.out.println(temp1);
    }
}