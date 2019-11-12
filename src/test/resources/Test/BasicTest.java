package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicTest {
	@BeforeClass
	public void start () {
		
		Properties property = new ReadWrite().ReadProperties(System.getProperty("User.dir")+/src/main/java/config/config.properties");
		
		
		
		String browser=	property.getProperty("browser");
			
			if (browser.equalsIgnoreCase("chrome") ) {
				System.out.println("chrome");
				System.setProperty("webdriver.chrome.driver", "C:\\Dev\\Chrome1\\chromedriver.exe");
				driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("Firefox")) {
				System.out.println("FireFfox");
				System.setProperty("webdriver.gecko.driver", "C:\\Dev\\Firefox\\geckodriver.exe");
				driver = new FirefoxDriver();
			}else
			{
				System.out.println("no browser");
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.bathandbodyworks.com");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
