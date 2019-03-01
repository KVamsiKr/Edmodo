package qa.Base;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUp {
	public static WebDriver driver;
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Testing Tools\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://akuteegapadu.com/student/");
	}
	
	
	

}
