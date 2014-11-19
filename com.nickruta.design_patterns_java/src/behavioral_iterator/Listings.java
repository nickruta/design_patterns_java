package behavioral_iterator;

import java.util.Iterator;

public interface Listings {
	
	// this is a simple interface that just lets the clients get an iterator for the items in the menu
	public Iterator createIterator();
	
}
