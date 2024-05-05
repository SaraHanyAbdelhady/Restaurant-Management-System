import java.util.*;


//fadel display w sort w implement l comparable
public abstract class MenuItems {
	
	private String itemName;
	private double rate;
	private double price;
	private ArrayList<MenuItems> items = new ArrayList<>(); 
	private ArrayList<MenuItems> specialityItems = new ArrayList<>();
	
	
	
	public MenuItems() {
	}
	
	public MenuItems(String itemName, double price, double rate) {
		this.itemName = itemName;
		this.rate = rate;
		this.price = price;
	}
	public MenuItems(String itemName, double price) {
		this.itemName = itemName;
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
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

    public abstract String  display(); // dih hattshal w hyt7t bdlha display 
	//public abstract void  display();  
   
   public void setSpecialityDishes(){
	   for(int i=0; i<items.size(); i++) {
		   if(items.get(i).getRate()>=4.5) specialityItems.add(items.get(i));
	   }
   }
	   
	   
   
   
   
   
   
	
	
	

}
