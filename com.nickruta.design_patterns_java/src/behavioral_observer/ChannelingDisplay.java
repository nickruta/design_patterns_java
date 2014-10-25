package behavioral_observer;

import java.util.Observable;
import java.util.Observer;

public class ChannelingDisplay implements Observer, DisplayElement {

	Observable observable;
	private float currentPrice = 69.81f;  
	private float lastPrice;

	// the constructor takes an Observable and we use this to add the ChannelingDisplay object as an Observer
	public ChannelingDisplay(Observable observable) {
		observable.addObserver(this);
	}

	// the update method takes both an Observable and the optional data argument
	public void update(Observable observable, Object arg) {
		// first make sure the observable is of type StockData
		//then use the getter method to obtain the StockPrice
		if (observable instanceof StockData) {
			StockData StockData = (StockData)observable;
			lastPrice = currentPrice;
			currentPrice = StockData.getStockPrice();
			display();
		}
	}

	//simple stock channeling advisor...If the stock goes up, sell it! If the stock goes down, buy it!
	public void display() {
		System.out.print("Course of Action: ");
		if (currentPrice > lastPrice) {
			System.out.println("The stock went up, SELL!");
		} else if (currentPrice == lastPrice) {
			System.out.println("More of the same");
		} else if (currentPrice < lastPrice) {
			System.out.println("The stock went down, BUY!");
		}
	}
}
