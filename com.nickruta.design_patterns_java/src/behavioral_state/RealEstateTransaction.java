package behavioral_state;

public class RealEstateTransaction {
	
	// here are the three states	
	State forSaleState;
	State pendingInEscrowState;
	State soldState;
	
	State state = new ForSaleState(this);
	
	public RealEstateTransaction() {
		forSaleState = new ForSaleState(this);
		pendingInEscrowState = new PendingInEscrowState(this);
		soldState = new SoldState(this);
	}
	
	public State getState() {
        return state;
    }
	
	void setState(State state) {
		this.state = state;
	}
	
	public State getForSaleState() {
		return forSaleState;
	}
	
	public State getPendingInEscrowState() {
		return pendingInEscrowState;
	}
	
	public State getSoldState() {
		return soldState;
	}
	
	// this is an action which changes the state
	public void offerMade() {
		state.offerMade();		
	}
	
	// this is an action which changes the state
	public void closingPapersSigned() {
		state.closingPapersSigned();		
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nReal Estate Transaction");
		result.append("\nListing is " + state + "\n");	
		return result.toString();
	}
}
