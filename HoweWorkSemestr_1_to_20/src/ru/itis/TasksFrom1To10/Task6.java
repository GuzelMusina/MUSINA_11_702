package ru.itis.TasksFrom1To10;

import java.time.Year;
import java.util.Scanner;

/**
 * 18.10.2017
 * Task6
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Task6 {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Print a year");
        int year = 2003;
        int daysOfYear = 365;
        int inWhichDay = 0;
        int daysInFeb = 28;
        if (year >= 1 && year <= 9999) {
            if (((year % 400 == 0) || (year % 4 == 0)) && (year % 100) != 0) {
                daysInFeb = 29;
            }
            inWhichDay = daysOfYear - 109;
            inWhichDay = inWhichDay - (5 * 31 + daysInFeb + 2 * 30);
            System.out.println(inWhichDay + "/" + "09/" + year);
        } else System.err.println("Такого года нет");
    }
}
