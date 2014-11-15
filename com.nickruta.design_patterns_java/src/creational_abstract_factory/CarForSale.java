package creational_abstract_factory;

public class CarForSale extends ItemForSale {
	
	// this factory is used to retreive the specific details for each listing
	ItemForSaleDetailsFactory itemForSaleDetailsFactory;

	public CarForSale(ItemForSaleDetailsFactory itemForSaleDetailsFactory) {
		this.itemForSaleDetailsFactory = itemForSaleDetailsFactory;
	}
	
	void initialize() {
		
		title = "Car for Sale";
		description = "Used Car for sale!";
		price = 65000;
		
		System.out.println("Adding specific item details to " + title);
		typeDetails = itemForSaleDetailsFactory.createTypeDetails();
		System.out.println("Type details - " + typeDetails);
		conditionDetails = itemForSaleDetailsFactory.createConditionDetails();
		System.out.println("Condition details - " + conditionDetails);
	}

}
