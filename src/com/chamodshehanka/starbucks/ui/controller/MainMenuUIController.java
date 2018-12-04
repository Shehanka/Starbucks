package com.chamodshehanka.starbucks.ui.controller;

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
public class MainMenuUIController implements Initializable {

    @FXML
    private AnchorPane rootMainMenu;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void loadMakeOrderUI() {
        AnchorPane makeOrderPane = null;
        try {
            makeOrderPane = FXMLLoader.load(getClass()
                    .getResource("/com/chamodshehanka/starbucks/ui/fxml/MakeOrderUI.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        rootMainMenu.getChildren().setAll(makeOrderPane);
    }

    @FXML
    private void loadManageItemsUI() {
        AnchorPane manageItemsPane = null;
        try {
            manageItemsPane = FXMLLoader.load(getClass()
                    .getResource("/com/chamodshehanka/starbucks/ui/fxml/ManageItemsUI.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        rootMainMenu.getChildren().setAll(manageItemsPane);
    }

    @FXML
    private void loadTopItemsUI() {
        AnchorPane topItemsPane = null;
        try {
            topItemsPane = FXMLLoader.load(getClass()
                    .getResource("/com/chamodshehanka/starbucks/ui/fxml/TopItemsUI.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        rootMainMenu.getChildren().setAll(topItemsPane);
    }
}
