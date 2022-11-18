package swaglab.test;

import org.testng.annotations.*;


import Page.Login_Page;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import swaglab.BaseLibrary.BaseLibrary;
import swaglab.propertyUtility.PropertyUtility;

public class Login_Test extends BaseLibrary
{
	Login_Page ob;
	@BeforeTest
public void getLaunchswaglab()
{
	getlaunch(PropertyUtility.getReadData("url"));
	ob=new Login_Page();
}
	@Test(priority = 1)
	@Description("To verift the Title")
	@Epic("EP001")
	@Feature("Feature : Title")
	@Story("Story : Title presence")
	@Step("Step : verify Title presence")
	@Severity(SeverityLevel.MINOR)
	public void verifyTitle()
	{
		ob.verifyTitle();
	}
	
	@Test(priority = 2)
	@Description("To Login with wrong data")
	@Epic("EP001")
	@Feature("Feature : Login")
	@Story("Story : Login presence")
	@Step("Step : verify shoud not done")
	@Severity(SeverityLevel.CRITICAL)
	public void wrongDatawithLogin()
	{
		ob.wrongDatawithLogin();
	}
	@Test(priority = 3)
	@Description("To Login with correct data ")
	@Epic("EP001")
	@Feature("Feature : Login")
	@Story("Story : Login presence")
	@Step("Step : verify Login done or not")
	@Severity(SeverityLevel.BLOCKER)
	public void loginwithvaliddata()
	{
		ob.loggin();
	}
	@Test(priority = 4)
	@Description(" Click on menu")
	@Epic("EP001")
	@Feature("Feature : Menu")
	@Story("Story : Menu presence")
	@Step("Step : verify Menu clickable or not")
	@Severity(SeverityLevel.CRITICAL)
	public void clickonmenubutton()
	{
		ob.clickonmenu();
	}
	@Test(priority = 5)
	@Description("To performe Logout")
	@Epic("EP001")
	@Feature("Feature : Logout")
	@Story("Story : Logout done")
	@Step("Step : verify Logout done or not")
	@Severity(SeverityLevel.CRITICAL)
	public void clickonLogout()
	{
		
		ob.logout();
	}

}
