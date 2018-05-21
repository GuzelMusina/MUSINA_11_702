package ru.itis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("input.txt"));
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n-1];
        for(int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        Tree tree = new Tree(n,k,array);
        System.out.println(tree.modify());
    }
}
