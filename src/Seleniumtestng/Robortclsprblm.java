package Seleniumtestng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Robortclsprblm {
	ChromeDriver driver;
	@BeforeTest
	public void setuup() throws Exception
	{
		driver= new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	@Test
	public void fileupload() throws AWTException 
	{
		WebElement wb= driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span"));
		String filepath="\"C:\\Users\\Ranjitha\\OneDrive\\Desktop\\Geek Squad Setup Guide.pdf\"";
		wb.click();
		
		StringSelection strselection= new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
		Robot robo=new Robot();
		
		robo.delay(3000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		
		
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		
		robo.delay(3000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
