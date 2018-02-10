package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstN = scanner.next();
        String secondN = scanner.next();

        int f[] = convertNumberToArray(firstN);
        int s[] = convertNumberToArray(secondN);

        System.out.println(Arrays.toString(convertNumberToArray(firstN)));
        System.out.println(Arrays.toString(convertNumberToArray(secondN)));

        System.out.println(Arrays.toString(sum(f, s)));

    }

    public static int[] convertNumberToArray(String number) {
        String splitter[] = number.split("");
        int[] array = new int[number.length()];
        for (int i = number.length() - 1; i >= 0; i--) {
            array[i] = Integer.parseInt(splitter[i]);
        }
        return array;
    }

    public static int[] sum(int[] a, int[] b) {

        int[] helpArray = new int[b.length];
        int[] summ = b;
        if (a.length > b.length) {
            summ = a;
            helpArray = new int[a.length];
            System.arraycopy(b, 0, helpArray, a.length - b.length, b.length);
            b = Arrays.copyOf(helpArray, helpArray.length);
        }else{
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
}
