
public class Beverages extends MenuItems {
	private String beverageDescription;
	
	public String getBeverageDescription() {
		return this.beverageDescription;
	}
	
	@Override 
	public String description(MenuItems I) {
		return ((Beverages) I).getBeverageDescription();
	}
	

}
