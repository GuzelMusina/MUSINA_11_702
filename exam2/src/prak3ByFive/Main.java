package prak3ByFive;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 25.06.2018
 * Main
 * Из входного файла in.txt вводятся целые числа. Они записываются в ArrayList.
 * Упорядочить полученную коллекцию по возрастанию количества пятерок в числах (реализовать Comparator).
 * Результат сортировки вывести в выходной файл out.txt.
 * Запрещается конвертировать числа в строки для применения к последним length. Все сделать через арифметику цифр числа.
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new FileReader("in.txt"));
        String s = bf.readLine();
        String[] arr = s.split(" ");

        for(int i = 0; i<arr.length; i++){
            list.add(Integer.parseInt(arr[i]));
        }
        bf.close();

        Collections.sort(list, new ComparatorByFive());

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ou.txt"));
        for (int i = 0; i<list.size(); i++){
            bufferedWriter.write(list.get(i).toString() + " ");
        }
        bufferedWriter.close();

    }
}
