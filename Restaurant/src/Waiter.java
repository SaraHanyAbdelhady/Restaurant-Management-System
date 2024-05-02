import java.util.List;

public class Waiter extends Person{
	private static int waiterIdAdder=1;
	private int employeeId;
	private List<Table> assignedTables; //t2rebn keda lazm a5od ids mo5tlfa
    private List <Order> order; // msh mot5yla ha3ml feeh eh
	private MenuItems menu;
   


	public Waiter(String name,String num,String email,List<Table> tables) {
		super(name,num,email);
		this.employeeId = waiterIdAdder++;
		this.assignedTables=tables;
		
	}
	 public void setTable(List<Table> table) {
	        this.assignedTables = table;
	    }

	    public List<Table> getTable() {
	        return this.assignedTables; 
	    }
	 public int getID()
	 {
		 return this.employeeId;
	 }
//	    public void setOrder(List<Order> order) {
//     this.order = order;
// }
// public List<Order> getOrder() {
//     return this.order;
// }
	 
	 //assign tables
	 
//	 public void takeOrder(Order order) {
//	     
//	    }
//	    public void serveOrder(Order order) {	        
//	    }
//	    public void processPayment(Order order) {    
//	    }

	@Override
	public  String identifyRole() {
		return "Waiter ID" + this.employeeId;
	}
}
