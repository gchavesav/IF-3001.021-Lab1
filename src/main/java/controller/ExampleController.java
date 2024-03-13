package controller;

import javafx.collections.FXCollections;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextArea;

public class ExampleController
{
    @javafx.fxml.FXML
    private TextArea textArea;
    @javafx.fxml.FXML
    private BarChart barChart;

    @javafx.fxml.FXML
    public void initialize() {
        this.barChart.getData().add(new XYChart.Series<>("Example Class",
                FXCollections.observableArrayList(
                        new XYChart.Data<>("Data1", 100),
                        new XYChart.Data<>("Data2", 200),
                        new XYChart.Data<>("Data3", 300)
                )
                ));
    }

}