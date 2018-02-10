package ru.itis;

public class Main {

    public static void main(String[] args) {
        int n = 4267;
        System.out.println(countOfNumber(n));
    }

    public static int countOfNumber(int n) {
        int sum = 0;
        int[] a = new int[4];
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = n % 10;
            n = n / 10;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] < a[j]) {
                    sum += fact(a.length - 1 - i);
                }
            }
        }
        return sum;
    }

    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }


}
