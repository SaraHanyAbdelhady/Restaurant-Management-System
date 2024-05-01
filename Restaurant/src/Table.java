
public class Table {
	private int tableNo;
	private int numberOfSeats;
	private Boolean isAvailable;
	//list of tables
	
	public Table(int tableNo, int numberOfSeats)
	{
		this.tableNo = tableNo;
		this.numberOfSeats = numberOfSeats;
		this.isAvailable = true;
	}
	public int getTableNo() {
		return tableNo;
	}
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public Boolean getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public void bookTable(int tableNo, int numberOfSeats) //available interface method parameter type object for menuItems and Table
	{
		if (isAvailable == false )
		{
			System.out.println("Sorry, this table is not available for now, Choose another table, please.");
		}
		else if ( this.numberOfSeats < numberOfSeats) 
		{
			System.out.println("Sorry, this table does not have enough chairs for you, Choose another table.");
		}
		else 
		{
			System.out.println("Your table is ready, Bon appetit :)");
			this.isAvailable = false;
		}
		
		
	}
	
	
	
}
