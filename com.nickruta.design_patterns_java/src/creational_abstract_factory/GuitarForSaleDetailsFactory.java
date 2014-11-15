package creational_abstract_factory;

public class GuitarForSaleDetailsFactory implements ItemForSaleDetailsFactory{

	@Override
	public ConditionDetails createConditionDetails() {
		return new GuitarConditionDetails();
	}

	@Override
	public TypeDetails createTypeDetails() {
		return new GuitarTypeDetails();
	}

}
