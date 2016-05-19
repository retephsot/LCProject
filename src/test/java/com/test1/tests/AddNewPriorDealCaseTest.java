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

public class AddNewPriorDealCaseTest extends TestBase

{

  @Test (dataProvider = "dataProvider")
  public void testSuccessfulAddNewPriorDealCase(String casenumber, String annuFirstName, String annuLastName) 
				  throws InterruptedException, IOException 
  {

	
	//The entry point DefaultLandingPage object below can now be removed because its added to TestBase can now inherit this
    // defaultlandingpage = new DefaultLandingPage(driver);
	  
	boolean testResult = defaultlandingpage.ClickResearchCasesLink()
										   .AddNewPriorDealCase(casenumber, annuFirstName, annuLastName)
										   .ClickResearchCasesLink()
			 						       .isAddNewCaseSuccessful(casenumber, annuFirstName, annuLastName); 
  
	 System.out.println(testResult);	
	 
	 Thread.sleep(1000);	
	 
	 Assert.assertTrue(testResult, casenumber + " has not been successfully created." );
	 
  }
  
 


}
