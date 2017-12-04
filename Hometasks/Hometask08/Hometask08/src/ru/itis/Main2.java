package ru.itis;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import ru.itis.models.Point;

import java.io.*;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * 04.12.2017
 * Main2
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Main2 extends Application {

    static LinkedList<Point> points = new LinkedList<>();
    static LinkedList<ru.itis.models.Line> lines = new LinkedList<>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Graphic");
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) throws Exception {
        launch(args);

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
        String line = "";

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
        finder.findLines(points, lines, writer);
        writer.close();
    }
}


