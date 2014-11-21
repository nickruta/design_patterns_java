package structural_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// InvocationHanlder is part of the java.lang.reflect package, we need to import it
public class ListingBidderInvocationHandler implements InvocationHandler {
	
	ListingBean listing;
	
	public ListingBidderInvocationHandler(ListingBean listing) {
		this.listing = listing;
	}
	
	// here is the invoke method that gets called every time a method is invoked on the proxy
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
		
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(listing, args);
   			} else if (method.getName().equals("setPrice")) {
				throw new IllegalAccessException();
			}
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
		return null;
	}
}