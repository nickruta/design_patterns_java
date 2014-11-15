package creational_abstract_factory;

// subclass and concrete factory which overrides the createItemForSale method and uses the orderItemForSale method from
// ItemForSaleCreator
public class GuitarItemForSaleConcreteCreator extends ItemForSaleCreator {
	
	ItemForSale itemForSale = null;
	ItemForSaleDetailsFactory itemForSaleDetailsFactory = new GuitarForSaleDetailsFactory();

	// this method is ABSTRACT in ItemForSaleCreator and must be implemented in this class because it is a concrete factory / creator
		@Override
		ItemForSale createItemForSale(String item) {
			if (item.equals("guitar")) {
				itemForSale = new GuitarForSale(itemForSaleDetailsFactory);
				itemForSale.setTitle("Gibson Les Paul");
			}
			return itemForSale;
		}

}