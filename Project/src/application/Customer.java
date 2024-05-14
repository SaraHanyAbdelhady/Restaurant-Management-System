package application;


public class Customer extends Person {
	
	private static int customerIdAdder=1;
    private int customerId;
    private int loyaltyPoints=0;
    
    public Customer() {}
    
	public Customer(String name,String num) {
		super(name,num);
		this.customerId = customerIdAdder++;
	}
    
    
	public Customer(String name,String num,String email) {
		super(name,num,email);
		this.customerId = customerIdAdder++;
	}
	public void setCustomerIdAdder(int customerIdAdder) {
		Customer.customerIdAdder= customerIdAdder;
	}
	public void setPoints(int Points) { 
		this.loyaltyPoints=Points;
	}

	 public int getID()
	 {
		 return this.customerId;
	 }
	 public int getLoyalty_points()
	 {
		 return this.loyaltyPoints;
	 }
	 
	public void addLoyaltyPoints(int Points) {   //lw 3rfna 3la 7asab el fatoora momken ad5l points 
		//for every order made by the customer there is a 50 loyalty points  added to his profile
		this.loyaltyPoints+=Points;
	}
	
@Override
public  String identifyRole() {
	return "Customer"+ this.customerId;
}

}

