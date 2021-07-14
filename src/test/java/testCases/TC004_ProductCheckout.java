/*
Steps:-
1 - Login with registered login credentials.
2 - Click on the My Cart button. (Product already added on Cart)
3 - Click to "Proceed To Checkout" button.
4 - 



*/
package testCases;

import org.testng.annotations.Test;
import pageObjects.PageObjectProductCheckout;
import pageObjects.PageObjectRegistrationLogin;
import pageObjects.baseClass;

public class TC004_ProductCheckout extends baseClass {


	@Test

	public void checkout() throws InterruptedException {

		PageObjectRegistrationLogin reg = new PageObjectRegistrationLogin(driver);

		reg.Register();
		System.out.println("Clicked on My account button");
		Thread.sleep(800);
		reg.myAccount(); 
		System.out.println("Choose first option as 'My Account'");
		reg.username();
		System.out.println("Email id entered");
		reg.lpassword();
		System.out.println("Password entered");
		reg.loginButton();
		System.out.println("Login Successfully");
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		PageObjectProductCheckout check = new PageObjectProductCheckout(driver);
		check.myCart();
		System.out.println("Clicked on my cart");
		Thread.sleep(1000);
		check.checkoutButton();
		System.out.println("Clicked on checkout button");
		Thread.sleep(3000);
		check.ship();
		System.out.println("Shippment method selected");
		Thread.sleep(1000);
		check.nextButton();
		System.out.println("Clicked on next button");
		Thread.sleep(3000);
		check.paymentMod();
		System.out.println("Payment mod select as Telr Payment");
		Thread.sleep(1500);
		check.continueCheckout();
		System.out.println("Product chechout successfully");
		Thread.sleep(1000);

	}


}
