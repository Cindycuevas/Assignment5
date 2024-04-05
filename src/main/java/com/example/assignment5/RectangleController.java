package com.example.assignment5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RectangleController {
    Group root = new Group();
    Rectangle rect = new Rectangle();
    Scene scene = new Scene(root,300,400,Color.hsb(180, 1, 1));

    @FXML
    protected void onHelloButtonClick() {
        primarystage.setTitle("Color Example");
        rect.setX(50);
        rect.setY(20);
        rect.setWidth(200);
        rect.setHeight(250);
        rect.setEffect(new DropShadow());
        root.getChildren().add(rect);
        primarystage.setScene(scene);
        primarystage.show();
    }
}