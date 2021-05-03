package in.muthukumarip;

import java.util.ArrayList;

public class OperationsOnBankList {
	static ArrayList<String> bank = new ArrayList<String>();

	// This method used to add the list of bank name
	public static void addBankList(String bankName) {
		// bank.add("Indian Bank");
		// bank.add("Indian Overseas Bank");
		// bank.add("Union Bank of India");
		bank.add(bankName);
	}

	// This method used to return the list of Banks count
	public static int getNoOfBanks() {

		int noOfBanks = bank.size();
		return noOfBanks;
	}

	// This method used to display the bank list
	public static void displayBankList() {

		System.out.println("------------- List of Banks ------------");
		for (String bankName : bank) {
			System.out.println(bankName);
		}
	}

}