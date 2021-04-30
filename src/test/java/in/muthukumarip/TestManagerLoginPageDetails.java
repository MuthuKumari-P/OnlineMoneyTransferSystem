package in.muthukumarip;

import java.util.ArrayList;

public class TestManagerLoginPageDetails {

	public static void main(String[] args) {
		long mobileNumber = 9767456764L;
		int passWord = 4367;
		ArrayList<String> errors = CheckLoginPageDetails.validateLoginPagedDetails(mobileNumber, passWord);
		if (errors.isEmpty()) {
			System.out.println("Login Details are valid");
		} else {
			System.out.println("Errors\n" + errors);

		}

	}
}
