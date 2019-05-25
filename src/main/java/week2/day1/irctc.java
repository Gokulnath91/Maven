package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class irctc {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver irctc = new ChromeDriver();
		irctc.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		irctc.manage().window().maximize();
		irctc.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		irctc.findElementById("userRegistrationForm:userName").sendKeys("Gokulnath91");
		irctc.findElementById("userRegistrationForm:password").sendKeys("Passw0rd");
		irctc.findElementById("userRegistrationForm:confpasword").sendKeys("Passw0rd");
		WebElement SecurityQuestion = irctc.findElementById("userRegistrationForm:securityQ");
		Select SecurityQuestionList = new Select(SecurityQuestion);
		SecurityQuestionList.selectByVisibleText("What is your pet name?");
		irctc.findElementById("userRegistrationForm:securityAnswer").sendKeys("Caesar");
		irctc.findElementById("userRegistrationForm:firstName").sendKeys("Gokul");
		irctc.findElementById("userRegistrationForm:middleName").sendKeys("Nath");
		irctc.findElementById("userRegistrationForm:lastName").sendKeys("J");
		irctc.findElementById("userRegistrationForm:gender:0").click();
		irctc.findElementById("userRegistrationForm:maritalStatus:0").click();
		WebElement dateDropdown = irctc.findElementById("userRegistrationForm:dobDay");
		Select dateList = new Select(dateDropdown);
		dateList.selectByVisibleText("12");
		WebElement monthDropdown = irctc.findElementById("userRegistrationForm:dobMonth");
		Select monthList = new Select(monthDropdown);
		monthList.selectByVisibleText("JUN");
		WebElement yearDropdown = irctc.findElementById("userRegistrationForm:dateOfBirth");
		Select yearList = new Select(yearDropdown);
		yearList.selectByVisibleText("1991");
		WebElement occupationDropdown = irctc.findElementById("userRegistrationForm:occupation");
		Select occupationList = new Select(occupationDropdown);
		occupationList.selectByValue("1");
		irctc.findElementById("userRegistrationForm:uidno").sendKeys("529470394592");
		irctc.findElementById("userRegistrationForm:idno").sendKeys("AYKPG8433D");
		WebElement countryDropdown = irctc.findElementById("userRegistrationForm:countries");
		Select contryList = new Select(countryDropdown);
		//List<WebElement> list = contryList.getOptions();
		contryList.selectByVisibleText("India");
		irctc.findElementById("userRegistrationForm:email").sendKeys("gokulnath71@gmail.com");
		irctc.findElementById("userRegistrationForm:mobile").sendKeys("9840044293");
		WebElement nationalityDreopdown = irctc.findElementById("userRegistrationForm:nationalityId");
		Select nationalityList = new Select(nationalityDreopdown);
		nationalityList.selectByVisibleText("India");
		irctc.findElementById("userRegistrationForm:address").sendKeys("3/42 Moovendhar Street");
		irctc.findElementById("userRegistrationForm:street").sendKeys("Thirumalai Nagar");
		irctc.findElementById("userRegistrationForm:area").sendKeys("Ramapuram");
		irctc.findElementById("userRegistrationForm:pincode").sendKeys("600089",Keys.TAB);
	 	Thread.sleep(5000);
		
	 	//doubt
		/*WebDriverWait wait = new WebDriverWait (irctc, 10);
		wait.until(ExpectedConditions.eLE
				(irctc.findElementById("userRegistrationForm:cityName")));
		*/		
				/*WebDriverWait wait = new WebDriverWait(irctc ,15);
		WebElement firstResult = wait.until(ExpectedConditions.elementToBeClickable(
				irctc.findElementById("userRegistrationForm:cityName")));
		*/
				
		
		WebElement cityDreopdown = irctc.findElementById("userRegistrationForm:cityName");
		Select cityList = new Select(cityDreopdown);
		cityList.selectByVisibleText("Kanchipuram");
		Thread.sleep(5000);
		WebElement postDreopdown = irctc.findElementById("userRegistrationForm:postofficeName");
		Select postList = new Select(postDreopdown);
		List<WebElement> postOffice = postList.getOptions();
		postList.selectByIndex(postOffice.size()-1);
		irctc.findElementById("userRegistrationForm:landline").sendKeys("9551656520");
		irctc.findElementById("userRegistrationForm:resAndOff:1").click();
		
		irctc.findElementById("userRegistrationForm:addresso").sendKeys("7th Floor Hardy Tower");
		irctc.findElementById("userRegistrationForm:streeto").sendKeys("Ramanujam IT City");
		irctc.findElementById("userRegistrationForm:areao").sendKeys("Taramani");
		WebElement countryDropdown1 = irctc.findElementById("userRegistrationForm:countrieso");
		Select contryList1 = new Select(countryDropdown1);
		contryList1.selectByVisibleText("India");
		irctc.findElementById("userRegistrationForm:pincodeo").sendKeys("600113",Keys.TAB);
		Thread.sleep(5000);
		
		WebElement cityDreopdown1 = irctc.findElementById("userRegistrationForm:cityNameo");
		Select cityList1 = new Select(cityDreopdown1);
		cityList1.selectByVisibleText("Chennai");
		Thread.sleep(5000);
		WebElement postDreopdown1 = irctc.findElementById("userRegistrationForm:postofficeNameo");
		Select postList1 = new Select(postDreopdown1);
		postList1.selectByVisibleText("Tidel Park S.O");
		irctc.findElementById("userRegistrationForm:landlineo").sendKeys("0444008900");

		//irctc.quit();


		
		
		
		
		
		
		
		
		
		
	}

}
