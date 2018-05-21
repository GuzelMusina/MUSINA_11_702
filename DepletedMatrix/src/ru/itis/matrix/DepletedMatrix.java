package ru.itis.matrix;

import ru.itis.sources.LinkedList;
import ru.itis.sources.Node;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * 02.05.2018
 * DepletedMatrix
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class DepletedMatrix<Integer> implements Matrix<Integer> {

    private LinkedList list;
    private int n;
    private int m;

    public DepletedMatrix(LinkedList list, int n, int m) {
        this.list = list;
        this.n = n;
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public LinkedList getList() {
        return list;
    }

    @Override
    public int[][] transMatrix() {
        int[][] matrix = toArray(this);
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

    @Override
    public int[][] multMatrix(Matrix matrix) {

        int[][] m1 = toArray(this);
        int[][] m2 = toArray((DepletedMatrix) matrix);
        int[][] result = new int[m1.length][m2[0].length];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                result[i][j] = 0;
                for (int s = 0; s < m1[0].length; s++) {
                    result[i][j] += m1[i][s] * m2[s][j];
                }
            }
        }
        return result;
    }

    @Override
    public int[][] substractMatrix(Matrix matrix) {
        int[][] m1 = toArray(this);
        int[][] m2 = toArray((DepletedMatrix) matrix);
        int[][] result = new int[0][0];
        if (m1.length == m2.length && m1[0].length == m2[0].length) {
            result = new int[m1.length][m1[0].length];
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    result[i][j] = m1[i][j] - m2[i][j];
                }
            }
        }
        return result;
    }

    public int[][] toArray(DepletedMatrix matrix) {
        Node[] nodes = toNodes(matrix);
        int[][] a = new int[n][m];
        int countNodes = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nodes[countNodes].getxCor() == i && nodes[countNodes].getyCor() == j) {
                    a[i][j] = (int) nodes[countNodes].getValue();
                } else {
                    a[i][j] = 0;
                }
            }
        }
        return a;
    }

    public Node[] toNodes(DepletedMatrix m) {
        Node[] nodes = new Node[m.getM()];
        for (int i = 0; i < getM(); i++) {
            nodes[i] = m.getList().get(i);
        }
        return nodes;
    }
}
