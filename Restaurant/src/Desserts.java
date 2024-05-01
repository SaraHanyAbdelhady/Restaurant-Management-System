
public class Desserts extends MenuItems {
	
	private String dessertDescription;

	Desserts() {
		
	}
	
	Desserts(String itemName, double price, double rate, String dessertDescription) {
		
		super(itemName, price, rate);
		
		this.dessertDescription = dessertDescription;
	}
	
	public String getDessertDescription() {
		return this.dessertDescription;
	}
	@Override 
	public String description(MenuItems I) {
		return ((Desserts) I).getDessertDescription();
	}
	
	public void  setDesserts(){
		
		
	}

}
