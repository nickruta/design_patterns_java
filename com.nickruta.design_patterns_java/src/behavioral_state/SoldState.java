package behavioral_state;

public class SoldState implements State {
	
	RealEstateTransaction realEstateTransaction;

	// when the state is instantiated we pass it a reference to the RealEstateTransaction
	// this is used to transition the transaction to a different state
	public SoldState(RealEstateTransaction realEstateTransaction) {
		this.realEstateTransaction = realEstateTransaction;
	}
	
	// this is an inappropriate action for this State
	public void offerMade() {
			System.out.println("The property was already sold!");	
	}
	
	// this is an inappropriate action for this State
	public void closingPapersSigned() {
		System.out.println("The property was already sold!");	
	}
	
	public String toString() {
		return "SOLD!";
	}

}
