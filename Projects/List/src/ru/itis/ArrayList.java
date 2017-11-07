package ru.itis;

/**
 * 26.09.2017
 * ArrayList
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class ArrayList {

    private int array[] = new int[10];

    public ArrayList() {
    }

    private int count = 0;


    public ArrayList(int count) {
       this.array = new int [count];
    }



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


    void deleteNumber(int index){
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
    }

    void putNumber(int index, int number){
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }

            for (int i = 0; i < array.length - 1; i++) {
                if (i == index) {
                    array[i] = number;
                }
            }
    }

//    int[] createArray(int count){
//        array = new int [count];
//        return array;
//    }


}
