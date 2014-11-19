package structural_composite;

import java.util.Iterator;

// implement the Iterator interface
public class MotorcycleListingsIterator implements Iterator {
	
	// position maintains the current position of the iteration over the array
	structural_composite.ListingsItem[] list;
	int position = 0;
	
	// the constructor takes the array of menu items we are going to iterate over
	public MotorcycleListingsIterator(structural_composite.ListingsItem[] listingsItems) {
		this.list = listingsItems;
	}

	// the hasNext() method checks to see if we've seen all the elements of the aray and returns true if there are more to iterate through
	@Override
	public boolean hasNext() {
		
		// because there is a max size array involved, we need to check not only if we are 
		// at the end of the array, but also if the next item is null, which indicates there are no more items
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	// the next() method returns the next item in the array and increments the potition
	@Override
	public Object next() {
		ListingsItem listingsItem = list[position];
		position = position + 1;
		return listingsItem;
	}

	@Override
	public void remove() {
		
		if (position <= 0) {
			throw new IllegalStateException("You can't remove an item until you've done at elast one next()");
		}
		
		if (list[position - 1] != null) {
			for (int i = position - 1; i < (list.length - 1); i++) {
				list[i] = list[i + 1];
			}
			list[list.length-1] = null;
		}
	}

}
