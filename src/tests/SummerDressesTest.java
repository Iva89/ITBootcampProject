package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objects.HomePage;
import objects.SummerDresses;

public class SummerDressesTest {
	WebDriver wd;

	@BeforeClass
	public void BeforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
	}
	
	@BeforeMethod
	public void BeforeTest() {
		HomePage.openHomePage(wd);
		HomePage.positioningCursorDressesButton(wd);
		HomePage.click_SDFromDresses(wd);
	}

	@AfterClass
	public void AfterClass() {
		wd.close();
	}

	//check if image link opens correct page
	@Test
	public void openPrintedSummerDress_Img (){
		String URL = "http://automationpractice.com/index.php?id_product=5&controller=product";
		SummerDresses.clickPrintedSummerDress_img(wd);
		Assert.assertEquals(wd.getCurrentUrl(), URL);
	}
	
	//check if text link opens correct page
	@Test
	public void openPrintedSummerDress_Text () {
		String URL = "http://automationpractice.com/index.php?id_product=5&controller=product";
		SummerDresses.clickPrintedSummerDress_text(wd);
		Assert.assertEquals(wd.getCurrentUrl(), URL);
	}
}
