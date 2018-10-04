package com.Ecommerce.qa.config;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass3 {
		
	public static void main(String args[]){
		
		System.setProperty("webdriver.chrome.driver", "E:\\EclipseProject\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.guru99.com/index.php/");
		
		driver.findElement(By.linkText("MOBILE")).click();
		
		driver.findElement(By.xpath("//a[@title='Xperia']//following-sibling::div//button")).click();
		
		WebElement Qty_Xperia=driver.findElement(By.xpath("//input[@title='Qty']"));
		Qty_Xperia.clear();
		Qty_Xperia.sendKeys("1000");
		
		driver.findElement(By.xpath("//button[@title='Update']")).click();
		
		String cartErrorMsg=driver.findElement(By.xpath("//p[@class='item-msg error']")).getText();
		String msgQty = ("* The requested quantity for \"Sony Xperia\" is not available.");
		
	    if(cartErrorMsg.equals(msgQty)){
	    	System.out.println("Error msg is as expected");
	    }
	    else
	    {
	    	System.out.println("Error msg is not as expected");
	    }
		System.out.println(cartErrorMsg);
		
		driver.findElement(By.xpath("//span[text()='Empty Cart']")).click();
		String noItmsMsg=driver.findElement(By.xpath("//div[@class='cart-empty']//p[contains(text(),'no items')]")).getText();
	    System.out.println("You have no items msg = " + noItmsMsg);
		if(noItmsMsg.equals("You have no items in your shopping cart.")){
			System.out.println("Empty Cart msg is as expected");
		}
		else{
			System.out.println("Empty cart msg is not as expected");
		}
		driver.quit();
	}
}
