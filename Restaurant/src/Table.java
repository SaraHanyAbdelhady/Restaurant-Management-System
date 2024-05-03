
import java.util.ArrayList;

public class Table implements Available{
	private int tableNo;
	private int numberOfSeats;
	private Boolean isAvailable;
	private ArrayList<Table> tables = new ArrayList<>(); 

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
	public ArrayList<Table> getTables(){
		return this.tables;
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
public void  setTables(){
		
		Table t1 = new Table (1,3);
		Table t2 = new Table (2,4);
  		Table t3 = new Table (3,5);
  		Table t4 = new Table (4,7);
  		Table t5 = new Table (5,5);
  		Table t6 = new Table (6,6);
  		Table t7 = new Table (7,4);
  		Table t8 = new Table (8,3);
  		this.getTables().add(t1);
		this.getTables().add(t2);
		this.getTables().add(t3);
		this.getTables().add(t4);
		this.getTables().add(t5);
		this.getTables().add(t6);
		this.getTables().add(t7);
		this.getTables().add(t8);
		
		
	}
	
	public static void initTables() {
		Table tables = new Table();
		tables.setTables();
	
	}

	
	
	
}
