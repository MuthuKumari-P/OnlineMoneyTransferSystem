package in.muthukumarip;

import java.util.ArrayList;

public class OperationsOnBankList {
	static ArrayList<String> bank = new ArrayList<String>();

	public static void addBankList() {
		bank.add("Indian Bank");
		bank.add("Indian Overseas Bank");
		bank.add("Union Bank of India");
	}

	public static int getNoOfBanks() {

		int noOfBanks = bank.size();
		return noOfBanks;
	}

	public static void displayBankList() {

		System.out.println("------------- List of Banks ------------");
		for (String bankName : bank) {
			System.out.println(bankName);
		}
	}

}