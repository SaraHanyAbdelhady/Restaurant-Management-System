import java.util.*;

public class Order {
    
    
	public Order() {
		System.out.println("If you want to know our offers Enter yes");
		System.out.println("If you don't Enter no");
		Scanner input1 = new Scanner(System.in);
		String answer1 = input1.nextLine();
		if (answer1=="yes")
		{
			//go to offers
		}
		else if (answer1=="no"){
		System.out.println("To get your order ");
		System.out.println("If you want MainDishes enter 1");
		System.out.println("If you want Desserts enter 2");
		System.out.println("If you want Beverages enter 3");
		getorder ();
		}
	}
	public void getorder () {
		Scanner input2 = new Scanner(System.in);
		int answer2 = input2.nextInt();
		if (answer2==1)
		{
			//go to MainDishes
		}
		else if (answer2==2)
		{
			//go to Desserts
		}
		else if (answer2==3)
		{
			//go to Beverages
		}
		else
		{
			System.out.println("please enter 1 or 2 or 3");
		}
	}	      
}
