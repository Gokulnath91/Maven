package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Classwork {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement drag = driver.findElementById("draggable");
		Point location = drag.getLocation();
		System.out.println(location);
		Actions builder=new Actions(driver);
		int xOffset = 8;
		int yOffset = 8;
		builder.dragAndDropBy(drag, xOffset+120, yOffset+120).perform();
		
		
			
	}

}
