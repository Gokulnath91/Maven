package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classroom1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();

		Alert alertBox = driver.switchTo().alert();
		alertBox.sendKeys("Gokulnath");
		alertBox.accept();
		String Result = driver.findElementById("demo").getText();

		System.out.println("Result : " + Result);

		if (Result.contains("Gokulnath")) {
			System.out.println("Text updated properly.");
		} else
			System.out.println("Text not updated properly.");

		driver.quit();

	}

}
