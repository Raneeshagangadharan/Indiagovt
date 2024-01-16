package Seleniumtestng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extendreports {
	ChromeDriver driver;
	ExtentHtmlReporter report;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		report= new ExtentHtmlReporter("./Report12/myreport1.html");
		report.config().setDocumentTitle("Titleverification");
		report.config().setReportName("testing");
		report.config().setTheme(Theme.STANDARD);
		extent= new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("host","local host");
		extent.setSystemInfo("os", "windows");
		extent.setSystemInfo("tester", "ranee");	
	}
	@BeforeMethod
	public void bfrmthd()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test1()
	{
		test= extent.createTest("fbtitle");
		String exp="facebok";
		String act=driver.getTitle();
		Assert.assertEquals(exp, act);
	}
	@Test
	public void test2()
	{
		test=extent.createTest("fb");
		String exp= "Facebook – log in or sign up";
		String act= driver.getTitle();
		Assert.assertEquals(exp, act);
		
	}
	@AfterTest
	public void display()
	{
		extent.flush();
		driver.quit();
	}

}
