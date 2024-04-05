package com.example.assignment5;

import javafx.fxml.FXML;

public class ArraysOfLinesController {
    Line line1 = new Line(20, 40, 270, 40);
    Line line2 = new Line(20, 60, 270, 60);
    Line line3 = new Line(20, 80, 270, 80);
    Line line4 = new Line(20, 100, 270, 100);
    Line line5 = new Line(20, 120, 270, 120);
    AnchorPane root = new AnchorPane();
    final Scene scene = new Scene(root, 400, 250);
    @FXML
    protected void onHelloButtonClick() {
        line1.getStrokeDashArray().addAll(25.0, 20.0, 5.0, 20.0);
        line2.getStrokeDashArray().addAll(50.0, 40.0);
        line3.getStrokeDashArray().addAll(25.0, 10.0);
        line4.getStrokeDashArray().addAll(2.0);
        line5.getStrokeDashArray().addAll(2.0, 21.0);
        root.setPadding(new Insets(5));
        root.getChildren().addAll(line1, line2, line3, line4, line5);
        stage.setTitle("JavaFX Line (o7planning.org)");
        stage.setScene(scene);
        stage.show();
    }
}