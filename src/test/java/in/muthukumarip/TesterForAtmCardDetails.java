package in.muthukumarip;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesterForAtmCardDetails {

	// Test case with correct input
	@Test
	public void testCase1() {
		Number num1 = new Number();
		num1.atmCardNumber = 8765456745676543L;
		num1.atmPinNumber = 7678;
		boolean valid=CheckAtmCardDetails.checkAtmCardDetails(num1);
		assertEquals(true, valid);
	}

	// Test case for wrong input
	@Test
	public void testCase2() {
		Number num2 = new Number();
		num2.atmCardNumber = 87654545676543L;
		num2.atmPinNumber = 768;
		boolean valid=CheckAtmCardDetails.checkAtmCardDetails(num2);
		assertEquals(false, valid);
	}

}
