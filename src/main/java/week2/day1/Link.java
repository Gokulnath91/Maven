package week2.day1;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		System.out.println(driver.findElementByLinkText("Find where am supposed to go without clicking me?")
				.getAttribute("href"));
		if(driver.findElementByLinkText("Verify am I broken?")
				.getAttribute("href").contains("error")) {
			System.out.println("Yes. The link is broken.");
		}else System.out.println("Yes. The link is not broken.");
		driver.findElementByLinkText("Go to Home Page").click();
		List<WebElement> list = driver.findElementsByTagName("a");
		int count = list.size();
		System.out.println(count);
		String Title = driver.getTitle();
		System.out.println(Title);
		//driver.close();

		
		
		
		
	}

}
