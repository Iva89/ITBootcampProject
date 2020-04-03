package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintedSummerDress_ID5 {
	
	private static final String URL_PSD = "http://automationpractice.com/index.php?id_product=5&controller=product";
	private static final String MINUS_BTN = "//i[@class='icon-minus']";
	private static final String PLUS_BTN = "//a[@class='btn btn-default button-plus product_quantity_up']//span";
	private static final String INPUT_QUANTITY_id = "quantity_wanted";
	private static final String SIZE_LIST = "//select[@id='group_1']";
	
	private static final String COL_BLACK= "//a[@id='color_11']";
	private static final String COL_ORANGE = "//a[@id='color_13']";
	private static final String COL_BLUE = "//a[@id='color_14']";
	private static final String COL_YELLOW = "//a[@id='color_16']";
	
	private static final String ADD_TO_CART_ID5 = "//button[@name='Submit']";
	private static final String CART = "//body[@id='product']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@class='col-sm-4 clearfix']/div[@class='shopping_cart']/a[1]";
	private static final String CONTINUE_SHOPPING = "//span[@class='continue btn btn-default button exclusive-medium']//span[1]";
	
	public static void openPrintedSDPage(WebDriver wd) {//opens "Printed Summer Dress" page, product ID 5
		wd.get(URL_PSD);
	}
	public static void clickMinus(WebDriver wd) {//subtracts quantity by 1
		wd.findElement(By.xpath(MINUS_BTN)).click();
	}
	
	public static void clickPlus(WebDriver wd) {//adds quantity by 1
		wd.findElement(By.xpath(PLUS_BTN)).click();
	}
	
	public static void inputQuantity(WebDriver wd, String quantity) {//inputs wanted quantity
		wd.findElement(By.id(INPUT_QUANTITY_id)).clear();
		wd.findElement(By.id(INPUT_QUANTITY_id)).sendKeys(quantity);
	}
	
	public static String getQuantity(WebDriver wd) {//returns product quantity
		String value = wd.findElement(By.id(INPUT_QUANTITY_id)).getAttribute("value");
		return value;
	}
	
	public static void resetQuantity(WebDriver wd) {//resets quantity to 1
		wd.findElement(By.id(INPUT_QUANTITY_id)).clear();
		wd.findElement(By.id(INPUT_QUANTITY_id)).sendKeys("1");
	}
	
	public static void selectSsize(WebDriver wd) {//selects S size from size list
		Select size = new Select(wd.findElement(By.xpath(SIZE_LIST)));
		size.selectByVisibleText("S");	
	}
	
	public static void selectMsize(WebDriver wd) {//selects M size from size list
		Select size = new Select(wd.findElement(By.xpath(SIZE_LIST)));
		size.selectByVisibleText("M");	
	}
	
	public static void selectLsize(WebDriver wd) {//selects L size from size list
		Select size = new Select(wd.findElement(By.xpath(SIZE_LIST)));
		size.selectByVisibleText("L");	
	}
	
	public static String getSize(WebDriver wd) {//returns chosen size
		Select size = new Select(wd.findElement(By.xpath(SIZE_LIST)));
		String s = size.getFirstSelectedOption().getAttribute("title");
		return s;
	}
	
	public static void clickBlue(WebDriver wd) {//choose Blue color
		wd.findElement(By.xpath(COL_BLUE)).click();
	}
	
	public static void clickBlack(WebDriver wd) {//choose Black color
		wd.findElement(By.xpath(COL_BLACK)).click();
	}
	
	public static void clickOrange(WebDriver wd) {//choose Orange color
		wd.findElement(By.xpath(COL_ORANGE)).click();
	}
	
	public static void clickYellow(WebDriver wd) {//choose Yellow color
		wd.findElement(By.xpath(COL_YELLOW)).click();
	}
	
	public static String getColor(WebDriver wd) {
		String s = wd.findElement(By.xpath(COL_BLUE)).getAttribute("title");
		return s;
	}
	
	public static void clickAddToCart(WebDriver wd) {//adds product (ID 5) to cart
		wd.findElement(By.xpath(ADD_TO_CART_ID5)).click();
		WebDriverWait wait = new WebDriverWait(wd, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CONTINUE_SHOPPING)));
	}
	
	public static void clickContinueShopping(WebDriver wd) {//navigates back to previous page of the dress added to cart
		wd.findElement(By.xpath(CONTINUE_SHOPPING)).click();
	}
	
	public static void clickCart(WebDriver wd) {//opens cart
		wd.findElement(By.xpath(CART)).click();
	}
}

