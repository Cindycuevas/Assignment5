package com.example.assignment5;

import javafx.fxml.FXML;

public class LineController {
    // TODO Auto-generated method stub
    Line line = new Line(); //instantiating Line class
    Group root = new Group(); //Creating a Group
    Scene scene = new Scene(root,300,300);

    @FXML
    protected void onHelloButtonClick() {
        line.setStartX(0); //setting starting X point of Line
        line.setStartY(0); //setting starting Y point of Line
        line.setEndX(100); //setting ending X point of Line
        line.setEndY(200); //setting ending Y point of Line
        root.getChildren().add(line); //adding the class object to the group
        primaryStage.setScene(scene);
        primaryStage.setTitle("Line Example");
        primaryStage.show();
    }
}