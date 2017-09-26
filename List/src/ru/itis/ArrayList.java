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
            System.out.print(array[i] + " ");
        }
    }
}
