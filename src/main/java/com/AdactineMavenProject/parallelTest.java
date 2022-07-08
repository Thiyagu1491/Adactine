package com.AdactineMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelTest 
{

	@Test
	private void adactineHotel() 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\grang\\eclipse-workspace\\AdactineMavenProject\\src\\main\\java\\com\\AdactineMavenProject\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
    driver.manage().window().maximize();
	}
	
	@Test
	private void automationPratice() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\grang\\eclipse-workspace\\AdactineMavenProject\\src\\main\\java\\com\\AdactineMavenProject\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();


	}
}
