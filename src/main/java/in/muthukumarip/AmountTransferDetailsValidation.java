package in.muthukumarip;

import java.util.ArrayList;

public class AmountTransferDetailsValidation {
	
	/**
	 * Check the recipient bank details for amount transfer
	 * @param recipient
	 * @return
	 */
	public static boolean validate(RecipientDetails recipient) {
		boolean isValid = false;
		ArrayList<String> errors = validateAmountTransferDetails(recipient);
		if (errors.isEmpty()) {
			System.out.println("Recipient Details are valid");
			System.out.println("You have the Enough amount in your bank account");
			isValid = true;
		} else {
			System.out.println("Errors\n" + errors);
			isValid = false;
		}
		return isValid;
	}

	public static ArrayList<String> validateAmountTransferDetails(RecipientDetails recipient) {
		 // Create a Array List for storing errors.
		ArrayList<String> errors = new ArrayList<String>();
		boolean validName = CustomerBankDetailValidation.nameValidation(recipient.name);
		if (validName == false) {
			errors.add("Name is Invalid");
		}
		boolean validBankName = CustomerBankDetailValidation.bankNameValidation(recipient.bankName);
		if (validBankName == false) {
			errors.add("Bank Name is Invalid");
		}
		boolean validIfscCode = CustomerBankDetailValidation.ifscCodeValidation(recipient.ifscCode, recipient.bankName);
		if (validIfscCode == false) {
			errors.add("IFSC code is Invalid");
		}
		boolean validAccountNumber = CustomerBankDetailValidation.accountNumberValidation(recipient.accountNumber,
				recipient.bankName);
		if (validAccountNumber == false) {
			errors.add("Account Number Invalid");
		}
		boolean validAmount = CustomerBankDetailValidation.checkAmount(recipient.TransferAmount);
		if (validAmount == false) {
			errors.add("You Doesn't have an Enough Amount");

		}
		return errors;// return the list of errors
	}
}
