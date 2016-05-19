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
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AddNewCaseTestConnDB extends TestBase

{
	//the below are inherited from TestBase class
//	private WebDriver driver;


	//BeforeMethod is not inherited from TestBase class
//  @BeforeMethod
//  public void beforeMethod() 
//  {
//	//To launch on google Chrome
//		System.setProperty("webdriver.chrome.driver",
//		"C:\\seleniumJar\\chromedriver_win32\\chromedriver.exe");
//					
//		driver = new ChromeDriver();
//		  
//		baseUrl = "http://www.powercontrol.net:81/login";
//		
//				
//		//Set implicityWait time to 45 seconds
//		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//		
//		//Enlarge the application screen
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		int Width = (int) toolkit.getScreenSize().getWidth();
//		int Height = (int)toolkit.getScreenSize().getHeight();
//		driver.manage().window().setSize(new Dimension(1600,1300));
//		
//		driver.get(baseUrl);
//  }

  @Test (dataProvider = "dataProvider")
  public void testSuccessfulAddNewCase(String casenumber, String annuFirstName, String annuLastName) 
				  throws InterruptedException, IOException, ClassNotFoundException, SQLException 
  {
	
	//The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
    //LogInPage logInPage = new LogInPage(driver);
	  
	boolean testResult = defaultlandingpage.AddNewCase(casenumber, annuFirstName, annuLastName)
			 						.isAddNewCaseSuccessfulCheckDB(casenumber, annuFirstName, annuLastName); 
  
	 System.out.println(testResult);	
	 
	 Assert.assertTrue(testResult, casenumber + " has not been successfully created." );
	 
  }
  
 

  //AfterMethod is not inherited from TestBase class
//  @AfterMethod
//  public void afterMethod() 
//  {
//	  driver.close();
//  }

}
