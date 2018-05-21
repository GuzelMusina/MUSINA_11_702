package ru.itis;

import ru.itis.matrix.DepletedMatrix;
import ru.itis.sources.LinkedList;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    private static int currentIndex = -1;

    private static Integer next(String numbers[]) {
        ++currentIndex;
        while (currentIndex < numbers.length && numbers[currentIndex].equals("")) {
            ++currentIndex;
        }
        return currentIndex < numbers.length ? Integer.
                parseInt(numbers[currentIndex]) : null;
    }

    public static void main(String[] args) throws IOException {
        LinkedList list = new LinkedList();
        FileInputStream inFile = new FileInputStream(new File("input.txt"));

        //available() сообщает вам, сколько байтов может быть прочитано
        byte[] str = new byte[inFile.available()];

        //read() чтение байтов из входного потока в массив str.
        // Возвращает количество прочитанных из потока байтов
        inFile.read(str);
        String text = new String(str);

        //"\\D" означает любая не цифра
        String[] numbers = text.split("\\D");
        int i, j;
        int n = next(numbers), m = next(numbers);
        int matrix[][] = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                matrix[i][j] = next(numbers);
                if (matrix[i][j] != 0) {
                    list.add(i, j, matrix[i][j]);
                }
            }
        }
        DepletedMatrix depletedMatrix = new DepletedMatrix(list,n,m);
    }
}
