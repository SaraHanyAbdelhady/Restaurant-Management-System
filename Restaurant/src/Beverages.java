//5ls
public class Beverages extends MenuItems {
	
	
	private String beverageDescription;
	
Beverages(){
		
	}
Beverages (String itemName, double price, double rate, String dessertDescription) {
		
		super(itemName, price, rate);
		
		this.beverageDescription = dessertDescription;
	}
Beverages (String itemName, double price, String dessertDescription) {
	
	super(itemName, price);
	
	this.beverageDescription = dessertDescription;
}
	
	
	
	@Override 
	public String description(MenuItems I) {
		return ((Beverages) I).beverageDescription;
	}
	
public void  setBeverages(){
		
		Beverages specialityHotChocolate = new Beverages("Speciality Hot Chocolate",75,5,"Hot chocolate made from the finest cocoa products served with marshamellos and whipped cream.");
		super.getItems().add(specialityHotChocolate);
		
		Beverages specialityCoffee = new Beverages("Speciality Coffee",60,5,"Everyone loves coffee! Enjoy our Espresso made from the finest beans from italian farms straight to your cup.  ");
		super.getItems().add(specialityCoffee);
		
		Beverages specialityTea = new Beverages("Speciality Tea",40,5,"Our speciality Tea is served with a mixture of fresh herbs that takes the tea into the next level!");
		super.getItems().add(specialityTea);
		
		Beverages water = new Beverages("Water",10,"600 ml mineral water.");
		super.getItems().add(water);
		
		Beverages sparklingWater = new Beverages("Sparkling Water",10,"600 ml mineral sparkling water. It is also available with different flavors with extra 5 EGP fees.");
		super.getItems().add(sparklingWater);
		
		Beverages freshJuices = new Beverages("Fresh Juices",10,4.5,"You can choose from Mango, Strawberry, Kiwi, Apple, Pineapple, Lemon, and watermelon");
		super.getItems().add(freshJuices);
		
		
		
		
	}

public static void initBeverages() {
	Beverages beverages = new Beverages();
   	beverages.setBeverages();

}
	

}
