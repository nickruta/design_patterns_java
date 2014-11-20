package behavioral_state;

// implements State
public class ForSaleState implements State {
	
	RealEstateTransaction realEstateTransaction;

	// when the state is instantiated we pass it a reference to the RealEstateTransaction
	// this is used to transition the transaction to a different state
	public ForSaleState(RealEstateTransaction realEstateTransaction) {
		this.realEstateTransaction = realEstateTransaction;
	}
	
	// this is an action which changes the State
	public void offerMade() {
		System.out.println("The offer was accepted");
		realEstateTransaction.setState(realEstateTransaction.getPendingInEscrowState());	
	}
	
	// this is an inappropriate action for this State
	public void closingPapersSigned() {
			System.out.println("The offer cannot be accepted, the property is still listed for sale!");
	}
	
	public String toString() {
		return "for sale!";
	}
}
