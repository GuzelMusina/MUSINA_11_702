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
import java.util.List;

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
        Collections.sort(points);


        for (int i = 0; i < points.size(); ) {
            Line line = new Line();
            line.addPoint(points.get(0));
            XYChart.Series series = new XYChart.Series();
            series.getData().add(new XYChart.Data(line.lastPointInList().getX(), line.lastPointInList().getY()));
            points.remove(0);
            for (int j = 0; j < points.size(); j++) {
                if (line.lastPointInList().getY() <= points.get(j).getY() && line.lastPointInList().getX() <= points.get(j).getX()) {
                    line.addPoint(points.get(j));
                    series.getData().add(new XYChart.Data(line.lastPointInList().getX(), line.lastPointInList().getY()));
                    points.remove(j);
                    j--;
                }
            }

            seriesLinkedList.add(series);
        }
        for (XYChart.Series s : seriesLinkedList) {
            lineChart.getData().add(s);
        }
        Scene scene = new Scene(lineChart, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

