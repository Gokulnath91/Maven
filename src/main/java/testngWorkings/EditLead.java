package testngWorkings;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditLead extends Annections {
	
	@BeforeTest
	public void sedData() {
		fileName="ELead";
	}
	@Test(dependsOnMethods= {"testngWorkings.CreateLead.runCreateLead"},  dataProvider="fetchData")
	public void runEdit(String firstName,String CompanyName) throws InterruptedException {
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='gwtWidget subSectionBlock']//input)[2]").sendKeys(firstName);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1500);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").click();
		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(CompanyName);
		String checkBefore = driver.findElementById("updateLeadForm_companyName").getAttribute("value");
		driver.findElementByXPath("//input[@value='Update']").click();

		String updatedName = driver.findElementById("viewLead_companyName_sp").getText();
		String[] split1 = updatedName.split("\\s");
		String Checkafter = "";
		for (int i = 0; i < split1.length - 1; i++) {
			Checkafter = Checkafter + split1[i] + " ";
		}
		if (checkBefore.equals(Checkafter.trim())) {
			System.out.println("Confirmed the change name and record was updated successfully");
		} else
			System.out.println("Confirmed the change name and record was not updated successfully");

	}

}
