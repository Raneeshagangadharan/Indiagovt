package Seleniumtestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homeworkpage {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
			driver.get("https://www.ebay.ca/");
	}
	@Test
	public void testt()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //implicit wait
		WebElement electronics= driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[9]/a"));
		Actions act= new Actions(driver);
		act.moveToElement(electronics);
		act.perform();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement ab=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[9]/div[2]/div[1]/nav[1]/ul/li[3]/a"));
		ab.click();
	}

}


