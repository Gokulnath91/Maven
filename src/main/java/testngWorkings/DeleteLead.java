package testngWorkings;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteLead extends Annections {
	
	@BeforeTest
	public void sedData() {
		fileName="DelLead";
	}
	@Test(dependsOnMethods= {"testngWorkings.DuplicateLead.runDuplicate"},dataProvider="fetchData")
	public void runDelete(String fName, String errMsg) throws InterruptedException {
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='gwtWidget subSectionBlock']//input)[2]").sendKeys(fName);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1500);
		String firstResult = driver
				.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").getText();
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").click();
		driver.findElementByXPath("//a[text()='Delete']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='gwtWidget subSectionBlock']//input)[1]").sendKeys(firstResult);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//div[@class='x-paging-info']")));*/
		Thread.sleep(1500);
		if (driver.findElementByXPath("//div[@class='x-paging-info']").getText().equals(errMsg)) {
			System.out.println("Record was deleted successfully");
		} else
			System.out.println("Record was not deleted successfully");
		driver.quit();
	}

}
