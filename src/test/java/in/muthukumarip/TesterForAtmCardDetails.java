package in.muthukumarip;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TesterForAtmCardDetails {

	@Test
	public void testcase1() {
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
		assertEquals(true, errors.isEmpty());
	}

	@Test
	public void testcase2() {
		Number num = new Number();
		num.atmCardNumber = 87654545676543L;
		num.atmPinNumber = 768;
		// AtmCardDetails card=new AtmCardDetails();

		ArrayList<String> errors = CheckAtmCardDetails.validateAtmCardDetails(num);
		if (errors.isEmpty()) {
			System.out.println("ATM Card details are valid");
			ValidateAtmCardDetails.addAtmCardDetails(num);
			ValidateAtmCardDetails.displayAtmCardDetails();
		} else {
			System.out.println("Errors\n" + errors);
		}
		assertEquals(false, errors.isEmpty());
	}

}
