//5ls
public class Desserts extends MenuItems {
	
	private String dessertDescription;

	Desserts() {
		
	}
	
	Desserts(String itemName, double price, double rate, String dessertDescription) {
		
		super(itemName, price, rate);
		
		this.dessertDescription = dessertDescription;
	}
	
	
	@Override 
	public String description(MenuItems I) {
		return ((Desserts) I).dessertDescription;
	}
	
	public void  setDesserts(){
		
		MenuItems moltencake = new Desserts("Molten cake",75,4.5,"Your favorite molten cake served with vanilla icecream");
		super.getItems().add(moltencake);
		
		MenuItems iceCream = new Desserts("Ice Cream",50,4.5,"Three scoops of icecream from your choice. You can choose from Mango, strawberry, vanilla,chocolate or coffee");
		super.getItems().add(iceCream);
		
		MenuItems specialityTiramisu = new Desserts("Speciality Tiramisu",90,5,"Our Tiramisu is made with the original recipe and that's what makes it special! Ladyfinger pastries dipped in coffee, layered with a whipped mixture of eggs, sugar and mascarpone and flavored with cocoa.");
		super.getItems().add(specialityTiramisu);
		
		MenuItems specialityCrostata = new Desserts("Speciality Crostata",80,5,"A jam or ricotta-filled tart with a crumbly pastry crust.");
		super.getItems().add(specialityCrostata);
		
		MenuItems pancakes = new Desserts("Pancakes",60,4.4,"5 mini pancakes served with vanilla ice cream and maple sirup. You can add fresh fruits of your choice.");
		super.getItems().add(pancakes);
		
		MenuItems fruitSalad = new Desserts("Fruit Salad",50,4.5,"A bowl of fresh watermelon, strawberry, apple, banana, kiwi and rasberry served with vanilla ice cream and mango sirup.");
		super.getItems().add(fruitSalad);
		
		
	}
	
	public static void initDesserts() {
		Desserts desserts = new Desserts();
	       desserts.setDesserts();
	
	}

}
