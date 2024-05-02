//t2rebn 5lsan

public class Payments {
	//private int tableNumber;
	protected double billValue;
	private int customerId; //hana7tago 3la 7sb el loyalty points
	//private String wayOfPayment;


	Payments(){
		
	}
//	public void setBillValueAndTableNo(double value, int tableNo) {
//		if(value > 0 && tableNo>0 && tableNo <9) {
//			billValue=value;
//		    tableNumber=tableNo;
//		}
//		else
//			System.out.println("Check your order with the waiter.");
//	}
	/*public void setTableNumber(int tableNo) {
		if(tableNo>0 && tableNo<10)
			tableNumber=tableNo;
		else
			System.out.println("Check your order with the waiter.");
	}*/
	public double getBillValue(Order order ,Table table) {
		 table.setIsAvailable(true);
		return order.getOrderPrice();	
	}
  
	
	
}
