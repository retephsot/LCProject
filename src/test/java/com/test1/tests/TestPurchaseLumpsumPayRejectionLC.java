package com.test1.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.test1.pages.DefaultLandingPage;

import org.testng.annotations.BeforeMethod;

import java.awt.Toolkit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestPurchaseLumpsumPayRejectionLC extends TestBase

{
	
  @Test (dataProvider = "dataProvider")
  public void testSuccessfulPurchaseLumpsumPayRejectionLC(String casenumber, String day, String month, String year,
		  String amount) throws InterruptedException, IOException 
  {
	
	//The entry point DefaultLandingPage object below can now be removed because its added to TestBase can now inherit this
    //DefaultLandingPage defaultlandingpage = new DefaultLandingPage(driver);
	  
	boolean testResult = defaultlandingpage.ClickResearchCasesLink()
										   .clickCaseNumbertLink(casenumber)
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .CreateLumpsumPaymentLifeCon(amount, month, year, day)
			 						       .isAddPurchaseLumpsumRejectionMessageSuccessful(); 
  
	 System.out.println(testResult);
	 
	 Thread.sleep(2000);
	 
	 Assert.assertTrue(testResult, "Add payment rejection is not successful for casenumber: " + casenumber);
	 
  }
  
  //AfterMethod is now inherited from TestBase class
//  @AfterMethod
//  public void afterMethod() 
//  {
//	  driver.close();
//  }
}
