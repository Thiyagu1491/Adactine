package com.AdactineMavenProject;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class DependsOnMethod 
{
	
@Test
private void flightTicketsOffer() 
{
	System.out.println("Offer Of June22");

}

@Test(dependsOnMethods = "flightTicketsOffer",expectedExceptions = TestNG.class)
private void spicejet()
{
 System.out.println("spicejet 10%");

}

@Test(dependsOnMethods = "flightTicketsOffer")
private void indiGo()
{
	System.out.println("indiGo 15%");

}
@Test
private void Vistara()
{

	System.out.println("Vistara No Discount");
}

}
