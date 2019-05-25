package myWorkings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

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
		driver.findElementByXPath("//input[@data-testid='search_input']").sendKeys("Test Leaf");
		driver.findElementByXPath("//button[@data-testid='facebar_search_button']").click();

		driver.findElementByXPath("(//a[text()='TestLeaf'])[1]").click();
		String Like = driver.findElementByXPath("(//div[@class='lfloat _ohe']//button[1])[1]").getText();
		System.out.println(Like);
		String check = "Like";
		if (Like.equals(check)) {
			driver.findElementByXPath("(//div[@class='lfloat _ohe']//button[1])[1]").click();
			driver.findElementByXPath("//input[@data-testid='search_input']").click();
			driver.findElementByXPath("//input[@data-testid='search_input']").clear();
			driver.findElementByXPath("//input[@data-testid='search_input']").sendKeys("Test Leaf");
			driver.findElementByXPath("//button[@data-testid='facebar_search_button']").click();
		} else
			System.out.println("Already Liked");
		String Number = driver.findElementByXPath("//div[contains(text(),'people like this')]").getText()
				.replaceAll("\\D", "");
		System.out.println("Number of likes for TestLeaf are : " + Number);
		driver.quit();
	}

}
