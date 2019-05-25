package week5.day1.homework;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditLead extends Common {
	@Test(dataProvider="fetchData")
	public void runEdit(String CompanyName,String FirstName) throws InterruptedException {
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='gwtWidget subSectionBlock']//input)[2]").sendKeys(FirstName);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").click();
		boolean title = driver.getTitle().contentEquals("View Lead | opentaps CRM");
		if (title == true) {
			System.out.println("Title is verified and the same is correct");
		} else
			System.out.println("Title is verified and the same is not correct");
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
		System.out.println(updatedName);
		System.out.println("Before Update : " + checkBefore);
		System.out.println(checkBefore.length());
		String trim = Checkafter.trim();
		boolean equals = checkBefore.equalsIgnoreCase(trim);
		System.out.println(equals);
		System.out.println("After Trim : " + trim);
		System.out.println(trim.length());

		if (equals == true) {
			System.out.println("Confirmed the change name and record was updated successfully");
		} else
			System.out.println("Confirmed the change name and record was not updated successfully");


	}
	@BeforeTest
	public void SetFile() {
		fileName="EditLead";
	}

}
