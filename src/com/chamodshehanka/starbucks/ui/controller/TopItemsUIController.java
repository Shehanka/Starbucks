package com.chamodshehanka.starbucks.ui.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 12/4/2018
 * @project Starbucks
 **/
public class TopItemsUIController implements Initializable {

    @FXML
    private AnchorPane rootTopItems;

    @FXML
    private JFXButton btnBackButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setUIComponents();
    }

    @FXML
    private void backButtonAction() {
        AnchorPane anchorPane = null;
        try {
            anchorPane = FXMLLoader.load(getClass()
                    .getResource("/com/chamodshehanka/starbucks/ui/fxml/MainMenuUI.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        rootTopItems.getChildren().setAll(anchorPane);
    }

    private void setUIComponents(){
        Image backImage = new Image(getClass()
                .getResourceAsStream("/com/chamodshehanka/starbucks/ui/images/back-icon.png"));
        ImageView backImageView = new ImageView(backImage);
        backImageView.setFitWidth(40);
        backImageView.setFitHeight(40);
        btnBackButton.setGraphic(backImageView);
    }
}
