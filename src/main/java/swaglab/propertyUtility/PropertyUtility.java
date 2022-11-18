package swaglab.propertyUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility 
{
	 static String configpath="C:\\Users\\LENOVO\\Seasia\\Swaglabstest\\Data\\config.Properties";
	public static String getReadData(String key)
	{
		String value="";
		try
		{
		FileInputStream fis= new FileInputStream(configpath);
		Properties prop= new Properties();
		prop.load(fis);
		value=prop.getProperty(key);
		
		}
		catch (Exception e)
		{
			System.out.println("Error to catch data from Property File");
		}
		return value;
	}

}
