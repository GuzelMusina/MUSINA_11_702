package ru.itis;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import ru.itis.models.Point;

import java.io.*;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * 04.12.2017
 * Main
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        LinkedList<Point> points = new LinkedList<>();
        LinkedList<ru.itis.models.Line> lines = new LinkedList<>();
        primaryStage.setTitle("Graphic");
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
        String line = "";

        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Abcissa");
        yAxis.setLabel("Ordinate");

        final LineChart<Number, Number> lineChart = new LineChart<Number, Number>(xAxis, yAxis);
        lineChart.setTitle("Graphic from Guzel Musi");
        XYChart.Series series = new XYChart.Series();

        try {
            while ((line = reader.readLine()) != null) {
                points.add(new Point(line.charAt(0) - '0', line.charAt(2) - '0'));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        points.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.getX() == o2.getX()) {
                    return 0;
                } else if (o1.getX() > o2.getX()) {
                    return 1;
                } else return -1;
            }
        });
        Finder finder = new Finder();

        //writer.close();
        for(int i = 0; i< lines.size();i++){
            lineChart.getData().add(finder.findLines(points, lines, writer, series));
        }

        Scene scene = new Scene(lineChart, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}


