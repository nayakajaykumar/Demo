package com.Ecommerce.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Ecommerce.qa.base.TestBase;

public class MobilePage extends TestBase {
	
	public MobilePage(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@title='Sort By']")
	WebElement sortByLink;
	
	@FindBy(xpath="//img[@alt='Xperia']")
	WebElement XperiaLink;
	
	@FindBy(xpath="//span[@id='product-price-1']//span")
	WebElement XperiaPrice;
	
	public String mobilePageTitle(){
		return driver.getTitle();
	}
	
	public void clickOnSortByLink_Name(){
		Select sortByDropDown=new Select(sortByLink);
		sortByDropDown.selectByVisibleText("Name");
	}
	public String getXperiaPrice(){
		return XperiaPrice.getText();
	}
	public String xperiaDetailsPage(){
		XperiaLink.click();
		return XperiaPrice.getText();
	}

}
