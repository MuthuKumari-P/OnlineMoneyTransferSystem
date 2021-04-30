package in.muthukumarip;

import java.util.ArrayList;

public class ValidateAtmCardDetails {

	public static boolean validateAtmCardNumber(long atmCardNumber) {
		boolean inValid = true;
		String atmCardNumberString = String.valueOf(atmCardNumber);
		if (atmCardNumberString.length() != 16 || atmCardNumberString.charAt(0) == 0) {
			inValid = false;
		}
		return inValid;
	}

	public static boolean validateAtmPinNumber(int atmPinNumber) {
		boolean inValid = true;
		String atmPinNumberString = String.valueOf(atmPinNumber);
		if (atmPinNumberString.length() != 4) {
			inValid = false;
		}
		return inValid;
	}

	static ArrayList<Number> atmCard = new ArrayList<Number>();

	public static void addAtmCardDetails(Number num) {
		atmCard.add(num);

	}

	public static void displayAtmCardDetails() {
		for (Number atmCardDetails : atmCard) {
			System.out.println(atmCardDetails);
			System.out.println("-----------------------------------");
		}
	}
}
