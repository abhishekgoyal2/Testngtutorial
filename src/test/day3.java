package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void weblogin()
	{
//		login
		System.out.println("login");
	}
	
	@Test
	public void mobilelogin()
	{
//		login mobile
		System.out.println("login mobile");
	}
	
	@Test
	public void mobilesignlogin()
	{
//		login mobile sign in
		System.out.println("login mobile sign in");
	}
	
	@Test
	public void mobilesignoutlogin()
	{
//		login mobile sign out
		System.out.println("login mobile sign out");
	}
	
	@BeforeSuite
	public void Presuite()
	{
		//rest APi
		System.out.println("before suit");
	}
	
	@Test
	public void Apicarloan()
	{
		//rest APi
		System.out.println("rest APi");
	}
	
	@AfterSuite
	public void Postsuite()
	{
		//rest APi
		System.out.println("post suit");
	}
	
}
