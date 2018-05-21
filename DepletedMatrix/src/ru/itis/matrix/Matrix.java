package ru.itis.matrix;

/**
 * 02.05.2018
 * Matrix
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public interface Matrix<T> {
    int[][] transMatrix();

    int[][] multMatrix(Matrix matrix);

    int[][] substractMatrix(Matrix matrix);

}
