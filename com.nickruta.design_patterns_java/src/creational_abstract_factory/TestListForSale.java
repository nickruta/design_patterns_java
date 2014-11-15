package creational_abstract_factory;

public class TestListForSale {
 
	public static void main(String[] args) {
		ItemForSaleCreator guitarItemForSaleConcreteCreator = new GuitarItemForSaleConcreteCreator();
		ItemForSaleCreator carItemForSaleConcreteCreator = new CarItemForSaleConcreteCreator();
 
		ItemForSale itemForSale1 = guitarItemForSaleConcreteCreator.orderItemForSale("guitar");
		System.out.println("Nick listed a " + itemForSale1.getTitle() + "\n");
 
		ItemForSale itemForSale2 = carItemForSaleConcreteCreator.orderItemForSale("car");
		System.out.println("Bob listed a " + itemForSale2.getTitle() + "\n");

	}
}

