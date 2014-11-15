package creational_abstract_factory;


// Product abstract class from which all concrete products will extend
public abstract class ItemForSale {
	
	TypeDetails typeDetails;
	ConditionDetails conditionDetails;
	
	String title;
	String description;
	int price;
	
	abstract void initialize();
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title; 	
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + title + " ----\n");
		display.append(description + "\n");
		display.append(price + "\n");
		
		return display.toString();
	}
	
}

 
 

