package challenges;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadFile {
	
	Properties prop = null;
	@BeforeTest
	public void loadObject() throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream(
				"C:\\Users\\sysd\\Desktop\\PatternObjectModel\\FRG.properties"));
	}	
	@Test
	public void upload() throws MalformedURLException{
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		System.out.println(prop.getProperty("Myhome.leads.Link"));
		WebElement upload = driver.findElementById("uploadBtnCont");
		upload.sendKeys("C:\\Users\\TestLeaf\\Desktop\\Resum.docx");
		
		
		
		
		
		
		
	}
}