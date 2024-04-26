
public class MenuItems {
	
	private String item;
	private double rate;
	private double price;
	
	
	public MenuItems() {
	}
	
	public MenuItems(String item, double rate, double price) {
		super();
		this.item = item;
		this.rate = rate;
		this.price = price;
	}
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
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
	
	
	

}
