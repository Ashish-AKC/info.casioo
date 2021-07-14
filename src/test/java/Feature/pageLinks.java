package Feature;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class pageLinks {
			
	public static void main(String[] args) {

		WebDriver driver = null;
		String homePage = "http://casioo.info/index1234.php";
		String url = "";
		HttpURLConnection huc = null;
		int responseCode = 200;

		System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"/driver/msedgedriver.exe");

		driver = new EdgeDriver();

		driver.get(homePage);

		driver.manage().window().maximize();

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		System.out.println("Count of links :-"+allLinks.size());

		Iterator<WebElement> it = allLinks.iterator();

		while(it.hasNext()) {

			url = it.next().getAttribute("href");
			System.out.println(url);

			if(url==null || url.isEmpty()) {

				System.out.println("URL is eighter not configured or it's empty.");
				continue;
			}
			if(!url.startsWith(homePage)) {
				System.out.println("URL belongs to another domains.");
				continue;
			}
			try
			{
				huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				responseCode = huc.getResponseCode();
				if(responseCode>=400) {
					System.out.println("Link broken");
				}else {
					System.out.println("Link valid");
				}
			}catch(MalformedURLException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

		driver.close();

	}

}
