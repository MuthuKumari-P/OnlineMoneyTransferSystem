package in.muthukumarip;

import java.util.ArrayList;

public class TestManagerAtmCardDetails {

	public static void main(String[] args) {
		Number num = new Number();
		num.atmCardNumber = 8765456745676543L;
		num.atmPinNumber = 7678;
		// AtmCardDetails card=new AtmCardDetails();

		ArrayList<String> errors = CheckAtmCardDetails.validateAtmCardDetails(num);
		if (errors.isEmpty()) {
			System.out.println("ATM Card details are valid");
			ValidateAtmCardDetails.addAtmCardDetails(num);
			ValidateAtmCardDetails.displayAtmCardDetails();
		} else {
			System.out.println("Errors\n" + errors);
		}

	}

}
