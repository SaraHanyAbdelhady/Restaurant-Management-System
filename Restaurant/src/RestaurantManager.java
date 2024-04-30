
public class RestaurantManager extends Person {
	private int employeeId=1;
    private Table table;
    private MenuItems menu;
   // private Order order;
    
//	 public void  addMenuItem(String Item); lessa msh 3arfa ha3mlhom implementation ezay
//	 public void removeMenuItem(String Item);
//	 public void modifyMenuItem(String Item);
	
	public RestaurantManager(String name,String num,String email) {
		super(name,num,email);
	}
	
	 public void setTable(Table table) {
	        this.table = table;
	    }

	    public Table getTable() {
	        return this.table;
	    }

	 public int getID()
	 {
		 return this.employeeId;
	 }
	

//	    public void setOrder(Order order) {
//	        this.order = order;
//	    }
//	    public Order getOrder() {
//	        return this.order;
//	    }
	
	@Override
	public  String identifyRole() {
		return "Restuarent Manager";
	}
}
