package week5.day1.homework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5.day2.ReadExcel1;

public class Common {
	public ChromeDriver driver;
	public String fileName; 
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void Login(String url,String username,String password) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@AfterMethod
	public void close()
	{
		driver.quit();	
}
	
	@DataProvider (name = "fetchData")
	public String[][] getData() throws InvalidFormatException, IOException
	{
		return ReadExcel1.ReadExcelData(fileName);
	}

}

