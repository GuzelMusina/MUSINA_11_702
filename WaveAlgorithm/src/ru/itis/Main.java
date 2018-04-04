package ru.itis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	int[][] net;
	Point begin;
	Point end;
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            StringBuilder input = new StringBuilder();
            int height = -1;
            while (reader.ready()) {
                input.append(reader.readLine()).append(' ');
                height++;
            }
            String[] points = input.toString().trim().split(" ");
             begin = new Point(Integer.parseInt(points[0]), Integer.parseInt(points[1]));
             end = new Point(Integer.parseInt(points[2]), Integer.parseInt(points[3]));
            int wide = (points.length - 4) / height;
            net = new int[height][wide];
            for (int i = 0; i < height; i++)
                for (int j = 0; j < wide; j++)
                    net[i][j] = Integer.parseInt(points[i * wide + j + 4]);
        } catch (IOException e) {
            throw new RuntimeException();
        }

        ArrayList<Point> answer =AlgorithmLee.getWay(net,begin,end);
        for(Point point: answer){
            System.out.println(point.getX() + " " + point.getY());
        }
    }
}
