package testngWorkings;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MergeLead extends Annections {
	@BeforeTest
	public void sedData() {
		fileName="MLead";
	}
	@Test(dependsOnMethods= {"testngWorkings.EditLead.runEdit"},dataProvider="fetchData")

	public  void runMerge(String fName1, String fName2) throws InterruptedException {
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//input[@id='partyIdFrom']/following-sibling::a[1]").click();
		Set<String> FromLeadWindow = driver.getWindowHandles();
		List<String> FromLeadWindowList = new ArrayList<String>(FromLeadWindow);
		driver.switchTo().window(FromLeadWindowList.get(2));
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(fName1);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1500);
		String FistResult = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").getText();
		driver.findElementByXPath("//input[@name='firstName']").clear();
		driver.findElementByXPath("//input[@name='id']").sendKeys(FistResult);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1500);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").click();
		//driver.close();
		driver.switchTo().window(FromLeadWindowList.get(0));
		driver.findElementByXPath("//input[@id='partyIdTo']/following-sibling::a[1]").click();
		Set<String> ToLeadWindow = driver.getWindowHandles();
		List<String> ToLeadWindowList = new ArrayList<String>(ToLeadWindow);
		driver.switchTo().window(ToLeadWindowList.get(2));
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(fName2);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1500);
		String SecondResult = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").getText();
		driver.findElementByXPath("//input[@name='firstName']").clear();
		driver.findElementByXPath("//input[@name='id']").sendKeys(SecondResult);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1500);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").click();
		driver.switchTo().window(ToLeadWindowList.get(0));
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(FistResult);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1500);
		if (driver.findElementByXPath("//div[@class='x-paging-info']").getText().contains("No record")) {
			System.out.println("Record was merged successfully");
		}else System.out.println("Record was not merged successfully");
		
				
	

	}

}
