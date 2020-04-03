package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Cart;
import objects.PrintedSummerDress_ID5;
import objects.Register;

public class RegisterTest {

	WebDriver wd;
	SoftAssert sa;

	@BeforeClass
	public void BeforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		wd = new ChromeDriver();
		sa = new SoftAssert();
		wd.manage().window().maximize();
	}

	@AfterClass
	public void AfterClass() {
		
	}
	//testing if registration of a user is successful and is the user logged in afterwards
	@Test
	public void RegisterCustomer_CartContent() {
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		PrintedSummerDress_ID5.openPrintedSDPage(wd);
		PrintedSummerDress_ID5.selectMsize(wd);
		PrintedSummerDress_ID5.inputQuantity(wd, "2");
		PrintedSummerDress_ID5.clickBlue(wd);
		PrintedSummerDress_ID5.clickAddToCart(wd);
		PrintedSummerDress_ID5.clickContinueShopping(wd);
		PrintedSummerDress_ID5.clickCart(wd);
		Cart.clickProceedToCheckout(wd);
		Register.inputEMail(wd, "ghghglk121@gmail.com");
		Register.clickCreateAnAccount(wd);
		Register.inputFirstName(wd, "Ivana");
		Register.inputLastName(wd, "Djokic");
		Register.inputPassword(wd, "pasvord");
		Register.inputAddress(wd, "Dragoslava Srejovica");
		Register.inputCity(wd, "New York");
		Register.selectState(wd, "New York");
		Register.inputZipPostalCode(wd, "10001");
		Register.inputMobilePhone(wd, "635588552");
		Register.clickRegister(wd);	
		String user = wd.findElement(By.className("account")).getText();
		System.out.println(user);
		Assert.assertEquals(user, "Ivana Djokic");

	}
	
	
	
}
