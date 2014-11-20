package behavioral_state;

public class PendingInEscrowState implements State {
	
	RealEstateTransaction realEstateTransaction;

	// when the state is instantiated we pass it a reference to the RealEstateTransaction
	// this is used to transition the transaction to a different state
	public PendingInEscrowState(RealEstateTransaction realEstateTransaction) {
		this.realEstateTransaction = realEstateTransaction;
	}
	
	// this is an inappropriate action for this State
	public void offerMade() {
			System.out.println("The property is already in escrow!");	
	}
	
	// this is an action which changes the state
	public void closingPapersSigned() {
			System.out.println("Congrats, the property is now sold!");
			realEstateTransaction.setState(realEstateTransaction.getSoldState());			
	}	
	
	public String toString() {
		return "pending in escrow...";
	}
}

