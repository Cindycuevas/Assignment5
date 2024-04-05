package com.example.assignment5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HoneycombController {
    double height = 600;
    double width = 800;
    AnchorPane tileMap = new AnchorPane();
    Scene content = new Scene(tileMap, width, height);
    double size = 50,v=Math.sqrt(3)/2.0;
        for(double y=0; y < height; y += size * Math.sqrt(3))
    {
        for(double x=-25,dy=y;x<width;x+=(3.0/2.0)*size)
        {
        }
    }
    Polygon tile = new Polygon();


    @FXML
    protected void onHelloButtonClick() {
        primaryStage.setScene(content);
        tile.getPoints().addAll(new Double[]{
                x, dy,
                x + size, dy,
                x + size * (3.0 / 2.0), dy + size * v,
                x + size, dy + size * Math.sqrt(3),
                x, dy + size * Math.sqrt(3),
                x - (size / 2.0), dy + size * v
        });
        tile.setFill(Paint.valueOf("#ffffff"));
        tile.setStrokeWidth(2);
        tile.setStroke(Paint.valueOf("#000000"));
        tileMap.getChildren().add(tile);
        dy = dy == y ? dy + size * v : y;
        primaryStage.show();
    }
}