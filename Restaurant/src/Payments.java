

public class Payments {
	private int tableNumber;
	protected double billValue;
	private int customerId;
	//private String wayOfPayment;
	
	
	
	
	Payments(){
		
	}
	
	public void setBillValueAndTableNo(double value, int tableNo) {
		if(value > 0 && tableNo>0 && tableNo <9) {
			billValue=value;
		    tableNumber=tableNo;
		}
		else
			System.out.println("Check your order with the waiter.");
	}
	/*public void setTableNumber(int tableNo) {
		if(tableNo>0 && tableNo<10)
			tableNumber=tableNo;
		else
			System.out.println("Check your order with the waiter.");
	}*/
	public double getBillValue() {
		return billValue;
	}
	public int getTableNumber() {
		return tableNumber;
	}
	//availability after payment=1
	
}
