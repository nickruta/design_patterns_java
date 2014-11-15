package creational_factory_method;

public class TestListForSale {
 
	public static void main(String[] args) {
		ItemForSaleCreator guitarItemForSaleConcreteCreator = new GuitarItemForSaleConcreteCreator();
		ItemForSaleCreator carItemForSaleConcreteCreator = new CarItemForSaleConcreteCreator();
 
		ItemForSale itemForSale = guitarItemForSaleConcreteCreator.orderItemForSale("guitar");
		System.out.println("Nick listed a " + itemForSale.getTitle() + "\n");
 
		itemForSale = carItemForSaleConcreteCreator.orderItemForSale("car");
		System.out.println("Bob listed a " + itemForSale.getTitle() + "\n");

	}
}

