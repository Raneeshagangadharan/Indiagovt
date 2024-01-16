package Seleniumtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Newxmlgoogle {
	ChromeDriver driver= new ChromeDriver();
	@BeforeTest(alwaysRun= true)
	public void settt()
	{
		driver.get("https://www.google.com/");
	}
	@Parameters("a")
	@Test
	public void test(String a)
	{
		driver.findElement(By.name("q")).sendKeys(a, Keys.ENTER);
	}

}
