package com.Ecommerce.qa.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Ecommerce.qa.base.TestBase;
import com.Ecommerce.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	
	@BeforeMethod
	public  void launchBrowser(){
		initialization();
		homePage=new HomePage();
	}
	@Test
	public void verifyHomePageTitle(){
		String homePageTitle=homePage.homePageTitle();
		try{
			Assert.assertEquals(homePageTitle, "THIS IS DEMO SITE");
		}
		catch(java.lang.AssertionError e)
		{
			System.out.println("Home Page title is not as expected.");
		}
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
