package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {

	private static final String EMAIL = "//input[@id='email']";
	private static final String PASSWORD = "//input[@id='passwd']";
	private static final String SIGN_IN = "//p[@class='submit']//span[1]";
	
	public static void inputEMail(WebDriver wd, String email) {//inputs email
		wd.findElement(By.xpath(EMAIL)).sendKeys(email);
	}
	
	public static void inputPassword(WebDriver wd, String password) {//inputs password
		wd.findElement(By.xpath(PASSWORD)).sendKeys(password);
	}
	
	public static void clickSignIn(WebDriver wd) {//opens user profile page
		wd.findElement(By.xpath(SIGN_IN)).click();
	}
}
