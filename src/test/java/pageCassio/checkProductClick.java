package pageCassio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class checkProductClick {

	public static WebDriver driver = null;
	public static String url = "http://casioo.info/index1234.php";
	public static String driverPath = System.getProperty("user.dir")+"/driver/msedgedriver.exe";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", driverPath);
		driver = new EdgeDriver();

		driver.get(url);
		System.out.println("Open browser with URL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("search")).sendKeys("Watch");//Enter text into search bar
		Thread.sleep(3000);//Add wait for 3 sec
		driver.findElement(By.xpath("//div[@class='actions']//button[@class='action search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt=\"Edifice Men's Black Watch\"]")).click();//Click to Edifice watch
		System.out.println("Selected a watch from the search result");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='action toggle trigger']")).sendKeys(Keys.RETURN);
		//Select quantity of 4 from the drop down
		Thread.sleep(2000);
		driver.findElement(By.id("product-addtocart-button")).click();
		System.out.println("Clicked on all to cart button");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role='alert']//a")).click();
		System.out.println("Clicked on cart button");
		
		



	}

}
