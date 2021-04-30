package in.muthukumarip;

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

class Number {
	public long atmCardNumber;
	public int atmPinNumber;

	@Override
	public String toString() {
		return "AtmCardNumber = " + atmCardNumber + "\nAtmPinNumber = " + atmPinNumber;
	}

}
class RecipientDetails
{
	public String name;
	public long accountNumber;
	public String bankName;
	public String ifscCode;
	public float TransferAmount;
}
