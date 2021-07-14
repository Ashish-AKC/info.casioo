package othersOnly;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterNew {

	static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {

		String driverPath = System.getProperty("user.dir")+"/driver/msedgedriver.exe";

		System.setProperty("webdriver.edge.driver", driverPath);
		//Initialize Edge driver
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		//Open the given URL

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Set website URL, want to open
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		
		
		
		
		
		
		
		

		WebElement firstName = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@placeholder='First Name']"));

		firstName.isEnabled();

		firstName.sendKeys("Ashish");

		WebElement lastName = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@placeholder='Last Name']"));

		lastName.isEnabled();

		lastName.sendKeys("Kumar");
		
		//Add address
		driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea")).sendKeys("RST Tower Bangalore");
		
		//Email id enter
		driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@type='email']")).sendKeys("tester.2020demo@gmail.com");
		
		//Mobile number enter
		driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@type='tel']")).sendKeys("3698521470");
		
		//Radio button select male option
		driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@type='radio' and @value='Male' ]")).click();
		
		//Selected two checkbox
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		
		//Perform Multiple selection for language
		
		WebElement select1 = driver.findElement(By.xpath("//div[@style='display: none;']//li[8]/a['English']"));
		
		select1.click();
		
		WebElement select2 = driver.findElement(By.xpath("//div[@style='display: none;']//li[12]/a['French']"));
		
				
		//Choose skill from the dropdown
		Select skill = new Select(driver.findElement(By.id("Skills")));
		
		skill.selectByValue("Javascript");
		
		


	}

}
