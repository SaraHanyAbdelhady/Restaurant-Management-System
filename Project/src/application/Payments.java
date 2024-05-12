
//t2rebn 5lsan

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
	//private int tableNumber;
	protected double billValue;
	//private int customerId; //hana7tago 3la 7sb el loyalty points
	//private String wayOfPayment;


	Payments(){
		
	}

	public double getBillValue(Order order ,Table table) {
		 table.setIsAvailable(true);
		return order.getOrderPrice();	
	}
	
	
	public class PAYMENT extends Application {
		@Override
		public void start(stage primaryStage) {
			BorderPane pane =new BorderPane();
			// placing the nodes in the pane
			pane.setTop(getHBox());
			pane.setLeft(getVBox());
			// EventHandling
		    cashButton.setOnAction(e->{
		    	pane.setCenter(new Label("your bill value is" + getBillValue));});
		    creditButton.setOnAction(e->{
		    	pane.setCenter(new Label("your bill value is" + (getBillValue+ getBillValue*0.01)));});	
			
			// create Scene and place it in the stage
			Scene scene= new Scene(pane);
			primaryStage.setTitle("Payment");
			primaryStage.setScene(scene);
			primaryStage.show();
		}

	}

	private HBox getHBox() {
		HBox hBox= new HBox(15);
		hBox.setPadding(new Insets(15,15,15,15));
		hbox.getChildren().add(new Label("How would you like to pay ?"));
		return hBox;
	}

	private VBox getVBox() {
		VBox vBox= new VBox(15);
		vBox.setPadding(new Insets(15,5,5,5));
		Button cashButton= new Button("Cash");
		Button creditButton= new Button("Credit");
		vBox.getChildern().addAll(cashButton,creditButton);
		return vBox;
		
	}
	
	
}
