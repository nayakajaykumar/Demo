package com.Ecommerce.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Ecommerce.qa.base.TestBase;

public class TestUtil extends TestBase{
	
		
	public static long IMPLICIT_WAIT=20;
	public static long PAGELOAD_TIMEOUT= 30;
	
	public void takesScreenShot(String testName){
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scr, new File("E:\\ECommerce-Guru99\\Screenshots\\"+testName+".PNG"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
