package in.muthukumarip;

import java.util.ArrayList;

public class OperationsOnCustomerDetails {
	static ArrayList<UserDetails> customer = new ArrayList<UserDetails>();

	// This method used to add the customer details
	public static void addCustomerDetails(UserDetails user) {
		customer.add(user);
	}

	// This method used to display the customer bank details
	public static void displayCustomerDetails() {
		for (UserDetails customerDetails : customer) {
			System.out.println(customerDetails);
			System.out.println("-----------------------------------");
		}
	}
}
