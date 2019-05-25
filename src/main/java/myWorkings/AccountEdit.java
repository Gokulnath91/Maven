package myWorkings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class AccountEdit {

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
		driver.findElementByLinkText("Find Accounts").click();
		driver.findElementByXPath("(//div[@class='x-tab-panel-bwrap'])//input[@name='accountName']").sendKeys("Gokul");
		driver.findElementByXPath("//button[text()='Find Accounts']").click();
		/*WebDriverWait wait = new WebDriverWait (driver,20);
		Wait.Until.elemntToBeVisible(driver.findElementByXPath("//div[contains(text(),' records')]");*/
		Thread.sleep(3000);
		String AccountId = driver.findElementByXPath ("(//table[@class='x-grid3-row-table']//a)[1]").getText();
		System.out.println(AccountId);
		driver.findElementByXPath ("(//table[@class='x-grid3-row-table']//a)[1]").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("groupNameLocal").clear();
		driver.findElementById("groupNameLocal").sendKeys("Gokulnath");
		String UpdateText = driver.findElementById("groupNameLocal").getAttribute("value");
		System.out.println(UpdateText);
		driver.findElementByClassName("smallSubmit").click();
		String UpdatedText = driver.findElementByXPath("//span[text()='Local Name']/following::span[1]").getText();
		System.out.println(UpdatedText);
		String UpdatedContactId = driver.findElementByXPath("	").getText().replaceAll("\\D","");
		System.out.println(UpdatedContactId);
		if(UpdatedContactId.contains(AccountId) && UpdateText.equals(UpdatedText)){
		System.out.println("Account updated successfully");
		}else System.out.println("Account not updated successfully");
		driver.quit();

	}

}
