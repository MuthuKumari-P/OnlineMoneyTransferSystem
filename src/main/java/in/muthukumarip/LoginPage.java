package in.muthukumarip;

public class LoginPage {
	public static boolean validateName(String name) {
		String[] arrayOfName = { "Daicy Rani", "Muthu Kumari", "Sanjana", "Abarna" };
		for (int i = 0; i < arrayOfName.length; i++) {
			String userName = arrayOfName[i];
			if (name.equals(userName)) 
			{
				return true;
			}
			else 
			{
				continue;
			}
		}	
		return false;

	}

	public static boolean validateEmail(String email)
	{
		String[] arrayOfEmailId = { "Daicy Rani", "Muthu Kumari", "Sanjana", "Abarna" };
		for (int i = 0; i < arrayOfEmailId.length; i++) {
			String userEmailId = arrayOfEmailId[i];
			if (email.equals(userEmailId)) 
			{
				return true;
			}
			else 
			{
				continue;
			}
		}	
		return false;

	}

	}
}
