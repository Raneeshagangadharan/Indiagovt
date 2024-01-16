package Seleniumtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logoverification {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void test()
	{
		By logoXPath = By.xpath("/html/body/div[1]/div[2]/div/img");
		System.out.println(logoXPath);
		 boolean isLogoPresent = isElementPresent(driver, logoXPath);

	        if (isLogoPresent) 
	        {
	            System.out.println("Logo is present on the webpage.");
	        } else 
	        {
	            System.out.println("Logo is not present on the webpage.");
	        }
	        driver.quit();
	    }

	    private static boolean isElementPresent(WebDriver driver, By locator) {
	        try {
	            WebElement element = driver.findElement(locator);
                return element.isDisplayed();
	        } catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.StaleElementReferenceException e) {
	            return false;
	        }
	    }
	}

