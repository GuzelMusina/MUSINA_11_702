package ru.itis;

/**
 * 19.12.2017
 * Cell
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Cell {
    private int i;
    private int j;
    private int value;

    public Cell(int i, int j, int value) {
        this.i = i;
        this.j = j;
        this.value = value;
    }

    public Cell() {
    }
    public int getI() {

        return i;
    }

    public int getJ() {
        return j;
    }

    public int getValue() {
        return value;
    }
}
