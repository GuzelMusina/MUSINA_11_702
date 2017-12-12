package ru.itis;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        double midOfYear = 0;
        double midOfMonth[] = new double[12];
        double min = 9999;
        int[] days = new int[12];
        int[] monthTemp = new int[12];
        while (scanner.hasNext()) {
            String date = scanner.next();
            String temp = scanner.next();
            int month = ((int) date.charAt(3) - '0') * 10 + ((int) date.charAt(4) - '0');
            monthTemp[month - 1] += Double.parseDouble(temp);
            days[month - 1]++;
        }
        for (int i = 0; i < monthTemp.length; i++) {
            midOfMonth[i] = (double) monthTemp[i] / days[i];
            midOfYear += midOfMonth[i];
        }
        midOfYear = (double) (midOfYear / 12.0);
        int finder = 0;
        for (int i = 0; i < monthTemp.length; i++) {
            if (Math.abs(midOfYear - midOfMonth[i]) < min) {
                min = Math.abs(midOfYear - midOfMonth[i]);
                finder = i;
            }
        }
        System.out.println(finder + 1);
    }

}

