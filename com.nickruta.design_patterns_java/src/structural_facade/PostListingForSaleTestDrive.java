package structural_facade;

public class PostListingForSaleTestDrive {
	
	public static void main(String[] args) {
		
		
		// here, we're creating the components right in the test drive. Normally the client is given a facde, it doesn't have to construct one itself
		EmailTransmitter emailTransmitter = new EmailTransmitter();
		PricePropagator pricePropagator = new PricePropagator();
		ListingsUpdater listingsUpdater = new ListingsUpdater();
		
		ListingForSale listingForSale = new ListingForSale("Corvette");
		
		// instantiate the Facade with all the components in the sub system
		PostListingForSaleFacade postListingForSaleFacade = new PostListingForSaleFacade(emailTransmitter, pricePropagator, listingsUpdater);
		
		// use the simplified interface to list the item for sale
		postListingForSaleFacade.listItemForSale(listingForSale);

	}

}
