package ru.itis;

/**
 * 27.02.2018
 * Line
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Line {

    private Point first;
    private Point second;

    private double length;       // длина вектора
    private double x, y;         // координаты вектора

    public Line(Point first, Point second) {
        this.first = first;
        this.second = second;

        this.x = second.getX() - first.getX();
        this.y = second.getY() - first.getY();

        this.length = Math.sqrt(x * x + y * y);
    }

    public Point getFirst() {
        return first;
    }

    public Point getSecond() {
        return second;
    }

    public double getLength() {
        return length;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return first + "to " + second;
    }

    public double scalarOfVectors (Point point){
        Line lineOther = new Line(first, point);
        return this.x * lineOther.y - this.y * lineOther.x;
    }
    public double pointS(Point point) {

        return scalarOfVectors(point) /
                (this.length * new Line(first,point).length);
    }
}
