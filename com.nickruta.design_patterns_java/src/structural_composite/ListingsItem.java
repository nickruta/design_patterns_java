package structural_composite;

import java.util.Iterator;

// first we need to extend the ListingsComponent interface
public class ListingsItem  extends ListingsComponent {
	
	String title;
	boolean streetLegal;
	int price;
	
	// the constructor just takes the fields and keeps a refernce to them all. 
	public ListingsItem (String title, boolean streetLegal,	int price) {
		this.title = title;
		this.streetLegal = streetLegal;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public boolean isStreetLegal() {
		return streetLegal;
	}
	
	// we ovveride the print() method in the ListingsComponent class. For ListingsItem this method prints
	// the complete Listings Entry
	@Override 
	public void print() {
		System.out.println("  " + getTitle());
		if(isStreetLegal()) {
			System.out.print("(SL)");
		}
		System.out.println(", " + getPrice());
	}

	@Override
	public Iterator createIterator() {
		return new NullIterator();
	}
}
