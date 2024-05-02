import java.util.*;
import java.util.ArrayList;

public class order extends MenuItems {
	
    private static int numberOfOrders;
    private ArrayList<MenuItems> order= new ArrayList<MenuItems>() ;

    
	public order() {
		
	}
	
	public void addItem (MenuItems item) {
		order.add(item);	
	}
	
	public void removeItem (MenuItems item) {
		order.remove(item);	
	}
    public void clearOrder() {
    	order.clear();
    }
	
    public int getSize() {
		return order.size();
    }
    
    
    public int getNumber() {
		return numberOfOrders ;
    } 
    
    public void incrementNumberOfOrders() {
    	numberOfOrders++;
    }
    
    
	
	
	
	@Override
	public String description(MenuItems I) {
		// TODO Auto-generated method stub
		return null;
	}
}
