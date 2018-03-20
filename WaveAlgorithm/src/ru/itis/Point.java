package ru.itis;

import java.util.Objects;

/**
 * 19.03.2018
 * Point
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }
}
