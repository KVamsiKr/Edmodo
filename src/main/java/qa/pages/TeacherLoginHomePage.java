package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.Base.SetUp;

public class TeacherLoginHomePage extends SetUp {
	@FindBy(xpath="//*[text()='Dashboard']")
	WebElement dash;
	@FindBy(xpath="//*[text()='Students']")
	WebElement std;
	@FindBy(xpath="//*[text()='Events']")
	WebElement events;
	@FindBy(xpath="//*[text()='Tasks']")
	WebElement tasks;
	@FindBy(xpath="//*[text()='Leave']")
	WebElement leave;
	@FindBy(xpath="//*[text()='Attendance']")
	WebElement Attendance;
	public TeacherLoginHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean techerHome()
	{
		boolean x=dash.isDisplayed();
		boolean StudentMod=std.isDisplayed();
		System.out.println("Student is :"+StudentMod);
		boolean eventsMod=events.isDisplayed();
		System.out.println("Events is :"+eventsMod);
		boolean tasksMod=tasks.isDisplayed();
		System.out.println("Tasks is :"+tasksMod);
		boolean LevMod=leave.isDisplayed();
		System.out.println("Leave is :"+LevMod);
		boolean attendmod=Attendance.isDisplayed();
		System.out.println("Attendance is"+attendmod);
		return x;
	}

}
