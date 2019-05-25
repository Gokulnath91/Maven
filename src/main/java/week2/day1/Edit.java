package week2.day1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("gokulnath71@gmail.com");
		driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/div/div/input")
		.sendKeys(Keys.BACK_SPACE,"gokul",Keys.TAB);
		System.out.println(driver.findElementByName("username").getAttribute("value"));
		driver.findElementByXPath("//*[@id='contentblock']/section/div[4]/div/div/input").clear();
		System.out.println(driver.findElementByXPath("//*[@id=\'contentblock']/section/div[5]/div/div/input")
				.isEnabled());



		
		
		
		//driver.findElementByClassName("smallSubmit").click();
		//String Title = driver.getTitle();
		//System.out.println(Title);
		//driver.close();

		
		
		
		
	}

}
