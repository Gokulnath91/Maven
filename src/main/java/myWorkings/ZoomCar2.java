package myWorkings;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar2 {
//Method 2
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("//div[@class='component-popular-locations']/div[2]").click();
		driver.findElementByXPath("//button[text()='Next']").click();

		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("dd");
		String today = sdf.format(date);
		int tomorrow = Integer.parseInt(today) + 0;
		System.out.println("Tomorrow date is :" + tomorrow);
		Thread.sleep(3000);
		driver.findElementByXPath("//div[contains(text(),'" + tomorrow + "')]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		driver.findElementByXPath("//button[text()='Done']").click();
		Thread.sleep(6000);

		List<WebElement> PriceLsit = driver.findElementsByXPath("(//div[@class='car-amount']//div[1])");
		List<String> Price = new ArrayList<String>();
		for (WebElement P : PriceLsit) {
			String PR = P.getText();
			Price.add(PR);
		}

		List<Integer> Price1 = new ArrayList<Integer>();

		for (String inte : Price) {

			Price1.add(Integer.parseInt(inte.replaceAll("\\D", "")));
		}
		Integer max1 = Collections.max(Price1);

		int maxPriceIndex = 0;
		for (int i = 0; i < Price.size() - 1; i++) {
			if (max1.toString().equals(Price.get(i).replaceAll("\\D", ""))) {
				maxPriceIndex = maxPriceIndex + i;

			}

		}

		System.out.println(Price.get(maxPriceIndex));

		String CarName = driver.findElementByXPath(
				"(//div[contains(text(),'" + Price.get(maxPriceIndex).replaceAll("₹ ", "") + "')])/preceding::h3[1]")
				.getText();
		System.out.println("Number of result appears :" + Price.size());
		System.out.println("Maximum price of the car is : " + CarName + " -> " + Price.get(maxPriceIndex));
		driver.quit();
	}
}
