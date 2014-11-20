package structural_composite;

import java.util.*;

// like all iterators, implement Iterator interface
public class CompositeIterator implements Iterator {
	Stack stack = new Stack();
   
	// the iterator of the top level composite we're going to iterate over is passed in. We throw that in a stack data structure
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
   
	// when the lcient wants to get the next element we first make sure there is one by calling hasNext();
	public Object next() {
		if (hasNext()) {
			Iterator iterator = (Iterator) stack.peek();
			ListingsComponent component = (ListingsComponent) iterator.next();
			// if there is a next element, we get the current iterator off the stack and get its next element
			if (component instanceof Listings) {
				// if that element is a listings, we have another composite that needs to be included in the iteration, so we
				// throw it on the stack. in either case, we return the componenet
				stack.push(component.createIterator());
			} 
			return component;
		} else {
			return null;
		}
	}
  
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			// to see fi there is a next element, we check to see if the stack is empty
			// if so, there isn't...otherwise we get the iterator off the top of the stack and see if it
			// has a next element. if it doesn't we pop it off the stack and call 
			// hasNext() recursively. 
			Iterator iterator = (Iterator) stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
   
	// we are not supporting remove, just traversal
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
