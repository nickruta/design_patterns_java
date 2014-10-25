package behavioral_observer;

public class StockMarket {

	public static void main(String[] args) {
		
		StockData stockData = new StockData();
		ChannelingDisplay channelingDisplay = new ChannelingDisplay(stockData);

		// stock price changes, the observer, ChannelingDisplay is notified
		stockData.setStockPrice(30.4f);
	
	}
}

