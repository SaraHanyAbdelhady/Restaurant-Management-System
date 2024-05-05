package application;

public class Credit extends Payments {
	private double percent;
	
	Credit(){
		
	}
	
	@Override
	public double getBillValue(Order order ,Table table) {
		percent =billValue*(1.0/100);
		return (billValue+percent);
	}
	

}
