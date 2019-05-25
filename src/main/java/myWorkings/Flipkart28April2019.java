package myWorkings;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart28April2019 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='✕']").click();
		Actions Action = new Actions(driver);
		Action.moveToElement(driver.findElementByXPath("//span[text()='Electronics']")).perform();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//a[text()='Mi'][1]")));
		String brand = driver.findElementByXPath("(//a[text()='Mi'])[1]").getText();
		System.out.println(brand);
		driver.findElementByXPath("(//a[text()='Mi'])[1]").click();
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//div[@class='_3wU53n']")));
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("Mi")) {
			System.out.println("Header is verified");
		} else
			System.out.println("Header is not verified");
		driver.findElementByXPath("//div[text()='Newest First']").click();

		/*
		 * WebDriverWait wait1 = new WebDriverWait(driver,20);
		 * wait1.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath
		 * ("(//div[@class='_3wU53n'])")));
		 */
		Thread.sleep(3000);

		List<WebElement> mobile = driver.findElementsByXPath("//div[@class='_3wU53n']");
		List<WebElement> Price = driver.findElementsByXPath("(//div[@class='_1uv9Cb']//div[1])");
		Map<String, String> mobileList = new LinkedHashMap<String, String>();
		for (int i = 0; i < mobile.size(); i++) {
			String mobileName = mobile.get(i).getText();
			String mobilePrice = Price.get(i).getText().replaceAll("\\D", "");
			mobileList.put(mobileName, mobilePrice);
		}
		System.out.println("Lsit fo mobiles with price");

		for (Entry<String, String> Re : mobileList.entrySet()) {

			System.out.println(Re.getKey() + " --> ₹ " + Re.getValue());

		}
		String titleBefore = mobile.get(mobile.size() - mobile.size()).getText();
//		System.out.println(titleBefore);
		String titleBefore1 = "";
		char[] charArray = titleBefore.toCharArray();
		for (int i = 0; i <= 4; i++) {
			titleBefore1 = titleBefore1 + charArray[i];
		}
//		System.out.println(titleBefore1);
		driver.findElementByXPath("//div[@class='_3wU53n'][1]").click();
		Set<String> windowList = driver.getWindowHandles();
		List<String> windowList1 = new ArrayList<String>(windowList);
		driver.switchTo().window(windowList1.get(2));
		String titleAfter = driver.getTitle();
//		System.out.println(titleAfter);

		if (titleAfter.contains(titleBefore1)) {
			System.out.println("Selected product is verified");
		} else
			System.out.println("Selected product is not verified");

		driver.quit();
	}

}
