package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

		@Parameters({"URL"})
@Test
	public void webloginhomeloan(String urlname)
	{
//		login home
		System.out.println("Home Laon loginhome");
		System.out.println("urlname");
	}
	
	@Test(groups={"Smoke"})
	public void mobilelogin()
	{
//		login mobile home
		System.out.println("login mobile home");
	}
	
	@Test
	public void loginAPI()
	{
		//rest APi home
		System.out.println("rest APi home");
	}
	
	
}
