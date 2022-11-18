package swaglab.ExcelUtility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility 
{
	public static String getReadData(String path, int rowno,int colno )
	{
		String value="";
		try 
		{
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(0);
			value=sheet.getRow(rowno).getCell(colno).getStringCellValue();
		}
		catch (Exception e) 
		{
			System.out.println("Issue in getReadData"+e);
			
		}
		return value;
	}

}
