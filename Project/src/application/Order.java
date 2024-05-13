package application;
import java.util.ArrayList;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.text.*;
public class Order extends Application {
	    private static int numberOfOrders=0;
	    private double orderPrice=0;
	    private int numOfOrder;
	    private ArrayList<MenuItems> order= new ArrayList<MenuItems>() ;
		public Order() {
			numOfOrder=++numberOfOrders;
		}
		
		public void addItem (MenuItems item) {
			order.add(item);	
			this.orderPrice+=item.getPrice();
		}
		
		public void removeItem (MenuItems item) {
			order.remove(item);	
			this.orderPrice-=item.getPrice();
		}
	    public void clearOrder() {
	    	order.clear();
	    	this.orderPrice=0;
	    }
		
	    public int getSize() {
			return order.size();
	    }
	    public double getOrderPrice() {
			return this.orderPrice;
	    }
	    
	    public int getNumberOfOrders() {
			return numberOfOrders ;
	    } 
	    
	    public int getOrderNumber() {
			return numOfOrder ;
	    } 
	    
		
	    
	    public void start(Stage primaryStage) {
	    	primaryStage.setTitle("The Order");
	    	
	    	VBox vbox = new VBox();
	    	Text text1 = new Text();
	    	Text text2 = new Text();
	    	text1.setText("Your Order and its price:");
	    	 
	    	vbox.getChildren().addAll(text1,text2);
	        
	        text1.setFont(Font.font("Calibri",FontWeight.BOLD,20));
	        
	        
	        
	        
	        int the_order;
	     
	        for (the_order=0;the_order<numberOfOrders;the_order++) {
	        	
	        	new Text(order.get(numOfOrder));
	        	vbox.setSpacing(20);
	        }
	    	primaryStage.setScene(new Scene(vbox,450,600));
	    	primaryStage.setResizable(false);
	    	primaryStage.show();
	    	
	    
	    }
	    
		
	}
	
	
	
}
