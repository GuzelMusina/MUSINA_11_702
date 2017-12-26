package ru.itis;

import java.util.ArrayList;
import java.util.Random;

/**
 * 19.12.2017
 * Generator
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Generator extends Random{

    Random random = new Random();

    public ArrayList<Point> generate(ArrayList<Point> points, int n){
       while (points.size() < n ){
           int x = random.nextInt(20)-10;
           int y = random.nextInt(20)-10;
           Point point = new Point(x,y);
           if(!points.contains(point)){
               points.add(point);
           }
       }
       return points;
    }
}
