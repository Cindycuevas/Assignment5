package com.example.assignment5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ShapesController {
    Circle circle = new Circle(40);

    Rectangle rect = new Rectangle(120, 75);
    // Create a line
    Line line = new Line(0, 0, 150, 50);

    // Create a parallelogram
    Polygon parallelogram = new Polygon();

    // Create a hexagon
    Polyline hexagon = new Polyline(100.0, 0.0, 120.0, 20.0, 110.0, 140.0, 100.0, 60.0, 80.0, 40.0, 80.0, 120.0, 100.0, 0.0);

    // A CHORD arc with no fill and a stroke
    Arc arc = new Arc(0, 0, 50, 100, 0, 90);

    // Add all shapes to an HBox
    HBox root = new HBox(circle, rect, line, parallelogram, hexagon, arc);

    Scene scene = new Scene(root);


    @FXML
    protected void onHelloButtonClick() {
        circle.setFill(Color.RED);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2.0);
        rect.setFill(Color.RED);
        line.setStrokeWidth(5.0);
        line.setStroke(Color.GREEN);
        parallelogram.getPoints().addAll(30.0, 0.0, 130.0, 0.0,120.00, 50.0,0.0, 50.0);
        parallelogram.setFill(Color.AZURE);
        parallelogram.setStroke(Color.BLACK);
        hexagon.setFill(Color.WHITE);
        hexagon.setStroke(Color.BLACK);
        arc.setFill(Color.TRANSPARENT);
        arc.setStroke(Color.BLACK);
        arc.setType(ArcType.CHORD);
        root.setSpacing(10);
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");
        stage.setScene(scene);
        stage.setTitle("2D Shapes");
        stage.show();
    }

}