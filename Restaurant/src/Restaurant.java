//gui hna

import java.util.ArrayList;

public class Restaurant extends Exception{
	
	public static void main(String[] args)
    {
		Table.initTables();
        // Menu driver methods
        
        MainDishes.initMainDishes();
        Desserts.initDesserts();
        Beverages.initBeverages();
        //try {
        // sorted list
        ArrayList<MainDishes> sorted = MainDishes.sortedMainDishesItems;
        
        /*for (MainDishes item : sorted) 
        	item.display();
        } catch (NullPointerException e) {
        	
        }*/
        }
	
}
