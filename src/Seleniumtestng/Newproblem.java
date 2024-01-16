package Seleniumtestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newproblem {
	@BeforeTest
	public void setup1()
	{
		//browserdetails
	}
	@BeforeMethod
	public void setup2()
	{
		//url
	}
	@Test()
	public void test1()
	{
		System.out.println("TEST 1");
		}
	@Test()
	public void test2()
	{
		System.out.println("TEST 2");
	}
	@AfterMethod
	public void methhod()
	{
		
	}
	@AfterTest
	public void methhodd()
	{
		
	}

}
