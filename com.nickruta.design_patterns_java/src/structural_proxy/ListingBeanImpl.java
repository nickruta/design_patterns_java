package structural_proxy;

public class ListingBeanImpl implements ListingBean {

		String title;
		int price;

		public String getTitle() {
			return title;
		}
	   
		public int getPrice() {
			return price;
		}
	  
	 
		public void setTitle(String title) {
			this.title = title;
		}
	  
		public void setPrice(int price) {
			this.price = price;
		}

}
