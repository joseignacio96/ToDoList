package com.example.todolist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.event.MouseEvent;
import java.io.IOException;

public class MainController {

    public VBox menu;
    public Button btnshowTask;

    public void initialize() {

    }

    public void addTask(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("addTask.fxml"));
            Main.mainScene.setCenter(loader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void showTask(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("showTaskView.fxml"));
            Main.mainScene.setCenter(loader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void exit(ActionEvent actionEvent) {
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setPrefWidth(436);
        anchorPane.setPrefHeight(216);

        Button btnSi = new Button("Si");
        Button btnNo = new Button("No");
        Text text = new Text("¿Seguro que deseas salir de la aplicacion?");


        text.setLayoutX(35);
        text.setLayoutY(74);

        btnSi.setLayoutX(140);
        btnSi.setLayoutY(115);

        btnNo.setLayoutX(300);
        btnNo.setLayoutY(115);

        anchorPane.getStyleClass().add("root");
        text.getStyleClass().add("txtName");
        btnSi.getStyleClass().add("button");
        btnNo.getStyleClass().add("button");

        Group group = new Group(anchorPane,text,btnSi,btnNo);
        Scene scene = new Scene(group);
        scene.getStylesheets().add("exit.css");
        Stage stage = new Stage();

        stage.setScene(scene);

        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();

        btnSi.setOnMouseClicked(event -> {
            System.exit(0);
        });

        btnNo.setOnMouseClicked(event -> {
            stage.close();
        });
    }

}
