package com.Ecommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Ecommerce.qa.base.TestBase;

public class TVPage extends TestBase {
	
	@FindBy(xpath="//a[@title='LG LCD']//following-sibling::div//button")
	WebElement LG_AddWishList;
	
	@FindBy(xpath="//a[@title='Samsung LCD']//following-sibling::div//button")
	WebElement Samsung_AddWishList;
	
	@FindBy(xpath="//a[@title='LG LCD'and text()='LG LCD']")
	WebElement lgLcd;
	
	@FindBy(xpath="")
	WebElement sortByTvPage;
}
