package myWorkings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadDelete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String errMsg = "No records to display";
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		for (int i = 0; i < 24; i++) {
			
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9551656520");
		driver.findElementByXPath("//button[text()='Find Leads']").click();;
		Thread.sleep(1500);
		
		
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeSelected(
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]")));
		*/
		
		
		String firstResult = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").getText();
		//Thread.sleep(1500);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").click();
		driver.findElementByXPath("//a[text()='Delete']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='gwtWidget subSectionBlock']//input)[1]").sendKeys(firstResult);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(
		driver.findElementByXPath("//div[@class='x-paging-info']")));
		
		//System.out.println(driver.findElementByXPath("//div[@class='x-paging-info']").getText());
		boolean b = driver.findElementByXPath("//div[@class='x-paging-info']").getText().equals(errMsg);
		if (b==true) {
			System.out.println("Record was deleted successfully");
		}else System.out.println("Record was not deleted successfully");
		}
			
		
		driver.close();
		
			
	}

}
