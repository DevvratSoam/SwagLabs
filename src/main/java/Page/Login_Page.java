package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import swaglab.BaseLibrary.BaseLibrary;
import swaglab.ExcelUtility.ExcelUtility;
import swaglab.waitUtility.WaitUtility;

public class Login_Page extends BaseLibrary {
	String path = "C:\\Users\\LENOVO\\Seasia\\Swaglabstest\\Data\\Test data.xlsx";

	public Login_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	private WebElement username;
	@FindBy(xpath = "//*[@id='password']")
	private WebElement password;
	@FindBy(xpath = "//*[@id='login-button']")
	private WebElement Login;

	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement MenuButton;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement LogOut;

	public void verifyTitle() {
		String title = driver.getTitle();
		System.out.println("Title is " + title);
	}

	public void wrongDatawithLogin() {
		
		System.out.println("going to  enter the username");
		WaitUtility.getExplicitWait(10, username);
		username.sendKeys(ExcelUtility.getReadData(path, 1, 0));
		System.out.println("entered the username");
		password.sendKeys(ExcelUtility.getReadData(path, 1, 1));
		Login.click();
		String text = driver.findElement(By.xpath("//h3[text()='Epic sadface: Sorry, this user has been locked out.']"))
				.getText();
		System.out.println("Error During of Login" + " " + text);
		Assert.assertEquals(text, "Epic sadface: Sorry, this user has been locked out.");

	}

	public void loggin() {
		
		username.clear();
		WaitUtility.getExplicitWait(10, username);
		username.sendKeys(ExcelUtility.getReadData(path, 2, 0));
		password.clear();
		password.sendKeys(ExcelUtility.getReadData(path, 2, 1));
		Login.click();
	}
	public void clickonmenu()
	{
		MenuButton.click();
	}
	public void logout()
	{
		WaitUtility.getExplicitWait(10, LogOut);
		LogOut.click();
	}

}
