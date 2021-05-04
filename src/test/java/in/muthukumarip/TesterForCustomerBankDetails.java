package in.muthukumarip;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesterForCustomerBankDetails {

	// Test case with correct input
	@Test
	public void testCase1() {
		UserDetails user1 = new UserDetails();
		user1.name = "P.Muthu Kumari";
		user1.mobileNumber = 7867898765L;
		user1.accountNumber = 6756789876787L;
		user1.ifscCode = " UBIN0539571 ";
		user1.password = "muthu1999KUMARI@";
		user1.balanceAmount = 2000.0f;
		String bankName = " Union Bank of India ";
		boolean valid=CheckCustomerBankDetails.checkCustomerDetail(user1, bankName);
		assertEquals(true, valid);
	}

	// Test case with wrong input
	@Test
	public void testcase2() {
		UserDetails user2 = new UserDetails();
		user2.name = " ";
		user2.mobileNumber = 786789765L;
		user2.accountNumber = 67567787L;
		user2.ifscCode = "UBN0539571";
		user2.password = "248";
		user2.balanceAmount = 2000.0f;
		String bankName = "       Union Bank of India      ";
		boolean valid=CheckCustomerBankDetails.checkCustomerDetail(user2, bankName);
		assertEquals(false, valid);

	}
}
