package creational_singleton;

public class ItemForSaleSingletonTest {
	
	public static void main(String args[]) {
		ItemForSaleSingleton listing = ItemForSaleSingleton.getInstance();
		listing.negotiate();
		listing.negotiationCompleted();
		listing.forSaleListingRemoved();

		// will return the existing instance
		ItemForSaleSingleton listing2 = ItemForSaleSingleton.getInstance();
	}

}
