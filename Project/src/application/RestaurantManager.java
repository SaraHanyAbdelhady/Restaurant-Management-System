package Project.src.application;
public class RestaurantManager extends Person {
	private int employeeId=1;
    private Table table;
    private MenuItems menu;
  
	
	public RestaurantManager() {
		
	}
	
	public RestaurantManager(String name,String num,String email) {
		super(name,num,email);
	}
	//add/remove array of tables method
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
	  public void addMenuItems(MenuItems newItem) {
		 newItem.getItems().add(newItem);
	   }
		
	   public void removeMenuItems(MenuItems oldItem) {
		   oldItem.getItems().remove(oldItem);
	   }
	   
	   public void editMenuItems(MenuItems editItem, double newPrice) {
		   int pos=menu.getItems().indexOf(editItem);
		   menu.getItems().get(pos).setPrice(newPrice);
	   }


	
	@Override
	public  String identifyRole() {
		return "Restuarent Manager";
	}
}
