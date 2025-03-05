package com.example.qtdl;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
<<<<<<< HEAD
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 406);
=======
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ChiTietNV.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 400);
>>>>>>> 4bd1df914725218e16a84f68cc5896f290ddc6fc
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}