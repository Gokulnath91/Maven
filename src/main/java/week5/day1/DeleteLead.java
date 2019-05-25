package week5.day1;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DeleteLead extends Annections {
@Test
	public void runDelete() throws InterruptedException {
			String errMsg = "No records to display";

			driver.findElementByLinkText("CRM/SFA").click();

			driver.findElementByXPath("//a[text()='Leads']").click();
			driver.findElementByLinkText("Find Leads").click();
			driver.findElementByXPath("//span[text()='Phone']").click();
			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9551656520");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			;
			Thread.sleep(1500);

		
			String firstResult = driver
					.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").getText();
			// Thread.sleep(1500);
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").click();
			driver.findElementByXPath("//a[text()='Delete']").click();
			driver.findElementByLinkText("Find Leads").click();
			driver.findElementByXPath("(//div[@class='gwtWidget subSectionBlock']//input)[1]").sendKeys(firstResult);
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			// Thread.sleep(1000);

			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//div[@class='x-paging-info']")));

			// System.out.println(driver.findElementByXPath("//div[@class='x-paging-info']").getText());
			boolean b = driver.findElementByXPath("//div[@class='x-paging-info']").getText().equals(errMsg);
			if (b == true) {
				System.out.println("Record was deleted successfully");
			} else
				System.out.println("Record was not deleted successfully");
		

		driver.quit();
	}

}
