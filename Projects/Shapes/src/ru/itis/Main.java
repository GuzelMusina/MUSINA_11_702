package ru.itis;

import com.sun.org.apache.regexp.internal.RE;

public class Main {

    public static void main(String[] args) {

        Ellipse ellipse = new Ellipse(5,4);
        System.out.println(ellipse.square());
        System.out.println(ellipse.perimetr());

        Circle circle = new Circle(5);
        System.out.println(circle.square());
        System.out.println(circle.perimetr());

        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle.square());
        System.out.println(rectangle.getPerimetr());

        Square square = new Square(5);
        System.out.println(square.getPerimetr());
        System.out.println(square.square());

    }
}
