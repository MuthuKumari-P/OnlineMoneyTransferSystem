package in.muthukumarip;

/**
 * This class used to declare the customer details.
 * 
 * @author muth2649
 *
 */
public class UserDetails {
	public String name;
	public long mobileNumber;
	public long accountNumber;
	public String ifscCode;
	public int password;
	public float balanceAmount;

	@Override
	public String toString() {
		return "Name = " + name + "\nMobileNumber = " + mobileNumber + "\nAccountNumber =" + accountNumber
				+ "\nIFSCcode = " + ifscCode + "\nPassword = " + password + "\nBalanceAmount =" + balanceAmount;

	}
}

/**
 * This class used to declare the ATM card details.
 * 
 * @author muth2649
 *
 */
class Number {
	public long atmCardNumber;
	public int atmPinNumber;

	@Override
	public String toString() {
		return "AtmCardNumber = " + atmCardNumber + "\nAtmPinNumber = " + atmPinNumber;
	}

}

/**
 * This class used to declare the recipient bank details
 * 
 * @author muth2649
 *
 */
class RecipientDetails {
	public String name;
	public long accountNumber;
	public String bankName;
	public String ifscCode;
	public float TransferAmount;
}
