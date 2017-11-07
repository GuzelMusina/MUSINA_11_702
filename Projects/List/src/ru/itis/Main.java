package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        Menu menu = new Menu();


        menu.writeMenu();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        while (number != 6) {

            switch (number) {
                case 1:

                    System.out.println("Write count if numbers in array: ");
                    int m = scanner.nextInt();
                    list = new ArrayList(m);

                    menu.writeMenu();
                    number = scanner.nextInt();
                    break;

                case 2:
                    System.out.println("Write one number :");
                    int newNumber = scanner.nextInt();

                    list.addToEnd(newNumber);

                    menu.writeMenu();
                    number = scanner.nextInt();
                    break;

                case 3:

                    System.out.println("Write index of number, which u want delete :");
                    int index = scanner.nextInt();

                    list.deleteNumber(index);

                    menu.writeMenu();
                    number = scanner.nextInt();
                    break;

                case 4:

                    System.out.println("Write index and integer, which u want put in array:");
                    index = scanner.nextInt();
                    int integer = scanner.nextInt();

                    list.putNumber(index, integer);

                    menu.writeMenu();
                    number = scanner.nextInt();
                    break;


                case 5:

                    list.showList();

                    menu.writeMenu();
                    number = scanner.nextInt();
                    break;


            }
        }


    }
}
