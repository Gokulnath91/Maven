package myWorkings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactCreate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("demoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("Gokul");
		driver.findElementById("lastNameField").sendKeys("J");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Gokul");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("J");
		driver.findElementById("createContactForm_personalTitle").sendKeys("Test");
		driver.findElementById("createContactForm_birthDate").sendKeys("05/5/2019");
		driver.findElementById("createContactForm_personalTitle").sendKeys("Test");
		driver.findElementById("createContactForm_departmentName").sendKeys("Testing");
		WebElement dropdown = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select options = new Select(dropdown);
		options.selectByVisibleText("INR - Indian Rupee");
		driver.findElementById("createContactForm_description").sendKeys("Description Text Box.");
		driver.findElementById("createContactForm_importantNote").sendKeys("Important Note Text Box");
		driver.findElementById("createContactForm_primaryPhoneCountryCode").click();
		driver.findElementById("createContactForm_primaryPhoneCountryCode").sendKeys("10");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("10");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("9840044293");
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("333");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Gokul");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("test@gmail.com");
		driver.findElementById("createContactForm_generalAttnName").sendKeys("Test");
		driver.findElementById("createContactForm_generalAddress1").sendKeys("Test");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("Test");
		driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
		WebElement countryDropdown = driver.findElementById("createContactForm_generalCountryGeoId");
		Select countryOption = new Select(countryDropdown);
		countryOption.selectByValue("IND");
		Thread.sleep(3000);
		WebElement stateDropdown = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select stateOption = new Select(stateDropdown);
		stateOption.selectByVisibleText("TAMILNADU");
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("600089");
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("123");
		String FistNameBeforeCreate = driver.findElementById("createContactForm_firstNameLocal").getAttribute("value");
		System.out.println(FistNameBeforeCreate);
		driver.findElementByClassName("smallSubmit").click();
		String FistNameAfterCreate = driver.findElementById("viewContact_firstName_sp").getText();
		//System.out.println(FistNameAfterCreate);
		if(FistNameBeforeCreate.equals(FistNameAfterCreate)){
		System.out.println("Contact Created Successfully");
		} else System.out.println("Contact Not Created Successfully");
		driver.quit();

	}

}
