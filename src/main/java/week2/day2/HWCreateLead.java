	package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HWCreateLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
			
		for (int i = 0; i <= 50; i++) {
			
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Datatracks");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gokulnath");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select sourceList= new Select(source);
		sourceList.selectByVisibleText("Existing Customer");
		WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketingList= new Select(marketing);
		List<WebElement> options = marketingList.getOptions();
		//System.out.println(options.size());	
		marketingList.selectByIndex(options.size()-1);
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Gokul");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Jothi");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Test");
		driver.findElementById("createLeadForm_birthDate-button").click();
		driver.findElementByXPath("//td[text()='15']").click();
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Lead");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Testing");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("500000");
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		Select currencyList= new Select(currency);
		currencyList.selectByValue("INR");
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select industryList = new Select(industry);
		industryList.selectByVisibleText("Finance");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("10");
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownershipList = new Select(ownership);
		List<WebElement> ownershipListCount = ownershipList.getOptions();
		ownershipList.selectByIndex(ownershipListCount.size()-1);
		driver.findElementById("createLeadForm_sicCode").sendKeys("123456");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("test");
		driver.findElementById("createLeadForm_description").sendKeys("This field is used to enter the description.");
		driver.findElementById("createLeadForm_importantNote").sendKeys("This field is used to enter the Important Note.");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("101");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("600089");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9551656520");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("208");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Gokul");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("gokulnath71@gmail.com");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://datatracks.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Gokul");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Gokul");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("3/42 Moovendhar Street, Thirumalai Nagar",Keys.TAB,"Ramapuram");
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select countryList = new Select(country);
		countryList.selectByVisibleText("India");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select stateList = new Select(state);
		stateList.selectByVisibleText("TAMILNADU");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600089");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("333");
		driver.findElementByXPath("//input[@name='submitButton']").click();
				
		boolean b = driver.findElementById("viewLead_firstName_sp").getText().equals("Gokulnath");
		
		if (b==true) {
			System.out.println("First name is verified and record was created successfully");
		}else System.out.println("First name is verified and record was not created successfully");
		System.out.println("The title is : "+driver.getTitle());
		}
		driver.close();
		
		
	}

}
