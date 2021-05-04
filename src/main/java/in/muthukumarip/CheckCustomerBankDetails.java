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
		boolean passwordValid = CustomerBankDetailValidation.passwordValidation(user1.password);
		if (passwordValid == false) {
			errors.add("password is Invalid");

		}
		return errors;// returns the errors list.
	}

	/**
	 * This method check the bank name and user details are valid.
	 * 
	 * @param user
	 * @param bankName
	 * @return
	 */
	public static boolean checkCustomerDetail(UserDetails user, String bankName) {
		ArrayList<String> errors = validateCustomerDetails(user, bankName);
		if (errors.isEmpty()) {
			System.out.println("Customer bank details are valid");
			OperationsOnCustomerDetails.addCustomerDetails(user);
			OperationsOnCustomerDetails.displayCustomerDetails();
		} else {
			System.out.println("Customer bank details are invalid\nErrors\n" + errors);
		}
		/**
		 * if no errors found isEmpty() method returns true otherwise it returns false.
		 */
		return errors.isEmpty();
	}

}
