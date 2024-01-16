package Seleniumtestng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivenprblm {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void testt() throws IOException
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\Ranjitha\\OneDrive\\Documents\\Book7.csv");
		    XSSFWorkbook wb = new XSSFWorkbook(ob);
			XSSFSheet ab=wb.getSheet("Sheet3");  //sheet
			int row=ab.getLastRowNum();
			for(int i=1;i<=row; i++)
			{
				try {
				XSSFCell user=ab.getRow(i).getCell(0);
				String username=user.getStringCellValue();
				XSSFCell pass=ab.getRow(i).getCell(1);
				String password=pass.getStringCellValue();
				
				System.out.println("username"+username);
				System.out.println("password"+password);
				
				driver.findElement(By.id("email")).clear();
				driver.findElement(By.id("email")).sendKeys(username);
				driver.findElement(By.id("pass")).clear();
				driver.findElement(By.id("pass")).sendKeys(password);
				driver.findElement(By.name("login")).click();
				}catch(Exception e)
				{
					
				}
				
			}
		}
	}

