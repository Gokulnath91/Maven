package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classroom2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//span[text()='AGENT LOGIN']").click();
		System.out.println("Titile before clicking contact us : "+driver.getTitle());
		driver.findElementByLinkText("Contact Us").click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> WindowList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(WindowList.get(WindowList.size()-1));
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		
	/*	driver.switchTo().window(WindowList.get(0));
		driver.close();
		driver.switchTo().window(WindowList.get(1));
		driver.close();
*/
		
		
	}

}
