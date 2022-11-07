package com.testscripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pages.HomePageShopper;
import com.pages.LoginPage;

import generic.ScreenshotMethod;


public class addtocart extends BaseTest {
	
	@Test
	public void addtocartshopper() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		
		
		lp.clickLogin();
		lp.enterShopperUsername();
		lp.entershopperPassword();
		lp.clickLoginSubmit();
	
		
		Thread.sleep(12000);
		
		HomePageShopper hp=new HomePageShopper(driver);
		
		WebElement dropdown=driver.findElement(By.className("navbar_selectBlock__x8JzW"));
		Select sele=new Select(dropdown);
		sele.selectByValue("men");
		
		hp.enterSearchitem();
		hp.clicksearchicon();
		hp.clickaddtocart();
		
		Thread.sleep(12000);
		hp.clickaddtocarticon();
		
		
		
SoftAssert sa=new SoftAssert();
		
		
	
		String actualheading=hp.gettextheading();
		System.out.println(actualheading);
		String expectedheading="Roadster";
		sa.assertEquals(actualheading, expectedheading);
		sa.assertAll();
		
		
		lp.clickShopperAccountSettings();
		lp.clickShopperLogout();
		
	}

}
