package com.example.chapter14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;

public class ShowEllipse extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a scene and place it in the stage
        Scene scene = new Scene(new MyEllipse(), 300, 200);
        primaryStage.setTitle("ShowEllipse"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}

class MyEllipse extends Pane {
    private void paint() {
        getChildren().clear();
        for (int i = 0; i < 16; i++) {
            // Create an ellipse and add it to pane
            Ellipse e1 = new Ellipse(getWidth() / 2, getHeight() / 2,
                    getWidth() / 2 - 50, getHeight() / 2 - 50);  // Correct the subtraction operator
            e1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));  // Random color
            e1.setFill(Color.WHITE);  // White fill
            e1.setRotate(i * 180 / 16);  // Rotate each ellipse
            getChildren().add(e1);  // Add ellipse to the pane
        }
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paint();  // Redraw the ellipses with new width
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paint();  // Redraw the ellipses with new height
    }
}

