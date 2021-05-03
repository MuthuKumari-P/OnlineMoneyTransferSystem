package in.muthukumarip;

import java.util.ArrayList;

public class AmountTransferDetailsValidation {
	/**
	 * Check the recipient bank details for amount transfer
	 * 
	 * @param recipient
	 * @return
	 */
	public static ArrayList<String> validateAmountTransferDetails(RecipientDetails recipient) {
		ArrayList<String> errors = new ArrayList<String>(); // Create a Array List for storing errors.
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
		return errors;// return list of errors
	}
}
