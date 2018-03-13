package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        String string = "X1:=128;Y2:=56;Z1:=X1+Y2;";
        Analyzer analyzer = new Analyzer();
       // analyzer.analyze(string);
        analyzer.process(string);
    }
}
