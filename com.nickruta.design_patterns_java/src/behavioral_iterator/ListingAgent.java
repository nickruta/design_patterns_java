package behavioral_iterator;

import java.util.Iterator;

public class ListingAgent {

	// we use Listings Interface as opposed to concrete Listings classes like MotorcycleListings
	Listings carListings;
	Listings motorcycleListings;
 
	public ListingAgent(Listings carListings, Listings motorcycleListings) {
		this.carListings = carListings;
		this.motorcycleListings = motorcycleListings;
	}
 
	public void printListings() {
		Iterator carIterator = carListings.createIterator();
		Iterator motorcycleIterator = motorcycleListings.createIterator();

		System.out.println("Listings\n----\nCARS");
		printListings(carIterator);
		System.out.println("\nMOTORCYCLES");
		printListings(motorcycleIterator);

	}
 
	// the overloaded printListings() method uses the Iterator to step through the menu items and print them
	private void printListings(Iterator iterator) {
		while (iterator.hasNext()) {
			ListingsItem listingsItem = (ListingsItem)iterator.next();
			System.out.print(listingsItem.getTitle() + ", ");
			System.out.print(listingsItem.getPrice() + " -- ");
		}
	}
 
	public void printStreetLegalListings() {
		System.out.println("\nSTREET LEGAL LISTINGS\n---------------");
		printStreetLegalListings(carListings.createIterator());
		printStreetLegalListings(motorcycleListings.createIterator());
		
	}

	private void printStreetLegalListings(Iterator iterator) {
		while (iterator.hasNext()) {
			ListingsItem listingsItem = (ListingsItem)iterator.next();
			if (listingsItem.isStreetLegal()) {
				System.out.print(listingsItem.getTitle() + ", ");
				System.out.print(listingsItem.getPrice() + " -- ");
			}
		}
	}

}