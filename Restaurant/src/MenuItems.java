import java.util.*;

public abstract class MenuItems {
	
	private String itemName;
	private double rate;
	private double price;
	private ArrayList<MenuItems> items = new ArrayList<>(); 
	
	
	public MenuItems() {
	}
	
	public MenuItems(String itemName, double price, double rate) {
		super();
		this.itemName = itemName;
		this.rate = rate;
		this.price = price;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItem(String itemName) {
		this.itemName = itemName;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public ArrayList<MenuItems> getItems(){
		return this.items;
	}
   public abstract String  description(MenuItems I);
	
	
	
	

}
