package com.example.assignment5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RectangleBlueController {
    Group root = new Group();
    primarystage.setTitle("Color Example");
    Rectangle rect = new Rectangle();

    Scene scene = new Scene(root, 300, 400);


    @FXML
    protected void onHelloButtonClick() {
        rect.setX(50);
        rect.setY(20);
        rect.setWidth(200);
        rect.setHeight(250);
        rect.setEffect(new DropShadow());
        rect.setFill(Color.web("#0000FF", 1));
        root.getChildren().add(rect);
        primarystage.setScene(scene);
        primarystage.show();
    }
}