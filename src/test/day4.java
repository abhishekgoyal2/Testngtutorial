package test;

import org.testng.annotations.Test;

public class day4 {

	@Test
	public void webloginhomeloan()
	{
//		login home
		System.out.println("loginhome");
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
