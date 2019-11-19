// Java program to demonstrate Decorator 
// pattern 

// Abstract Pizza class (All classes extend 
// from this) 
abstract class Pizza { 
	// it is an abstract pizza 
	String description = "Unknown Pizza"; 
	int cost;
	public String getDescription() { 
		return description; 
	} 

	public int getCost() { return cost; }
} 

// The decorator class : It extends Pizza to be 
// interchangable with it topings decorator can 
// also be implemented as an interface 
abstract class ToppingsDecorator extends Pizza { 
	Pizza pizza; 
	public ToppingsDecorator(Pizza pizza) { this.pizza = pizza; } 
	public String getDescription() { 
		return pizza.getDescription() + ", " + description; 
	} 
	public int getCost() { return pizza.getCost() + cost; } 
} 

// Concrete pizza classes 
class PeppyPaneer extends Pizza { 
	public PeppyPaneer() { 
		description = "PeppyPaneer"; 
		cost = 300;
	} 
} 
class FarmHouse extends Pizza { 
	public FarmHouse() { 
		description = "FarmHouse"; 
		cost = 400;
	} 
} 
class Margherita extends Pizza { 
	public Margherita() { 
		description = "Margherita"; 
		cost = 200;
	} 
} 
class ChickenFiesta extends Pizza { 
	public ChickenFiesta() { 
		description = "ChickenFiesta";
		cost = 300;
	}  
} 
class SimplePizza extends Pizza { 
	public SimplePizza() { 
		description = "SimplePizza"; 
		cost = 100;
	} 
} 

// Concrete toppings classes 
class FreshTomato extends ToppingsDecorator { 
	public FreshTomato(Pizza pizza) { 
		super(pizza);
		description = "FreshTomato";
		cost = 40;
	}
} 
class Barbeque extends ToppingsDecorator { 
	Pizza pizza; 
	public Barbeque(Pizza pizza) { 
		super(pizza);
		description = "Barbeque";
		cost = 90;
	}
} 
class Paneer extends ToppingsDecorator { 
	Pizza pizza; 
	public Paneer(Pizza pizza) { 
		super(pizza);
		description = "Paneer";
		cost = 70;
	}
} 

// Other toppings can be coded in a similar way 

// Driver class and method 
class PizzaStore { 
	public static void main(String args[]) { 
		// create new margherita pizza 
		Pizza pizza = new Margherita(); 
		System.out.println(pizza.getDescription() + 
			" will cost: " + pizza.getCost()); 

		// create new FarmHouse pizza 
		Pizza pizza2 = new FarmHouse(); 

		// decorate it with freshtomato topping 
		pizza2 = new FreshTomato(pizza2); 

		//decorate it with paneer topping 
		pizza2 = new Paneer(pizza2); 

		System.out.println(pizza2.getDescription() + 
			" will cost: " + pizza2.getCost()); 
		
		/*	
		// Attention: decorator needs a base to work on it 
		Pizza pizza3 = new Barbeque(null); // no specific pizza 
		System.out.println( pizza3.getDescription() + 
			" will cost: " + pizza3.getCost()); 
		*/
	} 
} 
