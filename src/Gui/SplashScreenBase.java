package Gui;

import java.lang.*;
import java.util.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public abstract class SplashScreenBase extends AnchorPane {

    protected final Button button;
    protected final Label label;

    public SplashScreenBase() {

        button = new Button();
        label = new Label();

        setId("AnchorPane");
        setPrefHeight(200);
        setPrefWidth(320);

        button.setLayoutX(126);
        button.setLayoutY(90);
        button.setOnAction(this::handleButtonAction);
        button.setText("Click Me!");

        label.setLayoutX(126);
        label.setLayoutY(120);
        label.setMinHeight(16);
        label.setMinWidth(69);

        getChildren().add(button);
        getChildren().add(label);

    }

    protected abstract void handleButtonAction(javafx.event.ActionEvent actionEvent);

}
