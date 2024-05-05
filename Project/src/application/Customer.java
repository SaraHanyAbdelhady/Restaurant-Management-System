package application;

//5ls momken fadel loyalty
public class Customer extends Person {
	private static int customerIdAdder=1;
    private int customer_ID;
    private int loyalty_points=0;
	public Customer(String name,String num,String email) {
		super(name,num,email);
		this.customer_ID = customerIdAdder++;
	}
	public void setPoints(int Points) { 
		this.loyalty_points=Points;
	}

	 public int getID()
	 {
		 return this.customer_ID;
	 }
	 public int getLoyalty_points()
	 {
		 return this.loyalty_points;
	 }
	 
	public void addLoyaltyPoints(int Points) {   //lw 3rfna 3la 7asab el fatoora momken ad5l points 
		//for every order made by the customer there is a 50 loyalty points  added to his profile
		this.loyalty_points+=Points;
	}
	
@Override
public  String identifyRole() {
	return "Customer"+ this.customer_ID;
}

}
