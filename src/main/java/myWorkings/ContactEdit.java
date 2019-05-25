package myWorkings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ContactEdit {

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
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByLinkText("Find Contacts").click();
		driver.findElementByXPath("(//div[@class='x-tab-panel-bwrap'])//input[@name='firstName']").sendKeys("Gokul");
		driver.findElementByXPath("//button[text()='Find Contacts']").click();
		/*WebDriverWait wait = new WebDriverWait (driver,20);
		Wait.Until.elemntToBeVisible(driver.findElementByXPath("//div[contains(text(),' records')]");*/
		Thread.sleep(3000);
		String ContactID = driver.findElementByXPath ("(//table[@class='x-grid3-row-table']//a)[1]").getText();
		System.out.println(ContactID);
		driver.findElementByXPath ("(//table[@class='x-grid3-row-table']//a)[1]").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateContactForm_lastName").clear();

		driver.findElementById("updateContactForm_lastName").sendKeys("Jothi");
		String UpdateText = driver.findElementById("updateContactForm_lastName").getAttribute("Value");
		System.out.println(UpdateText);
		driver.findElementByClassName("smallSubmit").click();
		String UpdatedText = driver.findElementById("viewContact_lastName_sp").getText();
		System.out.println(UpdatedText);
		String UpdatedContactId = driver.findElementById("viewContact_fullName_sp").getText();
		System.out.println(UpdatedContactId);
		if(UpdatedContactId.contains(ContactID) && UpdateText.equals(UpdatedText)){
		System.out.println("Contact updated successfully");
		}else System.out.println("Contact not updated successfully");
		driver.quit();
	}

}
