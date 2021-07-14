package pageCassio;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTestRegistrationLogin {

	private static WebDriver driver = null;
	public static String url = "http://casioo.info/index123.php";
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

		//Create object
		PageObjectRegistrationLogin reg = new PageObjectRegistrationLogin(driver);

		reg.Account();
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
	}

	@Test(priority=1)
	public void Login() throws InterruptedException {

		//Create object
		PageObjectRegistrationLogin reg = new PageObjectRegistrationLogin(driver);

		reg.Account();
		System.out.println("Clicked on My account button");
		Thread.sleep(2000);
		reg.myAccount();
		System.out.println("Choose first option as 'My Account'");
		Thread.sleep(2000);
		reg.emailLogin();
		System.out.println("Email id entered");
		Thread.sleep(2000);
		reg.PasswordLogin();
		System.out.println("Password entered");
		Thread.sleep(2000);
		reg.loginButton();
		System.out.println("Login Successfully");

	}


	@AfterMethod
	public void tearDown() throws InterruptedException {

		Thread.sleep(3000);
		driver.close();
	}


}
