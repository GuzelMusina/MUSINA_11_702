package ru.itis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        int[] array = new int[999];
        Scanner scanner = new Scanner(new File("input.txt"));
        for(int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        QuickSort quickSort = new QuickSort(array);
        quickSort.sort(0,array.length-1);
        System.out.println(quickSort.toString());
    }
}
