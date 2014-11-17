package structural_facade;

public class PostListingForSaleFacade {
	
	//here is the composition, these are all the components of the subsystem we are using
	EmailTransmitter emailTransmitter;
	PricePropagator pricePropagator;
	ListingsUpdater listingsUpdater;
	
	public PostListingForSaleFacade(EmailTransmitter emailTransmitter, PricePropagator pricePropagator, ListingsUpdater listingsUpdater) {
		
		// The facade is passed a reference to each component of the subsystem in its constructor. 
		this.emailTransmitter = emailTransmitter;
		this.pricePropagator = pricePropagator;
		this.listingsUpdater = listingsUpdater;
		
	}
	
	
	// listItemForSale wraps up all of the method calls by delegating the responsibility to the corresponding component in the subsystem
	public void listItemForSale(ListingForSale listingforSale) {
		System.out.println("Listing " + listingforSale.title + " for sale...");
		pricePropagator.getPrice();
		listingsUpdater.updateListings();
		emailTransmitter.sendListingPostedEmail();
	}

}
