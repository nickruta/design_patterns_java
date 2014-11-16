package structural_adapter;

public class UsedCorvetteForSale implements UsedCarForSale {

	@Override
	public int getPrice() {
		
		// insert here - web service call to get average auction price
		
		// returning a hard coded value instead of making a web service call to retrieve the average auction price of the used car
		return 55000;
	}

}
