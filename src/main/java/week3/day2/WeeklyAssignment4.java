package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeeklyAssignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		driver.findElementById("txtStationFrom").clear();

		driver.findElementById("txtStationFrom").sendKeys("MS", Keys.TAB);
		driver.findElementById("txtStationTo").clear();

		driver.findElementById("txtStationTo").sendKeys("TPJ", Keys.TAB);
		boolean b = driver.findElementById("chkSelectDateOnly").isSelected();
		if (b == true) {
			driver.findElementById("chkSelectDateOnly").click();
		}

		List<WebElement> TrainNumbers = driver
				.findElementsByXPath("(//a[@title='Click on train number to View fare and schedule'])");
		/*
		 * System.out.println(TrainNumbers.size()); System.out.println(TrainNumbers);
		 */
		
		//System.out.println(TrainNumbers.get(2).getText());
		List<String> List1 = new ArrayList<String>();
		int count = 0;
		for (WebElement c : TrainNumbers) {
			if (List1.contains(c.getText())) {
				List1.add(c.getText());
				++count;
			} else
				List1.add(c.getText());

			// System.out.println(c.getText());

		}

		if (count > 0) {
			System.out.println("There is duplicate values in Train number");
		} else
			System.out.println("There is no duplicate values in Train number");

		Collections.sort(List1);
		// System.out.println(List1);

		driver.findElementByXPath("//a[text()='Train']").click();
		List<WebElement> NewTrainNumbers = driver
				.findElementsByXPath("(//a[@title='Click on train number to View fare and schedule'])");
		List<String> List2 = new ArrayList<String>();
		for (WebElement c : NewTrainNumbers) {
			List2.add(c.getText());
			// System.out.println(c.getText());

		}
		// System.out.println(List2);
		
		if (List1.equals(List2)) {
			System.out.println("Train numbers are sorted properly");
		} else
			System.out.println("Train numbers are sorted properly");

		driver.quit();

	}
}
