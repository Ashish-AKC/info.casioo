package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectProductCheckout {
	
	WebDriver driver=null;

	public PageObjectProductCheckout(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//Click on the My cart button 
	By MyCartButton = By.xpath("//div[@class='minicart-wrapper']//a[1]");
	//Click on the "Process to checkout" button
	By ChechoutButton = By.id("top-cart-btn-checkout");
	//Check shipping method
	By Shipping = By.name("estimate_method0");
	//Click to next button
	By NextButton = By.xpath("//div[@class='primary']//button[@class='button action continue primary']");
	//Click to Telr Payment
	By TelrPayment = By.xpath("//div[@class='payment-method']/div//span[1]");
	//Click to "Continue Checkout" button
	By FinalCheckout = By.xpath("//div[@class='primary']//button[@class='action primary checkout']//span");
	//Enter card number
	By cardNumber = By.id("creditCardNumber");
	//Select Year
	By selectYearButton = By.xpath("//select[@id='creditCardYear']/option[02]");
	//Enter CVV
	By Cvv = By.id("http://casioo.info/homepage-21st-december-2020");
	
	public void myCart() {
		
		driver.findElement(MyCartButton).click();
	}
	
	public void checkoutButton() {
		
		driver.findElement(ChechoutButton).click();
	}
	
	public void ship() {
		
		driver.findElement(Shipping).click();
	}
	
	public void nextButton() {
		
		driver.findElement(NextButton).click();
	}
	
	public void paymentMod() {
		
		driver.findElement(TelrPayment).click();
	}
	
	public void continueCheckout() {
		
		driver.findElement(FinalCheckout).click();
	}
	
	public void CardNumber() {
		
		driver.findElement(cardNumber).sendKeys("4111 1111 1111 1111");
	}
	
	public void ExpireYear() {
		
		driver.findElement(selectYearButton).click();
	}
	
	public void cVV() {
		
		driver.findElement(Cvv).sendKeys("123");
	}
	
	
}
