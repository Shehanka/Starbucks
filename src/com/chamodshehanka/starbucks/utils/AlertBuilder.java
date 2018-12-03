package com.chamodshehanka.starbucks.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;

/**
 * @author chamodshehanka on 12/2/2018
 * @project Starbucks
 **/
public class AlertBuilder {
    private String title;
    private String headerText;
    private String contentText;

    public AlertBuilder(String alertType, String title, String headerText, String contentText) {
        this.title = title;
        this.headerText = headerText;
        this.contentText = contentText;

        alertType = alertType.toLowerCase();

        switch (alertType){
            case "error": errorAlert();
                break;
            case "info" : infoAlert();
                break;
            case "warn" : warnAlert();
                break;
            default:
                System.out.println("Invalid Alert Type");
        }
    }

    private void errorAlert(){
        Alert adminLoginFailedAlert = new Alert(Alert.AlertType.ERROR);
        DialogPane dialogPane = adminLoginFailedAlert.getDialogPane();
        dialogPane.getStylesheets().add(
                getClass().getResource("/com/chamodshehanka/starbucks/ui/css/dialog-pane-styles.css")
                        .toExternalForm());
        dialogPane.getStyleClass().add("myDialog");
        adminLoginFailedAlert.setTitle(title);
        adminLoginFailedAlert.setHeaderText(headerText);
        adminLoginFailedAlert.setContentText(contentText);
        adminLoginFailedAlert.showAndWait();
    }

    private void infoAlert(){
        Alert adminLoginFailedAlert = new Alert(Alert.AlertType.INFORMATION);
        DialogPane dialogPane = adminLoginFailedAlert.getDialogPane();
        dialogPane.getStylesheets().add(
                getClass().getResource("/com/chamodshehanka/starbucks/ui/css/dialog-pane-styles.css")
                        .toExternalForm());
        dialogPane.getStyleClass().add("myDialog");
        adminLoginFailedAlert.setTitle(title);
        adminLoginFailedAlert.setHeaderText(headerText);
        adminLoginFailedAlert.setContentText(contentText);
        adminLoginFailedAlert.showAndWait();
    }

    private void warnAlert(){
        Alert adminLoginFailedAlert = new Alert(Alert.AlertType.WARNING);
        DialogPane dialogPane = adminLoginFailedAlert.getDialogPane();
        dialogPane.getStylesheets().add(
                getClass().getResource("/com/chamodshehanka/starbucks/ui/css/dialog-pane-styles.css")
                        .toExternalForm());
        dialogPane.getStyleClass().add("myDialog");
        adminLoginFailedAlert.setTitle(title);
        adminLoginFailedAlert.setHeaderText(headerText);
        adminLoginFailedAlert.setContentText(contentText);
        adminLoginFailedAlert.showAndWait();
    }
}
