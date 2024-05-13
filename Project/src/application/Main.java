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
	
	ImageView[] mainDishesImages = {new ImageView("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDEZc07zKAt_n4Tr5pO0A3Zlm7qku6teohdF61KAP8jA&s"),
			new ImageView("https://th.bing.com/th/id/OIP.-Wvf_yJfzlrGMUn5gIMvfgHaFj?w=255&h=191&c=7&r=0&o=5&dpr=1.3&pid=1.7"),
			new ImageView("https://th.bing.com/th/id/OIP.ZDp2I-3jp5jL96RUfNu6zgHaHa?w=197&h=197&c=7&r=0&o=5&dpr=1.3&pid=1.7"),
			new ImageView("https://th.bing.com/th/id/OIP.rXm7nEAZSTziqRc8YWQoxAHaHa?w=179&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"),
			new ImageView("https://th.bing.com/th?id=OIF.Axklcf%2b4ZGIoKU01hzip%2fA&w=221&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"),
			new ImageView("data:image/jpeg;base64,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"),
			new ImageView("https://th.bing.com/th/id/OIP.eI0j9wHw_wxRvDBOBrLzuwHaE8?w=269&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"),
			new ImageView("https://th.bing.com/th/id/OIP.68uiBJmscINugtv8jRjIlQHaHa?w=198&h=198&c=7&r=0&o=5&dpr=1.3&pid=1.7"),
			new ImageView("data:image/jpeg;base64,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"),
			new ImageView("data:image/jpeg;base64,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")};
	ImageView[] dessertsImages = {new ImageView("https://th.bing.com/th/id/OIP.fSO9PwNsiAW_UiWWsX6qKAHaE7?w=202&h=134&c=7&r=0&o=5&dpr=1.3&pid=1.7"),
	
			//("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAsJCQcJCQcJCQkJCwkJCQkJCQsJCwsMCwsLDA0QDBEODQ4MEhkSJRodJR0ZHxwpKRYlNzU2GioyPi0pMBk7IRP/2wBDAQcICAsJCxULCxUsHRkdLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCz/wAARCADqAJUDASIAAhEBAxEB/8QAGwAAAgMBAQEAAAAAAAAAAAAABAUCAwYAAQf/xABJEAACAgEDAgQCCAIHAwkJAAABAgMRBAASIQUxE0FRYSJxBhQjMoGRobFCwTNSYtHh8PEVcoIHJCVDc5KisrM0NURTY2R0dbT/xAAbAQACAwEBAQAAAAAAAAAAAAAEBQIDBgEAB//EAC8RAAICAgICAQQBAwIHAAAAAAECAAMRIQQSMUEFEyJRYfAVgcEUIzIzQnGRseH/2gAMAwEAAhEDEQA/AGqltoA77UH6Xrwmie58ge/HvrxeQD6+/oL1GR1jR5GIUKpYk9gB66bRLJbq9RXGvQ3lfB72eNX4+BNNjw5EreCZQHETJbKh+7uIPc99ePgsDXirXlSnv+euZEn0bErDkGj8j8tC9RcGb6Pi7rOy/wD+OTRLYzKQTOtCgSVP73oHMgaWTAaHIjY4088xpWIO+FoaBuvO9RexUGSZJamJ0IQDyD6fnrvJh/aNapjaMHZLJKzUd5VNoQ/jY/XRydLlnhWRJnKSHcGR0ogeYZAR+uhW59A9y4cO0+pQL/Jv5a9JJHayAPPVpxchES4mFcG+W9LOvVxJWNWgbj4W3A1XcalVy6rdKd/idfi2V+RqVC/8+fOhpL/2on/6tP8A130x+qTAn44//F/MaobAyWzfHDxBFw0xqO7du8QyX2qudFk5g4Uyvnd31Id/P/XRP+z8n+tFyeOW/u1E4WYpHMXI8mNjn5a8CJ4q0Ga7q/P37VqJ7fPRZwcxyWXw6Po3PGonBza+6nkPvrqWRI9Wx4gQu1+Y/e9B4F7Mv/8AOzP/AFNNTg5y8mNOKv419fnoLE6f1SNMkHHAL5eRIoEkZtXawb3aiTsTwU4OpLn112rRhdS5+wP/AH4z+x12p5E51b8QlRSqf7IOgs+jBMA1BSl+9uoN6N+Laqj+qv8APQuTGngShqLOoNelEHy1HGpHO5qcmRVteFA4I+XppHlZYVgqE7idoC8sT7Aa96l1AAbFbk3Qrk8+V6ExIHLiUq0rH4r4Cpx2o86A5HIXjrvzGddRtP6h0HT5MtQcosMdhbRqSC1ci2Gg8uPFimjgxlKQxI82VMdzGKCMWbLE/h89OUPUSiIkMXhhLJd2LDnsFUV+ulfX8KXB6D1TIeYvPO0EY4AZ90ysyKF9geNI3ve45O4zppAYL+ZkeoZ+R1aQwQA4uCCqgbreQeRY+Z1pfof4uLj5yPkXjHI3Qo5LBdq7Waz6n+/z1kYMzpsCIDIp3oSSLKru58tEydWwnjj+ryNHKmzfsYhWEYoN6XwNBG2wHY1NK3xyGvpV5/M+iT9Sw0ELySKtluBRPwizx++lL9Ximz8OJApUAEstnl+FJrtf89YPP6lmZGTNE7rKkWQ5dwnMrAsNzEG/M1z6enDfoD7s7AieaOQyMCY03KFMalju3jmqvg6NrAWwfnIlK/HdaGsY50f/AFNu4UbrJPaj537a4AFmFDsnlRv01I7Qp8+/bvQ1FCu8f19hr5c608w5k1vgdtpv8SdSJWhZ5o9vbjXu0VZPLcfz1B+NoHJ5B/HXpyejkd6Fgm+OdesDRN+YHJ1WrHhK7ckHnXrKxqidoPPFg8dr16enoFhufbVYPDELyGb5En11xJJpfWvxI7airEg7v4WP92uzwMkHoAEC/c867XWW52/n312uzsWPLGqeJu4AVbAJ5N8caTZeWwJVeWchEHmSdHZThFJ/qqDf4eWlXS8duo57M3MUbANfkPMD59vz1VyuQONUXMHoq+tYEEaYsEkriaUW0gHhir+EDv8AM/5761OFhqEi+EbaJPHeudRxsKBFaWTasaKfX4R6caNWUyUkVolUGI5I9tZDNl7d7JpfsrHVJPMy8DAx2myXSOMJfxEKWodlvXzDM6l1D6USZLNOsHTsXIcQwW7G2Fdh3sd/n+Y302myG69nQuHVMdIIoEdyylPDDCRRdfFd6UYXUpMRWRGC8nxOwDdzxx30bgKAI24FChgzEZI1mMT03AQiNFaZgFsohKg81Z7frqLYfTlZVkYJK5AEaN4jEkHgrGD8joSTqWXPsRZGWyLCnduLGgVVfy1Yk2QAv1UJCg2uzhbkkeM2Wdns8dx8tdG49bQwu/5/PUnLhxUSEyyzUu6RghY80dtEmqr8vXTX6LYcbZsryxuxxIS9SEVHN4m26HnXbk+f4Kf+lG3THKm3tTs4aiQgDC6rsK1p/olUkPU5HVRIZkR2skvSk2SefP8AXRVCKbBiK/kLbKuM2dZ1qaRXjNjy3ENXnfN6mAoljJ7GKiPIm+NVFltQoAsD8e/J1U8u2WDkbfBo2b5BA506mFwTCdxAjs8AnXM4IBFnjd786DlnW0F/dPxfnoc5YjIDGgpNWf010mQAjZaGxt3+F6uIVR5HnyPe/XS2LISSrscAA1Y40wIAK9iRX7aqFqM3UHcsKMo7EalYAsEj+In/AF16gvd5kkn8tcwII78j4tchIDULFk8jzvVsrE6x5qSfPsNdqVtx2/LXa9iSmU6qWEZYGh4d8H0HfRH0e8HExo5CB8Y8Rj6sRu/mdD9XX/m7HniFq/LVGL4ggxkDGkjUPRq6FWNKPlmGFB8Sz45TkkTVHqHiAEGoj91R3sjknTTp6vId7ccCkHvpD0uNmG8izdxngkAkCtMuvZr9G+j/AFPLiBE3hfVsYj73jTnwUIr0sn8NZ2q1rXwPEeNUF17M+Tddz36h1bq2c9/a5EghWr2xx/ZRih7AaVqNvwupD8bQw5O7kfno3GikkmVC/wAUhCE0PhAFflorMgiSbp2RhWr47JFIZOxkVvhNH8q9tMh5M0YpCorH16/UhGgA+EUQRztoBbHCjvzphBFD4WTkO0McEe6BFeVFmkdqbZHGDuPufw0Hn5WRU2U8cXiSFa8MMsYYKELURfppeqzZLo0hUl3AJ7KrcJ8QHIJ7D11YNQlrMHoBuM8nOWVikQkZfE5pULKoUKKN15fprV/RvMwpMSPFhDpNjxscgSbadncv4ilSePLWRhR4YlkSjGsIMqj4SzuN7I3qF7Uf1vhx0V1xQ04LGTJiPhxiiyIDSrXr5t+HpyZxjh+xib5MG2kL7zrHszYMxrc38JHP4VpblTus+MpI2+DKBwL5YHvoPJ6lmQxO5SPaRYRy12bPccaWS5uVP4M7LsKJtBWyu1qa/wDP+pZ5lWNHMRr8Tys5K6j6CQ5mQkEckaO4O3eT8W0nsBq7qWDBhR4ZedpciRyXFKI6Au1Xvx5c6yq5C4+dj5MMpuN7EhB/3QSraPzM6TJysCMZRmtlUFjwpc1V6WXct2yBqE/076eCTmaXBUlVvcb20TV89xpk9Ahq70L+XGoxY0ePCjH4VQBSRzZPA2j1OpUSL9RX46B4txpt7H3KuQosTA9Tz7zbSbC8knz9BqIvdIa7txX92prRJodgPz7nUFNO4vnc34fI61giKe8/5Ou15xZtebPprtdkpmOsKxxdtd4zflzWh+nskkUEhcVIFsegAs9tMOpLcKivL9xrP9OcqJoATaZB2gDsJPir1q70j+ZTNYf8Qr4xsOU/M2vSFZ8mUUSkYCfD2pgG/TSz/lAzn3dD6WoIiWZc2XuA7JG4jX045P8App70ZBDiHJkLAIjySUOTt76z2Op63P1TK6ioZcqTbBETQhjjBCFPMUPT199JOFodvzHoZUuBbeJg8Pe2TMw7t43PJpiSOdEWTLHCGBhimDSuF7u4ILD2/HVfUMafp3UsrCQSiJpC+M+y2eEk7XG3y7i/bXFJY0HhxStQe5PDcItcsWLCr50c3nc0/HdXQHOoQ0K57zwQqdkMYhiaVwdvqePIe3r56CkjyMSXwchGikVEKtwfum1daPPN+f8AgX07NTHkWO0PxFrcFhuHLWo5v00f1ZI87HjyAFjkha3QKQEQmyB58dxriscyyxA6918iAZDZEGLCzQBVyhGil2PwKKPKdr9/c6ZfRrGSRpshiSwJjUEmgnfWfny5Zoo4XfesLVGxu2T3046HOcLIyIpKCsNjNdruHbkeuvXMeu4PQoLN1OdajPrjNCiBQ77mPAFsxNKqge5vV2XKmF0mKOTGC5LIsR5+6xF9+brtqzqUCzxePuIeKpISObcUa/z/AK5vPz5svwIzJv2CiLJo9rOp1EYnLsgA5jPp+AMjBllkDbvtfDYE2zdywvQceNLIkjpJZjAbYKBDAgcVx5a0PTcrCTp+NFLLEoijpQlkte6hXe/XStNsLZ7MpCKQPi8xZAA11sepQw71feNgTT9L6hL1ODDMhr6vHtksipJQSu+vl+59dOt1IeOaoAfmNI/o9gZGPiKZhERN9oEohgWPmdPSoO0A3yR5ccHVVFYsvAPiZrksEU9ZHgKD/WXn0snVCtuaS/Jytj01c9/Cv8XZT3Hl31WgouKB5NkfvrVCIJ6zcj7vIvz12kmZ1aOGdo91lQLrsL12uF1GjJhSZblx+JCB/ZH7azGGqx9UMTr/AEu1lvj4kaj+9/hrXldyL/uj8q1n+q4skUkOZAAJYXDexHmD89B82g30lBOcS36Noea/MbwekTRBqaVCgruRfP6aysM8iKUiLKWUIa44Bs3XPy0bF1BstGZnLgxttV+4ftx7jQLgQyxSUb3lW9OeOdZNSR9njE0RG+3nMLyooMjFKug8XDRPDc8v4UjgMoJHaxY50qzs7HhSCOpXc/BGg20g7nuOffTuP6vL07r0sj7FhgyCJAOxv7IJfnurjWByZppJcVpkG9DyUP2bbhQcVyBfJHtqFCmwFifcfcUkjqBqPcHCxGd5GjjOTkOjtsK7FT4qjFc8Vbaj1SCKXHtSbYHeYnYM6qeRXp6aEx8zwFEgCM4iLSMCQVLjaL3Cj2N0Ob1dBkPPDJLLZDTPsI+EVSggKO3PJ58/bVyhg3YxyKwPtXxE6dHyZhvjtjSyGNqDetc1ppkS4boy+E6Sk0Aq1yTwrMaFe9amHlxnWUOCFIC1fcdwb/DVDJm9Vy5/ATdtJ4SgzAg3tvyHn8xphjsNwNMUkqoxmFRT9SwYUlP22C6rT2biJ+HawIJHvwdL8FYnzLcKqSZANWOAW3UD+Q0fJg9YkCQZEcoQniMFFRiBt37VPc0L1RLgSYOwtGea8NVclnN/d+Hnnt313AA+2RJbt2P9obnwQTZMUGOoChwhIUqWkY82R5Dy0V9UyZvDigUpHBKjyyEbyGU0Nyg2W40Li9E69JOojBgiDBopctQGIPNhFYm/nrddP6amHixJIFaQJcrAAb2NktQ9dDFiHPYxLdyQEwvmV4eOcfHQ+I8s0gMksjWSzN6aJAVAF9TfvzqwyRIvwqOeFFdj8tDtIIxukIoM3xWOxF6P+NpLf7h8eoh5dv8A0e50sgjVKVnlkdYYVUFmkdjQVR6/3e2lmVl5cPjqsQD26X3o3ViuDp50aAZZPU5hSMHjwEPYRXtaY+7/ALf72qOuYkKOPDdS5RmaMMCyAEAkjv56ZveQcLBUqGNzLQYUbqzyzyKztdKBz6sxIuz/AC12jmwnZYW3VujUjnyJJ12qdy/UMS9qn+yvn7DQ+XHvjkFclTWiU7DnyHf5DVU9iN25G0Hj58aZRL7ifLxzgTtJGPsmayPIHtY/noTLkZ2TgXZYi/MWRyeNajqGF48ZWqFGiO41mGxpo54Y5QxCtSOVJDL3/MeWs58lxNm5B/3mh4V2SK3hOVBnSYfS+hQLGr5UTdYyndylx7ikSEgHnufyPlrPy9O6njmV5sOUR4yb5X2naiIQrMbNG/IgeZ1t3xseXLx+pI0nj+BDin4xtEUYogofXj8tOcYoz7r+Glj2nvXbz0so6rWBNAPkDT9qDX+Z8umjLQs6MeAJEYDcWXjkX7E+davEOMkalJGRHmgFBgVEcvqDxZI5502+lUWD0nLjx8fHZIpoPF2bT4HLtuEZHl5EeXPrrP4nTMmXFklO9TOqNGA3FqwcFlH4EavZ1QZeMxd3QPV7jGfHbHn2MxdJ2FhgB4brfPPHsNKsXJlwsoSRuQXLEVdWjFe445503zJcvJli248m0OCVIpfFK0GJHktlv01YmDhNDiRzxt4qHazADed8lGj687h8teWxc9VOQZZZcGCsRv3L8rPEMOPlOSGyEG3k0FIH2iC/0rVfTBkTytOPFffz4rr5UOEJ5/yNUYPTl6vkSSyPIMWFhFAqg/Gqcbu5onuRrZY8cUMEUIJZ425YLZcHuTX7asusI8CJ+TYq/YsniwzqqsxNWO5vnRjSbAN3J7d/PUQyLGos7yCQQBfGqNxBc3Z4B9hV8a5xeO3JbJGFiW+0VA/mdLIF5JJI5oe/npRlP9cmixd5WOV1EzLdql/FX4dtF5L8cWWPcaTSMVy0iVqcJ4jt6A899aQ4Vei6EUD7my02sXUIVychEmEPSuj4RGRtrbLMyhtlkdo1FCu5b20pQSSzHNyPgy89sj6tjlviVJCreGV82HwlvT900GRuhETf0Ek6yygi2mKNvAb2uiflpx0+bx8yXNlALRAQ40VWI41IJ59WPLfh6aGaskYWEhxnJhebgKJUTxCoihijAX0Auz8712pSGV3d3NsxLEk9yddo0VLjcGNhzAE+6hPmik/iBqrKsQSVzuaNP+866uj+5H7It/kNCdRYhMVF/jyoLH/Gv+OpwH3NCynbQCk0Qb8vPQmT0/HmiaOQfeoWCVIbuCCOQR5aZkKS/ajdel3qkx7jfejzV8+WqSARgw0EjxEJxZsVQoeSUDuzEeIfckAAn8NE42XCqs5G7YwVgTTJfA3DTOWFVBsduPc2NIepdLMwDwu0E4vbIm6x/ZYDgj2OlfI4CsO1WjDauSc4fxF3UfqnVMjHxcznwZJZoWJI3lwA0bnzBoefl767J+i+W5RcPNbHKIAsMptVNcBWUjg+WpQ4eR9YiknQEowLMnNkDuvtrWu+NIkL2oO0KwBAPyPy0kUWoxRxHg5XStTUZiH6F9IocaGReoLLMSFkgVfuP5AG+3rxoKXE6uJX3JkRuBLHZipRIynaEMZPFcA1xf4jYTPNBP4gt0L7iVrcP4RdaIypY5IYXkZAkc8cr80zBQykGhdc3+GpVsxboF3Lf9ayr2OIu+j3THxOnxK8ZWYqGksjhj30xeMwDgDc3AHB/LVqzAoXiBKPXhm+Np5FaoIdilli1ndZsm+PP9NFcfiWXsC+QsWcjlgEt5Jnqi2azfcFvMjXBPhkKnknkn+yKGpOu3kGtv3vf31WrDYp3Ubs+V2daRECAKo1ErMWJLQeRB32+fGlEmJMgytrF8vPnEe8KdkMJJJs+yivckaeyvHt5IsDtflqiv6OjQJBBvzJ89dK5kQ2Io3RxtnZAH/NunL9UiJPEk6/ev5Gh+Htpn0qMwRK8jHxpTukB7i+QCP317PhY8keBCgVcbGnfKeEf9ZKQSu4+gJLHViK7Cdu/wAZI4/U66qYOZ0tkQ5aYXZ89doMbwB8VfO9dq7EhuRi/o4ie+xe3l8I0H1GwcEjyyIe3Y06aLhP2cR/+mv/AJRobqK3HCw7LkRf+YH+WoHxBvc1Ownn04F+Va9KhRYPqfX31J3HIs37+fOo7ge9/lxXbnVMNnvLVwD7sOe2qWhDVZAN8g83qy+WAJN9jzQ41WS1c2OWHnzWvT0paBB8Kr8bD15q9eSY4jIJCkEi+O3p28tXq3Y/kT3Hz17I6BATXbkH116czA2UErsReBTX320e2h8tElheK9tr9+ga8u2oy5BWQC/huue/ftxqiTIU3fdbv8PLXeo9z2TDBNEsMSKPhjVFHyAA1Q+R8YYVfN0aI9NLZMkdh51wBya58tDjxpmYFiqFRZHLk2e3kND2X1ULsy5KnsOhGE2etlQ266JA5N++qDJlMAwFDcSB3JH4aoQRR0ix7AWJJHc2fM9+dNsXGjMZRnILcqT95SbonitJrPlXdsV6h68EIuXil2ctsffbVQBPrxYGpoSCVLsCvqT97TH6kRLU6UNg8OWPcY2HofRva/8AAPNjniUOihlsbSO5LGvTtpbby+WpyzmG1UUPoDciVkqzK3I4Pf8ALz12PkZMLEElgzd/Ku3NaNhUsqeJtskDaBdDyF6ITHUrMqorOFcC+xau2pLz+WSMPONxaFB7LBVzoW3bo2VgxDCrojXaXl2YJcjClr7NQR3Pc+uu0UPmeRjYH8/vK/6fUdgmHwMDFD/2cZ+VqDqvOF4+6hayREelh1F6HhnqKA9iIob9SNo51fMwlxcqudqBzx93awN61eZl8bmpO1ixDX39rrXm6qPf9v010bEkbrBI4HHbUTQb7x8wB5aqhc7cQa+6PP8AfXOgqPg9yfc2NcxA2hT/AJrXhDKBZNFxZ8hfGvT09tOVBs9j8+2gMybao+IluwrjRMrhEc9ySa/x1mep5KwxsSxDn7gokk6kSFGTPDZxI5eb8ewfE54VR/n89DrJJukL/EeG2j7t/Ic6Gxo5XdmcBppaDkC9lmgo04TpbxlZOI1NhWcjncOx1lub8jZYxSn1+I643ERR2skBjzHHEiqhDkcVRC+orUj0rqBj+AEEKu1Q1BgeeSPTTXp+PEFBWZXO1Sdt1R7ceh0bPkRdOx5srLligxkos0wJaieyKvJY+Q0vWp7dvmFfVFZwgBmbHSuotKjSPSfeltuF2cLxo548iNFkidGRUAoCzY7k6Dg+lXRs7KIdMtUALITEAgRT3NMT6eXnpd1n6c4eL42L0rFZpkDL9YyFURo39mPkn8TXsdWLxAThW3Ly95wGTU0cGKMzHmikt43kSWMn4XXbZsH9tUEtiusM4eeFtyCQgHZXxbZNo/XWP6Z9I/pJnYszt1CUSJOFk8IRRVCa+6I1Hbv79tNcX6TGIGDrDqNgZxlwJauljho+Du96/wASEqVV+m3mQs4tx/3VGv1HkQVdixLuFliSSTtrijpvCoZlbaDdBgRyeO51jsP6W/RqbLhw8QZMSCU7GnjREkLECo9rEj5HW3iohWX4gSDx3o9hqtOOa3g11hK78zDOSTx733HNn012roY2mTeUdCWa0NWhu9p99dpY9bliRCFcAYMshx1kkwMcvSZ+KjdNnagHYr9mrjtyRsb0J9O98TlcR8tldcjpcjY/Voe7NisSviFfVeVPyHpz70iFes9Cn6eriPP6bIHwnPBVpftYzfoTuU+nB8teyZe0dN+kvhVBkM3SPpNisteFkBvAZ3X58N8x/W1uyxxuZoKPU0kgaNYJkffDMFZHHamUGj/LXgP8V3ZJv+7VHT5YsObK6JObhSEZWC7nmTCkPwlfUxn4T+Hrq+tpYWpKWAV5HHn+Opo2dTrrjc8cG/haz39/lryV22RkUfiAN+X+OpkcXQHPxV5H11VJWwkrxvWr8j+GrZCBZ0pS64G0k9vfk6xs8oycwbiWSIlzZNUva/01oepympef4W8z38tZaDcRkMaG91Qk9xtBJHPzGgvkLfp1HEI4qd3Aj7ByIYF8QJukLEjd2qrvjRa5f1mRmJUsB2HFV5VpVjLKqCRgGCKaQ8bgPXTbpXTclpVmk2hfvMCBus803l8tYVLnzhZpmpTHZpoOnxAJuJF8MS1AAAXz6e+vlv0n+k8PWs6SLHdxh4bbMWNhtM8p4eXb+i35e5rW5+lfUkweg9WWMWzJBjuVsD7aQKbI5qrv1utfHcU781ZaK/fKkUKauKsV+mtDTXiv7pXw07Whl9nH/wBmkiwc/EwmzAQZWBYxH+GJSpYKO9+Z/wANVQ4DZ8T5UJ+JSTMjW3xVfHnz/ntpljZHiDKeQsyjAmjg3EUxItiK9BQv+1pNg5OXAhaCRl3IzSIx+8llSBXIFdteVUyTiac90xjz/ieSRTdMmWWL4I5lDMpshJKpo3A9+2p/W48p4SYwGS3KyIHid0Acqx9DXp7ed6tlzOlMI/GdtgKFQp3biD/jqzJxMuVEjw+nGLa5HjKUbxAwrbusDn56jrPacDD/AIc+c+PwYq6bjRZXUYAyLU0krnaAAhAL8AenlrYxfS5uh5KYGVHNLAqxmCSNjK6qTQDbuTXPn+2hOidHfBZ8rI2eOyMkcYo+GL5PPn+H76XdVQN1fAZth8Nga4JKB7+L9fPUzYMkmLeVxktArUeJqenZqZkDTxSKVaaXkLXN82DrtLMbFysf6wMRl8CWZplWq2MwFge2u0uLb1FLUEHEYYEs/S5en9Sj/oJ8SKDNA5qNgpWX/hIs+xOn0wg8bq0qxRyYPW8eNc/DkB2HJCmNp0YEffXbfHdAb50uwfi6f08MAQ2HDwex+AAg6WzxyxS/VpJiuMtDGBNsYe4QE/1e35fhr7l6jvMxQ+T0MPys+GOHFx5JWlbCQxY7DbJKqGlKtJ35oX8vyY9GzpcqGZZEKPjldl93ia6J9xzrMyT4eKPskDy9rf4yOPy08+jH1h4MvJmNieUCLyJRAQfwvQtLlnGBqFWAdZoACQCSSO3f21zC1omh4ig1z29NRoU4F12AFj4qvU1AYpu4o2fc6YwSZfrCkPL22hroDt+WkWOgfaiLZ3Ox4Js7q7a1XVURhIwom2Fe3udIOjASlmJ5inkj7cfesGz89KfllJq1DuCwWzcedNwDMylhajaW3c8g+Y9dPckripBFFQll3FRzYRRbN2/DQUOTjYEVvLulbhY413O5J7hR2HudQT6zlMcidAmRLHtKb7EcW4hUXny8yO5+ekPHrWsZI3GN1hc/qIuswSydJ+kCuvjt9XeYgtRUcMGs/wBXy+Wvm2MTsiXHiZshW8Vm7khD2Av89fUet5PSulYPU4eoZDLkdQxJkx4IwzzNuUojFR2W/MkdvPXzPFx56WZPC7FI43Zt8gI2swC9gODZI0ej9ljP45Ds/wAxGcebLLjHHijKZMtiZ6SvBJ8V0QCuSSBwBWhGkONA6QDdPkTBI77mNACxBBuhRH+mpTxyJJj48chlyZG2kUY0AO27HB4II/DV/UOnDpyQZU0wklkmSMMFCkCizBdvl21MuoIWNQG3k5/Z1/4/cUzdIeMOFkPiAbkja/tB/Y4r8zp/0jrGUsAhyUYmP4UBOxiVFHjsT+OqJy7rDJE1OCssT+ki8H8xXl5aM6N1DEjlRJ1UQSOfrXiBKilA2pKF7kf1vTg/w2ZsPqjqTIChOKe6jRjOPKdWdlDqhjRiCQxQAXVqLLeXfWRbLyJ+p5UmQCkjtaIRyiAAIoH6fjr6J1G8bGmypiPCUAkqFsjigNuvnzRdQ6n1CXqEaKfBqSQE8bAeB8+ONQPHVAQx2Z76jW4asaHnH89TZYeRvx4ilDimBbkMOCDrtIoZMERht5G9mfghTz6gHvrtDilgPInW4pY56zX9Na+m9M5/+Fi48/u6nmQxzQOXUNsDOtdwQL4OhukW3TemN/8Aaxj5VoyUn6vkm+PBluv9w61wAIny86MzufhHEyGNF0AQv4hulIAu/a9bnC2R4mAsQChsWAgVVfZrYr2OlPUUj8ZWKfA6bHsWSrLtOr+lZBbE+ryf0uJK0YJItlHxX+V/loPoEsyPcYZ7J+xGm4A159xx66tW9oquWHPuavUeAI2F7gf39tWRuBbMoosGIB/noiVe4m6grKZPMAnt7321loJ/DyWACjwQtXZVl3NywB762PUIzIjEKL+IkjWJlTw5nPNkUNveg16B+QHakn8Qji/8wD8xrjzbXZkQbpZLoAX34AvVP0p63nYY6RjdKnSDLx0ly8l12NLHJIpjSElgatSW9yR/V0w6dDAEWeQ3IQHrm157VpvLgdO6hCseVBHKpH2hrazG7DFko2OCOdZbjW/f2eaDFaEdhkT40+XJltlTZs0kmRIFdpJy8kjurci/XvX8tTHUcWCFaV2cqboEAE0K5Nf66v6/0yTpnWMjCAZoxMDEzWN6OAVN9r5F6nlYMGOI4g6uzPt2uocBexN9qHfTc4GD6jehnfP0yAcecSHRZJszNyMl1tlXeu6z8RIFi/mdP+pYMvUen7Mdh9agkEkLSnarsK3Dd78c+o1lcXJnjzXngAMW54grWA0d8D9jrRw9SxvDdJJhDkeHL4YKryxB27Co2iuOfbQ9wdXDKJdQ31aejnf58ZimCSURvBONsmJNHHIykEK24jgj/PGrJ8Zd8caWJZVLPHyBtVrLPt/hPlq7Fx/t8qPKnhk+t4zu7o6MrPZAopxYN3oxpOldIhX680z5eTCGRluVmUKAqMB2ry/H01f5hKN0XFh1+4vyM/LfEhwpGb6vFKyxh6OxE+7FYN8eXA7ac9PgEXSMt1Yb5Y2dz379ifP5azLTDKyPDQMqys8se4Ab3rhRXmASO/7a2fTpYGwoECgqYtjrV0QNtGvPQ9jHsCZIOvRhWc7mHiwzMviyZEy7mYoqtwqXQ89drQz9KcSv4GQEjuwrLdXzxrtFfUz4MDFNWNpn+80vRT/0V0s+sAv+WjMlqxMpvSGTt6kVoDohJ6T0kj/5Av8A7x0ZmEjDzTyPsm+fPfWiXxPmTDcb9Qxw0Sk1u2DsO1jvpNhsYM2AkkrOjY0p8hJ/1bG/LyPy99aOZQ6KOeUUCj7az3UojjurigGKkV2VwbB1S4yIYpwY/SRKCG9ygA7h2rjVhJAI72woDQmNKs8UOSp4kCh1u9slcg1o0n7vNUb+Z11TkZnGHU4lEqFxQu6rzo3rJ9WxxjTRyitgcBgPRu/Gti9fes32/A+2lfVMBMmJlB+I8g1yLGvWILEKn3PIxRgwi7GaNYQ5kGwChR4Zqvvp306YEAEUS3BHY2LvnWNijngm8GYH4TQFmt38PF1R9dO+mzyhN0ppVcg76Cg/duzz+msQ5HHs6ldgzRhTanbOplP+UAZ3+1ELlTGEjSNlA/hG4KPh3CiSD8Rvn5aSYsM2a6wIGi8RUEzyne6xdmUAc13Pvr6J9LulPn9MhyIF8R8a3KAFmeIkE7AO5H89ZPDg63KsRwceISTI6mViqCVB8IPIJuuO395cdgQCYx4VqLXtseoC2Lj48MpVULxPGxFCnCE2pog0QeedBTqZZMaUvsKXtKhRfAAHmOfPj99aCH6NdcmV/HkxVDm2RhJuU9tnFHQGR9HvpL9XmjixVm2cXDLGHIFUQr0f11wNnwYXZyuM6EAxXj42TJIwikVdlMQV+95eXpejcnGmbLwsRt6/DGxaQNbFyRu2t+nz1HEgzsOxm42RjyolN40bopU9xurb+uuys+RepYxffMwEYQgs7stkgADnjkao7HLL79f5ln1R9MEHR8y7q/T4cPp2O8CMAcqpJQSX37TtJbmgedD4mf8AVFJlhk8QByXilZFY1VSAhh+2nUuRLOnhxwvkQygDwxG5VhweDVD8TqMH0X631NYZFTGgxwVZosmSUPJT8j7NTQI476hXYDhGEGfkfTJftiK36vnOx25CIo+6BtPB5BJrXa+iR/RboEQ2pjxqPMd+fm3Ou0R1r/EG/qx/gEVdAN9G6Z7REf8AiOis99uHOP6w2/z0J9Hf/c3Tv+zb/wAzav6r/wCzH8f21px4mEbzNQwI8NuQAF8+K40P1DH+tQyAAfCGINaMlA+y4HZR+mpeTDy448u2oCETNdAyhHPk4k1+GWtwO455ZfcHn/XWjlUxNsYiww5FkFTzuHz1jz8PWnC8Dew448x6a2J5xumk8nY62e9CUgDVCHDlZc20DSt6tSBYJok/tqDBWBaxZoULod9Wv/H/AMH89DRAWwofxftokSgxfmYQcu1fGGtGq67cc+Wled9YP1INGqCB2KlFpLYUWJ9daaUCjwO/8xoeVVIFqD9/uBoLl8NOQuTo/mE0chqjjyJd07JEkEcbkFgvY8WO1itCZHSzFJJPiUCzGTbzRJ5Narwf6QezCvbnT0dyPLdrNoSp6HcbE+x7mfaWYuAYyHIpu/B9dEI8QWmJWUihXnqzIA+sycD7y/y1SQLXgcFq/PVpGDIMPxLZNxSTwwrFQeHG4OK4sD10tfpHQ8lYMtMeODLxJDPIIQUOwqRIu0V3/l+bSLz/AA1GUDx+w5xwDx3G499VvoZH8zPIx2IRiphtGJIVGyRVYBgABYHFVq5vhFllVR6caogACR0B2TVVktPZJpqFm6FaJ4FIv86g/IsKGWeLGCR8Zo12P89dqgAG7HnrtPB8dV+4D/qWn//Z"),
			new ImageView("https://www.simplyrecipes.com/thmb/BRF5Ti9oLTaQJQLSRPkEURcwkAA=/300x225/filters:no_upscale():max_bytes(150000):strip_icc()/__opt__aboutcom__coeus__resources__content_migration__simply_recipes__uploads__2020__07__Sweet-Cherry-Pie-LEAD-2-8d9a265fe53149a3a72d7817ef6fa453.jpg"),
			new ImageView("https://th.bing.com/th/id/OIP.6oMIttEBz69tQ6O0y5jQNgHaHa?pid=ImgDet&w=178&h=178&c=7&dpr=1.3"),
			new ImageView("https://th.bing.com/th/id/OIP.LFAu9T4KUB9l_yEh-8IS3QHaE7?w=240&h=169&c=7&r=0&o=5&dpr=1.3&pid=1.7"),
			new ImageView("https://th.bing.com/th/id/OIP.nVtdHugFbL-495WwLmVQSQAAAA?w=206&h=207&c=7&r=0&o=5&dpr=1.3&pid=1.7"),
			
			new ImageView("https://th.bing.com/th/id/OIP.ldIPmvKM9IyNQ-7bcXj5zgHaE8?w=236&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7")};
	
	ImageView[] beveragesImages = {
			new ImageView("https://th.bing.com/th/id/OIP.nagOtI5OUi7q_coL3AdAPQHaFj?pid=ImgDet&w=178&h=133&c=7&dpr=1.3"),
	
	new ImageView("https://th.bing.com/th/id/OIP.pQyo-W83jaTAHfsFSCl3ZAAAAA?pid=ImgDet&w=178&h=178&c=7&dpr=1.3"),
	new ImageView("https://th.bing.com/th/id/OIP.cjMbWlh35paOTq9eA6OP7AHaE8?w=285&h=190&c=7&r=0&o=5&dpr=1.3&pid=1.7"),
	new ImageView("https://th.bing.com/th/id/OIP.BbLY_ShrQ6B-o1KacDC1dAAAAA?w=115&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"),
	new ImageView("https://th.bing.com/th/id/OIP.6l5rYj84mvBR65m4bslrGwAAAA?w=268&h=186&c=7&r=0&o=5&dpr=1.3&pid=1.7"),
	new ImageView("https://th.bing.com/th/id/OIP.jO4oPaaPoe0C7wVt1F40aQHaEJ?pid=ImgDet&w=178&h=99&c=7&dpr=1.3")};
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
	         setDisplayForMainDishes(0);
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
		 descriptionPaneForMainDishes.setTitle(Double.toString(mainDishesItems.get(index).getPrice()));
		 descriptionPaneForMainDishes.setImageView(mainDishesImages[index]);
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
	         setDisplayForDesserts(0);
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
		 descriptionPaneForDesserts.setTitle(Double.toString(desserts.get(index).getPrice()));
		 descriptionPaneForDesserts.setImageView(dessertsImages[index]);
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
	         setDisplayForBeverages(0);
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
		 
		 descriptionPaneForBeverages.setTitle(Double.toString(beverages.get(index).getPrice()));
		 descriptionPaneForBeverages.setImageView(beveragesImages[index]);
		 descriptionPaneForBeverages.setDescription((beverages.get(index)).getBeverageDescription());
		   }
		  }

	
	

