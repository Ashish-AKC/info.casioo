package pageCassio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectRegistrationLogin {

	WebDriver driver=null;
	public static String fname = "Reshama";
	public static String lname = "Khatoon";
	public static String emailAddress = "Reshama@gmail.com";
	public static String pwd = "Tester@123";
	public static String cpwd = "Tester@123";


	public PageObjectRegistrationLogin(WebDriver driver) {

		this.driver = driver;
	}

	By Account = By.xpath("//a[@title=\"My Account\"]");
	By myAccount = By.xpath("//ul[@class=\"dropdown switcher-dropdown\"]/li[3]");
	By registrationButton = By.xpath("//div[@class='primary']//a[@class='action create primary']");
	By firstName = By.id("firstname");
	By lastName = By.id("lastname");
	By email = By.id("email_address");
	By password = By.id("password");
	By cPassword = By.id("password-confirmation");
	By createAccountButton = By.xpath("//div[@class='actions-toolbar']//button[@class='action submit primary']");
	By emailLogin = By.id("email");
	By passwordLogin = By.id("pass");
	By loginButton = By.xpath("//div[@class='primary']//button[@class='action login primary']");


	public void Account(){

		driver.findElement(Account).click();
	}

	public void myAccount(){

		driver.findElement(myAccount).click();
	}

	public void registerationButton(){

		driver.findElement(registrationButton).click();
	}

	public void firstName() {

		driver.findElement(firstName).sendKeys(fname);
	}

	public void lastName() {

		driver.findElement(lastName).sendKeys(lname);
	}

	public void emailId() {

		driver.findElement(email).sendKeys(emailAddress);
	}

	public void Password() {

		driver.findElement(password).sendKeys(pwd);
	}

	public void cPassword() {

		driver.findElement(cPassword).sendKeys(cpwd);
	}

	public void createAccountButton(){

		driver.findElement(createAccountButton).click();
	}

	public void emailLogin() {

		driver.findElement(emailLogin).sendKeys(emailAddress);
	}

	public void PasswordLogin() {

		driver.findElement(passwordLogin).sendKeys(pwd);
	}

	public void loginButton(){

		driver.findElement(loginButton).click();
	}


}
