package Seleniumtestng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Newxmltocls {
	@BeforeTest
	public void sett()
	{
		
	}
	@Parameters("a")
	@Test
	public void testtt(String a)
	{
		System.out.println(a);
	}

}
