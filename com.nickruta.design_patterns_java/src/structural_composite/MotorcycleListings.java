package structural_composite;

import java.util.Iterator;

public class MotorcycleListings extends Listings {
	
	static final int MAX_ITEMS = 3;
	int numberOfItems = 0;
	ListingsItem[] listingsItems;
	
	public MotorcycleListings() {
		listingsItems = new ListingsItem[MAX_ITEMS];
	
		addItem("2009 Kawasaki Ninja 250", true, 1500);
		addItem("2014 Suzuki Hayabusa", false, 19000);
		addItem("2012 Honda CBR 500R", true, 5600);
			
	}
	
	public void addItem(String title, boolean isStreetLegal, int price) {
		
		ListingsItem listingsItem = new ListingsItem(title, isStreetLegal, price);
		
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, the listings board is full! You can't add another item");
		} else {
			listingsItems[numberOfItems] = listingsItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	public ListingsItem[] getListingsItems() {
		return listingsItems;
	}

	// Here's the createIterator() method. It creates a MotorcycleListingsIteerator from the listingsItems array and returns it to the client
	@Override
	public Iterator createIterator() {
		
		// returning the Iterator interface. The client doesn't need to know how the Items are maintained in the MotorcycleListings 
		// nor does it need to know how the 
		// MotorcycleListingsIterator is implemented. It just needs to use the iterators to step through the items in the Listings
		return new MotorcycleListingsIterator(listingsItems);
	}
	
	// other Listings methods here

}
