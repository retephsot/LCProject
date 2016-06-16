package com.test1.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RelatedDocumentsTab extends PageBase
{
	public RelatedDocumentsTab (WebDriver driver)
	{
		super(driver);
	}

//	public NotesTab ClickContinueLinkwithOutFillingOut() throws InterruptedException
//	{
//		
//		//Find Continue to Annuitant button and click on it
//		driver.findElement(By.partialLinkText("Continue to Notes")).click();
//		
//		Thread.sleep(3000);	
//		return new NotesTab(driver);
//		
//	}
	
	public RelatedDocumentsTab AttachDocumentToCase(String title, String attachmentname, String type) throws InterruptedException
	{
		//To remove trailing zero .0
//		day = day.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
//		year = year.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		
		//Select file to upload
		//String filePath = System.getProperty("user.dir") + "/src/res/test.pdf"; 
		driver.findElement(By.id("file-upload")).sendKeys("C:\\testfolder\\" + attachmentname);
		
		Thread.sleep(2000);
		
		//Find the Title field and enter title of attachment
		driver.findElement(By.id("doc-title")).sendKeys(title);
		
		Thread.sleep(1000);
		
		//Find the type field, enter type value
		driver.findElement(By.name("doc-type")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("doc-type")).sendKeys(type);
		Thread.sleep(1000);
		driver.findElement(By.name("doc-type")).click();
		
		//find the Upload New Document button and click
		driver.findElement(By.partialLinkText("Upload New Document")).click();
		
			
    	Thread.sleep(2000);
		return new RelatedDocumentsTab(driver);
		
	}
	
	public boolean isAttachDocumentSuccessful(String title, String type, String casenumber,
			String attachmentname) 
			throws InterruptedException
	{
		
		boolean testresults;
		
		if (driver.findElement(By.xpath("//*[@id='page-container']/div/div/"
				+ "div[2]/div[6]/div/div/div/div[2]/div/div/div[6]/div/div[1]/div/table")).isDisplayed())
		{		
		String myMonth;
		String myDay;
		String myYear;
		String expectedval;
		
		Calendar cal1 = Calendar.getInstance();
		// The month value is string
		// str.replaceAll("^0+(?!$)", "") to remove leading zeros
		myMonth = new SimpleDateFormat("MM").format(cal1.getTime());
		//System.out.println("The current value of Month is: " + myMonth);
		
		Thread.sleep(3000);
		//to remove leading zero
		myMonth = myMonth.replaceAll("^0+(?!$)", "");
		
		//System.out.println("The value of Month now is: " + myMonth);
		
		//To get the day value
		Calendar cal7 = Calendar.getInstance();
		myDay = new SimpleDateFormat("dd").format(cal7.getTime());
		//System.out.println("The current value of Day is: " + myDay);
		
		//To remove leading zero
	    myDay = myDay.replaceAll("^0+(?!$)", "");
		
		//System.out.println("The value of Day now is: " + myDay);
		
		Thread.sleep(1000);
		
		//to get the year value
		Calendar cal8 = Calendar.getInstance();
		//System.out.println(new SimpleDateFormat("yyyy").format(cal8.getTime()));
		
		myYear = new SimpleDateFormat("yyyy").format(cal8.getTime());
		
		//System.out.println("The value of Year is: " + myYear);
		
		Thread.sleep(1000);
		
		String myTestdate = (myMonth + "/" + myDay + "/" + myYear);
		
		//System.out.println("The date value is: " + myTestdate);
		
		//to remove trailing .0
		//month = month.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		//day = day.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		//year = year.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		//month = month.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		
		//String date = myMonth + "/" + myDay + "/" + myYear;
		// refresh the page
		//driver.navigate().refresh();
		
		//Thread.sleep(1000);
		
		System.out.println("The value of date is: " + myTestdate);
				
		Thread.sleep(3000);
		
		//Liberty QA launch base table
		WebTable table = new WebTable(driver.findElement(By.xpath("//*[@id='page-container']/div/div/"
				+ "div[2]/div[6]/div/div/div/div[2]/div/div/div[6]/div/div[1]/div/table")));
				
		Thread.sleep(2000);
		
		
		//Print out all webtable values
//		System.out.println("");
//		System.out.println("==== getTextDisplayedInAllRows ====");
//		String[][] tableText = table.getTextDisplayedInAllRows();
//		for(String[] row:tableText)
//		{
//			for(String cell:row)
//			{
//				System.out.print(cell+"   ");
//			}
//			System.out.println("");
//		}
		
		//Thread.sleep(3000);
		
		System.out.println("getRowElement for date: " + 
				table.getRowElement(title).getText());
		
		Thread.sleep(1000);
		
		//String Claimant = annuFirstName + " " + annuLastName;		
		//System.out.println("The Claimant name is: " + Claimant);
				
		String retreiveRole = table.getRowElement(title).getText();
		
		Thread.sleep(1000);
		
		
		//int amount2 = Integer.parseInt(amount);
		
		//String amount3 = String.format("%,d", amount2);
		
		//DecimalFormat formatter = new DecimalFormat("#,###,###");	        
	    //String amount2 = formatter.format(amount);
			
	   
		expectedval = title + " " + type + " MEGAN " + myTestdate;
		
		Thread.sleep(1000);
		System.out.println("The expected value is :" + expectedval);
		
		Thread.sleep(1000);
		
		
		testresults = retreiveRole.contains(expectedval);
		
		Thread.sleep(1000);
		
		System.out.println(testresults);
		
		
		Thread.sleep(1000);	
		
		return testresults;
			
		}
		
		else
		{
			System.out.println("The document has not been attached and or does "
					+ "not show in the Related Documents Table for casenumber :" + casenumber);
			testresults = false;
			return testresults;	
		}
		
		
	}	
	
	public  NotesTab ClickContinueToNotes() throws InterruptedException
	{
		//Find the Continue to Notes button and click
		driver.findElement(By.linkText("Continue to Notes")).click();
		
		Thread.sleep(1000);	
		return new NotesTab(driver);
	}
	
	
	
}
