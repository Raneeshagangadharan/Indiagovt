package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Indiagovrmt;

public class Indiagvrmttest{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://www.india.gov.in/");
	}
	
	@Test
	public void test()
	{
		Indiagovrmt in= new Indiagovrmt(driver);
		in.click();
		in.perform1();
		
	}


}
