package controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import ucr.lab.HelloApplication;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label titleText;
    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane ap;
    @FXML
    private Text messageText;

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

    @FXML
    public void exampleOnMousePressed(Event event) {
        this.titleText.setText("");
        this.messageText.setText("Loading Example Test. Please wait !!!");
        this.bp.setCenter(ap);
    }
}