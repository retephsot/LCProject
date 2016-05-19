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

public class AddCaseSummaryInfoToCase extends TestBase

{
	

  @Test (dataProvider = "dataProvider")
  public void testSuccessfulCaseSummaryInfo(String casenumber, String state, String county, String instructions,
		  String researchstat, String month, String day, String year, String annuFirstName, String annuLastName) 
				  throws InterruptedException, IOException 
  {

	
	//The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
    //LogInPage logInPage = new LogInPage(driver);
	  
	boolean testResult = defaultlandingpage.clickCaseNumbertLink(casenumber)
			 						       .filloutTabAndClickContinueLink(state, county, instructions, researchstat, month, day, year)
			 						       .ClickResearchCasesLink()
			 						       .isAddCaseSummaryInfoNewSuccessful(casenumber, state, county, instructions, researchstat, year, day, month, annuFirstName, annuLastName); 
  
	 System.out.println(testResult);
	 
	 Thread.sleep(2000);
	 
	 Assert.assertTrue(testResult, "Case Summary information has not been successfully entered for : " + casenumber);
	 
  }
  
 

  //AfterMethod is not inherited from TestBase class
//  @AfterMethod
//  public void afterMethod() 
//  {
//	  driver.close();
//  }

}
