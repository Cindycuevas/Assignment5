package com.example.assignment5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HexagonController {
    Group root = new Group();
    QuadCurve c = new QuadCurve();
    Scene scene = new Scene(root,300,400);

    @FXML
    protected void onHelloButtonClick() {
        primarystage.setTitle("QuadCurve Example");
        c.setStartX(70);
        c.setStartY(30);
        c.setControlX(250);
        c.setControlY(50);
        c.setFill(Color.RED);
        c.setEffect(new DropShadow());
        c.setEndX(250);
        c.setEndY(300);
        root.getChildren().add(c);
        primarystage.setScene(scene);
        primarystage.show();
    }


}