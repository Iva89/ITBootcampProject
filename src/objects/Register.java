package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {
	
	private static final String EMAIL_INPUTBOX = "//input[@id='email_create']";
	private static final String CREATE_AN_ACC_BTN = "//form[@id='create-account_form']//span[1]";
	
	private static final String FIRST_NAME = "//input[@id='customer_firstname']";
	private static final String LAST_NAME = "//input[@id='customer_lastname']";
	private static final String PASSWORD = "//input[@id='passwd']";
	
	private static final String ADDRESS = "//input[@id='address1']";
	private static final String CITY = "//input[@id='city']";
	private static final String STATE = "//select[@id='id_state']";
	private static final String ZIP_POSTAL_CODE = "//input[@id='postcode']";
	private static final String COUNTRY = "//select[@id='id_country']";
	private static final String MOBILE_PHONE = "//input[@id='phone_mobile']";
	private static final String ADDRESS_ALIAS = "//input[@id='alias']";
	
	private static final String REGISTER_BTN = "//span[contains(text(),'Register')]";
	
	
	public static void inputEMail(WebDriver wd, String email) {//inputs email
		wd.findElement(By.xpath(EMAIL_INPUTBOX)).sendKeys(email);
	}
	
	public static void clickCreateAnAccount(WebDriver wd) {//opens registration form
		wd.findElement(By.xpath(CREATE_AN_ACC_BTN)).click();
	}
	
	public static void inputFirstName(WebDriver wd, String firstName) {//inputs first name
		wd.findElement(By.xpath(FIRST_NAME)).sendKeys(firstName);
	}
	
	public static void inputLastName(WebDriver wd, String lastName) {//inputs last name
		wd.findElement(By.xpath(LAST_NAME)).sendKeys(lastName);
	}
	
	public static void inputPassword(WebDriver wd, String password) {//inputs password
		wd.findElement(By.xpath(PASSWORD)).sendKeys(password);
	}
	
	public static void inputAddress(WebDriver wd, String address) {//inputs address
		wd.findElement(By.xpath(ADDRESS)).sendKeys(address);
	}
	
	public static void inputCity(WebDriver wd, String city) {//inputs city
		wd.findElement(By.xpath(CITY)).sendKeys(city);
	}
	
	public static void selectState(WebDriver wd, String state) {//selects state
		Select chooseState = new Select(wd.findElement(By.xpath(STATE)));
		chooseState.selectByVisibleText(state);
	}
	
	public static void inputZipPostalCode(WebDriver wd, String zipPostalCode) {//inputs zip code
		wd.findElement(By.xpath(ZIP_POSTAL_CODE)).sendKeys(zipPostalCode);
	}
	
	public static void selectCountry(WebDriver wd, String country) {//selects country
		Select chooseCountry = new Select(wd.findElement(By.xpath(COUNTRY)));
		chooseCountry.selectByValue(country);
	}
	
	public static void inputMobilePhone(WebDriver wd, String mobilePhone) {//inputs mobile phone number
		wd.findElement(By.xpath(MOBILE_PHONE)).sendKeys(mobilePhone);
	}
	
	public static void inputAddressAlias(WebDriver wd, String addressAlias) {//inputs address alias
		wd.findElement(By.xpath(ADDRESS_ALIAS)).sendKeys(addressAlias);
	}
	
	public static void clickRegister(WebDriver wd) {//navigates to user profile page
		wd.findElement(By.xpath(REGISTER_BTN)).click();
		
	}
	
	
}
