package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();


        list.writeMenu();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int array[] = new int[100];
        int count = 0;


        while (number != 6) {

            switch (number) {
                case 1:

                    System.out.println("Write count if numbers in array: ");
                    int m = scanner.nextInt();
                    list.createArray(m);

                    list.writeMenu();
                    number = scanner.nextInt();
                    break;

                case 2:
                    System.out.println("Write one number :");
                    int newNumber = scanner.nextInt();

                    list.addToEnd(newNumber);

                    list.writeMenu();
                    number = scanner.nextInt();
                    break;

                case 3:

                    System.out.println("Write index of number, which u want delete :");
                    int index = scanner.nextInt();

                    list.deleteNumber(index);

                    list.writeMenu();
                    number = scanner.nextInt();
                    break;

                case 4:

                    System.out.println("Write index and integer, which u want put in array:");
                    index = scanner.nextInt();
                    int integer = scanner.nextInt();

                    list.putNumber(index, integer);

                    list.writeMenu();
                    number = scanner.nextInt();
                    break;


                case 5:

                    list.showList();

                    list.writeMenu();
                    number = scanner.nextInt();
                    break;


            }
        }


//        list.writeMenu();
//
//        list.addToEnd(7);
//        list.addToEnd(8);
//        list.addToEnd(9);
//
//        list.showList();
//
//        list.deleteNumber(1);
//        list.putNumber(2,5);


    }
}
