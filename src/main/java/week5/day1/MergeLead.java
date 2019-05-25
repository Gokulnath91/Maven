package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MergeLead extends Annections {
@Test
	public  void runMerge() throws InterruptedException {
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//input[@id='partyIdFrom']/following-sibling::a[1]").click();
		Set<String> FromLeadWindow = driver.getWindowHandles();
		List<String> FromLeadWindowList = new ArrayList<String>(FromLeadWindow);
		driver.switchTo().window(FromLeadWindowList.get(2));
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("Gokul");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String FistResult = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").getText();
		driver.findElementByXPath("//input[@name='firstName']").clear();
		driver.findElementByXPath("//input[@name='id']").sendKeys(FistResult);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").click();
		//driver.close();
		driver.switchTo().window(FromLeadWindowList.get(0));
		driver.findElementByXPath("//input[@id='partyIdTo']/following-sibling::a[1]").click();
		Set<String> ToLeadWindow = driver.getWindowHandles();
		List<String> ToLeadWindowList = new ArrayList<String>(ToLeadWindow);
		driver.switchTo().window(ToLeadWindowList.get(2));
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("Gokul");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String SecondResult = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[2]").getText();
		driver.findElementByXPath("//input[@name='firstName']").clear();
		driver.findElementByXPath("//input[@name='id']").sendKeys(SecondResult);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").click();
		System.out.println(FistResult);
		System.out.println(SecondResult);
		driver.switchTo().window(FromLeadWindowList.get(0));
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(FistResult);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(
		driver.findElementByXPath("//div[@class='x-paging-info']")));
		boolean b = driver.findElementByXPath("//div[@class='x-paging-info']").getText().contains("No record");
		if (b==true) {
			System.out.println("Record was merged successfully");
		}else System.out.println("Record was not merged successfully");
		
				
	

	}

}
