package ru.itis;

import java.util.Arrays;

/**
 * 08.03.2018
 * QuickSort
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class QuickSort {

    private int[] array;
    private int iterator;

    public QuickSort(int[] array, SortType type) {
        this.array = array;
    }

    long startTime = System.nanoTime();

    public void sort(int low, int high) {

        if (low >= high) {
            return;
        }

        // i < pivot and j > pivot
        int i = low;
        int j = high;

        //pivot is in the middle of array
        int current = low + (high - low) / 2;
        int pivot = array[current];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
                iterator++;
            }

        }
        if (low < j) {
            sort(low, j);
        }
        if (i < high) {
            sort(i, high);
        }
    }

    long endTime = System.nanoTime();
    long elapsedTime = endTime - startTime;

    @Override
    public String toString() {
        return Arrays.toString(array) + '\n' + "Count of iteration = " + iterator
                + '\n' + "Time of algorithm = " + elapsedTime + " ns";
    }
}
