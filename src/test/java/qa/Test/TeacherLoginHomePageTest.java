package qa.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.Base.SetUp;
import qa.pages.HomePage;
import qa.pages.TeacherLoginHomePage;
import qa.pages.TeacherLoginPage;

public class TeacherLoginHomePageTest extends SetUp{
	HomePage page1;
	TeacherLoginHomePage page2;
	TeacherLoginPage page3;
	@BeforeMethod
	public void open()
	{
		openBrowser();
		page1=PageFactory.initElements(driver, HomePage.class);
		page2=PageFactory.initElements(driver, TeacherLoginHomePage.class);
		page3=PageFactory.initElements(driver, TeacherLoginPage.class);
		
	}
	@Test(priority=1)
	public void teacherHome()
	{
		page1.teacherLink();
		boolean val=page3.tLink("Krishna@edmodo.com", "123456");
		Assert.assertTrue(val);
		boolean val2=page2.techerHome();
		System.out.println(val2);
	}
	@AfterMethod
	public void close() {
		driver.close();
	}

}
