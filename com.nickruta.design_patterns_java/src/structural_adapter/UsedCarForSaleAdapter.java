package structural_adapter;

// implement the interface of the type to adapt to, this is the interface the client will expect to see
public class UsedCarForSaleAdapter implements NewCarForSale {
	
	UsedCarForSale usedCarForSale;
	
	// get a refrence to the object that we are adapting, we are doing it through the constructor here
	public UsedCarForSaleAdapter(UsedCarForSale usedCarForSale) {
		this.usedCarForSale = usedCarForSale;
	}

	// implement the methods in the interface, this translation occurs between getMsrpPrice and getPrice
	@Override
	public int getMsrpPrice() {
		return usedCarForSale.getPrice();
	}

}