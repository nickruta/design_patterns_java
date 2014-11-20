package behavioral_state;

// the interface for all states. The methods map directly to actions that could happen to the Real Estate Transaction
public interface State {	
	public void offerMade();	
	public void closingPapersSigned();
}
