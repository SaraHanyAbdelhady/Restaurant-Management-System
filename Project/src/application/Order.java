package application;
import java.util.ArrayList;


public class Order{
	    private static int numberOfOrders=0;
	    private double orderPrice=0;
	    private int numOfOrder;
	    private ArrayList<MenuItems> order= new ArrayList<MenuItems>() ;
		public Order() {
			numOfOrder=++numberOfOrders;
		}
		
		public void addItem (MenuItems item) {
			order.add(item);	
			this.orderPrice+=item.getPrice();
		}
		
		public void removeItem (MenuItems item) {
			order.remove(item);	
			this.orderPrice-=item.getPrice();
		}
	    public void clearOrder() {
	    	order.clear();
	    	this.orderPrice=0;
	    }
		
	    public int getSize() {
			return order.size();
	    }
	    public double getOrderPrice() {
			return this.orderPrice;
	    }
	    
	    public int getNumberOfOrders() {
			return numberOfOrders ;
	    } 
	    
	    public int getOrderNumber() {
			return numOfOrder ;
	    } 
}

