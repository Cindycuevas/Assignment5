package com.example.assignment5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RectangleRedController {
    Group root = new Group();
    Rectangle rect = new Rectangle();
    Scene scene = new Scene(root,200,200);


    @FXML
    protected void onHelloButtonClick() {
        primarystage.setTitle("Color Example");
        rect.setX(50);
        rect.setY(20);
        rect.setWidth(100);
        rect.setHeight(150);
        rect.setFill(Color.RED); //passing color name
        rect.setEffect(new DropShadow());
        root.getChildren().add(rect);
        primarystage.setScene(scene);
        primarystage.show();
    }


}