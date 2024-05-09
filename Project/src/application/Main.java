package application;
	
import java.util.ArrayList;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;




public class Main extends Application {
	
	public static void main(String[] args) {
		Table.initTables();
        // Menu driver methods
        
        MainDishes.initMainDishes();
        Desserts.initDesserts();
        Beverages.initBeverages();
        //try {
        // sorted list
        ArrayList<MainDishes> sorted = MainDishes.sortedMainDishesItems;
        
        /*for (MainDishes item : sorted) 
        	item.display();
        } catch (NullPointerException e) {
        	
        }*/
      
		launch(args);
	}
	private TextField tfName = new TextField();
	private TextField tfContactNumber = new TextField();
	private Button btSubmit = new Button("Submit");
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			GridPane gridPane = new GridPane();
			tfName.setPromptText("Name");
			tfContactNumber.setPromptText("Phone Number");
			gridPane.setPadding(new Insets(11,12,13,14));
			gridPane.setHgap(5);
     		gridPane.setVgap(5);
			gridPane.add(new Label("Your information"), 0, 0);
			gridPane.add(new Label("Name:"), 0, 1); //col,row
			gridPane.add(tfName, 1, 1);
			gridPane.add(new Label("Contact Number:"), 0, 2);
			gridPane.add(tfContactNumber, 1, 2);
			gridPane.add(btSubmit, 1, 5);
			gridPane.setAlignment(Pos.TOP_LEFT);
			tfName.setAlignment(Pos.BOTTOM_RIGHT);
			tfContactNumber.setAlignment(Pos.BOTTOM_RIGHT);
			GridPane.setHalignment(btSubmit, HPos.RIGHT);
			
			
			BorderPane root = new BorderPane();
			root.setLeft(gridPane);
		
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("MATHS Restaurant"); 
			primaryStage.setScene(scene); 
			primaryStage.show();
			
			
			
		
			
					} catch(Exception e) {
			e.printStackTrace();
		}
	}
	 
	
	
	
}
