package in.muthukumarip;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TesterForLoginPageDetails {

	@Test
	public void testCase1() {
		long mobileNumber = 9767456764L;
		int passWord = 4367;
		ArrayList<String> errors = CheckLoginPageDetails.validateLoginPagedDetails(mobileNumber, passWord);
		if (errors.isEmpty()) {
			System.out.println("Login Details are valid");
		} else {
			System.out.println("Errors\n" + errors);

		}
		assertEquals(true, errors.isEmpty());
	}

	@Test
	public void testCase2() {
		long mobileNumber = 9767677764L;
		int passWord = 437;
		ArrayList<String> errors = CheckLoginPageDetails.validateLoginPagedDetails(mobileNumber, passWord);
		if (errors.isEmpty()) {
			System.out.println("Login Details are valid");
		} else {
			System.out.println("Errors\n" + errors);

		}
		assertEquals(false, errors.isEmpty());
	}

}
