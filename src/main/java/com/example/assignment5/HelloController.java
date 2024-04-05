package com.example.assignment5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    Label label1 = new Label();
    Label label2 = new Label();

    HBox root = new HBox();
    Scene scene = new Scene(root, 300, 50);
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        label1.setText("Hello");
        label2.setText(" World");
        root.getChildren().add(label1);
        root.getChildren().add(label2);
        primaryStage.setTitle("JavaFX Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}