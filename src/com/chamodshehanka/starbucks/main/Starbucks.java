package com.chamodshehanka.starbucks.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Starbucks extends Application {

    public static boolean isSplashLoaded = false;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass()
                .getResource("/com/chamodshehanka/starbucks/ui/fxml/SplashScreenUI.fxml"));
        primaryStage.setTitle("Starbucks");
        primaryStage.setScene(new Scene(root));
        primaryStage.getIcons().add(new Image(getClass()
                .getResourceAsStream("/com/chamodshehanka/starbucks/ui/icon/starbucks-logo.png")));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
