package com.testscripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pages.LoginPage;
import com.pages.CreateAccountpage;

import generic.ExcelLibrary;
import generic.ScreenshotMethod;



public class CreateAccountTestCase  extends BaseTest{
	
	@Test(dataProvider = "Register")
	public void registerTestCase(String fn,String ln, String pn, String em, String pass) throws InterruptedException, IOException {
		LoginPage lp=new LoginPage(driver);
		Thread.sleep(12000);
//		WebDriverWait wait = new WebDriverWait(driver,50);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='navbar_Loginbutton__xIXoV']")));
		lp.clickLogin();
		
		
		CreateAccountpage ap=new CreateAccountpage(driver);
	
		ap.clickcreateaccount();
		ap.enterfirstname(fn);
		ap.enterlastname(ln);
		ap.enterphoneno(pn);
		ap.enteremail(em);
		ap.enterpassword(pass);
		ap.clickCheckbox();
		ap.clickregister();
		
		SoftAssert sa=new SoftAssert();
		
		
	    
		
		String actualtoast=ap.gettexttoast();
		System.out.println(actualtoast);
		String expectedtoast="Successfully Registered";
		sa.assertEquals(actualtoast, expectedtoast);
		sa.assertAll();
		
		
		
		
		
		
	}
	
	@DataProvider(name = "Register")
	public Object[][] testData() throws IOException {
		ExcelLibrary lib=new ExcelLibrary();
		
			return lib.readMultipleData("Register");
		
		
	}
	
	

}
