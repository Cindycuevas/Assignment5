package com.example.assignment5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ShapeExampleController {
    Group root = new Group();

    CubicCurve c = new CubicCurve();

    Scene scene = new Scene(root,300,400);


    @FXML
    protected void onHelloButtonClick() {
        primarystage.setTitle("Cubic Curve Example");
        c.setStartX(20);
        c.setStartY(100);
        c.setControlX1(300);
        c.setControlX2(200);
        c.setControlY1(100);
        c.setControlY2(90);
        c.setFill(Color.RED);
        c.setEffect(new DropShadow());
        c.setEndX(100);
        c.setEndY(300);
        root.getChildren().add(c);
        primarystage.setScene(scene);
        primarystage.show();
    }

}