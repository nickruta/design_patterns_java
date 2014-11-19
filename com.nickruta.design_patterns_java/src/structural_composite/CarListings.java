package structural_composite;

import java.util.ArrayList;
import java.util.Iterator;

public class CarListings extends Listings {
	
	ArrayList listingsItems;
	
	public CarListings() {
		listingsItems = new ArrayList();
	
		addItem("1993 Lamborghini Strosek Diablo", false, 250000);
		addItem("2014 Acura TSX", true, 35000);
		addItem("1996 Chevrolet Corvette", true, 20000);
			
	}
	
	public void addItem(String title, boolean isStreetLegal, int price) {
		ListingsItem listingsItem = new ListingsItem(title, isStreetLegal, price);
		listingsItems.add(listingsItem);
	}
	
	public ArrayList getListingsItems() {
		return listingsItems;
	}

	@Override
	public Iterator createIterator() {
		return listingsItems.iterator();
	}
	
	// other Listings methods here

}
