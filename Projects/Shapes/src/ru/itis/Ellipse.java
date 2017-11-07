package ru.itis;

import org.omg.CORBA.MARSHAL;

/**
 * 24.10.2017
 * Ellipse
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Ellipse extends Figure {

    private double radius1;
    private double radius2;
    private double pi = 3.14;

    public Ellipse(double radius1, double radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    public double square(){
        return radius1*radius2*pi;

    }

    public double perimetr(){
        return  2*pi* Math.sqrt((radius1*radius1+radius2*radius2)/2);
    }
}
