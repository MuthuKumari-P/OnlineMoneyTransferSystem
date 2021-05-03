package in.muthukumarip;

import org.junit.Test;

public class TesterForListOfBank {
	/**
	 * TestCase for No bank name
	 */
	@Test
	public void testCase1() {
		OperationsOnBankList.displayBankList();
		int noOfBanks = OperationsOnBankList.getNoOfBanks();
		System.out.println(noOfBanks);

	}

	/**
	 * Test case with one bank name
	 */
	@Test
	public void testCase2() {
		String bankName = "Indian Bank";
		OperationsOnBankList.addBankList(bankName);
		OperationsOnBankList.displayBankList();
		int noOfBanks = OperationsOnBankList.getNoOfBanks();
		System.out.println(noOfBanks);

	}

	/**
	 * test case with one bank name and with the condition
	 */
	@Test
	public void testCase3() {
		String bankName = "Indian Overseas Bank";
		boolean bankNameValidation = CustomerBankDetailValidation.nameValidation(bankName);
		if (bankNameValidation) {
			OperationsOnBankList.addBankList(bankName);
			OperationsOnBankList.displayBankList();
			int noOfBanks = OperationsOnBankList.getNoOfBanks();
			System.out.println(noOfBanks);
		} else {
			System.out.println("Enter Valid Bank Name");
		}
	}

	/**
	 * Test case with No bank name and with condition
	 */
	@Test
	public void testCase4() {
		String bankName = " ";
		boolean bankNameValidation = CustomerBankDetailValidation.nameValidation(bankName);
		if (bankNameValidation) {
			OperationsOnBankList.addBankList(bankName);
			OperationsOnBankList.displayBankList();
			int noOfBanks = OperationsOnBankList.getNoOfBanks();
			System.out.println(noOfBanks);
		} else {
			System.out.println("Enter Valid Bank Name");
		}
	}
}
