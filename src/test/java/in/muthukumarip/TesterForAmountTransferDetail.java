package in.muthukumarip;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TesterForAmountTransferDetail {
	public static boolean  validate(RecipientDetails recipient) {
	boolean isValid=false; 
	ArrayList<String> errors = AmountTransferDetailsValidation.validateAmountTransferDetails(recipient);
	if (errors.isEmpty()) {
		System.out.println("Recipient Details are valid");
		isValid=true;
	} else {
		System.out.println("Errors\n" + errors);
		isValid=false;
	}
	return isValid;
	}
	@Test
	public void testCase1() {
		RecipientDetails recipient = new RecipientDetails();
		recipient.name = "MUTHU KUMARI";
		recipient.accountNumber = 9876567876987654L;
		recipient.bankName = "Indian Bank";
		recipient.ifscCode = "IDIB000A089";
		recipient.TransferAmount = 1000.0f;
		boolean empty=validate(recipient);
		assertEquals(true,empty);
	}
	@Test
	public void testCase2() {
		RecipientDetails recipient = new RecipientDetails();
		recipient.name = " ";
		recipient.accountNumber =7223456798789123213L;
		recipient.bankName = "             Indian Bank            ";
		recipient.ifscCode = "IDIB000A089";
		recipient.TransferAmount = 6000.0f;
		ArrayList<String> errors = AmountTransferDetailsValidation.validateAmountTransferDetails(recipient);
		if (errors.isEmpty()) {
			System.out.println("Recipient Details are valid");
		} else {
			System.out.println("Errors\n" + errors);
		}
		assertEquals(false,errors.isEmpty());
	}

}
