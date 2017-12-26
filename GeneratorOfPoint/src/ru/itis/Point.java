package ru.itis;

/**
 * 19.12.2017
 * Point
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Point {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
