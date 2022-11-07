package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.FrameworkConstants;

public class LoginPage extends BasePage{
	
		public LoginPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			super(driver);
		}
		
		
		
		@FindBy(xpath="//button[@class='navbar_Loginbutton__xIXoV']")
		WebElement login;
		
        public void clickLogin() {
			clickAction(login);
		}
        
		@FindBy (xpath = "//input[@id='username']")
		WebElement username;
		
		public void enterShopperUsername() {
			enterValue(username, FrameworkConstants.shopperusername);
         }
		public void enterMerchantUsername() {
			enterValue(username, FrameworkConstants.merchantusername);
         }
		public void enterAdminUsername() {
			enterValue(username, FrameworkConstants.adminusername);
         }
		
		@FindBy (xpath = "//input[@id='password']")
		WebElement password;
		
		public void entershopperPassword() {
			enterValue(password, FrameworkConstants.shopperpassword);
         }
		public void entermerchantPassword() {
			enterValue(password, FrameworkConstants.merchantpassword);
         }
		public void enteradminPassword() {
			enterValue(password, FrameworkConstants.adminpassword);
         }
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement loginsubmit;
		
        public void clickLoginSubmit() {
			clickAction(loginsubmit);
		}
        
        @FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-892d40']")
		WebElement shopperaccountsettings;
		
        public void clickShopperAccountSettings() {
			clickAction(shopperaccountsettings);
		}
        
        @FindBy(xpath="(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[6]")
		WebElement shopperlogout;
		
        public void clickShopperLogout() {
			clickAction(shopperlogout);
		}
        
        
		
		
		}
