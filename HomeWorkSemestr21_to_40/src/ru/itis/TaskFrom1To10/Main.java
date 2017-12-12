package ru.itis.TaskFrom1To10;

/**
 * 29.11.2017
 * Main
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        int [] a = new int[]{1,1,1};
        newArray(a);

        System.out.println(a[2]);
    }
    public static void newArray(int [] a){
        int [] b = new int[]{1,2,3};
        a = b;
    }
}
