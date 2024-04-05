package com.example.assignment5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RectangleExampleController {
    Group root = new Group();
    Rectangle rect = new Rectangle();

    int red=20;
    int green=125;
    int blue=10;

    Scene scene = new Scene(root,200,200);

    @FXML
    protected void onHelloButtonClick() {
        primarystage.setTitle("Color Example");
        rect.setX(50);
        rect.setY(20);
        rect.setWidth(100);
        rect.setHeight(150);
        rect.setFill(Color.rgb(red, green, blue,0.63));
        root.getChildren().add(rect);
        primarystage.setScene(scene);
        primarystage.show();
    }


}