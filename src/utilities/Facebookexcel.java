package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Facebookexcel {
	
	public  static String getexcel(String xl, String sheet,int r, int c) throws IOException
	{
		FileInputStream ob= new FileInputStream(xl);
		 XSSFWorkbook wb = new XSSFWorkbook(ob);
		 XSSFCell cell=wb.getSheet(sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
			}
	}
	


public static int getrowcount(String xl,String sheet) throws IOException
{
	FileInputStream ob=new FileInputStream(xl);
	XSSFWorkbook wb= new XSSFWorkbook(ob);
	return wb.getSheet(sheet).getLastRowNum();
}
}
