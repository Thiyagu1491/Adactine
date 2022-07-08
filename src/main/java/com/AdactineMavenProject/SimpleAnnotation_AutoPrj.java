package com.AdactineMavenProject;

import org.testng.annotations.Test;

public class SimpleAnnotation_AutoPrj  {
	

@Test
private void setProperty()  
{
	System.out.println("Property Set");  
}
@Test
private void browserLaunch() 
{ 
	System.out.println("ChromePage"); 
}
@Test
private void url_Launch()
{
	System.out.println("http://automationpractice.com/index.php"); 	
}
@Test
private void loginPage()
{
	   System.out.println("loginpage"); 
}
@Test
private void searchDress()
{
 System.out.println("searchDress");
}
@Test
private void addCart()
{
 System.out.println("addCart");	
}
@Test
private void logout() {
	System.out.println("logOutPage");  
}
@Test
private void homePage() {
	System.out.println("HomePage");
}
@Test
private void closeBrowser() {
	System.out.println("CloseBrowser");
}
@Test
private void deletAllCookies() {
	System.out.println("Delete All Cookies");
}
}
	
	
	

	
