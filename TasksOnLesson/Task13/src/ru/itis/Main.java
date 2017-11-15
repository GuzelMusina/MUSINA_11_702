package ru.itis;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        MyScanner myScanner=new MyScanner("input.txt");
        System.out.println(myScanner.nextInt());
        System.out.println(myScanner.nextLine());

    }
}
