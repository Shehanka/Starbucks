package com.chamodshehanka.starbucks.ui.controller;

import com.chamodshehanka.starbucks.utils.AlertBuilder;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
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

    @FXML
    private JFXTextField txtUserName;

    @FXML
    private JFXPasswordField txtPassword;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void loginAction(){

        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        AnchorPane mainMenuPane;

        if (userName.equals("chamod") && password.equals("123")){
            try {
                mainMenuPane = FXMLLoader.load(getClass()
                        .getResource("/com/chamodshehanka/starbucks/ui/fxml/MainMenuUI.fxml"));
                rootLogin.getChildren().setAll(mainMenuPane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            new AlertBuilder("warn","User Login",
                    "Username or password Incorrect","Check Again");
        }
    }
}
