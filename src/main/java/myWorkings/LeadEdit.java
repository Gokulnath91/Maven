	package myWorkings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeadEdit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='gwtWidget subSectionBlock']//input)[2]").sendKeys("Gokulnath");
		
		

		driver.findElementByXPath("//button[text()='Find Leads']").click();

		 Thread.sleep(3000);

/*		WebDriverWait wait1 = new WebDriverWait(driver, 100);
		wait1.until(ExpectedConditions.elementToBeClickable(
				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]")))
				.click();
*/
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]")
			.click(); 
		boolean title = driver.getTitle().contentEquals("View Lead | opentaps CRM");
		if (title == true) {
			System.out.println("Title is verified and the same is correct");
		} else
			System.out.println("Title is verified and the same is not correct");
		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Datatracks Services Limited");
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

		driver.quit();

	}

}
