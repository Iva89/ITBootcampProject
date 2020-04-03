package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import objects.HomePage;
import objects.SummerDresses;

public class HomePageTest {
	WebDriver wd;
	
	@BeforeClass
	public void BeforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		HomePage.openHomePage(wd);
	}
	@AfterClass
	public void AfterClass() {
		wd.close();
	}
	
	//checks if clicking Summer Dresses via Women button to the right page
	@Test
	public void OpenSummerDressesViaWomen() {
		HomePage.positioningCursorWomenButton(wd);
		HomePage.click_SDFromWomen(wd);
		String URL = wd.getCurrentUrl();
		Assert.assertEquals(URL, SummerDresses.URL_WB);
	}
	
	//checks if clicking Summer Dresses via Dresses button to the right page
	@Test
	public void OpenSummerDressesViaDresses() {
		HomePage.positioningCursorDressesButton(wd);
		HomePage.click_SDFromDresses(wd);
		String URL = wd.getCurrentUrl();
		Assert.assertEquals(URL,SummerDresses.URL_DB);
	}
	
	//checks if clicking on Summer Dresses via both previous options leads to the same page
	@Test
	public void SummerDressesCrossURL() {
		HomePage.positioningCursorWomenButton(wd);
		HomePage.click_SDFromWomen(wd);
		String URL1 = wd.getCurrentUrl();
		HomePage.openHomePage(wd);
		HomePage.positioningCursorDressesButton(wd);
		HomePage.click_SDFromDresses(wd);
		String URL2 = wd.getCurrentUrl();
		Assert.assertEquals(URL1, URL2);
	}
	
}
