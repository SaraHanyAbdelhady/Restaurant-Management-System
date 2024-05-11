package application;
	
import java.util.ArrayList;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.*;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.shape.Circle;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;

//lazm n handle hna el exception elly momken yb2a thrown mn el ContactNumber

public class Main extends Application {
	static ArrayList<MainDishes> mainDishesItems = MainDishes.initMainDishes();
	static ArrayList<Desserts> desserts = Desserts.initDesserts();
	static ArrayList<Beverages> beverages = Beverages.initBeverages();
	static ArrayList<Table> table = Table.initTables();
	static ArrayList<Customer> customer;
	public static void main(String[] args) {
		
		MainDishes.sort(mainDishesItems);
  	    System.out.println("Menu:");
  	    for (MainDishes item : mainDishesItems) 
  	      item.display();
  	    
  	    Desserts.sort(desserts);
	    System.out.println("Desserts:");
	    for (Desserts item : desserts) 
	      item.display();
	     
	    Beverages.sort(beverages);
	    System.out.println("Beverages:");
	    for (Beverages item : beverages) 
	      item.display();
      
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
			
			btSubmit.setOnAction(event -> {
	            String name = tfName.getText();
	            String contactNumber = tfContactNumber.getText();

	            // Create a new Customer object
	            Customer customer = new Customer(name, contactNumber);
	            customer.add(customer); //msh 3arfa han3ml eh bel list dih el sara7a
			}
			
			VBox sidebar = new VBox();
			// Create a transparent Rectangle for the clickable area
			Rectangle menuclk = new Rectangle(100, 30);
			menuclk.setFill(Color.TRANSPARENT); // Transparent fill
			menuclk.setStroke(Color.GREY); // No border
			menuclk.setId("menu");
			menuclk.setLayoutX(50);
	        menuclk.setLayoutY(100);
			
			Rectangle mainDishesclk = new Rectangle(100, 30);
			mainDishesclk.setFill(Color.TRANSPARENT); // Transparent fill
			mainDishesclk.setStroke(Color.GREY); // No border
			mainDishesclk.setId("mainDishes");
			mainDishesclk.setLayoutY(200);
			mainDishesclk.setLayoutX(100);
		        
			Rectangle dessertsclk = new Rectangle(100, 30);
			dessertsclk.setFill(Color.TRANSPARENT); // Transparent fill
			dessertsclk.setStroke(Color.GREY); // No border
			dessertsclk.setId("desserts");
			dessertsclk.setLayoutY(300);
			dessertsclk.setLayoutX(100);
			
			Rectangle beveragesclk = new Rectangle(100, 30);
			beveragesclk.setFill(Color.TRANSPARENT); // Transparent fill
			beveragesclk.setStroke(Color.GREY); // No border
			beveragesclk.setId("beverages");
			beveragesclk.setLayoutY(400);
			beveragesclk.setLayoutX(100);
			
			
			mainDishesclk.setVisible(false);
			dessertsclk.setVisible(false);
			beveragesclk.setVisible(false);
			
			StackPane stackPaneForMenuClk = new StackPane();
			StackPane stackPaneForMainDishesClk = new StackPane();
			StackPane stackPaneForDessertsClk = new StackPane();
			StackPane stackPaneForBeveragesClk = new StackPane();
			// Create a Text node for the label
	        Text menuTxt = new Text("Menu");
	        menuTxt.setFont(Font.font(14)); // Set font size (optional)
	        menuTxt.setX(10); // Adjust label position (optional)
	        menuTxt.setY(20);
	        
	        Text mainDishesTxt = new Text("Main Dishes");
	        mainDishesTxt.setFont(Font.font(14)); // Set font size (optional)
	        mainDishesTxt.setX(10); // Adjust label position (optional)
	        mainDishesTxt.setY(20);
	        mainDishesTxt.setVisible(false);
	        
	        Text dessertsTxt = new Text("Desserts");
	        dessertsTxt.setFont(Font.font(14)); // Set font size (optional)
	        dessertsTxt.setX(10); // Adjust label position (optional)
	        dessertsTxt.setY(20);
	        dessertsTxt.setVisible(false);
	        
	        Text beveragesTxt = new Text("Beverages");
	        beveragesTxt.setFont(Font.font(14)); // Set font size (optional)
	        beveragesTxt.setX(10); // Adjust label position (optional)
	        beveragesTxt.setY(20);
	        beveragesTxt.setVisible(false);
	        
	        stackPaneForMenuClk.setPadding(new Insets(11,12,13,14));
	        
	        stackPaneForMenuClk.getChildren().addAll(menuclk,menuTxt);
	        stackPaneForMainDishesClk.getChildren().addAll(mainDishesclk,mainDishesTxt);
	        stackPaneForDessertsClk.getChildren().addAll(dessertsclk,dessertsTxt);
	        stackPaneForBeveragesClk.getChildren().addAll(beveragesclk,beveragesTxt);


			// Attach a click event handler
			menuclk.setOnMouseClicked(event -> {
			    // Handle the click action here
				menuclk.setCursor(Cursor.HAND);
				mainDishesclk.setVisible(!mainDishesclk.isVisible());
		        dessertsclk.setVisible(!dessertsclk.isVisible());
		        beveragesclk.setVisible(!beveragesclk.isVisible());
		        mainDishesTxt.setVisible(!mainDishesTxt.isVisible());
		        dessertsTxt.setVisible(!dessertsTxt.isVisible());
		        beveragesTxt.setVisible(!beveragesTxt.isVisible());
			});
			
			mainDishesclk.setOnMouseClicked(event -> {
			    // Handle the click action here
				menuclk.setCursor(Cursor.HAND);
				openNewWindow();
			});

			// Add the Rectangle to your sidebar (VBox)
			sidebar.getChildren().addAll(stackPaneForMenuClk,stackPaneForMainDishesClk,stackPaneForDessertsClk,stackPaneForBeveragesClk);
		    root.setRight(sidebar);
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("MATHS Restaurant"); 
			primaryStage.setScene(scene); 
			primaryStage.show();
			
			
			
			
			
		
			
					} catch(Exception e) { //msh 3arfa a throw IllegalArgumentException 3lshan dah ta2rebn byol2ot ay exception tal3 
						
			e.printStackTrace(); //eh dah??
		}
		
		
		
			
	
	}
	DescriptionPane descriptionPaneForMainDishes = new DescriptionPane();
	MenuItems menuItems = new MainDishes();

