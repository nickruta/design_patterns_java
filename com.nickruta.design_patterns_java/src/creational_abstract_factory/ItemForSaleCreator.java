package creational_abstract_factory;

public abstract class ItemForSaleCreator {
	
	// abstract factory method
	// all responsibility for instantiating ItemForSale is moved to this method
	// factory methods return the product - ItemForSale in this case
	// a factory method isolates the client, orderItemForSale() in this case from knowing what kind of concrete Product is actually created
	abstract ItemForSale createItemForSale(String item);
	
	// this method makes use of the object passed from createItemForSale therefore it has no idea of which implementation it uses
	// it just knows that it is an ItemForSale
	public ItemForSale orderItemForSale(String type) {
		ItemForSale itemForSale = createItemForSale(type);
		System.out.println("--- Listing a " + itemForSale.getTitle() + " ---");
		itemForSale.initialize();
		return itemForSale;
	}

}

