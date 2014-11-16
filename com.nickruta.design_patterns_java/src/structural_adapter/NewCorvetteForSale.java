package structural_adapter;

public class NewCorvetteForSale implements NewCarForSale {

	@Override
	public int getMsrpPrice() {		
		// constant inherited from NewCarForSale
		return NewCarForSale.MSRPPRICE;
	}

}
