package com.example.revision_app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RevisionApp extends Application {

    public static List<note> notes = new ArrayList<>();



    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RevisionApp.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Revision App");
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();


    }
}