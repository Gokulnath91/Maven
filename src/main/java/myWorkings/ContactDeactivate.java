package myWorkings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ContactDeactivate {

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
		Wait.Until.elemntToBeVisible(driver.findElementByXPath("//div[contains(text(),'Displaying records')]");*/
		Thread.sleep(3000);
		String ContactID = driver.findElementByXPath ("(//table[@class='x-grid3-row-table']//a)[1]").getText();
		driver.findElementByXPath ("(//table[@class='x-grid3-row-table']//a)[1]").click();
		driver.findElementByLinkText("Deactivate Contact").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Contacts").click();
		driver.findElementByXPath("//div[@class='x-tab-panel-bwrap']//input[@name= 'id']").sendKeys(ContactID);
		driver.findElementByXPath("//button[text()='Find Contacts']").click();
		/*WebDriverWait wait = new WebDriverWait (driver,20);
		Wait.Until.elemntToBeVisible(driver.findElementByXPath("//div[contains(text(),' records')]");*/
		Thread.sleep(3000);
		System.out.println(driver.findElementByXPath("//div[@class='x-panel-bbar']//div[@class='x-paging-info']").getText());
		if(driver.findElementByXPath("//div[@class='x-panel-bbar']//div[@class='x-paging-info']").getText().contains("No records")){
		System.out.println("Record deactivatd");
		}else System.out.println("Record not deactivatd");
		driver.quit();
	}

}
