package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class Classwork3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Gokul",Keys.ENTER);
	//	driver.findElementByXPath("//button[text()='Find Leads']").click();
	/*	WebElement firtResult = driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[1]//a)[1]");
		WebDriverWait wait=new WebDriverWait(driver,10).until(ExpectedConditions
				.elementToBeClickable("firtResult"));
	*/	
		Thread.sleep(5000);
		driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[1]//a)[1]").click();
		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementById("updateLeadForm_firstName").sendKeys("Test");
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();

		



				


		
			
	}

}
