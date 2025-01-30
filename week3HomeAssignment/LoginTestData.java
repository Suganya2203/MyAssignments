package week3HomeAssignment;

public class LoginTestData extends TestData
{
	
	void enterUsername()
	{
		System.out.println("Entering username in child class");
	}
	
	void enterPassword()
	{
		System.out.println("Entering password in child class");
	}

	public static void main(String[] args) {
		LoginTestData newObj= new LoginTestData();
		newObj.enterCredentials();
		newObj.navigateToHomePage();
		newObj.enterUsername();
		newObj.enterPassword();
	}

}
