package application;

import java.util.ArrayList;
import java.util.Collections;

//5ls
public class Desserts extends MenuItems implements Comparable<Desserts> {
	
	private String dessertDescription;

	Desserts() {
		
	}
	
	Desserts(String itemName, double price, double rate, String dessertDescription) {
		
		super(itemName, price, rate);
		
		this.dessertDescription = dessertDescription;
	}
	

	public String getDessertDescription() {
		return dessertDescription;
	}

	public void setDessertDescription(String dessertDescription) {
		this.dessertDescription = dessertDescription;
	}
	
	@Override
	public  void  display() {
        System.out.println("Item Name: " + super.getItemName() +
        					"\n Price: " + super.getPrice() + 
        					"\n Rate: " + super.getRate() + 
        					"\n Description: " + getDessertDescription() );
}
public ArrayList<Desserts>  setDesserts(){
		ArrayList<Desserts> desserts = new ArrayList<>();
		MenuItems moltencake = new Desserts("Molten cake",75,4.5,"Your favorite molten cake served with vanilla icecream");
		super.getItems().add(moltencake);
		desserts.add((Desserts)moltencake);
		
		MenuItems iceCream = new Desserts("Ice Cream",50,4.5,"Three scoops of icecream from your choice. You can choose from Mango, strawberry, vanilla,chocolate or coffee");
		super.getItems().add(iceCream);
		desserts.add((Desserts)iceCream);
		
		MenuItems specialityTiramisu = new Desserts("Speciality Tiramisu",90,5,"Our Tiramisu is made with the original recipe and that's what makes it special! Ladyfinger pastries dipped in coffee, layered with a whipped mixture of eggs, sugar and mascarpone and flavored with cocoa.");
		super.getItems().add(specialityTiramisu);
		desserts.add((Desserts)specialityTiramisu);
		
		MenuItems specialityCrostata = new Desserts("Speciality Crostata",80,5,"A jam or ricotta-filled tart with a crumbly pastry crust.");
		super.getItems().add(specialityCrostata);
		desserts.add((Desserts)specialityCrostata);
		
		MenuItems pancakes = new Desserts("Pancakes",60,4.4,"5 mini pancakes served with vanilla ice cream and maple sirup. You can add fresh fruits of your choice.");
		super.getItems().add(pancakes);
		desserts.add((Desserts)pancakes);
		
		MenuItems fruitSalad = new Desserts("Fruit Salad",50,4.5,"A bowl of fresh watermelon, strawberry, apple, banana, kiwi and rasberry served with vanilla ice cream and mango sirup.");
		super.getItems().add(fruitSalad);
		desserts.add((Desserts)fruitSalad);
		return desserts;
		
	}
	

	 public static ArrayList<Desserts> initDesserts() {
	   Desserts desserts = new Desserts();
	  	return desserts.setDesserts();
	  		
	}
	
	@Override
	public int compareTo(Desserts o) {
		if(getPrice()>o.getPrice()) return -1;
		   else if (getPrice()<o.getPrice()) return 1;
		   else return 0;
	}
	   // sorting 
	   
	public static void sort(ArrayList<Desserts> desserts){
		 Collections.sort(desserts);
		 

	   }

	

}
