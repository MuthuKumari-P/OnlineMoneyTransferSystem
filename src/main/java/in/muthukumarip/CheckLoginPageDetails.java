package in.muthukumarip;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckLoginPageDetails {

	public static ArrayList<String> validateLoginPageDetails(long mobileNumber, String password) {

		ArrayList<String> errors = new ArrayList<String>();
		// Check the mobile number
		boolean vaidMobileNumber = CustomerBankDetailValidation.mobileNumberValidation(mobileNumber);
		if (vaidMobileNumber == false) {
			errors.add("Invalid Mobile Number");
		}
		// Check the password
		boolean validPassword = CustomerBankDetailValidation.passwordValidation(password);
		if (validPassword == false) {
			errors.add("Invalid Password");
		}
		return errors;

	}

	/**
	 * This method check the login page details are correct or not.
	 * 
	 * @param mobileNumber
	 * @param password
	 * @return
	 */
	public static boolean checkLoginDetails(long mobileNumber, String password) {
		ArrayList<String> errors = CheckLoginPageDetails.validateLoginPageDetails(mobileNumber, password);
		if (errors.isEmpty()) {
			boolean exist = exists(mobileNumber, password);
			if (exist) {
				System.out.println("Login Details are valid");
			} else {
				System.out.println("Login Details are Invalid");
			}
		} else {
			System.out.println("Errors\n" + errors);
		}
		return errors.isEmpty();
	}

	/**
	 * This method have the collection of mobile numbers with password
	 * 
	 * @param mobileNumber
	 * @param password
	 * @return
	 */
	public static boolean exists(long mobileNumber, String password) {
		boolean isValid = false;
		HashMap<Long, String> add = new HashMap<Long, String>();
		// key,value
		add.put(8344793922L, "muthu@99P");
		add.put(8344793921L, "kumari@99P");
		add.put(8344793923L, "pmk@99P#");
		add.put(8344793924L, "1999Pmk.#");
		add.put(8344793925L, "0111@99P;");
		/**
		 * Check if the hash map contains mobile number or not
		 */
		if (add.containsKey(mobileNumber)) {
			String value = add.get(mobileNumber);// Get the password value from the mobile number key.
			/**
			 * Check if the hash map contains password or not with the position of mobile
			 * number
			 */
			if (value.equals(password)) {
				isValid = true;
			}
		}
		return isValid;
	}
}
