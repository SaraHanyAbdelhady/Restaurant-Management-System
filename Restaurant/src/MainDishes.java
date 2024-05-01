
public class MainDishes extends MenuItems {
	
	private String description;

	MainDishes() {
		
	}
	
	MainDishes(String itemName, double price, double rate, String description) {
		
		super(itemName, price, rate);
		
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	@Override 
	public String description(MenuItems I) {
		return ((MainDishes) I).getDescription();
	}
	
	public void  setMainDishes(){
		
		MainDishes specialityPasta = new MainDishes("Speciality Pasta",200,5,"Our speciality pasta dish is made from scratch starting from the homemade dough to the organic sauce made from fresh basil, thyme and olives. You can add any protein from your choice");
		super.getItems().add(specialityPasta);
		
		MainDishes specialityPizza = new MainDishes("Speciality Pizza",160,4.9,"Italian napolitana pizza made with the original italian recipe. You can choose your own toppings ");
		super.getItems().add(specialityPizza);
		
		MainDishes specialitySandwich = new MainDishes("Speciality Sandwich",150,4.6,"Your favorite classic grilled chicken sandwich but with a twist! The magic is in the secret sauce.");
		super.getItems().add(specialitySandwich);
		
		MainDishes Risotto = new MainDishes("Risotto",200,4.5,"Italian Risotto served with your choice of protein or vegies. You can choose between chicken,beef,shrimp or vegitables");
		super.getItems().add(Risotto);
		
		MainDishes Hamburger = new MainDishes("Hamburger",170,4.5,"Your choice of beef or chicken burger. Served with fries and a drink of your choice.");
		super.getItems().add(Hamburger);
		
		MainDishes steak = new MainDishes("Steak",250,4.4,"A 200 grams grilled rib eye served with your choice of side dish.");
		super.getItems().add(steak);
		
		MainDishes chicken = new MainDishes("Chicken",150,4.3,"A 150 grams grilled chicken served with your choice of side dish.");
		super.getItems().add(chicken);
		
		MainDishes lasagna = new MainDishes("Lasagna",120,4.4,"Homemade italian lasagna made from freshly made dough and sauce");
		super.getItems().add(lasagna);
		
		MainDishes Ravioli = new MainDishes("Ravioli",130,4.4,"Your favorite thin ravioli dough served in broth. You can choose from spinach,ricotta or truffle mushroom as a filling. ");
		super.getItems().add(Ravioli);
		
		MainDishes sideDishes = new MainDishes("Side dishes",65,4.2,"You can choose from french fries, sauted vegies, white rice or mashed potatoes as a side to your dish.");
		super.getItems().add(sideDishes);	
	}
}