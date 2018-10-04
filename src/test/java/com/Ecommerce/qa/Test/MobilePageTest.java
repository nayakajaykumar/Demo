package com.Ecommerce.qa.Test;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Ecommerce.qa.base.TestBase;
import com.Ecommerce.qa.pages.HomePage;
import com.Ecommerce.qa.pages.MobilePage;
import com.Ecommerce.qa.util.TestUtil;

public class MobilePageTest extends TestBase {
	MobilePage mobilePage;
	TestUtil testUtil;
	HomePage homepage;
	ITestResult result;
	
	@BeforeMethod
	public void lunchChrome(){
		initialization();
		homepage=new HomePage();
		
		mobilePage=new MobilePage();
		homepage.clickOnMobile();
		testUtil=new TestUtil();
	}
	@Test
	public void verifyMobilePageTitle(){
		String mobilePageTitle=mobilePage.mobilePageTitle();
		try{
			Assert.assertTrue(mobilePageTitle.equalsIgnoreCase("MOBILE"));
		}
		catch(java.lang.AssertionError e){
			System.out.println("Mobile Page title is not as expected");
		}
	}
	
	@Test
	public void verifySortByName(){
		mobilePage.clickOnSortByLink_Name();
		testUtil.takesScreenShot(result.getTestName());
		System.out.println("Test Case Passed");
		}
	@Test
	public void verifyXperiaPrice(){
		String Xperia_PriceInList=mobilePage.getXperiaPrice();
		System.out.println("Xperia product Price ="+Xperia_PriceInList);
		String Xperia_PriceInDetailsPage=mobilePage.xperiaDetailsPage();
		
		if(Xperia_PriceInList.equals(Xperia_PriceInDetailsPage)){
			System.out.println("Xperia Price in List and in Details Page are equal");
		}
		else
		{
			System.out.println("Xperia Price in List and in Details Page are not equal");
		}
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
