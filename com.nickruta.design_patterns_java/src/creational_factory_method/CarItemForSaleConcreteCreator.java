package creational_factory_method;

//subclass and concrete factory which overrides the createItemForSale method and uses the orderItemForSale method from
//ItemForSaleCreator
public class CarItemForSaleConcreteCreator extends ItemForSaleCreator {

	// this method is ABSTRACT in ItemForSaleCreator and must be implemented in this class because it is a concrete factory / creator
	@Override
	ItemForSale createItemForSale(String item) {
		if (item.equals("car")) {
			return new CarForSale();
		} else return null;
	}

}


