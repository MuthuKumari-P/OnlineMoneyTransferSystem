package in.muthukumarip;

import java.util.ArrayList;

public class CheckAtmCardDetails {
	
	public static ArrayList<String> validateAtmCardDetails(Number num) {
		/**
		 * Create a array list for storing errors list.
		 */
		ArrayList<String> errors = new ArrayList<String>();
		boolean validAtmCardNumber = ValidateAtmCardDetails.validateAtmCardNumber(num.atmCardNumber);
		if (validAtmCardNumber == false) {
			errors.add("Atm Card Number is Invalid");
		}
		boolean validAtmPinNumber = ValidateAtmCardDetails.validateAtmPinNumber(num.atmPinNumber);
		if (validAtmPinNumber == false) {
			errors.add("ATM Pin Number is Invalid");
		}
		return errors;// return the errors list.

	}

	public static boolean checkAtmCardDetails(Number num) 
	{
		//The ArrayList store the list of errors.
		ArrayList<String> errors = validateAtmCardDetails(num);
		if (errors.isEmpty()) {
			System.out.println("ATM Card details are valid");
			ValidateAtmCardDetails.addAtmCardDetails(num);
			ValidateAtmCardDetails.displayAtmCardDetails();
		} else {
			System.out.println("Errors\n" + errors);
		}
		/**
		 * if no errors found isEmpty() method returns true otherwise it returns false.
		 */
		return errors.isEmpty();
	}
}
