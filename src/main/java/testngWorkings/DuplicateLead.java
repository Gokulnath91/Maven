package testngWorkings;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DuplicateLead extends Annections {
	
	@BeforeTest
	public void sedData() {
		fileName="DupLead";
	}
	@Test(dependsOnMethods= {"testngWorkings.MergeLead.runMerge"},dataProvider="fetchData")
	public  void runDuplicate(String fName) throws InterruptedException {
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='gwtWidget subSectionBlock']//input)[2]").sendKeys(fName);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1500);
		String firstName = driver
				.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[1])[1]").getText();
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[1])[1]").click();
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		driver.findElementByXPath("//input[@name='submitButton']").click();
		if (driver.findElementById("viewLead_firstName_sp").getText().equals(firstName)) {
			System.out.println("Record was duplicated successfully");
		} else
			System.out.println("Record was not duplicated successfully");
	}

}
