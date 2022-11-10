package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class BasePage extends UtilityMethods {
	//test1234
	
	public BasePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	

}
