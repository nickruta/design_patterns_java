package behavioral_template_method;

public class CarForSaleTest {
	
	public static void main(String[] args) {
		
		// first we need used and new car objects
		UsedCarForSale usedCarForSale = new UsedCarForSale();
		NewCarForSale newCarForSale = new NewCarForSale();
		
		// call the template method
		System.out.println("\nListing a Used Car for Sale...");
		usedCarForSale.listCarForSale();
		
		// call the template method
		System.out.println("\nListing a New Car for Sale...");
		newCarForSale.listCarForSale();
	}

}
