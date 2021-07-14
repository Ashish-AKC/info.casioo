package Feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import dataUtils.Xls_Reader;


public class test {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		Xls_Reader read = new Xls_Reader("C:\\Users\\Admin\\git\\info.cassio\\info.casioo\\Excels\\Address.xlsx");
		String uname = read.getCellData("Login", "Username", 6);
		System.out.println("USERNAME IS :-"+uname);

		int rCount = read.getRowCount("Login");

		for(int rNum=2;rNum<=rCount;rNum++) {
			
			String Username = read.getCellData("Login","Username", rNum);
			System.out.println("The Username is:-"+Username);
			
			String password = read.getCellData("Login","Password", rNum);
			System.out.println("The Password is:-"+password);
			read.setCellData("Login", "Status", rNum, "Pass");
		}
		
		//read.setCellData("Login", "Status", rNum, "Pass");
		
		//String url ="http://casioo.info/customer/account/login/referer/aHR0cDovL2Nhc2lvby5pbmZvL2N1c3RvbWVyL2FjY291bnQvaW5kZXgv/";
		//Set path for driver from the current directory
		String url1 = "http://casioo.info/index1234.php";  
		String driverPath =	System.getProperty("user.dir")+"/driver/msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", driverPath); 
		//Initialize Edge
		driver = new EdgeDriver();
		driver.get(url1);
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[@class='action toggle switcher-trigger']//i[1]")).click();
		driver.findElement(By.id("switcher-customer-trigger")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown switcher-dropdown']//li[3]")).click();
		driver.findElement(By.id("customer-email")).sendKeys("tester.2020demo@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tester@123");
		driver.findElement(By.id("send2")).click();
		System.out.println("Successfully login");
		Thread.sleep(3000);

		 
	}

}
