package creational_abstract_factory;

public interface ItemForSaleDetailsFactory {
	
	public ConditionDetails createConditionDetails();
	public TypeDetails createTypeDetails();
}