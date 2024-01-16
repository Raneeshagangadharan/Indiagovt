package Seleniumtestng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newproblemaction {          //right click and double click
	ChromeDriver driver;
	@BeforeTest
	public void betestt()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void testtt()
	{
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act= new Actions(driver);
		act.contextClick(rightclick).perform();
		WebElement trigger=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]"));
		trigger.click();
		Alert a= driver.switchTo().alert();
		a.accept();
		String b =a.getText();
		System.out.println(b);
		WebElement doubleclick= driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclick).perform();
		Alert m= driver.switchTo().alert();
		m.accept();
		String n=m.getText();
		System.out.println(n);
		
		}

}
