package ru.itis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        final int MAX_COUNT_OF_POINT = 20;
        ArrayList<Point> points = new ArrayList<>();

        Generator generator = new Generator();
        points = generator.generate(points,MAX_COUNT_OF_POINT);

        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("output.txt")));
        for (int i = 0; i<points.size();i++){
            try {
                writer.write(points.get(i).getX() + " " + points.get(i).getY());
            }catch (IOException e){
                e.printStackTrace();
            }
            //System.out.println(points.get(i));
        }
    }
}
