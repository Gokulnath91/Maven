package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ops);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("gokulnath71@gmail.com");
		driver.findElementById("pass").sendKeys("gomathi@1");
		driver.findElementById("loginbutton").click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElementByXPath("//input[@data-testid='search_input']")));
		driver.findElementByXPath("//input[@data-testid='search_input']").click();
		driver.findElementByXPath("//input[@data-testid='search_input']").sendKeys("Test Leaf", Keys.ENTER);
		/*wait.until(ExpectedConditions
				.elementToBeSelected(driver.findElementByXPath("(//div[text()='Places'])[1]")));
*/
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[text()='Places'])[1]").click();
		if (driver.findElementByXPath("//a[text()='TestLeaf']").getText().equals("TestLeaf")) {
			System.out.println("TestLeaf page is present");
		} else
			System.out.println("TestLeaf page is not present");
		if (driver.findElementByXPath("(//div[@class='_ohf rfloat'])[2]//button").getText().equals("Like")) {
			driver.findElementByXPath("(//div[@class='_ohf rfloat'])[2]//button").click();
		} else
			System.out.println("Already Liked");
		driver.findElementByXPath("//a[text()='TestLeaf']").click();
		if (driver.getTitle().contains("Test Leaf")) {
			System.out.println("Title is verified");
		} else
			System.out.println("Title is not verified");
		System.out.println("Number of likes for TestLeaf is : " + driver
				.findElementByXPath("//div[contains(text(),'people like this')]").getText().replaceAll("\\D", ""));

		driver.quit();

	}

}
