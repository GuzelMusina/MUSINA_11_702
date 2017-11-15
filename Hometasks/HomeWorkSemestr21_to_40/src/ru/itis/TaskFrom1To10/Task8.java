package ru.itis.TaskFrom1To10;

import java.util.Scanner;

/**
 * 01.11.2017
 * Task8
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        int k = scanner.nextInt();
        int count = 0;
        double m=n;
        while (k > 1) {
            k = k / 2;
            count++;
        }
        double[] array = new double[count];

        for (int i = array.length - 1; i >= 0; i++) {
            array[i] = k % 2;
            k = (int) k / 2;

            if(array[i] == 1){
                m = (m*m) * n;
            }if(array[i]==0){
                m = m*m;
            }
        }
        System.out.println(m);
    }
}
