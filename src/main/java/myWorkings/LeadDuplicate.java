package myWorkings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeadDuplicate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
for (int i = 0; i < 25; i++) {
	

		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("gokulnath71@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		;
		Thread.sleep(1500);
		String firstResult = driver
				.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[1])[1]").getText();
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[1])[1]").click();
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		driver.findElementByXPath("//input[@name='submitButton']").click();
		boolean b = driver.findElementById("viewLead_firstName_sp").getText().equals(firstResult);
		if (b == true) {
			System.out.println("Record was duplicated successfully");
		} else
			System.out.println("Record was not duplicated successfully");
}
		driver.quit();

	}

}
