package qa.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.Base.SetUp;
//import qa.pages.AdminHomePage;
import qa.pages.HomePage;
import qa.pages.TeacherLoginPage;

public class TeacherLoginTest extends SetUp{
	HomePage page1;
	//AdminHomePage page2;
	TeacherLoginPage page3;
	@BeforeMethod
	public void open()
	{
		openBrowser();
		page1=PageFactory.initElements(driver, HomePage.class);
		//page2=PageFactory.initElements(driver, AdminHomePage.class);
		page3=PageFactory.initElements(driver, TeacherLoginPage.class);
		
	}
	@Test
	public void techerLogin()
	{
		page1.teacherLink();
		boolean val=page3.tLink("krishna@edmodo.com", "123456");
		Assert.assertTrue(val);
	
	}

}
