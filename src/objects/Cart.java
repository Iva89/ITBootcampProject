package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
	
	private static final String DRESS_NAME = "//td[@class='cart_description']//a[contains(text(),'Printed Summer Dress')]";
	private static final String DRESS_ID = "//small[@class='cart_ref']";
	private static final String DRESS_COLOR_SIZE = "//td[@class='cart_description']//a[contains(text(),'Color : Blue, Size : M')]";
	private static final String DRESS_QUANTITY = "//input[@name='quantity_5_24_0_0']";
	
	private static final String PROCEED_TO_CHECKOUT = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]";
	
	
	public static String getDressName(WebDriver wd) { //returns dress name
		String s = wd.findElement(By.xpath(DRESS_NAME)).getText();
		return s;
	}
	
	public static String getDressID(WebDriver wd) {//returns dress ID
		String s = wd.findElement(By.xpath(DRESS_ID)).getText();
		return s;
	}
	
	public static String getDressColorSize(WebDriver wd) {//returns dress color and size
		String s = wd.findElement(By.xpath(DRESS_COLOR_SIZE)).getText();
		return s;
	}
	
	public static String getDressQuantity(WebDriver wd) {//returns ordered product quantity 
		String s = wd.findElement(By.xpath(DRESS_QUANTITY)).getAttribute("value");
		return s;
	}
	
	public static void clickProceedToCheckout(WebDriver wd) {//navigates to sign in form from cart
		wd.findElement(By.xpath(PROCEED_TO_CHECKOUT)).click();
	}
}
