package in.muthukumarip;

import java.util.ArrayList;

public class OperationsOnCustomerDetails {
	static ArrayList<UserDetails> customer=new ArrayList<UserDetails>();
	public static void addCustomerDetails(UserDetails user)
	{
		customer.add(user);
	}
	public static void displayCustomerDetails()
	{
		for(UserDetails customerDetails:customer)
		{
			System.out.println(customerDetails);
			System.out.println("-----------------------------------");
		}
	}
}
