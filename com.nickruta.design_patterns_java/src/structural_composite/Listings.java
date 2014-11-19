package structural_composite;

import java.util.ArrayList;
import java.util.Iterator;

// Listings is also a ListingsComponent, just like ListingsItem
public class Listings extends ListingsComponent {
	
	// Listings can have any number of children of type ListingsComponent, use an internal ArrayList to hold these
	ArrayList listingsComponents = new ArrayList();
	
	String title;
	
	public Listings() {
		
	}
	
	public Listings(String title) {
		this.title = title;
	}
	
	
	// this is how to add ListingsItems or other Listings to the Listings Board
	public void add(ListingsComponent listingsComponent) {
		listingsComponents.add(listingsComponent);
	}
	
	public void remove(ListingsComponent listingsComponent) {
		listingsComponents.remove(listingsComponent);
	}
	
	public ListingsComponent getChild(int i) {
		return (ListingsComponent)listingsComponents.get(i);
	}
	
	public String getTitle() {
		return title;
	}
	
	public Iterator createIterator() {
		return new CompositeIterator(listingsComponents.iterator());
	}
	
	public void print() {
		System.out.println("\n" + getTitle());
		System.out.println("-----------------------");
		
		// printing all of the Listings components: other Listings and ListingsItems
		// We use an Iterator. We use it to iterate through all the Listings's components
		// they could be other Listings or they could be ListingsItems. Since both Listings and
		// ListingsItems implement print(), we just call print() and the rest is up to them
		Iterator iterator = listingsComponents.iterator();
		while (iterator.hasNext()) {
			ListingsComponent listingsComponent = 
					(ListingsComponent)iterator.next();
			listingsComponent.print();
		}
	}
	
	

}
