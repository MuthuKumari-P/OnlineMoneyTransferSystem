package in.muthukumarip;

public class TestManagerForListOfBank {

	public static void main(String[] args) {
		// Without adding bank name
		OperationsOnBankList.displayBankList();
		int noOfBanks = OperationsOnBankList.getNoOfBanks();
		System.out.println(noOfBanks);

		// adding one bank name
		String bankName1 = "Indian Bank";
		OperationsOnBankList.addBankList(bankName1);
		OperationsOnBankList.displayBankList();
		int listOfBankCount = OperationsOnBankList.getNoOfBanks();
		System.out.println(listOfBankCount);

		// adding another bank name
		String bankName2 = "Indian Overseas Bank";
		OperationsOnBankList.addBankList(bankName2);
		OperationsOnBankList.displayBankList();
		int listOfBankCount1 = OperationsOnBankList.getNoOfBanks();
		System.out.println(listOfBankCount1);
	}
}
