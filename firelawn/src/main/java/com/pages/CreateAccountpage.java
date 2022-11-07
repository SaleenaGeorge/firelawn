package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.FrameworkConstants;

public class CreateAccountpage extends BasePage {
	public CreateAccountpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	
	
	@FindBy(xpath="//span[text()='Create Account']")
	WebElement createaccount;
	

	public void clickcreateaccount() {
		clickAction(createaccount);
	}
	@FindBy (id = "FirstName")
	WebElement firstname;
	
	public void enterfirstname(String fn) {
		enterValue(firstname, fn);
}
	@FindBy (id = "lastName")
	WebElement lastname;
	
	public void enterlastname(String ln) {
		enterValue(lastname, ln);
}
	@FindBy (id = "phoneNumber")
	WebElement phonenumber;
	
	public void enterphoneno(String pn) {
		enterValue(phonenumber, pn);
	}
		@FindBy (id = "email")
		WebElement email;
		
	public void enteremail(String em) {
			enterValue(email, em);
}
	@FindBy (id = "outlined-adornment-password")
	WebElement password;
	
public void enterpassword(String pass) {
		enterValue(password, pass);
	
}
@FindBy(css="input[type='checkbox']")
WebElement checkbox;


public void clickCheckbox() {
	clickAction(checkbox);
}
@FindBy(xpath="//button[@class='signup_bn5__u7WeP']")
WebElement register;


public void clickregister() {
	clickAction(register);
}
@FindBy(xpath="//div[text()='Successfully Registered']")
	WebElement toast;
public String gettexttoast() {
	return toast.getAttribute("innerHTML");

}}
