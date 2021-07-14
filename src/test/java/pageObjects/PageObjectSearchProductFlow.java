/*
 * This object belongs to search any product for both registered or guest user both.
 * 
 * 
 * 
*/

package pageObjects;

import org.openqa.selenium.By;

public class PageObjectSearchProductFlow {
	
	//click on the search bar
	By searchBar = By.id("search");
	//Click on the search button
	By searchButton = By.xpath("//div[@class='actions']//button[@class='action search']");
	//Click on the available Watch (Edifice Men's Black)
	By productClick = By.xpath("//img[@alt=\"Edifice Men's Black Watch\"]");
	//Click on the Add To Cart button
	By addToCart = By.id("product-addtocart-button");
	//Click on Shopping Cart from the alert message
	By shoppingCart = By.xpath("//div[@role='alert']//a");
	//
	
	
}
