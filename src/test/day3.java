package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@Parameters({"URL","API/UserName"})
	
	@Test
	public void weblogin(String urlname,String username)
	{
//		login
		System.out.println("login");
		System.out.println(urlname);
		System.out.println(username);
	}
	
	@BeforeClass
	public void PreClassday3()
	{
//		login
		System.out.println("Before class day3");
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
	
	@Test(dataProvider="getData")
	public void mobilesignoutlogin(String username,String password)
	{
//		login mobile sign out
		System.out.println("login mobile sign out");
		System.out.println(username);
		System.out.println(password);
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
	
	@DataProvider
	public 	Object[][] getData()
	{
		//1st combination -username/password
		//2nd combination -username/password
		//3rd combination -username/password
		Object[][] data =new Object[3][2];
		//1st set
data[0][0]="firstname" ;
data[0][1]="password" ;

//2nd set
data[1][0]="secondname" ;
data[1][1]="secondpassword" ;

//3rd set
data[2][0]="thirdname" ;
data[2][1]="thirdpassword" ;


//columns in row value for particular combination row

	
return data;
	}
	
	
}
