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
import objects.Register;
import utility.RegistrationData;

public class RegisterForm30UsersTest {
	
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
	
	//testing if registration of 30 users with the data from .xlsx file is successful
	@Test
	public void test30UsersRegistration() {
		RegistrationData.findExcelSheet();
		for(int i = 1; i<RegistrationData.getRowNumber(); i++) {
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			HomePage.openHomePage(wd);
			HomePage.clickSignIn(wd);
			Register.inputEMail(wd, RegistrationData.getEMail(i));
			Register.clickCreateAnAccount(wd);
			Register.inputFirstName(wd, RegistrationData.getFirstName(i));
			Register.inputLastName(wd, RegistrationData.getLastName(i));
			Register.inputPassword(wd, RegistrationData.getPassword(i));
			Register.inputAddress(wd, RegistrationData.getAddress(i));
			Register.inputCity(wd, RegistrationData.getCity(i));
			Register.selectState(wd, RegistrationData.getState(i));
			Register.inputZipPostalCode(wd, RegistrationData.getPostalCode(i));
			Register.inputMobilePhone(wd, RegistrationData.getMobilePhone(i));
			Register.clickRegister(wd);	
			String user = wd.findElement(By.className("account")).getText();
			String expectedUser = RegistrationData.getFirstName(i) +" "+ RegistrationData.getLastName(i);
			Assert.assertEquals(user, expectedUser);
			HomePage.clickSignOut(wd);
		}
		RegistrationData.closeFi();
	}
}


