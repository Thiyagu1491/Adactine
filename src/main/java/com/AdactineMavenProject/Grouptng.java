package com.AdactineMavenProject;

import org.testng.annotations.Test;

public class Grouptng {

	@Test(groups="Flight TranSport",priority = -4)
	private void spiceJet() 
	{
		System.out.println("SpiceJet SG");

	}
	
	@Test(groups="Flight TranSport",priority = -3)
	private void indiGo() 
	{
		System.out.println("IndiGo 6E");
	}
	
	@Test(groups="Train TranSport")
	private void alleppeyExpress()
	{
		System.out.println("AlleppeyExpress 16041");

	}
	
	@Test(groups="Flight TranSport",priority = -2)
	private void jetAirWays() 
	{
		System.out.println("Jet AirWays 9W");
	}
	
	@Test(groups="Train TranSport")
	private void bangaloreExpress()
	{
		System.out.println("Bangalore Express 16538");

	}
	
	@Test(groups="Train TranSport")
	private void chennaiExpress()
	{
		System.out.println("Chennai Express 16702");
    
	}
	
	@Test(groups="Bus TranSport")
	private void ksrtc() 
	{
		System.out.println("KSRTC Karnataka");

	}
	@Test(groups="Flight TranSport",priority = -1)
	private void vistara() 
	{
		System.out.println("Vistara UK");
	}
	
	@Test(groups="Bus TranSport")
	private void setc() 
	{
		System.out.println("SETC TamilNadu");

	}

}
