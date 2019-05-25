package week5.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement Table = driver.findElementByXPath("//section[@class='innerblock']//table");
		List<WebElement> rowCount = Table.findElements(By.tagName("tr"));
		System.out.println("Number of rows in the table : " + rowCount.size());
		System.out.println("");

		// Code to print Table headers
		System.out.println("Table headers are below");
		System.out.println("");
		for (int i = 0; i < rowCount.size() - 3; i++) {
			WebElement Header = rowCount.get(i);
			List<WebElement> HeaderCellCount = Header.findElements(By.tagName("th"));
			// System.out.println(HeaderCellCount.size());
			for (int j = 0; j < HeaderCellCount.size(); j++) {
				String TableHeaders = HeaderCellCount.get(j).getText();
				System.out.println(TableHeaders);

			}

		}
		System.out.println("");
		// Code to print all the data in web table

		System.out.println("Below are the all datas in table row except table headrs");
		int a = 0;

		for (int i = 1; i < rowCount.size(); i++) {

			WebElement row = rowCount.get(i);
			List<WebElement> rowCell = row.findElements(By.tagName("td"));
			// System.out.println("Number of cells in the table : "+rowCell.size());
			System.out.println("");
			++a;
			System.out.println("Row " + a + " :");

			for (int j = 0; j < rowCell.size() - 1; j++) {
				String cellText = rowCell.get(j).getText();
				System.out.println(cellText);

			}

		}
		driver.quit();

	}

}
