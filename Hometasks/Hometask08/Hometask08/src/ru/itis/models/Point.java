package ru.itis.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * 02.12.2017
 * Point
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Point implements Comparable<Point> {

    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {

    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return  x + " "+ y ;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.getX() == o.getX()){
            return 0;
        }else if(this.getX() > o.getX()){
            return 1;
        }else return -1;
    }

    public LinkedList<Point> sorter (LinkedList<Point> points){
//        points.sort(new Comparator<Point>() {
//            @Override
//            public int compare(Point o1, Point o2) {
//                if(o1.getX() == o2.getX()){
//                    return 0;
//                }else if(o1.getX() > o2.getX() && o1.getY()>o2.getY()){
//                        return 1;
//                    }
//                else return -1;
//            }
//        });
        return points;
    }
}
