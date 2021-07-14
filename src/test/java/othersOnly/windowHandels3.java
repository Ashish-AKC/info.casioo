package othersOnly;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class windowHandels3 {

	public WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=null;

		String driverPath = System.getProperty("user.dir")+"/driver/msedgedriver.exe";

		System.setProperty("webdriver.edge.driver", driverPath);
		//Initialize Edge driver
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		//Open the given URL

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Windows.html");

		//Click for new window
		driver.findElement(By.xpath("//div[@class='tabpane pullleft']//li[2]")).click();

		//Click for new tab
		//driver.findElement(By.xpath("//div[@class='tabpane pullleft']//li[3]")).click();

		Thread.sleep(1000);

		//Click button
		driver.findElement(By.xpath("//div[@id='Seperate']//button[@class='btn btn-primary']")).click();
		System.out.println("Button clicked and new window opened");

		System.out.println(driver.getTitle());


		Set<String> s =driver.getWindowHandles();

		for (String i : s) {

			String w = driver.switchTo().window(i).getTitle();

			Thread.sleep(3000);


			if(w.contains("SeleniumHQ Browser Automation")) 
			{ 
				String c = driver.switchTo().window(i).getTitle();

				driver.findElement(By.xpath("//nav[@id='navbar']//a[@class='nav-item'][5]")).click();

				Thread.sleep(3000);

				driver.close();
				
				
			}

		}
			
		Thread.sleep(5000);
		driver.close();

	}

}