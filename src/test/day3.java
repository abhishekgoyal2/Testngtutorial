package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {

	@BeforeClass
	public void PreClassday3()
	{
//		login
		System.out.println("Before class day3");
	}
	
	@Test
	public void weblogin()
	{
//		login
		System.out.println("login");
	}
	
	@Test(groups={"Smoke"})
	public void mobilelogin()
	{
//		login mobile
		System.out.println("login mobile");
	}
	
	@Test(enabled=false)
	public void mobilesignlogin()
	{
//		login mobile sign in
		System.out.println("login mobile sign in");
	}
	
	@Test(timeOut=4000)
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
	
	@BeforeMethod
	public void berforemethod()
	{
		//rest APi
		System.out.println("before every method in day3");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		//rest APi
		System.out.println("After every method in day3");
	}
	
	
	@Test(dependsOnMethods={"weblogin"})
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
	
	@AfterClass
	public void PostClassday3()
	{
//		login
		System.out.println("After class day3");
	}
	
}
