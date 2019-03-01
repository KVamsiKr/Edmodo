package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.Base.SetUp;

public class AdminHomePage extends SetUp {
	@FindBy(xpath="//*[text()='Dashboard']")
	WebElement dash;
	@FindBy(xpath="//*[text()='Students']")
	WebElement student;
	@FindBy(xpath="//*[text()='Employees']")
	WebElement employees;
	@FindBy(xpath="//*[text()='Configuration']")
	WebElement config;
	@FindBy(xpath="//*[text()='Security']")
	WebElement security;
	@FindBy(xpath="//*[text()='Events']")
	WebElement events;
	@FindBy(xpath="//*[text()='Leave']")
	WebElement leave;
	public AdminHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean adimHome()
	{
		boolean x=dash.isDisplayed();
		boolean StudentMod=student.isDisplayed();
		System.out.println("Student is :"+StudentMod);
		boolean EmpMod=employees.isDisplayed();
		System.out.println("Employee is :"+EmpMod);
		boolean ConfigMod=config.isDisplayed();
		System.out.println("Configurtion is :"+ConfigMod);
		boolean SecMod=security.isDisplayed();
		System.out.println("Security is :"+SecMod);
		boolean EveMod=events.isDisplayed();
		System.out.println("Events is :"+EveMod);
		boolean LevMod=leave.isDisplayed();
		System.out.println("Leave is :"+LevMod);
		
		
	    return x;
	}
}
