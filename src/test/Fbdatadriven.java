package test;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import page.Facebook;
import utilities.Facebookexcel;

public class Fbdatadriven extends Baseclass{
	@Test
	public void login() throws IOException
	{
		Facebook fb=new Facebook(driver);
		
		String xl="C:\\Users\\Ranjitha\\OneDrive\\Documents\\Book79.xlsx";
		String sheet="Sheet1";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		try {
			int rowcount=Facebookexcel.getrowcount(xl, sheet);
			for(int i=1; i<=rowcount; i++)
			{
				String username=Facebookexcel.getexcel(xl, sheet, i, 0);
				System.out.println("username="+username);
				
				String password= Facebookexcel.getexcel(xl, sheet, i, 1);
				System.out.println("password="+password);
				fb.values(username, password);
				fb.clickk();
				driver.navigate().back();
				
				
			}
		}catch(Exception e) {
			
		}
	}

}
