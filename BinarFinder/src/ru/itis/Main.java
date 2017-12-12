package ru.itis;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 6, 7, 10, 12, 15, 18, 20};
        System.out.println(find(array, 0, array.length, 18));
    }

    public static int find(int[] array, int lower, int higher, int findNumber) {
        int mid;
        mid = lower + Math.abs(higher - lower) / 2;

        System.out.print("[");
        for (int i = lower; i < higher; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        if (array[mid] > findNumber) {
            return find(array, lower, mid, findNumber);
        } else if (array[mid] < findNumber) {
            return find(array, mid, higher, findNumber);
        } else if (array[mid] != findNumber) {
            return -1;
        }
        return mid;
    }
}
