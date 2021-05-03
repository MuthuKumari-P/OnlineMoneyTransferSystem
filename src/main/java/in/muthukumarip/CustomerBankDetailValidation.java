package in.muthukumarip;

import java.util.ArrayList;

public class CustomerBankDetailValidation {
	/**
	 * This class validate all the customer bank details.
	 * 
	 * @param bankName
	 * @return
	 */
	public static int bankNameCaseValidation(String bankName) {
		/**
		 * This method used to ignore the cases of bank name and return the integer
		 * value of all the bank name
		 */
		int bankNameValue = 0;// set default bank name value is 0
		if (bankName.trim().equalsIgnoreCase("Indian Bank")) {
			bankNameValue = 1;// Indian Bank name value is 1
		}
		if (bankName.trim().equalsIgnoreCase("Indian Overseas Bank")) {
			bankNameValue = 2;// Indian Overseas bank name value is 2
		}
		if (bankName.trim().equalsIgnoreCase("Union Bank of India")) {
			bankNameValue = 3;// Union bank of India bank name value is 3
		}
		return bankNameValue;// return the integer value of the bank name
	}

	/**
	 * This method used to validate the name of the customer
	 * 
	 * @param name
	 * @return
	 */
	public static boolean nameValidation(String name) {
		boolean isValid = true;// set isValid variable is true
		// Check the customer name is equal to null or is an empty space
		if (name == null || name.trim().equals("")) {
			isValid = false;// if the condition is false set isValid variable is false
		}
		return isValid;// return the isValid variable
	}

	/**
	 * This method used to validate the customer mobile number
	 * 
	 * @param mobileNumber
	 * @return
	 */
	public static boolean mobileNumberValidation(long mobileNumber) {
		// Convert long to String
		String mobileNumberString = String.valueOf(mobileNumber);
		boolean isValid = true;
		// Check mobile number length not equal to 10
		if (mobileNumberString.length() != 10) {
			isValid = false;
		}
		return isValid;
	}

	/**
	 * This method used to validate the customer account number
	 * 
	 * @param accountNumber
	 * @param bankName
	 * @return
	 */
	public static boolean accountNumberValidation(long accountNumber, String bankName) {
		// convert long to String
		String accountNumberString = String.valueOf(accountNumber);
		boolean isValid = false;
		int bankNameValue = bankNameCaseValidation(bankName);
		/**
		 * Validate the account number with the bank name using switch case
		 */
		switch (bankNameValue) {
		// case is 0 not a valid bank name
		case 0: {
			isValid = false;
			break;
		}
		case 1: {
			/**
			 * Indian bank account number length is between 9 to 17 and the first number
			 * should not start with 0
			 */
			if ((accountNumberString.charAt(0) != '0') && (accountNumberString.length() >= 9)
					&& (accountNumberString.length() <= 17)) {

				isValid = true;
				break;
			}
		}
		case 2: {
			/**
			 * Indian Overseas bank account number length is equal to 15 and the first
			 * number should not start with 0
			 */
			if ((accountNumberString.length() == 15) && (accountNumberString.charAt(0) != '0')) {
				isValid = true;
				break;
			}

		}
		case 3: {
			/**
			 * Indian Overseas bank account number length is equal to 13 and the first
			 * number should not start with 0
			 */
			if ((accountNumberString.length() == 13) && (accountNumberString.charAt(0) != '0')) {
				isValid = true;
				break;
			}
		}
		}
		// System.out.println(isValid);
		return isValid;
	}

	/**
	 * This method used to validate the IFSC code Each bank have the different IFSC
	 * code
	 * 
	 * @param ifscCode
	 * @param bankName
	 * @return
	 */
	public static boolean ifscCodeValidation(String ifscCode, String bankName) {

		boolean isValid = false;
		int bankNameValue = bankNameCaseValidation(bankName);
		switch (bankNameValue) {
		case 0: {
			isValid = false;
			break;
		}
		case 1: {
			if (ifscCode.trim().equals("IDIB000A089")) {
				isValid = true;
				break;
			}
		}
		case 2: {
			if (ifscCode.trim().equals("IOBA0001307")) {
				isValid = true;
				break;
			}

		}
		case 3: {
			if (ifscCode.trim().equals("UBIN0539571")) {
				isValid = true;
				break;
			}
		}

		}
		return isValid;
	}

	public static boolean passWordValidation(int passWord) {
		String passWordString = String.valueOf(passWord);
		boolean isValid = false;
		if (passWordString.length() == 4) {
			isValid = true;
		}
		return isValid;

	}

	/**
	 * This method used to validate the bank name
	 * 
	 * @param bankName
	 * @return
	 */
	public static boolean bankNameValidation(String bankName) {
		ArrayList<String> bank = new ArrayList<String>();
		bank.add("Indian Bank");
		bank.add("Indian Overseas Bank");
		bank.add("Union Bank of India");
		boolean isValid = false;
		String trimBankName = bankName.trim();
		//System.out.println(trimBankName);
		boolean exists = bank.contains(trimBankName);
		if (exists) {
			isValid = true;
		}
		return isValid;
	}

	// This method used to check the balance amount with withdraw amount
	public static boolean checkAmount(float amount) {
		float balanceAmount = 2000.0f;
		boolean isValid = true;
		if (amount > balanceAmount) {
			isValid = false;
		}
		return isValid;
	}
}
