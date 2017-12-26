package ru.itis;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import ru.itis.models.Line;
import ru.itis.models.Point;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;

/**
 * 04.12.2017
 * Main
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Graphic");
        LinkedList<Point> points = new LinkedList<>();
        LinkedList<Line> lines = new LinkedList<>();
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        LinkedList<XYChart.Series> seriesLinkedList = new LinkedList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
        String string = "";

        try {
            while ((string = reader.readLine()) != null) {
                points.add(new Point(string.charAt(0) - '0', string.charAt(2) - '0'));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //sort points at X
        Collections.sort(points);

        // create lines
        for (int i = 0; i < points.size(); i++) {
            int index = find(lines, 0, lines.size() - 1, points.get(i).getY());
            if (index == -1) {
                Line line = new Line();
                line.addPoint(points.get(i));
                lines.push(line);
            } else {
                lines.get(index).addPoint(points.get(i));
            }
        }

        //add lines to graphic
        for (int i = 0; i < lines.size(); i++) {
            XYChart.Series series = new XYChart.Series();
            Line line = lines.get(i);
            for (int j = 0; j < line.getLine().size(); j++) {
                series.getData().add(new XYChart.Data(line.getLine().get(j).getX(), line.getLine().get(j).getY()));
            }
            lineChart.getData().add(series);
        }


        Scene scene = new Scene(lineChart, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * method find - find in which line we need to add point
     * @param lines list of lines, where we add our points
     * @param lower lower index line in list of lines
     * @param higher higher index line in list of lines
     * @param findY point at Y, which we want to add in line
     * @return index in which line in list of lines we need add point
     */
    public static int find(LinkedList<Line> lines, int lower, int higher, int findY) {

        // in first iteration , cause higher = size - 1, a size = 0
        if (higher < 0) {
            return -1;
        }
        // in way when in the end we have only one point
        if (higher == lower) {
            int point = lines.get(lower).lastPointInList().getY();
            if (point > findY) {
                return -1;
            } else {
                return lower;
            }
        }
        int mid = lower + Math.abs(higher - lower) / 2;
        int lastHalf1 = lines.get(mid).lastPointInList().getY();
        int firstHalf = lines.get(mid + 1).lastPointInList().getY();

        if (findY > lastHalf1 && findY < firstHalf) {
            return mid;
        } else if (findY < lastHalf1) {
            return find(lines, lower, mid, findY);
        } else {
            return find(lines, mid + 1, higher, findY);
        }
    }
}
