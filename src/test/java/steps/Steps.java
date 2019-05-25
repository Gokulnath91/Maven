package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	public static ChromeDriver driver;
	public static String LeadID;
	public static String LeadIDToVerify;
	Set<String> FromLeadWindow;
	List<String> FromLeadWindowList;
	public static String FirstNameToVerify;

	@Before
	public void LoadURL() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");

	}

	@After
	public void closeBrowser() {
//		Thread.sleep(5000);
		driver.quit();

	}

	@Given("Enter the username as (.*)")
	public void enterTheUsername(String UName) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementById("username").sendKeys(UName);
	}

	@Given("Enter the password as (.*)")
	public void enterThePassword(String pwd) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementById("password").sendKeys(pwd);
	}

	@When("Click on login button")
	public void clickOnLoginButton() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("user should navigate to homepage")
	public void userShouldNavigateToHomepage() {
		// Write code here that turns the phrase above into concrete actions
		System.err.println("Navigated to home page");
	}

	@Given("click on CRM\\/SFA")
	public void clickOnCRMSFA() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("clcik on Create Lead")
	public void clcikOnCreateLead() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementByLinkText("Create Lead").click();
	}

	@When("enter the Company Name (.*)")
	public void enterTheCompanyName(String Cname) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementById("createLeadForm_companyName").sendKeys(Cname);
	}

	@When("enter the First name (.*)")
	public void enterTheFirstName(String Fname) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
	}

	@When("enter the Last name (.*)")
	public void enterTheLastName(String Lname) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
	}

	@When("click on Create Lead button")
	public void clickOnCreateLeadButton() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//input[@name='submitButton']").click();
	}

	@Then("should create the lead (.*)")
	public void shouldCreateTheLead(String FName) {
		// Write code here that turns the phrase above into concrete actions
		boolean b = driver.findElementById("viewLead_firstName_sp").getText().equals(FName);

		if (b == true) {
			System.out.println("First name is verified and record was created successfully");
		} else
			System.out.println("First name is verified and record was not created successfully");
	}

	@Then("Should Navigate to home page as (.*)")
	public void homePage(String UName) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		if (driver.findElementByXPath("//div[@id='form']//h2").getText().replaceAll(" ", "").toLowerCase()
				.contains(UName.toLowerCase())) {
			System.out.println("Navigated to home page");
		} else
			System.out.println("Not Navigated to home page");

	}

	@Then("should not create the lead")
	public void shouldNotCreateTheLead() {
		// Write code here that turns the phrase above into concrete actions

		if (driver.findElementByXPath("//li[@class='errorMessage']").getText()
				.contains("The following required parameter is missing")) {
			System.out.println("Lead is not created");
		} else
			System.out.println("Lead is created");
	}

	@But("Should stay in login page")
	public void shouldStayInLoginPage() {
		// Write code here that turns the phrase above into concrete actions
		if (driver.findElementByXPath("//div[@id='errorDiv']//p[2]").getText()
				.contains("error occurred during login")) {
			System.out.println(
					"following error occurred during login: Password incorrect. Application remains the same page");
		} else
			System.out.println("Logged in");

	}

	//Edit Lead
	@Given("click on Leads Tab")
	public void clickOnLeadsTab() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//a[text()='Leads']").click();
	}

	@Given("clcik on Find Leads")
	public void clcikOnFindLeads() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByLinkText("Find Leads").click();
	}

	@Given("enter the Firt Name (.*)")
	public void enterTheFirtName(String fName) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("(//div[@class='gwtWidget subSectionBlock']//input)[2]").sendKeys(fName);
	}

	@Given("click on Find Leads button")
	public void clickOnFindLeadsButton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	}

	@Given("Click on the first result displayed")
	public void clickOnTheFirstResultDisplayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").click();
		
		}

	@Given("Click on edit button")
	public void clickOnEditButton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//a[text()='Edit']").click();
	}

	@Given("update the company name (.*)")
	public static void updateTheCompanyName(String CompanyName) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(CompanyName);
	}

	@When("Click on the update button")
	public void clickOnTheUpdateButton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//input[@value='Update']").click();
		}

	@Then("Should update the company name (.*)")
	public static void shouldUpdateTheCompanyName(String checkBefore) {
	    // Write code here that turns the phrase above into concrete actions
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
	
	
	@But("Should not update the company name (.*)")
	public static void shouldNotUpdateTheCompanyName(String errorMessage) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		if (driver.findElementByXPath("//li[@class='errorMessage']").getText().contains(errorMessage)) {
			System.out.println("Lead not updated");
		} else
			System.out.println("Lead updated successfully");
	}
	
	//Merge Lead Steps
	
	@Given("clcik on Merge Leads")
	public void clcikOnMergeLeads() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByLinkText("Merge Leads").click();
	}

	@Given("Click on From Lead Icon")
	public void clickOnFromLeadIcon() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//input[@id='partyIdFrom']/following-sibling::a[1]").click();
	}

	@Given("Navigate to From Lead find leads page")
	public void navigateToFromLeadFindLeadsPage() {
	    // Write code here that turns the phrase above into concrete actions
		FromLeadWindow = driver.getWindowHandles();
		FromLeadWindowList = new ArrayList<String>(FromLeadWindow);
		driver.switchTo().window(FromLeadWindowList.get(2)); new cucumber.api.PendingException();
	}

	@Given("enter the From Lead Firt Name (.*)")
	public void enterTheFromLeadFirtNameGokul(String FName1) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(FName1);
	}



	@Given("get lead ID of From Lead first result")
	public void getLeadIDOfFromLeadFirstResult() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1500);
		LeadID = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").getText();
		LeadIDToVerify=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").getText();
		}

	@Given("Enter the From Lead Lead ID")
	public void enterTheFromLeadLeadID() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//input[@name='firstName']").clear();
		driver.findElementByXPath("//input[@name='id']").sendKeys(LeadID);
	}

	@Given("Click on the From Lead first result displayed")
	public void clickOnTheFromLeadFirstResultDisplayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1500);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").click();	
		driver.switchTo().window(FromLeadWindowList.get(0));

		}
	
	@Given("Click on the To Lead first result displayed")
	public void clickOnTheToLeadFirstResultDisplayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1500);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").click();
		driver.switchTo().window(FromLeadWindowList.get(0));
		}


	@Given("Click on To Lead Icon")
	public void clickOnToLeadIcon() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//input[@id='partyIdTo']/following-sibling::a[1]").click();
	}

	@Given("Navigate to To Lead find leads page")
	public void navigateToToLeadFindLeadsPage() {
	    // Write code here that turns the phrase above into concrete actions
		FromLeadWindow = driver.getWindowHandles();
		FromLeadWindowList = new ArrayList<String>(FromLeadWindow);
		driver.switchTo().window(FromLeadWindowList.get(2));
		}

	@Given("enter the To Lead Firt Name (.*)")
	public void enterTheToLeadFirtNameMayil(String fName2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(fName2);
	}


	@Given("get To Lead lead ID of first result")
	public void getToLeadLeadIDOfFirstResult() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1500);
		LeadID = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").getText();
		}

	@Given("Enter the To Lead Lead ID")
	public void enterTheToLeadLeadID() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//input[@name='firstName']").clear();
		driver.findElementByXPath("//input[@name='id']").sendKeys(LeadID);
	}


	@Given("Click on Merge Button")
	public void clickOnMergeButton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByLinkText("Merge").click();
	}

	
	@Given("Accept the alert popup")
	public void accepTheAlertPopup() {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().accept();
	}
	
	@Given("Enter the Lead ID to verify")
	public void enterTheLeadIDToVerify() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//input[@name='id']").sendKeys(LeadIDToVerify);
	}
	
	@Then("Lead ID should not be available (.*)")
	public void leadIDShouldNotBeAvailableNoRecord(String ErrorMessage) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1500);
		if (driver.findElementByXPath("//div[@class='x-paging-info']").getText().contains(ErrorMessage)) {
			System.out.println("Record was merged successfully");
		}else System.out.println("Record was not merged successfully");	}
		
	//Duplicate Lead
	
	@Given("Click on Duplicate Lead Icon")
	public void clickOnDuplicateLeadIcon() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
	}


	@Then("Verify the first name")
	public void verifyTheFirstName() {
	    // Write code here that turns the phrase above into concrete actions
		if (driver.findElementById("viewLead_firstName_sp").getText().equals(FirstNameToVerify)) {
			System.out.println("Record was duplicated successfully");
		} else
			System.out.println("Record was not duplicated successfully");
	}	
	
	
	@Given("Save the first Name to verify")
	public void saveTheFirstNameToVerify() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1500);
		FirstNameToVerify = driver
				.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[1])[1]").getText();	}
	
	//Delete Lead
	
	@Given("Save the first lead ID to verify")
	public void saveTheFirstLeadIDToVerify() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1500);
		LeadIDToVerify= driver
				.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1])[1]").getText();	
		}
	
	
	@When("Click on Delete Lead Icon")
	public void clickOnDeleteLeadIcon() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//a[text()='Delete']").click();
	}

	@When("Enter the Lead ID")
	public void enterTheLeadID() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("(//div[@class='gwtWidget subSectionBlock']//input)[1]").sendKeys(LeadIDToVerify);
	}

	@Then("Verify the Lead ID (.*)")
	public void verifyTheLeadID(String errMsg) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1500);
		if (driver.findElementByXPath("//div[@class='x-paging-info']").getText().equals(errMsg)) {
			System.out.println("Record was deleted successfully");
		} else
			System.out.println("Record was not deleted successfully");	}


	
}
