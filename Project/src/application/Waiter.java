package application;
import java.util.List;
//process payment
public class Waiter extends Person{
	private static int waiterIdAdder=1;
	private int employeeId;
	private List<Table> assignedTables; 
    private List <Order> order; 

	public Waiter(String name,String num,String email,List<Table> tables) {
		super(name,num,email);
		this.employeeId = ++waiterIdAdder;
		this.assignedTables=tables;
		
	}
	 public void setTable(List<Table> table) {
	        this.assignedTables = table;
	    }
	 public void setWaiterIdAdder(int waiterIdAdder) {
			Waiter.waiterIdAdder= waiterIdAdder;
		}
	    public List<Table> getTables() {
	        return this.assignedTables; 
	    }
	 public int getID()
	 {
		 return this.employeeId;
	 }
	    public void setOrder(List<Order> order) {
     this.order = order;
 }
 public List<Order> getOrder() {
     return this.order;
 }
public Object getSpecificOrder(List<Order> order,int numOrderId) {
	if(numOrderId<order.size()+1)
	{
		return order.get(numOrderId-1);
	}
	else {
		throw new IllegalArgumentException("Wrong Order number!");
		}
	
}	 
	 //assign tables
	 
	 public void takeOrder(Order order,List<Order>OrderList) {
	     OrderList.add(order);
	    }
	 
	 public Object RemoveSpecificOrder(List<Order> order,int numOrderId) {
			if(numOrderId<order.size()+1)
			{
				return order.remove(numOrderId-1);
			}
			else {
				throw new IllegalArgumentException("Wrong Order number!");
				}
			
		}
	 
//	    public void serveOrder(Order order) {	        
//	    }
//	    public void processPayment(Order order) {    
//	    }

	@Override
	public  String identifyRole() {
		return "Waiter ID" + this.employeeId;
	}
}
