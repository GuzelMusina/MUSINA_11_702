package Task11_1;

import java.util.Scanner;

/**
 * 20.09.2017
 * Program
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Program {


    public static void addNumber(int newNumber, int[] array, int count) {
        array[count] = newNumber;
    }

    public static void writeMenu() {
        System.out.println("MENU : "
                + "\n" + "1. Create array"
                + "\n" + "2. Add integer in the back"
                + "\n" + "3. Delete number"
                + "\n" + "4. Put number"
                + "\n" + "5.Write all array"
                + "\n" + "6. Exit"
                + "\n"
                + "\n" + "Write a number of comand :");
    }

    public static int[] deleteNumber(int[] array, int index) {

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;

        return array;
    }

    public static int[] putNumber(int[] array, int index, int number) {
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (i == index) {
                array[i] = number;
            }
        }
        return array;
    }

    public static void writeArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

    }


    public static void main(String[] args) {

        writeMenu();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Write count of numbers in array : ");
        int m = scanner.nextInt();
        int array[] = new int[m];
        int count = 0;

        while (number != 6) {


            switch (number) {
                case 1:
                    if (array != null) {
                        System.out.println("You already create an array :) ");
                    }
                    writeMenu();
                    number = scanner.nextInt();
                    break;

                case 2:
                    System.out.println("Write one number :");
                    int newNumber = scanner.nextInt();
                    if (count >= array.length) {
                        int[] temp = new int[array.length * 2];
                        for (int i = 0; i < array.length; i++) {
                            temp[i] = array[i];
                        }
                        array=temp;
                    }
                    addNumber(newNumber, array, count);
                    count++;

                    writeMenu();

                    number = scanner.nextInt();
                    break;

                case 3:

                    System.out.println("Write index of number, which u want delete :");
                    int index = scanner.nextInt();

                    deleteNumber(array, index);

                    writeMenu();

                    number = scanner.nextInt();
                    break;

                case 4:

                    System.out.println("Write index and integer, which u want put in array:");
                    index = scanner.nextInt();
                    int integer = scanner.nextInt();

                    putNumber(array, index, integer);

                    writeMenu();

                    number = scanner.nextInt();
                    break;


                case 5:

                    writeArray(array);
                    writeMenu();

                    number = scanner.nextInt();
                    break;


            }


        }
    }


}




