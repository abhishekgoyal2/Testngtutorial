package test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

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