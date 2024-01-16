package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.Facebook;

public class Fbtest
{
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		 driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test()
	{
		Facebook fb=new Facebook(driver);
		fb.values("ranee", "ranee12");
		fb.clickk();
		
	}

}
