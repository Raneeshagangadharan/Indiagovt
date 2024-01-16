package Seleniumtestng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionsproblem {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		String act=driver.getTitle();
		String exp="Facebook – log in or sign up";
		Assert.assertEquals(act, exp);
	}
	

}
