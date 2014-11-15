package creational_abstract_factory;

public class GuitarForSale extends ItemForSale {
	
	// this factory is used to retreive the specific details for each listing
	ItemForSaleDetailsFactory itemForSaleDetailsFactory;
	
	public GuitarForSale(ItemForSaleDetailsFactory itemForSaleDetailsFactory) {
		this.itemForSaleDetailsFactory = itemForSaleDetailsFactory;
	}
	
	void initialize() {
		
		title = "Guitar for Sale";
		description = "Brand New Guitar for sale!";
		price = 2500;
		
		System.out.println("Adding specific item details to " + title);
		typeDetails = itemForSaleDetailsFactory.createTypeDetails();
		System.out.println("Type details - " + typeDetails);
		conditionDetails = itemForSaleDetailsFactory.createConditionDetails();
		System.out.println("Condition details - " + conditionDetails);
	}

}