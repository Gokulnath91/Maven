package challenges;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollDown {
	public static void main(String[] args) throws InterruptedException, AWTException {

		// chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//new Select(element)
		// maximize the browser
		driver.manage().window().maximize();

		// load the browser with url
		driver.get("https://www.naukri.com/");
		driver.findElementByLinkText("Browse All Jobs").click();
		
		WebElement ele = driver.findElementByLinkText("Browse All Jobs");
		

		int y = driver.findElementByLinkText("Browse All Jobs")
				.getLocation().getY();

		// Way 1										   //x,y
		((JavascriptExecutor) driver).executeScript("scroll(0,"+y+");");

		// Way 2
		/*Actions builder = new Actions(driver);
		builder.sendKeys(Keys.PAGE_DOWN).build().perform();	*/	

	}
}



