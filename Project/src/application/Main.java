package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


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
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
