package com.Ecommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecommerce.qa.base.TestBase;

public class HomePage extends TestBase {
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Mobile')]")
	WebElement mobileLink;
	
	public String homePageTitle(){
		return driver.getTitle();
	}
	public MobilePage clickOnMobile(){
		mobileLink.click();
		return new MobilePage();
	}

}
