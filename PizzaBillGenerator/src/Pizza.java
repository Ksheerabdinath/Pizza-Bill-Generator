
public class Pizza {
	private double price;
	private boolean veg;
	
	private double basePrice;
	private double extraCheesePrice=100;
	private double extraToppingsPrice=150;
	private double takeAwayPrice=20;
	
	private boolean isCheeseAdded=false, isToppingsAdded=false, takeawayOpted=false;
	
	public Pizza(boolean veg) {
		this.veg=veg;
		if(this.veg) {
			this.price=300;
		}
		else {
			this.price=400;
		}
		basePrice=this.price;
	}
		
	
	public void addExtraCheese() {
		
		isCheeseAdded=true;
		this.price += extraCheesePrice;
		
	}
	
	
	public void addExtraToppings() {
		
		isToppingsAdded=true;
		this.price += extraToppingsPrice;
		
	}
	
	
	public void takeAway() {
		
		takeawayOpted=true;
		this.price += takeAwayPrice;
		
	}
	
	
	public void getBill() {
		
		System.out.println("\n\n\n\n***Bill for your purchase at SK Pizzas***");
		System.out.println("===========================================================");
		System.out.println("Pizza - "+ basePrice);
		if(isCheeseAdded) {
			System.out.println("Extra Cheese Added - Rs."+ extraCheesePrice);
		}
		if(isToppingsAdded) {
			System.out.println("Extra Toppings Added - Rs."+ extraToppingsPrice);
		}
		if(takeawayOpted) {
			System.out.println("Take Away opted - Rs."+ takeAwayPrice);
		}
		System.out.println("Total Bill - Rs."+ this.price);
		System.out.println("===========================================================");
		
		
	}
}
