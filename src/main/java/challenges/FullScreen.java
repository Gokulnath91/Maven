package challenges;
/*<!-- https://mvnrepository.com/artifact/ru.yandex.qatools.ashot/ashot -->
<dependency>
    <groupId>ru.yandex.qatools.ashot</groupId>
    <artifactId>ashot</artifactId>
    <version>1.5.4</version>
</dependency>
*/

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullScreen {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/draggable/");	
		
		Screenshot page = new AShot().
				shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
		ImageIO.write(page.getImage(),"PNG", new File("./snaps/page.png"));
		Thread.sleep(2000);
		driver.quit();
		/*Screenshot screenshot = new AShot().takeScreenshot(driver,webElement);
		ImageIO.write(screenshot.getImage(),"PNG",new File(./snaps/Element.png"));*/
	}
}
