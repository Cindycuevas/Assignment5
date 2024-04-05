package com.example.assignment5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PolygonController {
    //Creating a Polygon
    Polygon polygon = new Polygon();
    //Creating a Group object
    Group root = new Group(polygon);
    //Creating a scene object
    Scene scene = new Scene(root, 600, 300);


    @FXML
    protected void onHelloButtonClick() {
        polygon.getPoints().addAll(new Double[]{
                300.0, 50.0,
                450.0, 150.0,
                300.0, 250.0,
                150.0, 150.0,

                stage.setTitle("Drawing a Polygon");
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Drawing a Polygon");
        stage.setScene(scene);
        stage.show();
        }
    }
}