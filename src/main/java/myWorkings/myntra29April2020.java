package myWorkings;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class myntra29April2020 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementByClassName("desktop-searchBar").sendKeys("\"Sunglasses\"", Keys.ENTER);
		List<WebElement> Brandname = driver.findElementsByXPath("//div[@class='product-productMetaInfo']//h3");
		Set<String> brandName = new LinkedHashSet<String>();
		for (WebElement namelist : Brandname) {
			brandName.add(namelist.getText());
		}
		// System.out.println(brandName.size());
		System.out.println("List of unique brands name are :");
		for (String pr : brandName) {
			System.out.println(pr);
		}
		System.out.println("**************");
		List<WebElement> discountRate = driver.findElementsByXPath("//span[@class='product-discountPercentage']");
		int count = 0;
		for (WebElement discountList : discountRate) {
			// String disRate = discountList.getText().replaceAll("//D", "");
			if (discountList.getText().contains("40")) {
				++count;
			}
		}
		System.out.println("Count of the sunglasses with 40% discounts --> " + count);
		System.out.println("***************");

		List<WebElement> Unisex = driver
				.findElementsByXPath("//div[@class='product-productMetaInfo']//h4[@class='product-product']");
		int countUnisex = 0;
		for (WebElement unisexList : Unisex) {
			// String disRate = discountList.getText().replaceAll("//D", "");
			if (unisexList.getText().contains("Unisex")) {
				++countUnisex;
			}
		}
		System.out.println("Count of product thoes are Unisex --> " + countUnisex);
		driver.findElementByXPath("//input[@value='Green']/following-sibling::div").click();
		Thread.sleep(3000);
		Actions builder = new Actions(driver);
		WebElement secondProduct = driver.findElementByXPath("(//div[@class='product-productMetaInfo'])[2]");
		builder.moveToElement(secondProduct).click().perform();
		Set<String> windowList = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowList);
		driver.switchTo().window(window.get(2));
		String displayBrandName = driver.findElementByXPath("//h1[@class='pdp-title']").getText();
		String displayBrandPrice = driver.findElementByXPath("//p[@class='pdp-discount-container']//strong[1]")
				.getText().replaceAll("Rs. ", "");
		driver.findElementByXPath("//div[text()='ADD TO BAG']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text()='Bag']").click();
		String selectedBrandName = driver.findElementByXPath("//div[@class='itemContainer-base-itemName']//a[1]")
				.getText();
		String selectedBrandPrice = driver
				.findElementByXPath(
						"//div[@class='itemComponents-base-price itemComponents-base-bold itemContainer-base-amount']")
				.getText().replaceAll(",", "");
		System.out.println("************");
		/*
		 * System.out.println(displayBrandName); System.out.println(displayBrandPrice);
		 * System.out.println(selectedBrandName);
		 * System.out.println(selectedBrandPrice);
		 */
		if (displayBrandName.contains(selectedBrandName) && displayBrandPrice.equals(selectedBrandPrice)) {
			System.out.println("Product name and price is correct");
		} else
			System.out.println("Product name and price is correct");

		driver.quit();

	}

}
