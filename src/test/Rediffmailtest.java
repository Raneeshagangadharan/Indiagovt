package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Rediffmail;

public class Rediffmailtest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		Rediffmail fb=new Rediffmail(driver);
		fb.values("ranee", "ranee123");
		fb.click();
		fb.values1("Ranee@123", "Ranee@123", "ranee790");
		fb.values2("8281823425");
		fb.values3();
		fb.values4();
		fb.values5();
		fb.clickk();
		fb.values6();
		fb.clicck();
	
		
	}

}
