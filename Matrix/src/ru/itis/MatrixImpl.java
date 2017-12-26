package ru.itis;

import java.util.LinkedList;

/**
 * 19.12.2017
 * MatrixImpl
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class MatrixImpl implements Matrix {

    private LinkedList<Cell> cells = new LinkedList<>();

    @Override
    public void set(int i, int j, int value) {
        Cell cell = new Cell(i, j, value);
        int index = 0;
        cells.add(index, cell);
        index++;
    }

    @Override
    public int get(int i, int j) {
        for (int n = 0; n < cells.size(); n++) {
            if (cells.get(n).getI() == i && cells.get(n).getJ() == j) {
                return cells.get(n).getValue();
            }
        }
        return 0;
    }
}
