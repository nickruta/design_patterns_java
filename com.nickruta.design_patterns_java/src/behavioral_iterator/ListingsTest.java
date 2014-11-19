package behavioral_iterator;

import java.util.*;

public class ListingsTest {
	
	public static void main(String args[]) {
		CarListings carListings = new CarListings();
		MotorcycleListings motorcycleListings = new MotorcycleListings();
 
		ListingAgent listingsAgent = new ListingAgent(carListings, motorcycleListings );
 
		listingsAgent.printListings();
		listingsAgent.printStreetLegalListings();
		
	}

}