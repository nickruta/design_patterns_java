package structural_adapter;

public class TestDrive {
	
	public static void main(String[] args) {
		
		// create an instance of the class to be adapted, UsedCorvetteForSale
		UsedCorvetteForSale UsedCorvetteForSale = new UsedCorvetteForSale();
		
		//use the adapter to set the UsedCorvetteForSale instance to the reference variable of type NewCarForSale
		// if you simply passed UsedCorvetteForSale, you would get a type mismatch error
		NewCarForSale newCorvetteForSaleAdapter = new UsedCarForSaleAdapter(UsedCorvetteForSale);

			System.out.println("The NewCorvetteAdapter says...");
			System.out.println(newCorvetteForSaleAdapter.getMsrpPrice());
	}

}

