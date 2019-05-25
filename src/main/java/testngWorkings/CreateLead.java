package testngWorkings;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends Annections {
	
	
	@BeforeTest
	public void sedData() {
		fileName="CLead";
	}
	
	@Test(dataProvider="fetchData")
	public void runCreateLead(String companyName,String firstName,String lastName) {
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
		
		driver.findElementByXPath("//input[@name='submitButton']").click();
				
		
		
		if (driver.findElementById("viewLead_firstName_sp").getText().equals(firstName)) {
			System.out.println("First name is verified and record was created successfully");
		}else System.out.println("First name is verified and record was not created successfully");
		System.out.println("The title is : "+driver.getTitle());
		
		

	}

}
