package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dataUtils.Xls_Reader;
import pageObjects.PageObjectRegistrationLogin;

public class PageTestRegistrationLogin{

	private static WebDriver driver = null;
	public static String url = "http://casioo.info/index1234.php";
	public static String driverPath = System.getProperty("user.dir")+"/driver/msedgedriver.exe";


	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.edge.driver", driverPath);
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@Test(priority=0)
	public void Registration() throws InterruptedException {

		PageObjectRegistrationLogin reg = new PageObjectRegistrationLogin(driver);

		reg.Register();
		System.out.println("Clicked on My account button");
		Thread.sleep(2000);
		reg.myAccount();
		System.out.println("Clicked on My account button");
		Thread.sleep(2000);
		reg.registerationButton();
		System.out.println("Clicked on Create an account button");
		Thread.sleep(2000);
		reg.firstName();
		System.out.println("First name entered");
		Thread.sleep(500);
		reg.lastName();
		System.out.println("Last name entered");
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

		//Add below data fetching from Excel file

		Xls_Reader reader = new Xls_Reader("C:\\Users\\Admin\\eclipse-workspace\\Ashish\\info.casioo\\src\\test\\java\\excelTestData\\SampleExcel.xlsx");

		String firstName = reader.getCellData("Registration", "Firstname", 2);
		System.out.println(firstName);

		String lastName = reader.getCellData("Registration", "Lastname", 2);
		System.out.println(lastName);

		String emailId = reader.getCellData("Registration", "Email-id", 2);
		System.out.println(emailId);

		String password = reader.getCellData("Registration", "Password", 2);
		System.out.println(password);

		String CoPassword = reader.getCellData("Registration", "CoPassword", 2);
		System.out.println(CoPassword);


	}



}
