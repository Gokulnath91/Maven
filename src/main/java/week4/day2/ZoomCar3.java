package week4.day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar3 {
	//Method 1
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

		List<WebElement> CarLsit = driver.findElementsByXPath("(//div[@class='details']//h3[1])");
		System.out.println("Number of result appears are :" + CarLsit.size());
		List<WebElement> PriceLsit = driver.findElementsByXPath("(//div[@class='car-amount']//div[1])");
		// System.out.println(PriceLsit.size());

		Map<String, String> Result = new LinkedHashMap<String, String>();
		List<String> Value = new ArrayList<String>();

		for (int i = 0; i < CarLsit.size(); i++) {
			String text = CarLsit.get(i).getText();

			String Price = PriceLsit.get(i).getText().replaceAll("\\D", "");
			// System.out.println(Price);
			Result.put(text, Price);

		}
		// System.out.println(Result.size());

		for (Entry<String, String> c : Result.entrySet()) {
			Value.add(c.getValue());

		}
		String last = Collections.max(Value);
		
		
		
		for (Entry<String, String> c : Result.entrySet()) {
			
		
			if (c.getValue().equals(last)) {
				System.out.print("Maximum price of the car is : "+c.getKey() + " -> ₹ " + c.getValue());

			}

		}
		driver.quit();

	}
}
