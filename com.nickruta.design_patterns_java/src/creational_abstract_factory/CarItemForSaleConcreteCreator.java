package creational_abstract_factory;

//subclass and concrete factory which overrides the createItemForSale method and uses the orderItemForSale method from
//ItemForSaleCreator
public class CarItemForSaleConcreteCreator extends ItemForSaleCreator {

	ItemForSale itemForSale = null;
	ItemForSaleDetailsFactory itemForSaleDetailsFactory = new CarForSaleDetailsFactory();
	
	// this method is ABSTRACT in ItemForSaleCreator and must be implemented in this class because it is a concrete factory / creator
	@Override
	ItemForSale createItemForSale(String item) {
		if (item.equals("car")) {
			itemForSale = new CarForSale(itemForSaleDetailsFactory);
			itemForSale.setTitle("Corvette");
		}
		return itemForSale;
	}

}