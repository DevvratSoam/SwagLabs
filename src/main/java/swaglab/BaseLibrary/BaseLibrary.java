package swaglab.BaseLibrary;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLibrary 
{

	
	public static WebDriver driver;
	
	public void getlaunch(String url)
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
	}
	
}
