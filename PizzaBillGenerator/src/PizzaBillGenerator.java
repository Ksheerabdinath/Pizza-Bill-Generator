import java.util.Scanner;

public class PizzaBillGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pizza pizza;
		DeluxePizza Dpizza;
		System.out.println("========Welcome  to SK Pizzas========\n\n");
		System.out.println("Todays's Special:\n"
				+ "  1.Veg Pizza\n"
				+ "  2.Non-veg Pizza\n"
				+ "  3.Veg Deluxe Pizza\n"
				+ "  4.Non-Veg Deluxe Pizza");
		
		
		int ch = sc.nextInt();
		
		
		switch(ch) {
		case 1:
			pizza = new Pizza(true);
			
			
			System.out.println("Extra Cheese Needed?(y/n):");
			char c = sc.next().charAt(0);
			if(c=='y' || c=='Y') {
				pizza.addExtraCheese();
			}
			
			System.out.println("Extra Toppings Needed?(y/n):");
			char t = sc.next().charAt(0);
			if(t=='y' || t=='Y') {
				pizza.addExtraToppings();
			}
			
			System.out.println("Opt for Take Away(y/n):");
			char takeAway = sc.next().charAt(0);
			if(takeAway=='y' || takeAway=='Y') {
				pizza.takeAway();
			}
			
			pizza.getBill();
			break;
		
		
		case 2:
			pizza = new Pizza(false);
			System.out.println("Extra Cheese Needed?(y/n):");
			char c1 = sc.next().charAt(0);
			if(c1=='y' || c1=='Y') {
				pizza.addExtraCheese();
			}
			
			System.out.println("Extra Toppings Needed?(y/n):");
			char t1 = sc.next().charAt(0);
			if(t1=='y' || t1=='Y') {
				pizza.addExtraToppings();
			}
			
			System.out.println("Opt for Take Away(y/n):");
			char takeAway1 = sc.next().charAt(0);
			if(takeAway1=='y' || takeAway1=='Y') {
				pizza.takeAway();
			}
			
			pizza.getBill();
			break;
		
		
		case 3:
			Dpizza = new DeluxePizza(true);
			System.out.println("Opt for Take Away(y/n):");
			char takeAway2 = sc.next().charAt(0);
			if(takeAway2=='y' || takeAway2=='Y') {
				Dpizza.takeAway();
			}
			
			Dpizza.getBill();
			break;
		
		
		case 4:
			Dpizza = new DeluxePizza(false);
			
			System.out.println("Opt for Take Away(y/n):");
			char takeAway3 = sc.next().charAt(0);
			if(takeAway3=='y' || takeAway3=='Y') {
				Dpizza.takeAway();
			}
			
			
			Dpizza.getBill();
			break;
		
		default:
			System.out.println("Enter correct choice:");
			break;
		}
		sc.close();		
	}
	

}
