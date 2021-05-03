package in.muthukumarip;

import java.util.ArrayList;

public class CheckCustomerBankDetails {

	public static ArrayList<String> validateCustomerDetails(UserDetails user1, String bankName) {
		/**
		 * Create a Array list and store the errors of the Customer bank details.
		 */
		ArrayList<String> errors = new ArrayList<String>();
		boolean bankNameValid = CustomerBankDetailValidation.bankNameValidation(bankName);
		if (bankNameValid == false) {
			errors.add("Bank Name is Invalid");
		}
		boolean nameValid = CustomerBankDetailValidation.nameValidation(user1.name);
		if (nameValid == false) {
			errors.add("Name is Invalid");
		}
		boolean mobileNumberValid = CustomerBankDetailValidation.mobileNumberValidation(user1.mobileNumber);
		if (mobileNumberValid == false) {
			errors.add("Mobile Number is Invalid");
		}

		boolean accountNumberValid = CustomerBankDetailValidation.accountNumberValidation(user1.accountNumber,
				bankName);
		if (accountNumberValid == false) {
			errors.add("Account Number is Invalid");
		}
		boolean ifscCodeValid = CustomerBankDetailValidation.ifscCodeValidation(user1.ifscCode, bankName);
		if (ifscCodeValid == false) {
			errors.add("IFSC code is Invalid");
		}
		boolean passWordValid = CustomerBankDetailValidation.passWordValidation(user1.password);
		if (passWordValid == false) {
			errors.add("password is Invalid");

		}
		return errors;// returns the errors list.
	}

}
