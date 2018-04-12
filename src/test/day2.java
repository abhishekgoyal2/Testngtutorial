package test;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@AfterTest
	
		public void posttest()
		{
			System.out.println("after test execution");
	}
	
	
	@Test
	public void loan()
	{
		System.out.println("test loand department");
	}
	
	@BeforeTest
	
	public void prerequiste()
	{
		System.out.println("Before execution");
}
}