package ru.itis;

/**
 * 24.10.2017
 * Rectangle
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Rectangle extends Figure {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double square() {
      return width*length;
    }

    public double getPerimetr(){
        return (width+length)*2;
    }

}
