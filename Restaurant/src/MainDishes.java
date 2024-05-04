//5ls

import java.util.*;
import java.lang.Comparable;

public class MainDishes extends MenuItems implements Comparable<MainDishes> {
	
	private String description;
	
	private ArrayList<MainDishes> mainDishesItems = new ArrayList<>();
	
	public static ArrayList<MainDishes> sortedMainDishesItems;

	MainDishes() {
		
	}
	
	MainDishes(String itemName, double price, double rate, String description) {
		
		super(itemName, price, rate);
		
		this.description = description;
	}
	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public  String  display() {
		return "Item Name: " + super.getItemName() + "\n Price: " + super.getPrice() + "\n Rate: " + super.getRate() + "\n Description: " + getDescription();
	}

	public void  setMainDishes(){
		
		MenuItems specialityPasta = new MainDishes("Speciality Pasta",200,5,"Our speciality pasta dish is made from scratch starting from the homemade dough to the organic sauce made from fresh basil, thyme and olives. You can add any protein from your choice");
		super.getItems().add(specialityPasta);
		mainDishesItems.add(specialityPasta);
		
		MenuItems specialityPizza = new MainDishes("Speciality Pizza",160,4.9,"Italian napolitana pizza made with the original italian recipe. You can choose your own toppings ");
		super.getItems().add(specialityPizza);
		mainDishesItems.add(specialityPizza);
		
		MenuItems specialitySandwich = new MainDishes("Speciality Sandwich",150,4.6,"Your favorite classic grilled chicken sandwich but with a twist! The magic is in the secret sauce.");
		super.getItems().add(specialitySandwich);
		mainDishesItems.add(specialitySandwich);
		
		MenuItems Risotto = new MainDishes("Risotto",200,4.5,"Italian Risotto served with your choice of protein or vegies. You can choose between chicken,beef,shrimp or vegitables");
		super.getItems().add(Risotto);
		mainDishesItems.add(Risotto);
		
		MenuItems Hamburger = new MainDishes("Hamburger",170,4.5,"Your choice of beef or chicken burger. Served with fries and a drink of your choice.");
		super.getItems().add(Hamburger);
		mainDishesItems.add(Hamburger);
		
		MenuItems steak = new MainDishes("Steak",250,4.4,"A 200 grams grilled rib eye served with your choice of side dish.");
		super.getItems().add(steak);
		mainDishesItems.add(steak);
		
		MenuItems chicken = new MainDishes("Chicken",150,4.3,"A 150 grams grilled chicken served with your choice of side dish.");
		super.getItems().add(chicken);
		mainDishesItems.add(chicken);
		
		MenuItems lasagna = new MainDishes("Lasagna",120,4.4,"Homemade italian lasagna made from freshly made dough and sauce");
		super.getItems().add(lasagna);
		mainDishesItems.add(lasagna);
		
		MenuItems Ravioli = new MainDishes("Ravioli",130,4.4,"Your favorite thin ravioli dough served in broth. You can choose from spinach,ricotta or truffle mushroom as a filling. ");
		super.getItems().add(Ravioli);
		mainDishesItems.add(Ravioli);
		
		MenuItems sideDishes = new MainDishes("Side dishes",65,4.2,"You can choose from french fries, sauted vegies, white rice or mashed potatoes as a side to your dish.");
		super.getItems().add(sideDishes);	
		mainDishesItems.add(sideDishes);
	}
	
	public static void initMainDishes() {
		 MainDishes mainDishes = new MainDishes();
			mainDishes.setMainDishes();
		
	}
	
	   @Override 
	   public int compareTo(MainDishes md) {
		   if(getRate()>md.getRate()) return 1;
		   else if (getRate()<md.getRate()) return -1;
		   else return 0;
	   }
	   
	   // sorting 
	   
	   public void sort(){
		   MainDishes[] arr1 = new MainDishes [mainDishesItems.size()];
		   Arrays.sort(mainDishesItems.toArray(arr1));
		   sortedMainDishesItems = new ArrayList<>(Arrays.asList(arr1));
	   }
	   
	   
	   
	   
	   
	   
	   
}
