package objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {
	// defining elements paths
	private static final String HOME_URL = "http://automationpractice.com/index.php";
	private static final String WOMEN_BUTTON = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
	private static final String DRESSES_BUTTON = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]";
	private static final String W_SUMMER_DRESSES_LINK = "//li[@class='sfHover']//ul//li//a[contains(text(),'Summer Dresses')]";
	private static final String D_SUMMER_DRESSES_LINK = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[3]/a[1]";
	private static final String SIGN_IN_BUTTON = "//a[@class='login']";
	private static final String SIGN_OUT_BUTTON= "//a[@class='logout']";
	
	
	public static void openHomePage(WebDriver wd) {//opens Home page
		wd.get(HOME_URL);
	}
	
	public static void clickWomenButton(WebDriver wd) {//click on "Women" button
		wd.findElement(By.xpath(WOMEN_BUTTON)).click();
	}

	public static void clickDressesButton(WebDriver wd) {//click on "Dresses" button
		wd.findElement(By.xpath(DRESSES_BUTTON)).click();
	}

	public static void click_SDFromWomen(WebDriver wd) {//opens Summer Dresses via "Women" button
		WebDriverWait wait = new WebDriverWait(wd, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(W_SUMMER_DRESSES_LINK)));
		wd.findElement(By.xpath(W_SUMMER_DRESSES_LINK)).click();
	}

	public static void click_SDFromDresses(WebDriver wd) {//opens Summer Dresses via "Dresses" button
		WebDriverWait wait = new WebDriverWait(wd, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(D_SUMMER_DRESSES_LINK)));
		wd.findElement(By.xpath(D_SUMMER_DRESSES_LINK)).click();
	}

	public static void positioningCursorWomenButton(WebDriver wd) {//hover over "Women" button
		Actions action = new Actions(wd);
		action.moveToElement(wd.findElement(By.xpath(WOMEN_BUTTON))).build().perform();
		sleep();
	}

	public static void positioningCursorDressesButton(WebDriver wd) {//hover over "Dresses" button
		Actions action = new Actions(wd);
		action.moveToElement(wd.findElement(By.xpath(DRESSES_BUTTON))).build().perform();
		sleep();
	}
	
	public static void clickSignIn(WebDriver wd) {//opens Sign in page
		wd.findElement(By.xpath(SIGN_IN_BUTTON)).click();
	}
	
	public static void clickSignOut(WebDriver wd) {//logs out user
		wd.findElement(By.xpath(SIGN_OUT_BUTTON)).click();
	}

	public static void sleep () {//sleep method
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
