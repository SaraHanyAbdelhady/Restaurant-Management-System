package application;

import java.util.ArrayList;
import java.util.Collections;

//5ls
public class Beverages extends MenuItems implements Comparable<Beverages>{
	
	
	private String beverageDescription;
	
Beverages(){
		
	}
Beverages (String itemName, double price, double rate, String dessertDescription) {
		
		super(itemName, price, rate);
		
		this.beverageDescription = dessertDescription;
	}
Beverages (String itemName, double price, String beverageDescription) {
	
	super(itemName, price);
	
	this.beverageDescription = beverageDescription;
}
	
	
public String getBeverageDescription() {
	return beverageDescription;
}
public void setBeverageDescription(String beverageDescription) {
	this.beverageDescription = beverageDescription;
}

@Override
public  void  display() {
    System.out.println("Item Name: " + super.getItemName() +
    					"\n Price: " + super.getPrice() + 
    					"\n Rate: " + super.getRate() + 
    					"\n Description: " + getBeverageDescription() );
}

public ArrayList<Beverages>  setBeverages(){
	    ArrayList<Beverages> beverages = new ArrayList<>();	
		MenuItems specialityHotChocolate = new Beverages("Speciality Hot Chocolate",75,5,"Hot chocolate made from the finest cocoa products served with marshamellos and whipped cream.");
		super.getItems().add(specialityHotChocolate);
		beverages.add((Beverages)specialityHotChocolate);
		
		MenuItems specialityCoffee = new Beverages("Speciality Coffee",60,5,"Everyone loves coffee! Enjoy our Espresso made from the finest beans from italian farms straight to your cup.  ");
		super.getItems().add(specialityCoffee);
		beverages.add((Beverages)specialityCoffee);
		
		MenuItems specialityTea = new Beverages("Speciality Tea",40,5,"Our speciality Tea is served with a mixture of fresh herbs that takes the tea into the next level!");
		super.getItems().add(specialityTea);
		beverages.add((Beverages)specialityTea);
		
		MenuItems water = new Beverages("Water",10,"600 ml mineral water.");
		super.getItems().add(water);
		beverages.add((Beverages)water);
		
		MenuItems sparklingWater = new Beverages("Sparkling Water",10,"600 ml mineral sparkling water. It is also available with different flavors with extra 5 EGP fees.");
		super.getItems().add(sparklingWater);
		beverages.add((Beverages)sparklingWater);
		
		MenuItems freshJuices = new Beverages("Fresh Juices",10,4.5,"You can choose from Mango, Strawberry, Kiwi, Apple, Pineapple, Lemon, and watermelon");
		super.getItems().add(freshJuices);
		beverages.add((Beverages)freshJuices);
		
		return beverages;
		
	}

public static ArrayList<Beverages> initBeverages() {
	Beverages beverages = new Beverages();
		return beverages.setBeverages();
	
}
@Override
public int compareTo(Beverages o) {
	return getItemName().compareTo(o.getItemName());
}
public static void sort(ArrayList<Beverages> beverages){
	 Collections.sort(beverages);
  }

}
