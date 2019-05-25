package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classroom3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[text()='Alert Box']").click();;
		driver.switchTo().alert();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElementByXPath("//button[text()='Confirm Box']").click();;
		driver.switchTo().alert().accept();
		if(driver.findElementById("result").getText().equals("You pressed OK!")) {
			System.out.println("Verified");
		}else 			System.out.println("Not Verified");

		
		driver.findElementByXPath("//button[text()='Prompt Box']").click();;
		driver.switchTo().alert().sendKeys("Gokul");
		driver.switchTo().alert().accept();
		File file = driver.getScreenshotAs(OutputType.FILE);
		File Destiny = new File ("./Screenshots/img.JPG");
		FileUtils.copyFile(file, Destiny);
		
		String text = driver.findElementByXPath("(//div[contains(@class,'large-6 small-12')]//p[1])[2]").getText();
		if(text.contains("Gokul")){
			System.out.println("Text Updated");
		}else
		System.out.println("Text Not Updated");

		
		driver.findElementByXPath("//button[text()='Line Breaks?']").click();;
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
//		driver.quit();
		File file1 = driver.getScreenshotAs(OutputType.FILE);
		File Destiny1 = new File ("./Screenshots/img1.JPG");
		FileUtils.copyFile(file1, Destiny1);
		
		
/*		driver.findElementByLinkText("AGENT LOGIN").click();
		driver.findElementByLinkText("Contact Us").click();
		Set<String> Windows = driver.getWindowHandles();
		List<String> WindowsList = new ArrayList<String>(Windows);
		String WindowIndex = WindowsList.get(2);
		String WindowIndexOrginal = WindowsList.get(0);

		driver.switchTo().window(WindowIndex);
		System.out.println(driver.getTitle());
		driver.switchTo().window(WindowIndexOrginal);
		driver.quit();
*/		
		
		
		
	}

}
