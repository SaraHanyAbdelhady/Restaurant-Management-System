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
	private TextField tfEmail = new TextField();
	private Button btSubmit = new Button("Submit");
	private TextField tfNoOfSeats = new TextField();
	private Button btTable1 = new Button("Table 1");
	private Button btTable2 = new Button("Table 2");
	private Button btTable3 = new Button("Table 3");
	private Button btTable4 = new Button("Table 4");
	private Button btTable5 = new Button("Table 5");
	private Button btTable6 = new Button("Table 6");
	private Button btTable7 = new Button("Table 7");
	private Button btTable8 = new Button("Table 8");
	private GridPane gridPane = new GridPane();
	private Label lbl1 =new Label(null);
	private Label lbl2 =new Label(null);
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox hbox1 = new HBox(5);
			HBox hbox2 = new HBox(5);
			HBox hbox3 = new HBox(5);
			HBox hbox4 = new HBox(5);
			hbox1.getChildren().add(btTable1);
			hbox1.getChildren().add(btTable2);
			hbox1.setAlignment(Pos.BASELINE_RIGHT);
			hbox2.getChildren().add(btTable3);
			hbox2.getChildren().add(btTable4);
			hbox3.getChildren().add(btTable5);
			hbox3.getChildren().add(btTable6);
			hbox3.setAlignment(Pos.BASELINE_RIGHT);
			hbox4.getChildren().add(btTable7);
			hbox4.getChildren().add(btTable8);
			
			
			tfName.setPromptText("Name");
			tfContactNumber.setPromptText("Phone Number");
			tfEmail.setPromptText("Email");
			tfNoOfSeats.setPromptText("Number of Seats");
			gridPane.setPadding(new Insets(11,12,13,14));
			gridPane.setHgap(5);
     		gridPane.setVgap(5);
			gridPane.add(new Label("Your information"), 0, 0);
			gridPane.add(new Label("Name:"), 0, 1); //col,row
			gridPane.add(tfName, 1, 1);
			gridPane.add(new Label("Contact Number:"), 0, 2);
			gridPane.add(tfContactNumber, 1, 2);
			gridPane.add(new Label("Email:"), 0, 3);
			gridPane.add(tfEmail, 1, 3);
			
			gridPane.add(btSubmit, 1, 5);
			gridPane.add(new Label("=============="), 0, 6);
			gridPane.add(new Label("Choose a Table"), 0, 7);
			gridPane.add(new Label("Number of Seats:"), 0, 8);
			gridPane.add(tfNoOfSeats, 1, 8);
			gridPane.add(hbox1, 0, 9);
			gridPane.add(hbox2, 1, 9);
			gridPane.add(hbox3, 0, 10);
			gridPane.add(hbox4, 1, 10);

			gridPane.setAlignment(Pos.TOP_LEFT);
			tfName.setAlignment(Pos.BOTTOM_LEFT);
			tfContactNumber.setAlignment(Pos.BOTTOM_LEFT);
			tfNoOfSeats.setAlignment(Pos.BOTTOM_LEFT);
			GridPane.setHalignment(btSubmit, HPos.RIGHT);
			
			btSubmit.setOnAction(e -> btSubmitHandler());
			
			btTable1.setOnAction(e -> btTableHandler(0));
			btTable2.setOnAction(e -> btTableHandler(1));
			btTable3.setOnAction(e -> btTableHandler(2));
			btTable4.setOnAction(e -> btTableHandler(3));
			btTable5.setOnAction(e -> btTableHandler(4));
			btTable6.setOnAction(e -> btTableHandler(5));
			btTable7.setOnAction(e -> btTableHandler(6));
			btTable8.setOnAction(e -> btTableHandler(7));
			
			
			BorderPane root = new BorderPane();
			root.setLeft(gridPane);
			
			/*btSubmit.setOnAction(event -> {
	            String name = tfName.getText();
	            String contactNumber = tfContactNumber.getText();

	            // Create a new Customer object
	            Customer customer = new Customer(name, contactNumber);
	            //customer.add(customer); //msh 3arfa han3ml eh bel list dih el sara7a
			});*/
			
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
				mainDishesclk.setCursor(Cursor.HAND);
				openNewWindowForMainDishes();
			});
			
			dessertsclk.setOnMouseClicked(event -> {
			    // Handle the click action here
				dessertsclk.setCursor(Cursor.HAND);
				openNewWindowForDesserts();
			});
			
			beveragesclk.setOnMouseClicked(event -> {
			    // Handle the click action here
				beveragesclk.setCursor(Cursor.HAND);
				openNewWindowForBeverages();
			});

			// Add the Rectangle to your sidebar (VBox)
			sidebar.getChildren().addAll(stackPaneForMenuClk,stackPaneForMainDishesClk,stackPaneForDessertsClk,stackPaneForBeveragesClk);
		    root.setRight(sidebar);
			
			Scene scene = new Scene(root,500,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("MATHS Restaurant"); 
			primaryStage.setScene(scene); 
			primaryStage.show();
			
			
			
			
			
		
			
					} catch(Exception e) { //msh 3arfa a throw IllegalArgumentException 3lshan dah ta2rebn byol2ot ay exception tal3 
						
			e.printStackTrace(); //eh dah??
		}
		
		
		
			
	
	}
	
	private void btSubmitHandler() {
		
		try {
			
			String name = tfName.getText();
			String contactNumber = tfContactNumber.getText();
			String email =tfEmail.getText();
			Person customer=new Customer(name,contactNumber,email);
			lbl2.setText("Data Saved");
			lbl2.setTextFill(Color.GREEN);
			gridPane.add(lbl2, 0, 4);
		}
		catch(IllegalArgumentException ex1) {
			lbl2.setText(ex1.getMessage());
			lbl2.setTextFill(Color.RED);
			gridPane.add(lbl2, 0, 4);
		}
		catch(Exception ex2){
			lbl2.setText("Please Enter your Data.");
			lbl2.setTextFill(Color.RED);
			gridPane.add(lbl2, 0, 4);
		}
}
	
	private void btTableHandler(int i) {
		try {
			int t = Integer.parseInt(tfNoOfSeats.getText());
			if(t > 7) {
				throw new IllegalArgumentException("we don't have tables with this capacity!");
			}
			else if (table.get(i).getIsAvailable()) {
				lbl1.setText("Your table is ready, Bon appetit :)");
				lbl1.setTextFill(Color.BLUE);
				gridPane.add(lbl1, 0, 11);
				table.get(i).setIsAvailable(false);
			}
			else {
				throw new IllegalArgumentException("Sorry, this table is not available for now.");
			}
		}
		catch(IllegalArgumentException Ex) {
			lbl1.setText(Ex.getMessage());
			lbl1.setTextFill(Color.RED);
			gridPane.add(lbl2, 0, 11);
		}
		catch(Exception Ex) {
			lbl1.setText("Enter an Integer number please.");
			lbl1.setTextFill(Color.RED);
			gridPane.add(lbl2, 0, 11);
		};
		
	}
	
	DescriptionPane descriptionPaneForMainDishes = new DescriptionPane();
	MenuItems menuItems = new MainDishes();
	DescriptionPane descriptionPaneForDesserts = new DescriptionPane();
	DescriptionPane descriptionPaneForBeverages = new DescriptionPane();

	 private void openNewWindowForMainDishes() {
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
	        cboForMainDishes.setOnAction(e -> setDisplayForMainDishes(MainDishesitems.indexOf(cboForMainDishes.getValue())));
	        
	        
	        // Add content to the new window
	        Scene newScene = new Scene(rootForMainDishes , 300, 150);
	        mainDishesStage.setScene(newScene);
	        mainDishesStage.setTitle("Main Dishes");
	        mainDishesStage.show();
	    }
	 
	 public void setDisplayForMainDishes(int index) {
		 descriptionPaneForMainDishes.setTitle((mainDishesItems.get(index)).getItemName());
		 //descriptionPaneForMainDishes.setImageView((menuItems.getItems().get(index)).getImageView());
		 descriptionPaneForMainDishes.setDescription((mainDishesItems.get(index)).getDescription());
		   }
	 
	 
	 
	 private void openNewWindowForDesserts() {
	        Stage DessertsStage = new Stage();
	        BorderPane rootForDesserts = new BorderPane();
	        ObservableList<String> dessertsitems =
	        FXCollections.observableArrayList();
	        
	        
	        BorderPane paneForComboBoxForDesserts = new BorderPane();
	        paneForComboBoxForDesserts.setLeft(new Label("Select a dessert: "));
	        ComboBox<String> cboForDesserts = new ComboBox<>();
	        paneForComboBoxForDesserts.setCenter(cboForDesserts);
	        rootForDesserts.setTop(paneForComboBoxForDesserts);
	        cboForDesserts.setPrefWidth(400);
	        cboForDesserts.setValue(desserts.get(0).getItemName());
	        
	        
	    	
	        for(Desserts o:desserts) {
	        		dessertsitems.add(o.getItemName());
	        }
	         //setDisplay(0);
	        cboForDesserts.getItems().addAll(dessertsitems);
	        rootForDesserts.setLeft(descriptionPaneForDesserts);
	        cboForDesserts.setOnAction(e -> setDisplayForDesserts(dessertsitems.indexOf(cboForDesserts.getValue())));
	        
	        
	        // Add content to the new window
	        Scene newScene = new Scene(rootForDesserts , 300, 150);
	        DessertsStage.setScene(newScene);
	        DessertsStage.setTitle("Desserts");
	        DessertsStage.show();
	    }
	 
	 public void setDisplayForDesserts(int index) {
		 descriptionPaneForDesserts.setTitle((desserts.get(index)).getItemName());
		 //descriptionPaneForMainDishes.setImageView((menuItems.getItems().get(index)).getImageView());
		 descriptionPaneForDesserts.setDescription((desserts.get(index)).getDessertDescription());
		   }
	 
	 private void openNewWindowForBeverages() {
	        Stage beveragesStage = new Stage();
	        BorderPane rootForbeverages = new BorderPane();
	        ObservableList<String> beveragesitems =
	        FXCollections.observableArrayList();
	        
	        
	        BorderPane paneForComboBoxForBeverages = new BorderPane();
	        paneForComboBoxForBeverages.setLeft(new Label("Select a drink: "));
	        ComboBox<String> cboForBeverages = new ComboBox<>();
	        paneForComboBoxForBeverages.setCenter(cboForBeverages);
	        rootForbeverages.setTop(paneForComboBoxForBeverages);
	        cboForBeverages.setPrefWidth(400);
	        cboForBeverages.setValue(beverages.get(0).getItemName());
	        
	        
	    	
	        for(Beverages o:beverages) {
	        		beveragesitems.add(o.getItemName());
	        }
	         //setDisplay(0);
	        cboForBeverages.getItems().addAll(beveragesitems);
	        rootForbeverages.setLeft(descriptionPaneForBeverages);
	        cboForBeverages.setOnAction(e -> setDisplayForBeverages(beveragesitems.indexOf(cboForBeverages.getValue())));
	        
	        
	        // Add content to the new window
	        Scene newScene = new Scene(rootForbeverages , 300, 150);
	        beveragesStage.setScene(newScene);
	        beveragesStage.setTitle("Beverages");
	        beveragesStage.show();
	    }
	 
	 public void setDisplayForBeverages(int index) {
		 descriptionPaneForBeverages.setTitle((beverages.get(index)).getItemName());
		 //descriptionPaneForMainDishes.setImageView((menuItems.getItems().get(index)).getImageView());
		 descriptionPaneForBeverages.setDescription((beverages.get(index)).getBeverageDescription());
		   }
		  }

	
	

