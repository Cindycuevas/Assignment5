package com.example.assignment5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RectangleLinearGradientController {
    VBox root = new VBox();
    final Scene scene = new Scene(root,300, 250);
    Stop[] stops = new Stop[] { new Stop(0, Color.GREEN), new Stop(1,Color.BLUE)};
    LinearGradient linear = new LinearGradient(0, 0, 1, 0, true,CycleMethod.NO_CYCLE, stops);
    Rectangle rect = new Rectangle(0, 0, 100, 100);


    @FXML
    protected void onHelloButtonClick() {
        rect.setFill(linear);
        root.getChildren().add(rect);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Animation Example");
        primaryStage.show();
    }


}