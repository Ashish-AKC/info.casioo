package Feature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass {

	WebDriver driver = null;
	public String ActualTitle = "Casio";
	public String title;
	String url1 = "casio-mea.com/";

	@Test

	public void setup() {


		String driverPath =	System.getProperty("user.dir")+"/driver/msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", driverPath);
		driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get(url1);
		title = driver.getTitle();
		System.out.println("Page title is :- "+title);

		try { 
			Assert.assertEquals(title, ActualTitle);
			System.out.println("Title is equal as expected"); 
			driver.close();
		}catch (AssertionError a) {
			a.printStackTrace();
			driver.close();

		}

	}
}
