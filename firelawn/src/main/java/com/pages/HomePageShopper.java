package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.FrameworkConstants;

public class HomePageShopper extends BasePage{
	public HomePageShopper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	
	
	@FindBy(xpath="//select[@class='navbar_selectBlock__x8JzW']")
	WebElement filterDrop;
	
    public void clickfilterDrop() {
		clickAction(filterDrop);
	}
    
	@FindBy (xpath = "//li[text()='men']")
	WebElement men;
	
	public void clickmen() {
		clickAction(men);
	}
	
	@FindBy (id = "searchbar")
	WebElement search;
	
	public void enterSearchitem() {
		enterValue(search, FrameworkConstants.searchitem);
     }
	@FindBy (css = "svg[data-testid='SearchIcon']")
	WebElement searchicon;
	
	public void clicksearchicon() {
		clickAction(searchicon);
	}
	@FindBy(xpath="//button[text()='add to cart']")
	WebElement addtocart;
	
    public void clickaddtocart() {
		clickAction(addtocart);
	}
    
    @FindBy(xpath="//a[@href=\"/cart\"]")
	WebElement addtocarticon;
	
    public void clickaddtocarticon() {
		clickAction(addtocarticon);
	}
    
    @FindBy(xpath="//h3[text()='roadster']")
   	WebElement itemheading;
    public String gettextheading() {
		String headingtext=itemheading.getText();
		return(headingtext);
	}
   	
     
    
}
