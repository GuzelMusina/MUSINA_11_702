package ru.itis;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import ru.itis.models.Point;
import ru.itis.models.Line;
import java.util.LinkedList;

/**
 * 04.12.2017
 * Controller
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Controller {
    @FXML
    private LineChart<Number, Number> chart;
    @FXML
    private NumberAxis yLine;
    @FXML
    private NumberAxis xLine;

    LinkedList<XYChart.Series> lineList = new LinkedList<>();
    XYChart.Series series = new XYChart.Series();

    public void add(Line line){
        series.getData().add(new XYChart.Data(line.lastPointInList().getX(), line.lastPointInList().getY()));
    }
}
