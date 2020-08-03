package com.teamgannon.trips.search.components;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;

/**
 * Created by larrymitchell on 2017-06-25.
 */
public class DistanceSelectionPanel extends BasePane {

    private final static Color textColor = Color.BLACK;
    private final Slider d2EarthSlider = new Slider(0, 150, 20);
    private final Label d2EarthLabel = new Label(d2EarthSlider.getValue() + " ly");


    public DistanceSelectionPanel() {
        Label distanceToEarth = createLabel("Distance from Earth");

        d2EarthSlider.setPrefWidth(400);

        d2EarthSlider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                                Number old_val, Number new_val) {

                // set distance to earth
                d2EarthLabel.setText(String.format("%.2f", new_val) + " ly");
            }
        });

        d2EarthLabel.setTextFill(textColor);

        planGrid.add(distanceToEarth, 0, 0);
        planGrid.add(d2EarthSlider, 1, 0);
        planGrid.add(d2EarthLabel, 2, 0);
    }

    public double getDistance() {
        return d2EarthSlider.getValue();
    }

}