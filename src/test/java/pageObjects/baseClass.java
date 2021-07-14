package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseClass {

	public static WebDriver driver = null;
	public static String url = "https://casio-mea.com/";
	//Set path for driver from the current directory
	public static String driverPath = System.getProperty("user.dir")+"/driver/msedgedriver.exe";

	@BeforeClass
	public void setUp() {

		System.setProperty("webdriver.edge.driver", driverPath);
		//Initialize Edge driver
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		//Open the given URL
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterClass
	public void tearDown() throws InterruptedException {

		Thread.sleep(3000);
		driver.close();
	}

	
}
