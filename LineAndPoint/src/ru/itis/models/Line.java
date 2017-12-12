package ru.itis.models;

import java.util.ArrayList;

/**
 * 02.12.2017
 * Line
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Line {

    private ArrayList<Point> line;

    public Line() {
        this.line=new ArrayList<Point>();
    }

    public ArrayList<Point> getLine() {
        return line;
    }

    public void addPoint(Point point) {
        line.add(point);
    }
    public Point lastPointInList(){
        return line.get(line.size()-1);
    }


}
