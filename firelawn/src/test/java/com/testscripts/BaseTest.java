package com.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import generic.FrameworkConstants;
import generic.UtilityMethods;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest extends UtilityMethods {
	
public static WebDriver driver;
	
	@Parameters("browser") //browser name must be given at runtime
	@BeforeClass(alwaysRun = true)
	public void setUpBrowser(@Optional("chrome") String browserName) {
	
		if(browserName.contains("chrome")) {
			//System.setProperty(FrameworkConstants.CHROME_KEY, FrameworkConstants.CHROME_PATH);
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		} else if(browserName.contains("firefox")) {
			//System.setProperty(FrameworkConstants.FIREFOX_KEY, FrameworkConstants.FIREFOX_PATH);
			WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
		}
		else {
			System.out.println("Browser name not specified");
		}
		
		driver.manage().window().maximize();
		driver.get(FrameworkConstants.URL);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
	}
	@AfterClass(alwaysRun = true)
	public void browserTearDown() {
		driver.quit();
	}
	
}