package in.muthukumarip;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesterForAmountTransferDetail {

	// Test case for correct input
	@Test
	public void testCase1() {
		RecipientDetails recipient1 = new RecipientDetails();
		recipient1.name = "MUTHU KUMARI";
		recipient1.accountNumber = 9876567876987654L;
		recipient1.bankName = "Indian Bank";
		recipient1.ifscCode = "IDIB000A089";
		recipient1.TransferAmount = 1000.0f;
		boolean empty = AmountTransferDetailsValidation.validate(recipient1);
		assertEquals(true, empty); //expected,actual
	}

	// Test case for wrong input
	@Test
	public void testCase2() {
		RecipientDetails recipient2 = new RecipientDetails();
		recipient2.name = " ";
		recipient2.accountNumber = 7223456798789123213L;
		recipient2.bankName = "             Indian Bank            ";
		recipient2.ifscCode = "IDIB000A089";
		recipient2.TransferAmount = 6000.0f;
		boolean empty = AmountTransferDetailsValidation.validate(recipient2);
		assertEquals(false, empty); //expected,actual
	}
}
