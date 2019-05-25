package myWorkings;

import org.openqa.selenium.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Create Account").click();
		driver.findElementById("accountName").sendKeys("Gokul");
		driver.findElementById("groupNameLocal").sendKeys("Gokul"); 
		driver.findElementById("officeSiteName").sendKeys("Gokul"); 
		String FirstNameBeforeCreate = driver.findElementById("accountName").getAttribute("value"); 
		//System.out.println(FirstNameBeforeCreate);
		driver.findElementById("annualRevenue").sendKeys("100");
		WebElement currencyDropdown = driver.findElementById("currencyUomId");
		Select currencyOption = new Select(currencyDropdown);
		currencyOption.selectByVisibleText("INR - Indian Rupee");
		WebElement IndustryDropdown = driver.findElementByXPath ("//select[@name='industryEnumId']");
		Select IndustryOption = new Select(IndustryDropdown);
		IndustryOption.selectByVisibleText("Finance");
		driver.findElementById("numberEmployees").sendKeys("100");
		WebElement ownershipDropdown = driver.findElementByXPath ("//select[@name= 'ownershipEnumId']");
		Select ownershipOption = new Select(ownershipDropdown);
		ownershipOption.selectByVisibleText("Partnership");
		driver.findElementById("sicCode").sendKeys("1234");
		driver.findElementById("tickerSymbol").sendKeys("Test");
		WebElement sourceDropdown = driver.findElementById("dataSourceId");
		Select sourceOption = new Select(sourceDropdown);
		sourceOption.selectByVisibleText("Employee");
		WebElement MarketingDropdown = driver.findElementById("marketingCampaignId");
		Select MarketingOption = new Select(MarketingDropdown);
		MarketingOption.selectByVisibleText("Demo Marketing Campaign");
		WebElement TeamDropdown = driver.findElementById("initialTeamPartyId");
		Select TeamOption = new Select(TeamDropdown);
		TeamOption.selectByIndex(1);
		driver.findElementByXPath("//textarea[@name= 'description']").sendKeys("Description Text Box.");
		driver.findElementByXPath("//textarea[@name='importantNote']").sendKeys("Important Note Text Box");
		driver.findElementById("primaryPhoneCountryCode").click();
		driver.findElementById("primaryPhoneCountryCode").sendKeys("10");
		driver.findElementById("primaryPhoneAreaCode").sendKeys("10");
		driver.findElementById("primaryPhoneNumber").sendKeys("9840044293");
		driver.findElementById("primaryPhoneExtension").sendKeys("333");
		driver.findElementById("primaryPhoneAskForName").sendKeys("Gokul");
		driver.findElementById("primaryEmail").sendKeys("test@gmail.com");
		driver.findElementById("primaryWebUrl").sendKeys("ww.test.com");
		driver.findElementById("generalToName").sendKeys("Test");
		driver.findElementById("generalAttnName").sendKeys("Test");
		driver.findElementById("generalAddress1").sendKeys("Test");
		driver.findElementById("generalAddress2").sendKeys("Test");
		driver.findElementById("generalCity").sendKeys("Chennai");
		WebElement countryDropdown = driver.findElementById("generalCountryGeoId");
		Select countryOption = new Select(countryDropdown);
		countryOption.selectByValue("IND");
		Thread.sleep(3000);
		WebElement stateDropdown = driver.findElementById("generalStateProvinceGeoId");
		Select stateOption = new Select(stateDropdown);
		stateOption.selectByVisibleText("TAMILNADU");
		driver.findElementById("generalPostalCode").sendKeys("600089");
		driver.findElementById("generalPostalCodeExt").sendKeys("123");
		driver.findElementByClassName("smallSubmit").click();
		try {
			if (driver.findElementByXPath("//span[@class='errorMessage']").getText().contains("Duplicate")) {
				driver.findElementByXPath("//a[@class='buttonDangerous']").click();
				driver.switchTo().alert().accept();
			}	
		} catch (NoSuchElementException e) {
			
		}
		
		//span[text()='Account Name']/following::span[1]
		if(driver.findElementByXPath("//span[text()='Account Name']/following::span[1]").getText().contains(FirstNameBeforeCreate)){
		System.out.println("Account Created Successfully");
		} else System.out.println("Account Not Created Successfully");
		driver.quit();

	}

}
