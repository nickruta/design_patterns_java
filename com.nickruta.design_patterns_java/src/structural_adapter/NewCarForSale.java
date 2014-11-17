package structural_adapter;

public interface NewCarForSale {
	
	// a new car for sale has a set price, the MSRP
	// the UsedCarForSale will have to adapt to this by finding its price based on a web service call which retrieves the 
	// average price of the used car
	public static final int MSRPPRICE = 75000;
	
	public int getMsrpPrice();

}
