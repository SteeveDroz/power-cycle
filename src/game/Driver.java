package game;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Driver extends VBox {
    private Label driver;
    private TextField distance1;
    private TextField distance2;
    private TextField distance3;
    private TextField distance4;
    private TextField distance5;

    public Driver() {
	driver = new Label("Bob");
	distance1 = new TextField();
	distance2 = new TextField();
	distance3 = new TextField();
	distance4 = new TextField();
	distance5 = new TextField();

	HBox hBoxDriver = new HBox();
	hBoxDriver.getChildren().add(new Label("Name: "));
	hBoxDriver.getChildren().add(driver);
	getChildren().add(hBoxDriver);

	HBox hBox1 = new HBox();
	distance1.setOnKeyReleased(event -> update());
	hBox1.getChildren().add(new Label("Distance 1:"));
	hBox1.getChildren().add(distance1);
	getChildren().add(hBox1);

	HBox hBox2 = new HBox();
	distance2.setOnKeyReleased(event -> update());
	hBox2.getChildren().add(new Label("Distance 2:"));
	hBox2.getChildren().add(distance2);
	getChildren().add(hBox2);

	HBox hBox3 = new HBox();
	distance3.setOnKeyReleased(event -> update());
	hBox3.getChildren().add(new Label("Distance 3:"));
	hBox3.getChildren().add(distance3);
	getChildren().add(hBox3);

	HBox hBox4 = new HBox();
	distance4.setOnKeyReleased(event -> update());
	hBox4.getChildren().add(new Label("Distance 4:"));
	hBox4.getChildren().add(distance4);
	getChildren().add(hBox4);

	HBox hBox5 = new HBox();
	distance5.setOnKeyReleased(event -> update());
	hBox5.getChildren().add(new Label("Distance 5:"));
	hBox5.getChildren().add(distance5);
	getChildren().add(hBox5);
    }

    private void update() {
	if (distance1.getText().equals("17") && distance2.getText().equals("23") && distance3.getText().equals("19")
		&& distance4.getText().equals("43") && distance5.getText().equals("29")) {
	    driver.setText("Agent 2-3-5-7-11-13");
	} else {
	    driver.setText("Bob");
	}
    }
}
