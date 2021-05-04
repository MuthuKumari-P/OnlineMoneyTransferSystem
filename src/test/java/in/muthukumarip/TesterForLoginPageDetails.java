package in.muthukumarip;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesterForLoginPageDetails {

	// Testcase for correct input
	@Test
	public void testCase1() {
		long mobileNumber = 8344793922L;
		String password = "muthu@99P";
		boolean valid = CheckLoginPageDetails.checkLoginDetails(mobileNumber, password);
		assertEquals(true, valid);
	}

	// Testcase for incorrect input
	@Test
	public void testCase2() {
		long mobileNumber = 9767677764L;
		String password ="437";
		boolean valid = CheckLoginPageDetails.checkLoginDetails(mobileNumber, password);
		assertEquals(false, valid);

	}

}
