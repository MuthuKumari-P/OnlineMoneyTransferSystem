package in.muthukumarip;

public class TestManagerForListOfBank {

	public static void main(String[] args) {
		OperationsOnBankList.displayBankList();
		int noOfBanks=OperationsOnBankList.getNoOfBanks();
		System.out.println(noOfBanks);
		OperationsOnBankList.addBankList();
		OperationsOnBankList.displayBankList();
		int listOfBankCount=OperationsOnBankList.getNoOfBanks();
		System.out.println(listOfBankCount);
	}
}
