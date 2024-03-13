package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import ucr.lab.HelloApplication;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label titleText;
    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane ap;

    private void loadPage(String page){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(page));
        try {
            this.bp.setCenter(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void home(ActionEvent event) {
        this.titleText.setText("Laboratory 1");
        this.bp.setCenter(ap);
    }

    @FXML
    void example(ActionEvent event) {
        loadPage("example.fxml");
    }

    @FXML
    void recursive(ActionEvent event) {
        loadPage("recursive.fxml");
    }

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }
}