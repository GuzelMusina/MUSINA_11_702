package ru.itis.TasksFrom11To20;

import java.util.Scanner;

/**
 * 20.10.2017
 * Task18
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count=0;
        int number1 = scanner.nextInt();
        int[] a1 = new int[4];
        for (int i = a1.length - 1; i >= 0; i--) {
            a1[i] = number1 % 10;
            number1 = number1 / 10;
        }
        int number2 = 1622;
        int[] a2 = new int[4];
        for (int i = a2.length - 1; i >= 0; i--) {
            a2[i] = number2 % 10;
            number2 = number2 / 10;
        }

        for(int i = 0; i<a2.length;i++){
            if(a1[i]==a2[i]){
                count++;
            }
        }
        System.out.println("Count of bull: "+count );
    }
}
