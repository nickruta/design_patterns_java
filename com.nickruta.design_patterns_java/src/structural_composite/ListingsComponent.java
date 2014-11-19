package structural_composite;

import java.util.Iterator;

// ListingsComponent provides default implementations for every method
public abstract class ListingsComponent {

	// grouped together the 'composite' methods, that is, methods to add, remove and get ListingsComponents
	public void add(ListingsComponent listingsComponent) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(ListingsComponent listingsComponent) {
		throw new UnsupportedOperationException();
	}
	
	public ListingsComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	// there are the 'operation' methods; these are used by the ListingsItems. It turns out we can also use a couple of them in 
	// Listings too
	public String getTitle() {
		throw new UnsupportedOperationException();
	}
	
	public int getPrice() {
		throw new UnsupportedOperationException();
	}
	
	public boolean isStreetLegal() {
		throw new UnsupportedOperationException();
	}
	
	public abstract Iterator createIterator();
	
	// the print() method is an 'operation' method that both our Listings and ListingsItems will implement, but we
	// provide a default operation here
	public void print() {
		throw new UnsupportedOperationException();
	}
}
