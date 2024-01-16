package Seleniumtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actionclassnew {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void testtt()
	{
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement password=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		email.sendKeys("ranee");
		Actions act=new Actions(driver);
		act.keyDown(email,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(email, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(password, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();		
	}
	

}
