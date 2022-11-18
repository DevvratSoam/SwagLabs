package swaglab.waitUtility;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import swaglab.BaseLibrary.BaseLibrary;

public class WaitUtility extends BaseLibrary
{
	
	//implicit wait
	public static void getImplicitwait(int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	//explicitWait
	public static void getExplicitWait(int time, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	

}
