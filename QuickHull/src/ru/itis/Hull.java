package ru.itis;

import org.omg.PortableServer.POA;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 27.02.2018
 * Hull
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Hull {

    private ArrayList<Point> points;
    private ArrayList<Point> hull;

    public void finder(Line line) {

        Point first = line.getFirst();
        Point second = line.getSecond();

        double maxSquare = 0.0;
        Point maxPoint = line.getSecond();

        for (Point point : points) {
            if (!point.equals(first) && !point.equals(second)) {

                double sin = line.pointS(point);

                if (sin >= 0) {
                    double square = 0.5 * line.scalarOfVectors(point);

                    Line pLine = new Line(first, point);

                    if (square >= maxSquare || square == maxSquare &&
                            pLine.getLength() < new Line(first, maxPoint).getLength()) {

                        maxSquare = square;
                        maxPoint = point;

                    }
                }
            }
        }

        if(!maxPoint.equals(line.getSecond())){
            hull.add(maxPoint);
            finder(new Line(line.getFirst(), maxPoint));
            finder(new Line(maxPoint, line.getSecond()));
        }
    }

    public Hull (ArrayList<Point> points){
        this.points = points;
        this.hull = new ArrayList<>();

        Collections.sort(this.points);

        Point left = this.points.get(0);
        Point right = this.points.get(this.points.size()-1);

        hull.add(left);
        hull.add(right);

        finder(new Line(left, right));
        finder(new Line(right, left));
    }
}
