package in.muthukumarip;

import java.util.ArrayList;

public class OperationsOnCustomerDetails {
	static ArrayList<UserDetails> customerDetails = new ArrayList<UserDetails>();

	// This method used to add the customer details
	public static void addCustomerDetails(UserDetails user) {
		customerDetails.add(user);
	}

	// This method used to display the customer bank details
	public static void displayCustomerDetails() {
		for (UserDetails customerDetail : customerDetails) {
			System.out.println(customerDetail);
			System.out.println("-----------------*****-----------------");
		}
	}
}
