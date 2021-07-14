package pageObjects;

/*
 * New user only
 * After successfully registration, user can add or manage address from the manage addressed section
 *  * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectShippingAddress {
	WebDriver driver=null;
	public PageObjectShippingAddress(WebDriver driver) {

		this.driver = driver;

	}

	//Manage Addresses button
	By ManageAddressesButton = By.xpath("//div[@class='block block-dashboard-addresses']//a[@class='action edit']/span[contains(text(),'Manage')]");
	//Phone number text field
	By phoneNumber = By.id("telephone");
	//Street address line1
	By addressLine1 = By.id("street_1");
	//Street address line2
	By addressLine2 = By.id("street_2");
	//Street address line3
	By addressLine3 = By.id("street_3");
	//City 
	By city = By.id("city");
	//First click on the State/Province field for view drop-down options
	By listOfStates = By.id("region_id");
	//State
	By state = By.xpath("//select[@id=\"region_id\"]/option[5]");
	//Zip/Postal Code
	By zipCode = By.id("zip");
	//Country
	By country = By.xpath("//select[@id=\"country\"]/option[1]");
	//Save address button
	By saveAddress = By.xpath("//div[@class='primary']//button/span[contains(text(),'Save Address')]");

}
