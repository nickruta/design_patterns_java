package behavioral_observer;

//The Observable class keeps track of all your observers and notifies them for you
import java.util.Observable;

//Observable is a CLASS not an interface, so StockData extends Observable
//With Java's built-in support, all you have to do is extend Observable and tell it when to notify the observers. 
//The API does the rest for you
public class StockData extends Observable {
	
	private float stockPrice;
	
	public StockData() {
	}
	
	public void priceChanged() {
		//setChanged() is used to signify that the state has changed and that notifyObservers
		//should update its observers when it is called.
		// the reason for setChanged() is incase we need more flexibility in how we update observers
		// for example, we may want to notify only if the stock price changes at least 10%
		setChanged();
		//if notifyObservers() was called without first calling setChanged(), the observers would NOT be notified
		// notice we aren't sending a data object with the notifyObservers() call. That means we're using the PULL model
		notifyObservers();
	}
	
	public void setStockPrice(float stockPrice) {
		this.stockPrice = stockPrice;
		priceChanged();
	}

	// get method is needed because we are going to PULL data into the Observers. ChannelingDisplay will use it to get at the StockData object's state.
	public float getStockPrice() {
		return stockPrice;
	}
	
}
