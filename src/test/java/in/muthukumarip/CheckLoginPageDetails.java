package in.muthukumarip;

import java.util.ArrayList;

public class CheckLoginPageDetails {
	public static ArrayList<String> validateLoginPagedDetails(long mobileNumber, int passWord) {
		ArrayList<String> errors = new ArrayList<String>();
		boolean mobileNumberValidation = CustomerBankDetailValidation.mobileNumberValidation(mobileNumber);
		if (mobileNumberValidation == false) {
			errors.add("Invalid Mobile Number");
		}
		boolean passWordValidation = CustomerBankDetailValidation.passWordValidation(passWord);
		if (passWordValidation == false) {
			errors.add("Invalid Password");
		}
		return errors;

	}
}
