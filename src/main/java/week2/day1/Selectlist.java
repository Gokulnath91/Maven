package week2.day1;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selectlist {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement dropDown1 = driver.findElementByXPath("(//section[@class='innerblock']//select)[1]");
		Select dropDown1List= new Select(dropDown1);
		dropDown1List.selectByIndex(1);
		WebElement dropDwon2 = driver.findElementByXPath("(//section[@class='innerblock']//select)[2]");
		Select dropDwon2List= new Select(dropDwon2);
		dropDwon2List.selectByVisibleText("Selenium");
		WebElement deropDwon3 = driver.findElementByXPath("(//section[@class='innerblock']//select)[3]");
		Select dropDwonList = new Select(deropDwon3);
		dropDwonList.selectByValue("1");
		WebElement dropDwon4 = driver.findElementByXPath("(//section[@class='innerblock']//select)[4]");
		Select dropDwon4List = new Select(dropDwon4);
		List<WebElement> count = dropDwon4List.getOptions();
		System.out.println("Count of option available under the dropdown is : "+count);
		driver.findElementByXPath("(//section[@class='innerblock']//select)[5]")
		.sendKeys(Keys.ARROW_DOWN,Keys.ENTER,Keys.ENTER);
		
		/*//doubt
		WebElement select1 = driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[2]");
		WebElement select2 = driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[3]");
		Actions builder = new Actions (driver);
		builder.sendKeys(Keys.LEFT_CONTROL).click(select1).sendKeys(Keys.LEFT_CONTROL).click(select2).perform();*/
		
		/*driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[2]").click();
		
		driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[3]").sendKeys(Keys.LEFT_CONTROL);
		driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[3]").click();
		WebElement dropDown5 = driver.findElementByXPath("(//section[@class='innerblock']//select)[5]");
		Select dropDownList = new Select(dropDown5);
		dropDownList.selectByIndex(1);
		*/
		
		//String Title = driver.getTitle();
		//System.out.println(Title);
		//driver.close();

		WebElement dropDwon6 = driver.findElementByXPath("(//section[@class='innerblock']//select)[6]");
		Select dropDwon6List = new Select(dropDwon6);
		dropDwon6List.selectByVisibleText("Selenium");
		dropDwon6List.selectByVisibleText("Appium");
		
		
		
	}

}
