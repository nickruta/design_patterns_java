package creational_abstract_factory;

public class CarForSaleDetailsFactory implements ItemForSaleDetailsFactory{

	@Override
	public ConditionDetails createConditionDetails() {
		return new CarConditionDetails();
	}

	@Override
	public TypeDetails createTypeDetails() {
		return new CarTypeDetails();
	}

}
