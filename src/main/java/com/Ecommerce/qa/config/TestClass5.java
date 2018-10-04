package com.Ecommerce.qa.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass5
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\EclipseProject\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://live.guru99.com/");
		driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//div[@class='footer']//span[text()='Account']")).click();
		driver.findElement(By.xpath("//a[@title='Create an Account']")).click();
		
		driver.findElement(By.id("firstname")).sendKeys("Ajay");
		
		driver.findElement(By.id("lastname")).sendKeys("Kumar");
		
		driver.findElement(By.name("email")).sendKeys("ajay.milu.13@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.name("confirmation")).sendKeys("test123");
		
		driver.findElement(By.xpath("//button[@title='Register']")).click();
		
		//String alert=driver.findElement(By.id("advice-required-entry-email_address")).getText();
		
		//System.out.println(alert);
		
		
	}
}
