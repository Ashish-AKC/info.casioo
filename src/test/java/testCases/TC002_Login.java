/*
Test Steps
1 - First navigate to respected URL
2 - Click on the My Account
3 - Choose option as My Account
4 - Enter email id
5 - Enter password
6 - Click on the Sign-in button
			***Account information page should be display***
*/

package testCases;

import org.testng.annotations.Test;
import pageObjects.PageObjectRegistrationLogin;
import pageObjects.baseClass;

public class TC002_Login extends baseClass{

	@Test
	public void Login() throws InterruptedException {

		//Create object
		PageObjectRegistrationLogin reg = new PageObjectRegistrationLogin(driver);

		reg.regButton();
		
		//reg.Register();
		
		Thread.sleep(800);
		reg.myAccount();
		
		//Thread.sleep(500);
		//driver.navigate().refresh();
		reg.username();
		
		Thread.sleep(500);
		reg.lpassword();
		
		Thread.sleep(500);
		reg.loginButton();
		driver.navigate().back();
		/*
		 * String statucVerify = reg.loginButton(); String message =
		 * "THE ACCOUNT SIGN-IN WAS INCORRECT OR YOUR ACCOUNT IS DISABLED TEMPORARILY. PLEASE WAIT AND TRY AGAIN LATER."
		 * ; if(statucVerify == message) {
		 * 
		 * 
		 * }else {
		 * 
		 * 
		 * }
		 */
		
		System.out.println("Login Successfully");
		Thread.sleep(5000);

	}

}
