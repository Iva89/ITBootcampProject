package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;
import objects.SignIn;
import utility.RegistrationData;

public class SignInTest {
	WebDriver wd;

	@BeforeClass
	public void BeforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
	}

	@AfterClass
	public void AfterClass() {
		wd.close();
	}
	
	//Testing success of sign in of registered users 
	@Test
	public void SignIn() {
		RegistrationData.findExcelSheet();
		for(int i = 1; i<RegistrationData.getRowNumber(); i++) {
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			HomePage.openHomePage(wd);
			HomePage.clickSignIn(wd);
			SignIn.inputEMail(wd, RegistrationData.getEMail(i));
			SignIn.inputPassword(wd, RegistrationData.getPassword(i));
			SignIn.clickSignIn(wd);
			String user = wd.findElement(By.className("account")).getText();
			String expectedUser = RegistrationData.getFirstName(i) +" "+ RegistrationData.getLastName(i);
			Assert.assertEquals(user, expectedUser);
			HomePage.clickSignOut(wd);
	}
}
}
