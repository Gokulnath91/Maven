package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		driver
		.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::input[1]")
		.click();
		driver
		.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::input[3]")
		.click();
		
		
		boolean b = driver
				.findElementByXPath("//label[text()='Confirm Selenium is checked']/following-sibling::input[1]")
				.isSelected();
		if (b == true) {
			System.out.println("The check box is selected");
		} else
			System.out.println("The check box is not selected");
		
		boolean c = driver
		.findElementByXPath("//label[text()='DeSelect only checked']/following-sibling::input[1]")
		.isSelected();
		if (c==true) {
			driver
			.findElementByXPath("//label[text()='DeSelect only checked']/following-sibling::input[1]")
			.click();
		}
		
		boolean d = driver
				.findElementByXPath("//label[text()='DeSelect only checked']/following-sibling::input[2]")
				.isSelected();
				if (d==true) {
					driver
					.findElementByXPath("//label[text()='DeSelect only checked']/following-sibling::input[2]")
					.click();
				}
				
				
	List<WebElement> list = driver.findElementsByXPath("//label[text()='Select all below checkboxes ']/following-sibling::input");
	System.out.println(list.size());
	for (WebElement webElement : list) {
		webElement.click();
	}
	/*for (int i = 0; i < list.size(); i++) {
		list[i].click();		
		
		
	}*/
	

		//driver.close();
	}

}
