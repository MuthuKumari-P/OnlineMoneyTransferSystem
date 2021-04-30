package in.muthukumarip;

import java.util.ArrayList;

public class TestManagerAmountTransferDetails {

	public static void main(String[] args) {
		RecipientDetails recipient = new RecipientDetails();
		recipient.name = "MUTHU KUMARI";
		recipient.accountNumber = 907678765456L;
		recipient.bankName = "Indian Bank";
		recipient.ifscCode = "IDIB000A089";
		recipient.TransferAmount = 1000.0f;
		ArrayList<String> errors = AmountTransferDetailsValidation.validateAmountTransferDetails(recipient);
		if (errors.isEmpty()) {
			System.out.println("Recipient Details are valid");
		} else {
			System.out.println("Errors\n" + errors);
		}
	}
}
