package ru.itis.TaskFrom1To10;

/**
 * 01.11.2017
 * Task7
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task7 {
    public static void main(String[] args) {
        int sum1=0;
        int sum2=0;
        for(int i = 1; i<=100; i++){
            sum1 = sum1 +i*i;
            sum2 = sum2 + i;
        }
        sum2 = sum2*sum2;
        System.out.println(sum2-sum1);
    }
}
