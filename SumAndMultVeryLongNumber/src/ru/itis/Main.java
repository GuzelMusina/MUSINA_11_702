package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstN = "123";
        String secondN = "671";

        int f[] = convertNumberToArray(firstN);
        int s[] = convertNumberToArray(secondN);

        //  System.out.println(Arrays.toString(convertNumberToArray(firstN)));
        //  System.out.println(Arrays.toString(convertNumberToArray(secondN)));

      //  System.out.println(Arrays.toString(sum(f, s)));

        System.out.println(Arrays.toString(mult(f,s)));

    }

    public static int[] convertNumberToArray(String number) {
        String splitter[] = number.split("");
        int[] array = new int[number.length()];
        for (int i = number.length() - 1; i >= 0; i--) {
            array[i] = Integer.parseInt(splitter[i]);
        }
        return array;
    }

    public static int[] reverseArray(int b[]){
        int temp;

        for (int i = 0; i <= b.length / 2; i++) {
            temp = b[i];
            b[i] = b[(b.length - 1) - i];
            b[(b.length - 1) - i] = temp;
        }
        return b;
    }

    public static int[] sum(int[] a, int[] b) {

        int[] helpArray = new int[b.length];
        int[] summ = b;
        if (a.length > b.length) {
            summ = a;
            helpArray = new int[a.length];
            System.arraycopy(b, 0, helpArray, a.length - b.length, b.length);
            b = Arrays.copyOf(helpArray, helpArray.length);
        } else {
            System.arraycopy(a, 0, helpArray, b.length - a.length, a.length);
            a = Arrays.copyOf(helpArray, helpArray.length);
        }
        int q = 0;
        for (int i = summ.length - 1; i >= 0; i--) {

            if (a[i] + b[i] <= 9) {
                summ[i] = (a[i] + b[i] + q);
                q = 0;
            } else {
                summ[i] = ((a[i] + b[i]) % 10 + q);
                q = 1;
            }
        }
        if (q == 1) {
            int[] newSum = Arrays.copyOf(summ, summ.length + 1);
            for (int i = 0; i < summ.length; i++) {
                newSum[i + 1] = summ[i];
                summ[i] = newSum[i];
            }
            newSum[0] = q;
            return newSum;
        }
        return summ;
    }

    public static int[] mult (int [] a , int [] b){

       // a = reverseArray(a);
        //b = reverseArray(b);

        int leng = a.length+b.length+1;
        int [] mult = new int[leng];
        for(int i =0 ; i<b.length; i++){
            for(int j =0; j<a.length; j++){
                int result = a[j] * b[i];
                mult[i+j] += result % 10;
                if(mult[i+j]>=10){
                    mult[i+j+1] += mult[i+j] /10;
                    mult[i+j] %=10;
                }

                mult[i+j+1] += result/10;
                if(mult[i+j+1]>=10){
                    mult[i+j+2]+= mult[i+j+1]/10;
                    mult[i+j+1]%=10;
                }

            }
        }
//        while (mult[leng] == 0){
//            leng--;
//        }
        return mult;
    }
}
