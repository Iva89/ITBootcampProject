package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import objects.HomePage;
import objects.PrintedSummerDress_ID5;
import objects.SummerDresses;

public class PrintedSummerDress_ID5Test {
	WebDriver wd;

	@BeforeClass
	public void BeforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		HomePage.openHomePage(wd);
		HomePage.positioningCursorDressesButton(wd);
		HomePage.click_SDFromDresses(wd);
		SummerDresses.clickPrintedSummerDress_img(wd);
	}

	@AfterClass
	public void AfterClass() {
		wd.close();
	}
	
	//checks if method inputQuantity works properly
	@Test
	public void inputQuantity() {
		PrintedSummerDress_ID5.inputQuantity(wd, "2");
		Assert.assertEquals(PrintedSummerDress_ID5.getQuantity(wd), "2");
	}
	
	//checks if method clickPlus works properly
	@Test
	public void addQuantityPlusBtn() {
		PrintedSummerDress_ID5.resetQuantity(wd);
		PrintedSummerDress_ID5.clickPlus(wd);
		Assert.assertEquals(PrintedSummerDress_ID5.getQuantity(wd), "2");
	}
	
	//checks if method clickMinus works properly
	@Test 
	public void subtractQuantityMinusBtn() {
		PrintedSummerDress_ID5.resetQuantity(wd);
		PrintedSummerDress_ID5.inputQuantity(wd, "3");
		PrintedSummerDress_ID5.clickMinus(wd);
		Assert.assertEquals(PrintedSummerDress_ID5.getQuantity(wd), "2");
	}
	
	//checks if method selectMsize works properly
	@Test
	public void selectMsize() {
		PrintedSummerDress_ID5.selectMsize(wd);
		Assert.assertEquals(PrintedSummerDress_ID5.getSize(wd), "M");
	}
	
	//checks if method clickBlue works properly
	@Test
	public void selectBlueColor() {
		PrintedSummerDress_ID5.clickBlue(wd);
		Assert.assertEquals(PrintedSummerDress_ID5.getColor(wd), "Blue");
	}
	

}
