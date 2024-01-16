package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Mainexm;

public class Maintest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}
	@Test
	public void test()
	{
		Mainexm mt= new Mainexm(driver);
		mt.values("ranee", "ranee23");
		mt.click();
	}

}
