package controller;

import javafx.collections.FXCollections;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextArea;

public class RecursiveController
{
    @javafx.fxml.FXML
    private BarChart barChart;
    @javafx.fxml.FXML
    private TextArea textArea;

    @javafx.fxml.FXML
    public void initialize() {
        this.barChart.getData().add(new XYChart.Series<>("Recursive Class",
                FXCollections.observableArrayList(
                        new XYChart.Data<>("Data1", 500),
                        new XYChart.Data<>("Data2", 800),
                        new XYChart.Data<>("Data3", 1000)
                )
        ));
    }

}