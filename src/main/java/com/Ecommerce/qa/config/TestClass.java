package com.Ecommerce.qa.config;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass 
{
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\EclipseProject\\tools\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://live.guru99.com/index.php");
		if(driver1.getTitle().equals("THIS IS DEMO SITE")){
			System.out.println("Home Page title is shown as expected");
		}
		else{System.out.println("Home Page title is not as expected");}
		
		driver1.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
		if(driver1.getTitle().equals("MOBILE"))
		{
			System.out.println("Mobile Page Title is shown as expected");
		}
		else{System.out.println("Mobile Page title is not as expected");}
		
		List<WebElement> mobileList=driver1.findElements(By.xpath("//img[contains(@id,'product')]"));
		Thread.sleep(2000);
		
		Iterator<WebElement> it=mobileList.iterator();
		if(it.hasNext()){
			for(int i=0;i<mobileList.size();i++){
			WebElement mList=mobileList.get(i);
			String mobileName=mList.getAttribute("title");
			System.out.println(mobileName);
			}
		}
		
		driver1.quit();
		
	}
}
