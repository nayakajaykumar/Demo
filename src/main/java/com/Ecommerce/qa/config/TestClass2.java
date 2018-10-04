package com.Ecommerce.qa.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass2{
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\EclipseProject\\tools\\chromedriver.exe");
		WebDriver driver3=new ChromeDriver();
		
		driver3.get("http://live.guru99.com/index.php/");
		driver3.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
			
		String XperiaPrice_ListPage=driver3.findElement(By.xpath("//span[@id='product-price-1']//span")).getText();
		driver3.findElement(By.xpath("//img[@alt='Xperia']")).click();
	
		String XperiaPrice_DetailsPage=driver3.findElement(By.xpath("//span[@id='product-price-1']//span")).getText();
		if(XperiaPrice_ListPage.equals(XperiaPrice_DetailsPage))
		{
			System.out.println("Product Value in List and in details page are equal");
		}
		else{
			System.out.println("Product value in list and in details page are not equal");
		}
		
			driver3.quit();
	}

}
