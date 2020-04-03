package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummerDresses {


	//Printed Summer Dress, Product ID = 5 
	public static final String URL_WB = "http://automationpractice.com/index.php?id_category=11&controller=category";
	public static final String URL_DB = "http://automationpractice.com/index.php?id_category=11&controller=category";
	private static final String IMAGE_PATH = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 "
			+ "first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']"
			+ "//img[@class='replace-2x img-responsive']";
	
	private static final String TEXT_PATH = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 "
			+ "first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']"
			+ "//a[@class='product-name'][contains(text(),'Printed Summer Dress')]";
	
	private static final String ADD_TO_CART_ID5= "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 "
			+ "first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']"
			+ "//span[contains(text(),'Add to cart')]";
	
	private static final String MORE_BUTTON_ID5 = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 "
			+ "first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']"
			+ "//span[contains(text(),'More')]";
	
	private static final String COLOR_BLACK = "//a[@id='color_22']";
	private static final String COLOR_ORANGE = "//a[@id='color_21']";
	private static final String COLOR_BLUE = "//a[@id='color_20']";
	private static final String COLOR_YELLOW = "//a[@id='color_19']";
	
	
	public static void clickPrintedSummerDress_img(WebDriver wd) {//opens Printed Summer Dress page via image link
		wd.findElement(By.xpath(IMAGE_PATH)).click();
	}
	
	public static void clickPrintedSummerDress_text(WebDriver wd) {//opens Printed Summer Dress page via text link
		wd.findElement(By.xpath(TEXT_PATH)).click();
	}
	
	public static void clickAddToCart(WebDriver wd) {//adding Printed Summer Dress to cart
		wd.findElement(By.xpath(ADD_TO_CART_ID5)).click();
	}
	
	public static void clickMoreButton(WebDriver wd) {//opens Printed Summer Dress page
		wd.findElement(By.xpath(MORE_BUTTON_ID5)).click();
	}
	
	public static void chooseColorBlack(WebDriver wd) {//opens Printed Summer Dress (black color) page
		wd.findElement(By.xpath(COLOR_BLACK)).click();
	}
	
	public static void chooseColorOrange(WebDriver wd) {//opens Printed Summer Dress (orange color) page
		wd.findElement(By.xpath(COLOR_ORANGE)).click();
	}
	
	public static void chooseColorBlue(WebDriver wd) {//opens Printed Summer Dress (blue color) page
		wd.findElement(By.xpath(COLOR_BLUE)).click();
	}
	
	public static void chooseColorYellow(WebDriver wd) {//opens Printed Summer Dress (yellow color) page
		wd.findElement(By.xpath(COLOR_YELLOW)).click();
	}
	
}
