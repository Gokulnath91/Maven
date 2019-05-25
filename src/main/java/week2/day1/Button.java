package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		System.out.println(driver.findElementById("position").getLocation());
		System.out.println(driver.findElementById("color").getCssValue("background-color"));
		System.out.println(driver.findElementById("size").getSize());
	
		
		
		driver.findElementByXPath("//button[text()='Go to Home Page']").click();
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.quit();
		
	}

}
