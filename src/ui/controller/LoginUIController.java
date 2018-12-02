package ui.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 12/2/2018
 * @project Starbucks
 **/
public class LoginUIController implements Initializable {

    @FXML
    private AnchorPane rootLogin;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void loginAction(){
        AnchorPane mainMenuPane;
        try {
            mainMenuPane = FXMLLoader.load(getClass().getResource("/ui/fxml/MainMenuUI.fxml"));
            rootLogin.getChildren().setAll(mainMenuPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
