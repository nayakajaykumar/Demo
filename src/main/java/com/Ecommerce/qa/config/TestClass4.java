package com.Ecommerce.qa.config;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestClass4 {
	
	public static void main(String args[]){
		
		System.setProperty("webdriver.chrome.driver", "E:\\EclipseProject\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String mainWindow=driver.getWindowHandle();
		
		driver.get("http://live.guru99.com/index.php/");
		
		driver.findElement(By.linkText("MOBILE")).click();
		
		driver.findElement(By.xpath("//a[@title='Xperia']//following-sibling::div//ul//li//a[contains(text(),'Add to Compare')]")).click();
		String Mobile1=driver.findElement(By.xpath("//a[contains(text(),'Xperia')]")).getAttribute("title");
		System.out.println("Mobile1 in List Page ::"+Mobile1);
		driver.findElement(By.xpath("//a[@title='IPhone']//following-sibling::div//ul//a[contains(text(),'Add to Compare')]")).click();
		String Mobile2=driver.findElement(By.xpath("//a[contains(text(),'IPhone')]")).getAttribute("title");
		System.out.println("Mobile2 in list Page ::"+Mobile2);
		driver.findElement(By.xpath("//button[@title='Compare']")).click();
		
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		
		
		String popWindMobile1=driver.findElement(By.xpath("//a[contains(text(),'Xperia')]")).getAttribute("title");
		System.out.println("Mobile1 in pop up window ::"+popWindMobile1);
		
		String popWinMobile2=driver.findElement(By.xpath("//a[contains(text(),'IPhone')]")).getAttribute("title");
		System.out.println("Mobile 2 in pop up window ::"+popWinMobile2);
		Assert.assertEquals(Mobile1, popWindMobile1,"Mobile MisMatched");
		System.out.println("Tets Case 1 passed");
		
			Assert.assertEquals(Mobile2, popWinMobile2);
			System.out.println("Tets Case 2 passed");
		
		driver.close();
		driver.switchTo().window(mainWindow);
		driver.close();
		
	//	driver.quit();
	}

}
