package in.muthukumarip;

import java.util.ArrayList;

public class TestManagerCustomerBankDetails {
	static String bankName = "Union Bank of India";// valid Bank Name
	// static string bankName="Canara bank";//Invalid Bank Name
	public static void main(String[] args) {
		UserDetails user1 = new UserDetails();
		user1.name = "P.Muthu Kumari";
		user1.mobileNumber = 7867898765L;
		user1.accountNumber = 6756789876787L;
		user1.ifscCode = "UBIN0539571";
		user1.password = 2458;
		user1.balanceAmount = 2000.0f;
		ArrayList<String> errors=CheckCustomerBankDetails.validateCustomerDetails(user1,bankName);
		if(errors.isEmpty()) {
			System.out.println("Customer bank details are valid");
			OperationsOnCustomerDetails.addCustomerDetails(user1);
			OperationsOnCustomerDetails.displayCustomerDetails();
		}
		else { 
			System.out.println("Errors\n" + errors);
		}
	}
}
