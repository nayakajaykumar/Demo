package com.Ecommerce.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public TestBase(){
		prop=new Properties();
			FileInputStream ip;
			try {
				ip = new FileInputStream("E:\\EclipseProject\\work\\Ecommerce\\src\\main\\java\\com\\Ecommerce\\qa\\config\\config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
										
			} catch (IOException e) {
				e.printStackTrace();
				}
		}
	
	@Test
	public static void initialization(){
		
				
		System.setProperty("webdriver.gecko.driver", prop.getProperty("geckoDriverPath"));
		
		driver=new FirefoxDriver();
		driver.get(prop.getProperty("url"));
		
	}

}
