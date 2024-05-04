//gui hna

import java.util.ArrayList;

public class Restaurant {
	public static void main(String[] args)
    {
		Table.initTables();
        // Menu driver methods
        
        MainDishes.initMainDishes();
        Desserts.initDesserts();
        Beverages.initBeverages();
        
        // sorted list
        ArrayList<MainDishes> sorted = MainDishes.sortedMainDishesItems;
    }   
}
