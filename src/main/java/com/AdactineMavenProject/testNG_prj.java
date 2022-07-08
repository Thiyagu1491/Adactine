package com.AdactineMavenProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class testNG_prj {

@BeforeSuite
private void setProperty()
{
	
  System.out.println("Property Set");	
  
}

@BeforeTest
private void browser_Launch()
{

 System.out.println("Chrome");

}

@BeforeClass
private void url_Launch()
{

System.out.println("http://automationpractice.com/index.php");

}

@BeforeMethod
private void loginPage()
{

System.out.println("LoginPage");

}

@Test(priority = -2)
private void selectionOfDresses() 
{

System.out.println("SelectionOfDresses");	
	
}

@Test(priority = -1,invocationCount = 2)
private void sarees()
{

 System.out.println("Select Saree");
 
}

@Test(invocationCount = 3)
private void tShirt() 
{

	System.out.println("Select T-Shirt");

}

@Test(enabled = false)
private void jean() 
{

	System.out.println("Select Jean");
}

@Test(priority=-3,invocationCount = 2)
private void shoe() 
{

	System.out.println("Select Shoe");

}

@AfterMethod
private void logOut()
{

 System.out.println("LogOut");

}

@AfterClass
private void homePage()
{

 System.out.println("Home Page");

}

@AfterTest
private void browserClose() 
{
	
 System.out.println("browserClose");	

}

@AfterSuite()
private void deleteCookies() 
{

 System.out.println("deleteCookies");

}
}