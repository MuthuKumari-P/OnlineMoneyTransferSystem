package in.muthukumarip;

import java.util.HashSet;

public class OperationsOnBankList {
	static HashSet<String> banklist = new HashSet<String>();

	// This method used to add the list of bank name
	public static void addBankList(String bankName) {
		banklist.add(bankName);
	}

	// This method used to return the list of Banks count
	public static int getNoOfBanks() {

		int noOfBanks = banklist.size();
		return noOfBanks;
	}

	// This method used to display the bank list
	public static void displayBankList() {

		System.out.println("------------- List of Banks ------------");
		for (String bankName : banklist) {
			System.out.println(bankName);
		}
	}

}
