package Seleniumtestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newxmlproblem {
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
	@Test(groups = "sanity")
	public void test1()
	{
		System.out.println("TEST 1");
		}
	@Test(groups = "sanity")
	public void test2()
	{
		System.out.println("TEST 2");
	}
	@Test(groups = "regression")
	public void test3()
	{
		System.out.println("TEST 3");
	}
	@Test(groups = "sanity")
	public void test4()
	{
		System.out.println("TEST 4");
	}
	@Test(groups = "regression")
	public void test5()
	{
		System.out.println("TEST 5");
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
