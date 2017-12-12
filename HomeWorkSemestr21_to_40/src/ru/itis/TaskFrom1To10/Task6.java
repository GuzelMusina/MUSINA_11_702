package ru.itis.TaskFrom1To10;

/**
 * 01.11.2017
 * Task6
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task6 {
    public static void main(String[] args) {
//        int sum1 = 0;
//        int sum2 = 0;
        int sum=0;

//        sum1 = (9999 * 3 - 3) / (3 - 1);
//        sum2 = (9995 * 5 - 5) / (5 - 1);
//        sum = sum1 + sum2;

        for(int i =0; i<1000; i++){
            if((i%3==0) || (i%5 == 0)){
                sum = sum+i;
            }
        }

        System.out.println(sum);

    }
}

