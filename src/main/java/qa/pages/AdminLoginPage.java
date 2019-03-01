package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.Base.SetUp;

public class AdminLoginPage extends SetUp {
	@FindBy(xpath="//input[@name='uname']")
	WebElement uname;
	@FindBy(xpath="//input[@name='pwd']")
	WebElement pwd;
	@FindBy(xpath="//*[@class='iCheck-helper']")
	WebElement remind;
	@FindBy(xpath="//button[@name='submit']")
	WebElement submit;
	public AdminLoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean login(String u,String p)
	{
		uname.sendKeys(u);
		pwd.sendKeys(p);
		remind.click();
		boolean x=remind.isEnabled();
		submit.click();
		return x;
		
	}

}
