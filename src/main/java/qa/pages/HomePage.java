package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.Base.SetUp;

public class HomePage extends SetUp {
   // we have to define object repository for web elements 
	@FindBy(xpath="//*[text()='Admin Login']")
	WebElement admin;
	@FindBy(xpath="//*[text()='Teacher Login']")
	WebElement teacher;
	@FindBy(xpath="//*[text()='Parent Login']")
	WebElement parent;
	@FindBy(xpath="//*[text()='Student Login']")
	WebElement student;
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	//creating actions
	public boolean adminLink()
	{
		boolean x=admin.isDisplayed();
		String data=admin.getText();
		System.out.println(data);
	    admin.click();
	    return x;
	 
	}
	public boolean teacherLink()
	{
		boolean val1=teacher.isDisplayed();
		String data1=teacher.getText();
		System.out.println(data1);
		teacher.click();
		return val1;
	}
	public boolean parentLink()
	{
		boolean val1=parent.isDisplayed();
		String data1=parent.getText();
		System.out.println(data1);
		parent.click();
		return val1;
	}
	public boolean studentLink()
	{
		boolean val1=student.isDisplayed();
		String data1=student.getText();
		System.out.println(data1);
		student.click();
		return val1;
	}

}
