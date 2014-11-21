package structural_proxy;

import java.lang.reflect.*;
import java.util.*;

	public class Test {

		Hashtable listingsDB = new Hashtable();
	 	
		// Main just creates the test and calls it's drive() method to get things started
		public static void main(String[] args) {
			Test test = new Test();
			test.drive();
		}
		
		// the constructor initializes our DB of listings in the service
		public Test() {
			initializeDatabase();
		}

		
		public void drive() {
			
			// retrieve a listing from the DB
			ListingBean ferrari = getListingFromDatabase("2014 Ferrari 458 Italia");
			// create an owner proxy
			ListingBean ownerProxy = getOwnerProxy(ferrari);
			ListingBean nonOwnerProxy = getNonOwnerProxy(ferrari);
			System.out.println("Title is " + ownerProxy.getTitle());
			ownerProxy.setPrice(300000);
			System.out.println("Price set from owner proxy");
			System.out.println("New price is " + ownerProxy.getPrice() + "\n");
			try {
				System.out.println("Title is " + nonOwnerProxy.getTitle());
				System.out.println("The bidder is trying to change the for sale price...");
				nonOwnerProxy.setPrice(1);
			} catch (Exception e) {
				System.out.println("Can't set price from bidder proxy");
			}
			System.out.println("Price is " + ownerProxy.getPrice() + "\n");

			ownerProxy.setPrice(400000);
			System.out.println("Price set from owner proxy");
			System.out.println("Title is " + nonOwnerProxy.getTitle());
			System.out.println("New price is " + ownerProxy.getPrice());
		}

		// this method takes a listing object (the real subject) and returns a proxy for it.
		// because the proxy has the same interface as the subject, we return a ListingBean
		ListingBean getOwnerProxy(ListingBean listing) {
	 		
			// this code creates the proxy
			// to create a proxy, we use the static newProxyInstance method on the Proxy class
			
			// we pass it the classloader for our subject...
			// and the set of interfaces the proxy needs to implement
	        return (ListingBean) Proxy.newProxyInstance( 
	            	listing.getClass().getClassLoader(),
	            	listing.getClass().getInterfaces(),
	            	
	            	// we pass the real subject into the constructor of the invocation handler
	                new ListingSellerInvocationHandler(listing));
		}

		ListingBean getNonOwnerProxy(ListingBean listing) {
			
	        return (ListingBean) Proxy.newProxyInstance(
	            	listing.getClass().getClassLoader(),
	            	listing.getClass().getInterfaces(),
	                new ListingBidderInvocationHandler(listing));
		}

		ListingBean getListingFromDatabase(String name) {
			return (ListingBean)listingsDB.get(name);
		}

		void initializeDatabase() {
			ListingBean ferrari = new ListingBeanImpl();
			ferrari.setTitle("2014 Ferrari 458 Italia");
			ferrari.setPrice(250000);
			listingsDB.put(ferrari.getTitle(), ferrari);

			ListingBean corvette = new ListingBeanImpl();
			corvette.setTitle("1996 Chevrolet Corvette");
			corvette.setPrice(75000);
			listingsDB.put(corvette.getTitle(), corvette);
		}
	}