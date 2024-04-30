
public class Customer extends Person {
	private static int customerIdAdder=1;
    private int customer_ID;
    private int loyalty_points;
    private Table table;
    private MenuItems menu;
    private Order order;
	public Customer(String name,String num,String email) {
		super(name,num,email);
		this.customer_ID = customerIdAdder++;
	}
	public void setPoints(int Points) { 
		this.loyalty_points=Points;
	}
	 public void setTable(Table table) {
	        this.table = table;
	    }

	    public Table getTable() {
	        return this.table;
	    }
	    public void setMenu(MenuItems menu) {
	        this.menu = menu;
	    }

	    public MenuItems getMenu() {
	        return this.menu;
	    }

	    public void setOrder(Order order) {
	        this.order = order;
	    }
	    public Order getOrder() {
	        return this.order;
	    }
	 public int getID()
	 {
		 return this.customer_ID;
	 }
	 public int getLoyalty_points()
	 {
		 return this.loyalty_points;
	 }
	 
	public void addLoyaltyPoints(int Points) {
		//for every order made by the customer there is a 50 loyalty points  added to his profile
		this.loyalty_points+=Points;
	}
	
@Override
public  String identifyRole() {
	return "Customer";
}

}

