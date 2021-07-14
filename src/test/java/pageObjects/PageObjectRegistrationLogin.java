package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataUtils.Xls_Reader;

public class PageObjectRegistrationLogin {

	WebDriver driver=null;

	public PageObjectRegistrationLogin(WebDriver driver) {

		this.driver = driver;
	}

	//By Account = By.xpath("//a[@title=\"My Account\"]");
	By regButton = By.xpath("//a[@title='Register']");
	By register = By.id("switcher-customer-trigger");
	By myAccount = By.xpath("//ul[@class='dropdown switcher-dropdown']/li[1]");
	By registrationButton = By.xpath("//div[@class='primary']//a[@class='action create primary']");
	By fName = By.id("firstname");
	By lName = By.id("lastname");
	By dob = By.id("dob");
	By email = By.id("email_address");
	By Password = By.id("password");
	By cPassword = By.id("password-confirmation");
	By createAccountButton = By.xpath("//div[@class='actions-toolbar']//button[@class='action submit primary']");
	By emailLogin = By.id("email");
	By passwordLogin = By.id("pass");
	By loginButton = By.id("send2");

	public void regButton() {
		
		driver.findElement(regButton).click();
		
	}
	
	
	public void Register(){

		driver.findElement(register).click();
		System.out.println("Clicked on dropdown menu");
	}

	public void myAccount(){

		driver.findElement(myAccount).click();
		System.out.println("Choose first option as 'Sign in'");
	}

	public void registerationButton(){

		driver.findElement(registrationButton).click();
	}

	public void firstName() {

		driver.findElement(fName).sendKeys(firstName);
		System.out.println("First name entered");
	}

	public void lastName() {

		driver.findElement(lName).sendKeys(lastName);
		
	}

	public void dob() {

		driver.findElement(dob).sendKeys(DateOfBirth);
	}

	public void Gender() {

		List<WebElement> gender = driver.findElements(By.id("gender"));
		System.out.println("Options available in dropdown:"+gender.size());
		
		}
	

	public void emailId() {

		driver.findElement(email).sendKeys(emailId);
		System.out.println("Email id entered");
	}

	public void Password() {

		driver.findElement(Password).sendKeys(password);
		System.out.println("Password entered");
	}

	public void cPassword() {

		driver.findElement(cPassword).sendKeys(CoPassword);
	}

	public void createAccountButton(){

		driver.findElement(createAccountButton).click();
	}

	public void username() {

		driver.findElement(emailLogin).sendKeys(username);
	}

	public void lpassword() {

		driver.findElement(passwordLogin).sendKeys(lpassword);
	}

	public void loginButton(){

		driver.findElement(loginButton).click();
		
	}

	//Get test data from excel

	Xls_Reader reader = new Xls_Reader("C:\\Users\\Admin\\Desktop\\Project\\info.casioo\\Excels\\SampleExcel.xlsx");

	String firstName = reader.getCellData("Registration", "Firstname", 2);

	String lastName = reader.getCellData("Registration", "Lastname", 2);

	String DateOfBirth = reader.getCellData("Registration", "Dob", 2);

	String Gender = reader.getCellData("Registration", "Gender", 2);

	String emailId = reader.getCellData("Registration", "Email-id", 2);

	String password = reader.getCellData("Registration", "Password", 2);

	String CoPassword = reader.getCellData("Registration", "CoPassword", 2);
	
	String username = reader.getCellData("Login", "Username", 2);
	
	String lpassword = reader.getCellData("Login", "Password", 2);
	
	
}
