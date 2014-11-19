package behavioral_iterator;

public class ListingsItem {
	
	String title;
	boolean streetLegal;
	int price;
	
	public ListingsItem (String title, boolean streetLegal,	int price) {
		this.title = title;
		this.streetLegal = streetLegal;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public boolean isStreetLegal() {
		return streetLegal;
	}
}
