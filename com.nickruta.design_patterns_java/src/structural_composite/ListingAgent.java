package structural_composite;

public class ListingAgent {
	
	ListingsComponent allListings;
	
	// listing agent gets a top level listings component, which contains all the other listings. 
	public ListingAgent(ListingsComponent allListings) {
		this.allListings = allListings;
	}

	// all it has to do is print the entire listings hierarchy - all the lisings, and all the listings items - call print()
	// on the top level listings
	public void printListings() {
		allListings.print();
	}
}
