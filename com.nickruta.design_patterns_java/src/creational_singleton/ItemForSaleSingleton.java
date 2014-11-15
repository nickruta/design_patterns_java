package creational_singleton;

public class ItemForSaleSingleton {

	private boolean sold;
	private boolean escrowClosed;
	
	// we have a static variable to hold our one instance of the class
	// volatile keyword ensures that multiple threads hanlde the unique instance variable correctly when it is being initialized to the ItemForSaleSingleton instance
	private volatile static ItemForSaleSingleton uniqueInstance;
  
	// the constructor is declared private; only ItemForSaleSingleton can instantiate this class
	private ItemForSaleSingleton() {
		sold = true;
		escrowClosed = false;
	}
  
	// the getInstance() method gives us a way to instantiate the class and also to return an instance of it
	public static ItemForSaleSingleton getInstance() {
		
		// if we never need the instance, it never gets created, this is called LAZY INSTANTIATION
		// first, we check for an instance and if there isn't one, enter a synchronized block
		// only synchorinze the first time through
		if (uniqueInstance == null) {
			synchronized (ItemForSaleSingleton.class) {
				// once in the block, check again and if still null, create an instance
				if (uniqueInstance == null) {
					System.out.println("Creating unique instance of ItemForSaleSingleton");
					uniqueInstance = new ItemForSaleSingleton();
					// if performance is an issue, this method of DOUBLE-CHECKED locking can drastically reduce overhead
				}
			}
		}
		System.out.println("Returning instance of ItemForSaleSingleton");
		return uniqueInstance;
	}
	
	// this class is a Singleton but also is a normal class and has useful instance variables and methods
	public void negotiate() {
		if (isSold()) {
			sold = false;
			escrowClosed = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}
 
	public void forSaleListingRemoved() {
		if (!isSold() && isEscrowClosed()) {
			// remove the FOR SALE listing
			sold = true;
		}
	}
 
	public void negotiationCompleted() {
		if (!isSold() && !isEscrowClosed()) {
			// close escrow
			escrowClosed = true;
		}
	}
  
	public boolean isSold() {
		return sold;
	}
 
	public boolean isEscrowClosed() {
		return escrowClosed;
	}
}
