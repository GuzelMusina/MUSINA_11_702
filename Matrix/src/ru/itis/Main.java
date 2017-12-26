package ru.itis;

public class Main {

    public static void main(String[] args) {

        MatrixImpl matrix = new MatrixImpl();
        matrix.set(1,6,7);
        matrix.set(1,6,8);
        matrix.set(2,6,9);
        matrix.set(6,6,10);

        System.out.println(matrix.get(9,9));
        System.out.println(matrix.get(1,6));
        System.out.println(matrix.get(2,6));
        System.out.println(matrix.get(6,6));

    }
}
