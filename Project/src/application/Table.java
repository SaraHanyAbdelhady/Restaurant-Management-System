package Project.src.application;

import java.util.ArrayList;

public class Table implements Available{
	private int tableNo;
	private int numberOfSeats;
	private Boolean isAvailable;
	 

	public Table()
	{
		
	}
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
	
	@Override
	public void available(int numberOfCustomers) //available interface method parameter type object for menuItems and Table
	{
		if (this.isAvailable == false )
		{
			System.out.println("Sorry, this table is not available for now, Choose another table, please.");
		}
		else if ( this.numberOfSeats < numberOfCustomers) 
		{
			System.out.println("Sorry, this table does not have enough chairs for you, Choose another table.");
		}
		else 
		{
			System.out.println("Your table is ready, Bon appetit :)");
			this.isAvailable = false;
		}
		
		
	}
public ArrayList<Table>  setTables(){
	 ArrayList<Table> tables = new ArrayList<>();
		Table t1 = new Table (1,3);
		Table t2 = new Table (2,7);
  		Table t3 = new Table (3,5);
  		Table t4 = new Table (4,7);
  		Table t5 = new Table (5,5);
  		Table t6 = new Table (6,6);
  		Table t7 = new Table (7,4);
  		Table t8 = new Table (8,3);
  		tables.add(t1);
  		tables.add(t2);
  		tables.add(t3);
  		tables.add(t4);
  		tables.add(t5);
  		tables.add(t6);
  		tables.add(t7);
  		tables.add(t8);
		return tables;
		
	}
	
	public static ArrayList<Table> initTables() {
		Table tables = new Table();
		return tables.setTables();
		
			
	}

	
	
	
}
