package Seleniumtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newgoogle {
	ChromeDriver driver;
	@BeforeTest
	public void setup1()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void testt()
	{
		WebElement button =driver.findElement(By.xpath("//*[@class='lnXdpd']"));
		String actualtitle=button.getAttribute("alt");
		String comparetitle="Google";
		if(actualtitle.equals(comparetitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@AfterTest
	public void getup1()
	{
		driver.quit();
	}


}
