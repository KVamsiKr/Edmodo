package qa.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.Base.SetUp;
import qa.pages.AdminHomePage;
import qa.pages.AdminLoginPage;
import qa.pages.HomePage;

public class AdminLoginTest extends SetUp {
	HomePage page1;
	AdminLoginPage page2;
	AdminHomePage page3;
	@BeforeMethod
	public void open()
	{
		openBrowser();
		page1=PageFactory.initElements(driver, HomePage.class);
		page2=PageFactory.initElements(driver,AdminLoginPage.class );
		page3=PageFactory.initElements(driver, AdminHomePage.class);
	}
	@Test
	public void adminLogin()
	{
		page1.adminLink();
		boolean val=page2.login("ramkig@gmail.com", "123456");
		Assert.assertTrue(val);
	}
		@AfterMethod
	public void close() {
		driver.close();
	}

}
