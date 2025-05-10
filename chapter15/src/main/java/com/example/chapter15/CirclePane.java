package com.example.chapter15;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class CirclePane extends Pane {
    private Circle circle;

    public CirclePane() {
        circle = new Circle(50, 50, 20);
        getChildren().add(circle);
    }

    public void enlarge() {
        circle.setRadius(circle.getRadius() + 2);
    }

    public void shrink() {
        if (circle.getRadius() > 2) {
            circle.setRadius(circle.getRadius() - 2);
        }
    }
}

