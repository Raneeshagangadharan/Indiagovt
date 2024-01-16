package Seleniumtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void befotestt()
	{
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
	}
	@Test
	public void testt()
	{
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act= new Actions(driver);
		act.dragAndDrop(drag, drop);
		act.perform();
		String actual=drop.getText();
		String expected="dropped!";
		if(actual.equals(expected))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		}

}