	 private void openNewWindow() {
	        Stage mainDishesStage = new Stage();
	        BorderPane rootForMainDishes = new BorderPane();
	        ObservableList<String> MainDishesitems =
	        FXCollections.observableArrayList();
	        
	        
	        BorderPane paneForComboBox = new BorderPane();
	        paneForComboBox.setLeft(new Label("Select a main dish: "));
	        ComboBox<String> cboForMainDishes = new ComboBox<>();
	        paneForComboBox.setCenter(cboForMainDishes);
	        rootForMainDishes.setTop(paneForComboBox);
	        cboForMainDishes.setPrefWidth(400);
	        cboForMainDishes.setValue(mainDishesItems.get(0).getItemName());
	        
	        
	    	
	        for(MainDishes o:mainDishesItems) {
	        		MainDishesitems.add(o.getItemName());
	        }
	         //setDisplay(0);
	        cboForMainDishes.getItems().addAll(MainDishesitems);
	        rootForMainDishes.setLeft(descriptionPaneForMainDishes);
	        cboForMainDishes.setOnAction(e -> setDisplay(MainDishesitems.indexOf(cboForMainDishes.getValue())));
	        
	        
	        // Add content to the new window
	        Scene newScene = new Scene(rootForMainDishes , 300, 150);
	        mainDishesStage.setScene(newScene);
	        mainDishesStage.setTitle("Main Dishes");
	        mainDishesStage.show();
	    }
	 
	 public void setDisplay(int index) {
		 descriptionPaneForMainDishes.setTitle((mainDishesItems.get(index)).getItemName());
		 //descriptionPaneForMainDishes.setImageView((menuItems.getItems().get(index)).getImageView());
		 descriptionPaneForMainDishes.setDescription((mainDishesItems.get(index)).getDescription());
		   }
		  }

	
	

