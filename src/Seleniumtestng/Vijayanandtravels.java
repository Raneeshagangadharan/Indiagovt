package Seleniumtestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Vijayanandtravels {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.vrlbus.in/#/");
	}
	@Test
	public void test1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"txtcontactPerson\"]")).sendKeys("Raneesha");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("ranee@123");
		driver.findElement(By.xpath("//*[@name='mobileNo']")).sendKeys("8281823425");
		driver.findElement(By.xpath("//*[@id=\"TourCategory\"]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Corporate Tour')]")).click();
		driver.findElement(By.xpath("//*[@id=\"txtFromCity\"]")).sendKeys("palakkad");
		driver.findElement(By.xpath("//*[@id=\"txtToCity\"]")).sendKeys("kochi");
	}
	@Test
	public void test2()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//*[@id=\"txtPickupHour\"]")).click();
		//driver.findElement(By.xpath("//li[contains(text(),'2')]")).click();
		driver.findElement(By.xpath("//*[@id=\"txtPickup\"]")).sendKeys("kanjikode");
		driver.findElement(By.xpath("//*[@id=\"txtnoOfPassenger\"]")).sendKeys("2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div/div[2]/div[3]/div[3]/input")).click();
	}		
}