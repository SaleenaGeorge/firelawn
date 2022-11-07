package com.testscripts;

import org.testng.ITestListener;
import org.testng.ITestResult;

import generic.ScreenshotMethod;



public class Listeners extends BaseTest implements ITestListener{

		

		public void onTestFailure(ITestResult result) {
			
			
			ScreenshotMethod.pageScreenshot(driver);
		}
	}

