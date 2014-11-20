package behavioral_state;

public class RealEstateTransactionTest {
	
	public static void main(String[] args) {
		
		RealEstateTransaction realEstateTransaction = new RealEstateTransaction();
		
		// print out the initial state of the listing
		System.out.println(realEstateTransaction);
		
		realEstateTransaction.closingPapersSigned();
		
		realEstateTransaction.offerMade();
		
		realEstateTransaction.closingPapersSigned();
		
		// print out the current state of the listing
		System.out.println(realEstateTransaction);
	
	}
	
}
