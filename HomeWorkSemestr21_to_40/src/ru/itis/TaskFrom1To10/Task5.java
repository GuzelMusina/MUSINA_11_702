package ru.itis.TaskFrom1To10;

import java.util.Scanner;

/**
 * 01.11.2017
 * Task5
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double d = scanner.nextDouble();
        double count=0;
        double x2=0;
        double sum;
        count = ((y-x)/d)-1;
        x2 = x+d;
        sum = ((2*x2+d*(count-1))/2) * count;
        if(count%1==0){
            System.out.println("Count of elements : " + count);
            System.out.println("Sum of elements : " + sum);

        }


    }
}
