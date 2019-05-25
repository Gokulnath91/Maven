package myWorkings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class AccountDeactivate {

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
		Wait.Until.elemntToBeVisible(driver.findElementByXPath("//div[cont	ains(text(),' records')]");*/
		Thread.sleep(3000);
		String AccountId = driver.findElementByXPath ("(//table[@class='x-grid3-row-table']//a)[1]").getText();
		driver.findElementByXPath ("(//table[@class='x-grid3-row-table']//a)[1]").click();
		driver.findElementByLinkText("Deactivate Account").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Accounts").click();
		driver.findElementByXPath("(//div[@class='x-tab-panel-bwrap'])//input[@name='id']").sendKeys(AccountId);
		driver.findElementByXPath("//button[text()='Find Accounts']").click();
		/*WebDriverWait wait = new WebDriverWait (driver,20);
		Wait.Until.elemntToBeVisible(driver.findElementByXPath("//div[contains(text(),' records')]");*/
		Thread.sleep(3000);
		if(driver.findElementByXPath("//div[@class='x-panel-bbar']//div[@class='x-paging-info']").getText().contains("No records")){
		System.out.println("Record deactivated successfully");
		}else System.out.println("Record not deactivated successfully");
		driver.quit();
	}

}
