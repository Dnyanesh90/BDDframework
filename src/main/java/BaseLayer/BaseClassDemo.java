package BaseLayer;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassDemo {
public static WebDriver driver;

public static void intilization() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\kadam\\eclipse-workspace\\BDD Framework\\BDDFramework\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.get("https://sysuite.com/signup");
	}
}
