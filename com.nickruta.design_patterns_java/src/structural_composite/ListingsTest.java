package structural_composite;

public class ListingsTest {
	
	public static void main(String args[]) {
		
		// create the listings objects
		ListingsComponent carListings = new Listings("CAR LISTINGS");
		ListingsComponent motorcycleListings = new Listings("MOTORCYCLE LISTINGS");
		
		// create the top level listings 
		ListingsComponent allListings = new Listings("ALL LISTINGS");
		
		// using Composite add() method to add each listings to the top level listings, allListings
		allListings.add(carListings);
		allListings.add(motorcycleListings);
		
		// now we add all the listings items
		carListings.add(new ListingsItem("1993 Lamborghini Strosek Diablo", false, 250000));
		carListings.add(new ListingsItem("2014 Acura TSX", true, 35000));
		carListings.add(new ListingsItem("1996 Chevrolet Corvette", true, 20000));
	
		motorcycleListings.add(new ListingsItem("2009 Kawasaki Ninja 250", true, 1500));
		motorcycleListings.add(new ListingsItem("2014 Suzuki Hayabusa", false, 19000));
		motorcycleListings.add(new ListingsItem("2012 Honda CBR 500R", true, 5600));
		
		ListingAgent listingAgent = new ListingAgent(allListings);
		
		// once we have created the entire listings hierarchy, we hand the whole thing to the Listing Agent which prints all
		listingAgent.printListings();
		
	}

}
