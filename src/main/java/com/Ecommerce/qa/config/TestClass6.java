package com.Ecommerce.qa.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass6 {
	
	private static WebDriver driver;
	
	@BeforeMethod
	public void launchChrome(){
		System.setProperty("webdriver.chrome.driver", "E:\\EclipseProject\\tools\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.guru99.com/index.php/");
	}
	@Test
	public void verifyPurchaseProduct() throws InterruptedException{
		driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
		
		driver.findElement(By.id("email")).sendKeys("ajay.milu.13@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test123");
		Thread.sleep(1000);
		
		driver.findElement(By.id("send2")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("MY WISHLIST")).click();
		
		driver.findElement(By.xpath("//li[@class='current']")).click();
		
		driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
		
		WebElement countryDropdown=driver.findElement(By.id("country"));
		
		Select s=new Select(countryDropdown);
		s.selectByValue("US");
		
		WebElement stateDropdown=driver.findElement(By.name("region_id"));
		Select s1=new Select(stateDropdown);
		
		s1.selectByValue("43");
		
		driver.findElement(By.id("postcode")).sendKeys("542896");
		
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		
		String shippingCost=driver.findElement(By.xpath("//label[contains(@for,'s_method')]")).getText();
		try{
			Assert.assertEquals(shippingCost, "Fixed - $5.00");
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		driver.findElement(By.xpath("//div[h1]//button[@title='Proceed to Checkout']")).click();	
		
	}
	@AfterMethod
	public void tearDown(){
		//driver.close();
	}

}
