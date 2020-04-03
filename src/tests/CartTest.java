package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Cart;
import objects.PrintedSummerDress_ID5;

public class CartTest {
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
		wd.close();
	}
	
	//add to cart Printed Summer Dress (ID 5), M size, 2 items, blue color
	//test if cart content is same as above requests
	@Test
	public void cartContent() {
		PrintedSummerDress_ID5.openPrintedSDPage(wd);
		PrintedSummerDress_ID5.selectMsize(wd);
		PrintedSummerDress_ID5.inputQuantity(wd, "2");
		PrintedSummerDress_ID5.clickBlue(wd);
		PrintedSummerDress_ID5.clickAddToCart(wd);
		PrintedSummerDress_ID5.clickContinueShopping(wd);
		PrintedSummerDress_ID5.clickCart(wd);
		sa.assertEquals(Cart.getDressName(wd), "Printed Summer Dress");
		sa.assertTrue(Cart.getDressID(wd).contains("demo_5") );
		sa.assertTrue(Cart.getDressColorSize(wd).contains("Blue"));
		sa.assertTrue(Cart.getDressColorSize(wd).contains("M"));
		sa.assertEquals(Cart.getDressQuantity(wd), "2");
		sa.assertAll();
	}
}
