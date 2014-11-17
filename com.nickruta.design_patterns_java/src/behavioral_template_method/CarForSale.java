package behavioral_template_method;

public abstract class CarForSale {
	
	// this is the TEMPLATE METHOD
	// it serves as a template for an algorithm, in this case, an algorithm for listing a car for sale
	final void listCarForSale() {
		
		// in the template, each step of the algorithm is represented by a method
		
		// this method is handled by subclasses
		getPrice();
		
		// these listings are handled by this class
		addListingToDatabase();
		listCar();
		sendConfirmationEmail();
		
		// this conditional statement bases its success on a concrete method, sellerWantsToPostToSocialMedia(). 
		// if the seller wants to post to social media, then postToSocialMedia()
		if (sellerWantsToPostToSocialMedia()) {
			postToSocialMedia();
		}
	}
	
	// declare abstract all methods that are required to be supplied by a subclass
	abstract void getPrice();
	abstract void postToSocialMedia();
	
	void addListingToDatabase() {
		System.out.println("Adding Listing to the database...");
	}
	
	void listCar() {
		System.out.println("Adding the car to the listings for sale...");
	}
	
	void sendConfirmationEmail() {
		System.out.println("Confirmation Email sent to the seller!");
	}
	
	// this is a TEMPLATE METHOD HOOK - a subclass can override this method, but doesn't have to
	// the default set is to not post to social media sites
	boolean sellerWantsToPostToSocialMedia() {
		return false;
	}

}
