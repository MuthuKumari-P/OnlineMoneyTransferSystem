package in.muthukumarip;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesterForListOfBank {
	/**
	 * TestCase for display Banks
	 */
	@Test
	public void testCase1() {
		OperationsOnBankList.displayBankList();
		int noOfBanks = OperationsOnBankList.getNoOfBanks();
		System.out.println(noOfBanks);

	}

	/**
	 * Test case with One Bank Name
	 */
	@Test
	public void testCase2() {
		String bankName = "Indian Overseas Bank";
		boolean bankNameValidation = CustomerBankDetailValidation.checkBankName(bankName);
		assertEquals(true, bankNameValidation);
	}

	/**
	 * Test case with No Bank Name
	 */
	@Test
	public void testCase3() {
		String bankName = " ";
		boolean bankNameValidation = CustomerBankDetailValidation.checkBankName(bankName);
		assertEquals(false, bankNameValidation);
	}
}
