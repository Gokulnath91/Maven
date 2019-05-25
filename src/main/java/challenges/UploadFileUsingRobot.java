package challenges;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileUsingRobot {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		driver.findElementById("input_resumeParser").click();
		Thread.sleep(10000);
		// Store the copied text in the clipboard
		StringSelection stringSelection = new StringSelection("C:\\Users\\TestLeaf\\Desktop\\Resum.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		// Paste it using Robot class
		Robot robot = new Robot();

		// Enter to confirm it is uploaded
		robot.keyPress(KeyEvent.VK_CONTROL);			
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);


		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@type='file']")
		.sendKeys("C:\\Users\\Sarath\\Desktop\\PDF\\Resume 1.pdf");
		//Value = "?"
	}
	
	
	
	
	
	
	
	
	
}