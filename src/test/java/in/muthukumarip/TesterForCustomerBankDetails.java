package in.muthukumarip;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TesterForCustomerBankDetails {
	// static String bankName = "Union Bank of India";

	// Test case with right input
	@Test
	public void testcase1() {
		UserDetails user1 = new UserDetails();
		user1.name = "P.Muthu Kumari";
		user1.mobileNumber = 7867898765L;
		user1.accountNumber = 6756789876787L;
		user1.ifscCode = " UBIN0539571 ";
		user1.password = 2458;
		user1.balanceAmount = 2000.0f;
		String bankName = " Union Bank of India ";
		ArrayList<String> errors = CheckCustomerBankDetails.validateCustomerDetails(user1, bankName);
		if (errors.isEmpty()) {
			System.out.println("Customer bank details are valid");
			OperationsOnCustomerDetails.addCustomerDetails(user1);
			OperationsOnCustomerDetails.displayCustomerDetails();
		} else {
			System.out.println("Errors\n" + errors);
		}
		assertEquals(true, errors.isEmpty());
	}

	// Test case with wrong input
	@Test
	public void testcase2() {
		UserDetails user1 = new UserDetails();
		user1.name = " ";
		user1.mobileNumber = 786789765L;
		user1.accountNumber = 67567787L;
		user1.ifscCode = "UBN0539571";
		user1.password = 248;
		user1.balanceAmount = 2000.0f;
		String bankName = "       Union Bank of India      ";
		ArrayList<String> errors = CheckCustomerBankDetails.validateCustomerDetails(user1, bankName);
		if (errors.isEmpty()) {
			System.out.println("Customer bank details are valid");
			OperationsOnCustomerDetails.addCustomerDetails(user1);
			OperationsOnCustomerDetails.displayCustomerDetails();
		} else {
			System.out.println("Errors\n" + errors);
		}
		assertEquals(false, errors.isEmpty());

	}
}
