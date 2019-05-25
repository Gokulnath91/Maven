package myWorkings;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class AccountMerge {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Merge Accounts").click();
		driver.findElementByXPath("(//td[@class='titleCell']/following::a)[1]").click();

		Set<String> Window = driver.getWindowHandles();
		List<String> WindowList = new ArrayList<String>(Window);
		driver.switchTo().window(WindowList.get(2));
		driver.findElementByXPath("//input[@name='accountName']").sendKeys("Gokul");
		driver.findElementByXPath("//button[text()='Find Accounts']").click();
		/*
		 * WebDriverWait wait = new WebDriverWait (driver,20);
		 * Wait.Until.elemntToBeVisible(driver.findElementByXPath(
		 * "//div[contains(text(),records')]");
		 */
		Thread.sleep(3000);
		String ContactIDFrom = driver.findElementByXPath("(//table[@class='x-grid3-row-table']//a)[1]").getText();
		driver.findElementByXPath("(//table[@class='x-grid3-row-table']//a)[1]").click();
		driver.switchTo().window(WindowList.get(0));
		driver.findElementByXPath("(//td[@class='titleCell']/following::a)[2]").click();
		Set<String> ToWindow = driver.getWindowHandles();
		List<String> ToWindowList = new ArrayList<String>(ToWindow);
		driver.switchTo().window(ToWindowList.get(2));
		driver.findElementByXPath("//input[@name='accountName']").sendKeys("Gokul");
		driver.findElementByXPath("//button[text()='Find Accounts']").click();
		/*
		 * WebDriverWait wait = new WebDriverWait (driver,20);
		 * Wait.Until.elemntToBeVisible(driver.
		 * findElementByXPath("//div[contains(text(),'Displaying records')]");
		 */
		Thread.sleep(3000);
		// String ContactIDTo = driver.findElementByXPath
		// ("((//table[@class='x-grid3-row-table'])[2]//a)[1]").getText();
		driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[2]//a)[1]").click();
		driver.switchTo().window(WindowList.get(0));
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Accounts").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(ContactIDFrom);
		driver.findElementByXPath("//button[text()='Find Accounts']").click();
		/*
		 * WebDriverWait wait = new WebDriverWait (driver,20);
		 * Wait.Until.elemntToBeVisible(driver.
		 * findElementByXPath("//div[contains(text(),'No records')])");
		 */
		Thread.sleep(3000);
		if (driver.findElementByXPath("//div[@class='x-panel-bbar']//div[@class='x-paging-info']").getText()
				.contains("No records")) {
			System.out.println("Account merged");
		} else
			System.out.println("Account not merged");

	}

}
