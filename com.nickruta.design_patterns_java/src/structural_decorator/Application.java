package structural_decorator;

//Application acts as our abstract component class
public abstract class Application {
	
	String description = "Unknown Application";
	  
	public String getDescription() {
		return description;
	}
 
	public abstract int cost();

}
