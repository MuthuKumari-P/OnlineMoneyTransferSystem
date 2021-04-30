package in.muthukumarip;

import java.util.ArrayList;

public class CustomerBankDetailValidation {
	public static int bankNameCaseValidation(String bankName) {
		int bankNameValue = 0;
		if (bankName.trim().equalsIgnoreCase("Indian Bank")) {
			bankNameValue = 1;
		}
		if (bankName.trim().equalsIgnoreCase("Indian Overseas Bank")) {
			bankNameValue = 2;
		}
		if (bankName.trim().equalsIgnoreCase("Union Bank of India")) {
			bankNameValue = 3;
		}
		return bankNameValue;
	}

	public static boolean nameValidation(String name) {
		boolean isValid = true;
		if (name == null || name.trim().equals("")) {
			isValid = false;
		}
		return isValid;
	}

	public static boolean mobileNumberValidation(long mobileNumber) {
		String mobileNumberString = String.valueOf(mobileNumber);

		boolean isValid = true;
		if (mobileNumberString.length() != 10) {
			isValid = false;
		}
		return isValid;
	}

	public static boolean accountNumberValidation(long accountNumber, String bankName) {
		String accountNumberString = String.valueOf(accountNumber);
		boolean isValid = false;
		int bankNameValue = bankNameCaseValidation(bankName);
		switch (bankNameValue) {
		case 0: {
			isValid = false;
			break;
		}
		case 1: {
			if ((accountNumberString.charAt(0) != '0') && (accountNumberString.length() >= 9)
					&& (accountNumberString.length() <= 17)) {

				isValid = true;
				break;
			}
		}
		case 2: {
			if ((accountNumberString.length() == 15) && (accountNumberString.charAt(0) != '0')) {
				isValid = true;
				break;
			}

		}
		case 3: {
			if ((accountNumberString.length() == 13) && (accountNumberString.charAt(0) != '0')) {
				isValid = true;
				break;
			}
		}
		}
		//System.out.println(isValid);
		return isValid;
	}

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

	public static boolean bankNameValidation(String bankName) {
		ArrayList<String> bank = new ArrayList<String>();
		bank.add("Indian Bank");
		bank.add("Indian Overseas Bank");
		bank.add("Union Bank of India");
		boolean isValid = false;
		String trimBankName=bankName.trim();
		System.out.println(trimBankName);
		boolean exists = bank.contains(trimBankName);
		if (exists) {
			isValid = true;
		}
		return isValid;
	}

	public static boolean checkAmount(float amount) {
		float balanceAmount = 2000.0f;
		boolean isValid = true;
		if (amount > balanceAmount) {
			isValid = false;
		}
		return isValid;
	}
}
