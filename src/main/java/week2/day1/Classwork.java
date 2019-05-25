package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Classwork {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Datatracks");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gokulnath");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		WebElement dropdown1 = driver.findElementById("createLeadForm_dataSourceId");
		Select select= new Select(dropdown1);
		select.selectByVisibleText("Existing Customer");
		
		WebElement dropdown2 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select select2= new Select(dropdown2);
		List<WebElement> options = select2.getOptions();
		System.out.println(options.size());	
		select2.selectByIndex(options.size()-1);
		
		
		
		//driver.findElementByClassName("smallSubmit").click();
		//String Title = driver.getTitle();
		//System.out.println(Title);
		//driver.close();

		
		
		
		
	}

}
