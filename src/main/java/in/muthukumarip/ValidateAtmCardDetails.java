package in.muthukumarip;

import java.util.ArrayList;

public class ValidateAtmCardDetails {

	// This method validate the ATM card Number
	public static boolean validateAtmCardNumber(long atmCardNumber) {
		boolean inValid = true;
		String atmCardNumberString = String.valueOf(atmCardNumber);
		/**
		 * ATM card number length should equal to 16 and the first number should not 0
		 */
		if (atmCardNumberString.length() != 16 || atmCardNumberString.charAt(0) == 0) {
			inValid = false;
		}
		return inValid;
	}

	//This method validate the ATM card pin number
	public static boolean validateAtmPinNumber(int atmPinNumber) {
		boolean inValid = true;
		String atmPinNumberString = String.valueOf(atmPinNumber);
		// ATM card pin number length should equal to 4
		if (atmPinNumberString.length() != 4) {
			inValid = false;
		}
		return inValid;
	}

	static ArrayList<Number> atmCard = new ArrayList<Number>();

	// This method used to add the ATM card details
	public static void addAtmCardDetails(Number num) {
		atmCard.add(num);
	}

	// This method display the ATM card Details
	public static void displayAtmCardDetails() {
		for (Number atmCardDetails : atmCard) {
			System.out.println(atmCardDetails);
			System.out.println("-----------------------------------");
		}
	}
}
