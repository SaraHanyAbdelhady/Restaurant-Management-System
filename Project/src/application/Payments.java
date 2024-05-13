package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Payments {
	
	private double billValue;
	


	Payments(){
		
	}

	public double getBillValue(Order order ,Table table) {
		 table.setIsAvailable(true);
		return order.getOrderPrice();	
	}
	
	
	
	
}
