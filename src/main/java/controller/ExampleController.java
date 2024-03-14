package controller;

import domain.Example;
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
    private double a, b, c, d, e;

    @javafx.fxml.FXML
    public void initialize() {
        this.textArea.setText(this.example1Test()
                            +this.example2Test()
                            +this.example3Test()
                            +this.example4Test()
                            +this.example5Test());

        this.barChart.getData().add(new XYChart.Series<>("Example Class",
                FXCollections.observableArrayList(
                        new XYChart.Data<>("Example1", a),
                        new XYChart.Data<>("Example2", b),
                        new XYChart.Data<>("Example3", c),
                        new XYChart.Data<>("Example4", d),
                        new XYChart.Data<>("Example5", e)
                )
                ));
    }

    String example1Test() {
        Example ex = new Example();
        int n = 10000000;
        int a[] = new int[n];
        util.Utility.fill(a, 99); //llena el arreglo
        util.Utility.show(a, 100);
        //analisis de example1
        long startTime = System.currentTimeMillis();
        int result = ex.example1(a);
        long endTime = System.currentTimeMillis();
        long tn = endTime - startTime;
        this.a = tn;
        return "\n\nTest Example1\n"
                + "n: "+util.Utility.format(n)+"\n"
                + "Result: "+util.Utility.format(result)+"\n"
                + "Tn: "+util.Utility.format(tn)+ " milliseconds";
    }

    String example2Test() {
        Example ex = new Example();
        int n = 10000000;
        int a[] = new int[n];
        util.Utility.fill(a, 99); //llena el arreglo
        util.Utility.show(a, 100);
        //analisis de example2
        long startTime = System.currentTimeMillis();
        int result = ex.example2(a);
        long endTime = System.currentTimeMillis();
        long tn = endTime - startTime;
        this.b = tn;
        return "\n\nTest Example2\n"
                + "n: "+util.Utility.format(n)+"\n"
                + "Result: "+util.Utility.format(result)+"\n"
                + "Tn: "+util.Utility.format(tn)+ " milliseconds";
    }


    String example3Test() {
        Example ex = new Example();
        int n = 100000;
        int a[] = new int[n];
        util.Utility.fill(a, 99); //llena el arreglo
        util.Utility.show(a, 100);
        //analisis de example3
        long startTime = System.currentTimeMillis();
        int result = ex.example3(a);
        long endTime = System.currentTimeMillis();
        long tn = endTime - startTime;
        this.c = tn;
        return "\n\nTest Example3\n"
                + "n: "+util.Utility.format(n)+"\n"
                + "Result: "+util.Utility.format(result)+"\n"
                + "Tn: "+util.Utility.format(tn)+ " milliseconds";
    }

    String example4Test() {
        Example ex = new Example();
        int n = 10000000;
        int a[] = new int[n];
        util.Utility.fill(a, 99); //llena el arreglo
        util.Utility.show(a, 100);
        //analisis de example4
        long startTime = System.currentTimeMillis();
        int result = ex.example4(a);
        long endTime = System.currentTimeMillis();
        long tn = endTime - startTime;
        this.d = tn;
        return "\n\nTest Example4\n"
                + "n: "+util.Utility.format(n)+"\n"
                + "Result: "+util.Utility.format(result)+"\n"
                + "Tn: "+util.Utility.format(tn)+ " milliseconds";
    }

    String example5Test() {
        Example ex = new Example();
        int n = 3000;
        int m = 5000;
        int a[] = new int[n];
        int b[] = new int[m];
        util.Utility.fill(a, 99); //llena el arreglo
        util.Utility.show(a, 100);
        //analisis de example5
        long startTime = System.currentTimeMillis();
        int result = ex.example5(a, b);
        long endTime = System.currentTimeMillis();
        long tn = endTime - startTime;
        this.e = tn;
        return "\n\nTest Example5\n"
                + "n: "+util.Utility.format(n)+"\n"
                + "m: "+util.Utility.format(m)+"\n"
                + "Result: "+util.Utility.format(result)+"\n"
                + "Tn: "+util.Utility.format(tn)+ " milliseconds";
    }

}