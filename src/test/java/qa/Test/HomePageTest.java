package qa.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.Base.SetUp;
import qa.pages.HomePage;

public class HomePageTest extends SetUp {
	HomePage page1;
	@BeforeMethod
	public void open()
	{
		openBrowser();
		page1=PageFactory.initElements(driver, HomePage.class);
	}
	@Test(priority=0)
	public void tcAdmin()
	{
		boolean val=page1.adminLink();
		Assert.assertTrue(val);
		String data=driver.getTitle();
		System.out.println(data);
	}
	@Test(priority=1)
	public void tcTacher()
	{
		boolean val1=page1.teacherLink();
		Assert.assertTrue(val1);
		String data=driver.getTitle();
		System.out.println(data);
	}
	@Test(priority=2)
	public void tcParent()
	{
		boolean val1=page1.parentLink();
		Assert.assertTrue(val1);
		String data=driver.getTitle();
		System.out.println(data);
	}
	@Test(priority=3)
	public void tcStudent()
	{
		boolean val1=page1.studentLink();
		Assert.assertTrue(val1);
		String data=driver.getTitle();
		System.out.println(data);
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
