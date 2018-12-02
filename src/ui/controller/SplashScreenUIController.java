package ui.controller;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import main.Starbucks;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 12/2/2018
 * @project Starbucks
 **/
public class SplashScreenUIController implements Initializable{

    @FXML
    private AnchorPane root;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (!Starbucks.isSplashLoaded){
            loadSplashScreen();
        }
    }

    private void loadSplashScreen() {
        Starbucks.isSplashLoaded = true;
        AnchorPane splashScreen = null;

        try {
            splashScreen = FXMLLoader.load(getClass()
                    .getResource("/ui/fxml/SplashScreenUI.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        root.getChildren().setAll(splashScreen);

        FadeTransition fadeIn = new FadeTransition(Duration.seconds(3), splashScreen);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);

        fadeIn.setCycleCount(1);

        FadeTransition fadeOut = new FadeTransition(Duration.seconds(3), splashScreen);
        fadeOut.setFromValue(1);
        fadeOut.setToValue(0);
        fadeOut.setCycleCount(1);

        fadeIn.play();

        fadeIn.setOnFinished((e) -> fadeOut.play());

        fadeOut.setOnFinished((e) -> {
            AnchorPane parentContent = null;
            try {
                parentContent = FXMLLoader.load(getClass()
                        .getResource("/ui/fxml/LoginUI.fxml"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            root.getChildren().setAll(parentContent);
        });
    }
}
