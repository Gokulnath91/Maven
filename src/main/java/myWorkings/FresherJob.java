package myWorkings;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FresherJob {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.indeed.co.in/Fresher-jobs");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> linkList = driver.findElementsByXPath("//div[@class='title']//a");
		// System.out.println(linkList.get(1).getAttribute("href"));
		String Mainwindow = driver.getWindowHandle();
		for (int i = 0; i < linkList.size(); i++) {
			((JavascriptExecutor) driver).executeScript("window.open(arguments[0])",
					linkList.get(i).getAttribute("href"));
			Set<String> OpenWindow = driver.getWindowHandles();
			List<String> ListOfWindows = new ArrayList<String>(OpenWindow);
			driver.switchTo().window(ListOfWindows.get(ListOfWindows.size() - 1));
			System.out.println(driver.getTitle());
			driver.switchTo().window(Mainwindow);	
		}
		driver.quit();

	}

}
