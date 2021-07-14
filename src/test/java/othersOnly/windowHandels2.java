package othersOnly;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class windowHandels2 {



	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=null;

		String driverPath = System.getProperty("user.dir")+"/driver/msedgedriver.exe";

		System.setProperty("webdriver.edge.driver", driverPath);
		//Initialize Edge driver
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		//Open the given URL

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://stqatools.com/demo/Windows.php");

		// Current window location store into Parent Window string.
		String parentWindow = driver.getWindowHandle();

		// Click some link that opens a new window.
		driver.findElement(By.xpath("//button[contains(text(),' Click to open new Window ')]")).click();
			
		
		// Store newly open window into Child Window using getWindowHandles.
		for (String childWindow : driver.getWindowHandles()) {
			
			if(!childWindow.equals(parentWindow)) {
			// Switch to Newly open window using switchTo().
			driver.switchTo().window(childWindow);
			System.out.println(driver.getCurrentUrl());
			System.out.println("Title of the child window :"+driver.getTitle());
			// Click the new window button from opened child window.
			}else
				System.out.println("Window not switched");
				//driver.quit();


		}
		

	}

}