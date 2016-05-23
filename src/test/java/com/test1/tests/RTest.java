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

public class RTest extends TestBase

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
				  throws InterruptedException, IOException 
  {
	
	//The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
    //LogInPage logInPage = new LogInPage(driver);
	  
	  boolean testResult = defaultlandingpage.ClickResearchCasesLink()
											 .AddNewCase(casenumber, annuFirstName, annuLastName)
											 .ClickResearchCasesLink()
											 .isAddNewCaseSuccessful(casenumber, annuFirstName, annuLastName); 
  
	 System.out.println(testResult);	
	 
	 Assert.assertTrue(testResult, casenumber + " has not been successfully created." );
	 
  }
  
  @Test (priority=2, dataProvider = "dataProvider")
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

  @Test (priority=3, dataProvider = "dataProvider")
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
  
 

  @Test (priority=4, dataProvider = "dataProvider")
  public void testSuccessfulCreateNewClaimant(String casenumber, String state, String county, String annuFirstName, 
		  String annuLastName, String ssN, String gender, String mStatus, String bMonth, String bDay, String bYear) 
				  throws InterruptedException, IOException 
  {

	
	//The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
    //LogInPage logInPage = new LogInPage(driver);
	  
	boolean testResult = defaultlandingpage.ClickResearchCasesLink()
										   .clickCaseNumbertLink(casenumber)
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .FillOutAnnuInfoNClickContinue(ssN, gender, mStatus, bMonth, bDay, bYear)
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .ClickContinueToNotes()
			 						       .ClickConvertCaseToLeadCreateNewClaimant()
			 						       .clickCaseNumbertLink(casenumber)
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .IsCreateNewClaimantSuccessful(annuFirstName, annuLastName, ssN, state, county, bMonth, bDay, bYear); 
  
	 System.out.println(testResult);
	 
	 Thread.sleep(2000);
	 
	 Assert.assertTrue(testResult, "New Claimant has not been created for : " + casenumber);
	 
  }
  
  
  
  
  @Test (priority=5, dataProvider = "dataProvider")
  public void testSuccessfulLumpsumPayAddLC(String casenumber, String day, String month, String year,
		  String amount) throws InterruptedException, IOException 
  {

	
	//The entry point DefaultLandingPage object below can now be removed because its added to TestBase can now inherit this
    //DefaultLandingPage defaultlandingpage = new DefaultLandingPage(driver);
	  
	boolean testResult = defaultlandingpage.ClickResearchCasesLink()
										   .clickCaseNumbertLink(casenumber)
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .CreateLumpsumPaymentLifeCon(amount, month, year, day)
			 						       .isAddLumpsumPaymentSuccessful(amount, year, day, month); 
  
	 System.out.println(testResult);
	 
	 Thread.sleep(2000);
	 
	 Assert.assertTrue(testResult, "Case Summary information has not been successfully entered for : " + casenumber);
	 
  }
  
  
  
  
  
  
  @Test (priority=6, dataProvider = "dataProvider")
  public void testSuccessfulDocAttachment(String casenumber, String title, String type,
		  String attachmentname) throws InterruptedException, IOException 
  {

	
	//The entry point DefaultLandingPage object below can now be removed because its added to TestBase can now inherit this
    //DefaultLandingPage defaultlandingpage = new DefaultLandingPage(driver);
	  
	boolean testResult = defaultlandingpage.ClickResearchCasesLink()
										   .clickCaseNumbertLink(casenumber)
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .AttachDocumentToCase(title, attachmentname, type)
			 						       .isAttachDocumentSuccessful(title, type, casenumber, attachmentname); 
  
	 System.out.println(testResult);
	 
	 Thread.sleep(2000);
	 
	 Assert.assertTrue(testResult, "Document has not bee succesfully attached for : " + casenumber);
	 
  }
  
  @Test (priority=7, dataProvider = "dataProvider")
  public void testSuccessfulNotesAdd(String casenumber, String notes)throws InterruptedException, IOException
  {

	
	//The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
    //LogInPage logInPage = new LogInPage(driver);
	  
	boolean testResult = defaultlandingpage.ClickResearchCasesLink()
										   .clickCaseNumbertLink(casenumber)
										   .ClickContinueLinkwithOutFillingOut()
										   .ClickContinueLinkwithOutFillingOut()
										   .ClickContinueLinkwithOutFillingOut()
										   .ClickContinueLinkwithOutFillingOut()
										   .ClickContinueLinkwithOutFillingOut()
										   .ClickContinueToNotes()
										   .ClickAddNoteButtonAddNote(notes)
										   .ClickResearchCasesLink()
										   .clickCaseNumbertLink(casenumber)
										   .ClickContinueLinkwithOutFillingOut()
										   .ClickContinueLinkwithOutFillingOut()
										   .ClickContinueLinkwithOutFillingOut()
										   .ClickContinueLinkwithOutFillingOut()
										   .ClickContinueLinkwithOutFillingOut()
										   .ClickContinueToNotes()
										   .isAddNotesSuccessful(notes); 
  
	 System.out.println(testResult);
	 
	 Thread.sleep(2000);
	 
	 Assert.assertTrue(testResult, "Note has not been successfully added for : " + casenumber);
	 
  }
  
  
  @Test (priority=8, dataProvider = "dataProvider")
  public void testSuccessfulPurchaseLumpsumPayAdd(String casenumber, String day, String month, String year,
		  String amount) throws InterruptedException, IOException 
  {

	
	//The entry point DefaultLandingPage object below can now be removed because its added to TestBase can now inherit this
    //DefaultLandingPage defaultlandingpage = new DefaultLandingPage(driver);
	  
	boolean testResult = defaultlandingpage.ClickResearchCasesLink()
										   .clickCaseNumbertLink(casenumber)
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .CreateLumpsumPaymentLifeCon(amount, month, year, day)
			 						       .ClickContinueLinkwithOutFillingOut()
			 						       .CreateLumpsumPaymentLifeCon(amount, month, year, day)
			 						       .isAddPurchaseLumpsumPaymentSuccessful(amount, year, day, month); 
  
	 System.out.println(testResult);
	 
	 Thread.sleep(2000);
	 
	 Assert.assertTrue(testResult, "Purchase payment has not been successfully created for : " + casenumber);
	 
  }


}
