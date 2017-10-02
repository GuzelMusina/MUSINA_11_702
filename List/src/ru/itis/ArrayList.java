package ru.itis;

/**
 * 26.09.2017
 * ArrayList
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class ArrayList {

    int array[] = new int[10];

    int count = 0;

    void addToEnd(int element) {
        if (count < array.length) {
            array[count] = element;
            count++;
        } else {
            System.err.println("Нет места");
        }
    }

    void showList() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i] + " ");
        }
    }

    void writeMenu(){
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

    void deleteNumber(int index){
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
    }

    int[] putNumber(int index, int number){
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

    int[] createArray(int count){
        array = new int [count];
        return array;
    }


}
