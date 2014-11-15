package creational_factory_method;


// Product abstract class from which all concrete products will extend
public abstract class ItemForSale {
	
	String title;
	String description;
	int price;
	
	void initialize() {
		System.out.println("Initializing the Item for Sale");
	}
	
	public String getTitle() {
		return title;
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + title + " ----\n");
		display.append(description + "\n");
		display.append(price + "\n");
		
		return display.toString();
	}
	
}

 
 

