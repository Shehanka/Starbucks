package com.chamodshehanka.starbucks.ui.controller;

import com.chamodshehanka.starbucks.ui.tableModel.MakeOrderTableModel;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 12/4/2018
 * @project Starbucks
 **/
public class MakeOrderUIController implements Initializable {

    @FXML
    private AnchorPane rootMakeOrder;

    @FXML
    private JFXButton btnBackButton;

    @FXML
    private JFXTextField txtOrderID;

    @FXML
    private JFXDatePicker datePickerOrderDate;

    @FXML
    private JFXTextField txtCustomerID;

    @FXML
    private JFXTextField txtItemCode;

    @FXML
    private JFXTextField txtDescription;

    @FXML
    private JFXTextField txtUnitPrice;

    @FXML
    private JFXTextField txtQty;

    @FXML
    private Text lblItemAmount;

    @FXML
    private Text lblTotalAmount;

    @FXML
    private TableView<MakeOrderTableModel> tblOrder;

    @FXML
    private TableColumn<MakeOrderTableModel, String> colItemCode;

    @FXML
    private TableColumn<MakeOrderTableModel, String> colDescription;

    @FXML
    private TableColumn<MakeOrderTableModel, Double> colPrice;

    @FXML
    private TableColumn<MakeOrderTableModel, Integer> colQty;

    private ObservableList<MakeOrderTableModel> makeOrderTableModelObservableList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setUIComponents();
    }

    @FXML
    private void addToOrderAction(){
        colItemCode.setCellValueFactory(new PropertyValueFactory<>("itemCode"));
        colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        colQty.setCellValueFactory(new PropertyValueFactory<>("qty"));

        tblOrder.setItems(makeOrderTableModelObservableList);

        MakeOrderTableModel makeOrderTableModel = new MakeOrderTableModel();
        makeOrderTableModel.setItemCode(txtItemCode.getText());
        makeOrderTableModel.setDescription(txtDescription.getText());
        makeOrderTableModel.setPrice(Double.parseDouble(txtUnitPrice.getText()));
        makeOrderTableModel.setQty(Integer.parseInt(txtQty.getText()));
        makeOrderTableModelObservableList.add(makeOrderTableModel);

        int qty = Integer.parseInt(txtQty.getText());
        int unitPrice = Integer.parseInt(txtUnitPrice.getText());
        double amount = qty * unitPrice;
        double total = Double.parseDouble(lblTotalAmount.getText());
        total += amount;

        lblItemAmount.setText(String.valueOf(amount));
        lblTotalAmount.setText(String.valueOf(total));
    }

    @FXML
    private void removeItemAction() {

    }

    @FXML
    private void saveOrderAction() {

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
        rootMakeOrder.getChildren().setAll(anchorPane);
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
