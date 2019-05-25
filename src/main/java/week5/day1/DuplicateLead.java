package week5.day1;


import org.testng.annotations.Test;

public class DuplicateLead extends Annections {
	@Test
	public  void runDuplicate() throws InterruptedException {
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
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

}
