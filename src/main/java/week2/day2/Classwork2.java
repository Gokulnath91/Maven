package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Classwork2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement drag = driver.findElementByXPath("//ul[@id='sortable']//li[1]");
		WebElement drop = driver.findElementByXPath("//ul[@id='sortable']//li[4]");
		WebElement move = driver.findElementByXPath("//ul[@id='sortable']//li[3]");

		Point location = drop.getLocation();
		System.out.println(location);
		Actions builder=new Actions(driver);
		builder.clickAndHold(drag).moveByOffset(11, 130).perform();
		builder.click(move).perform();
		


		
			
	}

}
