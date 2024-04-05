package com.example.assignment5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RadialGradientController {
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("Radial Gradient Example");
        Group root = new Group();
        Scene scene = new Scene(root, 400, 300, Color.WHITE);
        primaryStage.setScene(scene);
        addRectangle(scene);
        primaryStage.show();
    }
    private void addRectangle(final Scene scene) {
        Circle C = new Circle(200, 150, 100);
        RadialGradient gradient1 = new RadialGradient(0,
                .1,
                100,
                100,
                200,
                false,
                CycleMethod.NO_CYCLE,
                new Stop(0, Color.YELLOW),
                new Stop(1, Color.RED));
        C.setFill(gradient1);

        final Group root = (Group) scene.getRoot();
        root.getChildren().add(C);
    }
}