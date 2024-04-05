package com.example.assignment5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CircleController {
    final double WIDTH = 500.0;
    final double HEIGHT = 500.0;
    final double RADIUS = Math.min(WIDTH, HEIGHT) / 10;
    Pane pane = new Pane();

    Scene scene = new Scene(pane, WIDTH, HEIGHT);

    @FXML
    protected void onHelloButtonClick() {
        pane.setOnMouseClicked(e -> {
            switch (e.getButton()) {
                case PRIMARY:
                    Circle circle = new Circle(e.getX(), e.getY(), RADIUS);
                    circle.setFill(Color.WHITE);
                    circle.setStroke(Color.BLACK);
                    circle.setOnMouseClicked(f -> {
                        pane.getChildren().remove(f.getSource());
                    });
                    pane.getChildren().add(circle);
                    break; }
        });
        primaryStage.setTitle("java2s.com");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}