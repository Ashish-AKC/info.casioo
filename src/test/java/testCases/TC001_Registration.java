package testCases;

import org.testng.annotations.Test;
import pageObjects.PageObjectRegistrationLogin;
import pageObjects.baseClass;

public class TC001_Registration extends baseClass{


	@Test
	public void Registration() throws InterruptedException {

		PageObjectRegistrationLogin reg = new PageObjectRegistrationLogin(driver);

		reg.Register();
		System.out.println("Clicked on Register button");
		Thread.sleep(2000);
		reg.myAccount();
		System.out.println("Clicked on My account button");
		Thread.sleep(2000);
		/*
		 * reg.registerationButton();
		 * System.out.println("Clicked on Create an account button");
		 * Thread.sleep(2000);
		 */
		reg.firstName();
		System.out.println("First name entered");
		Thread.sleep(500);
		reg.lastName();
		System.out.println("Last name entered");
		Thread.sleep(500);
		reg.dob();
		System.out.println("Entered date of birth");
		Thread.sleep(500);
		reg.emailId();
		System.out.println("EmailId entered");
		Thread.sleep(500);
		reg.Password();
		System.out.println("Password entered");
		Thread.sleep(500);
		reg.cPassword();
		System.out.println("Confirm Password entered");
		Thread.sleep(500);
		reg.createAccountButton();
		System.out.println("Registerd successfully");
		Thread.sleep(500);

	}

}
