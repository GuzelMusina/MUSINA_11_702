package ru.itis;

/**
 * 27.02.2018
 * Point
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Point implements Comparable<Point> {

    private double x, y;

    public Point(){
        this.x = 0.0;
        this.y = 0.0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Point o) {
        return Double.compare(this.x, o.x);
    }
}
