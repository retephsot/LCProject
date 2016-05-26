package com.test1.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotesTab extends PageBase
{
	public NotesTab (WebDriver driver)
	{
		super(driver);
	}

	public DefaultLandingPage ClickConvertCaseToLeadCreateNewClaimant() throws InterruptedException
	{
		
		//Find Continue to Annuitant button and click on it
		driver.findElement(By.linkText("Convert Case to Lead")).click();
		Thread.sleep(1000);	
		
		//Find the Search button and click
		driver.findElement(By.linkText("Search")).click();
		Thread.sleep(1000);	
		
		//Find the Create New Claimant button and click
		driver.findElement(By.linkText("Create New Claimant")).click();
		
		//Click ok on the pop-up
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		
		Thread.sleep(1000);	
		return new DefaultLandingPage(driver);
		
	}
	
	public NotesTab ClickConvertCaseToLeadAssociate() throws InterruptedException
	{
		
		//Find Continue to Annuitant button and click on it
		driver.findElement(By.linkText("Convert Case to Lead")).click();
		
		Thread.sleep(3000);	
		return new NotesTab(driver);
		
	}
	
	
	public NotesTab ClickAddNoteButtonAddNote(String notes) throws InterruptedException
	{
		
		//Find Continue to Annuitant button and click on it
		driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[2]/div[7]/div/div/div[1]/a")).click();
		
		Thread.sleep(1000);	
		
		//Find the notes text box and enter notes
		driver.findElement(By.xpath("//*[@id='annuitantNoteBox']")).sendKeys(notes);
		Thread.sleep(1000);	
		
		//Find the Submit button and click
		driver.findElement(By.linkText("Submit")).click();
		Thread.sleep(1000);	
		
		return new NotesTab(driver);
		
	}
	
	public boolean isAddNotesSuccessful(String notes, String casenumber) throws InterruptedException
	{
		
		boolean testresults;
		
		// refresh the page
		//driver.navigate().refresh();
				
		//Thread.sleep(2000);
		
		//Liberty QA launch base table
		//WebTable table = new WebTable(driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[3]/"
		//		+ "div/div/div/div[6]/div/div[1]/div/table")));
				
		//Thread.sleep(3000);
		
		if (driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[2]/div[7]/"
				+ "div/div/div[2]/ul/li/div[2]/p")).isDisplayed())
		{
		String noteValue = driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[2]/div[7]/"
				+ "div/div/div[2]/ul/li/div[2]/p")).getText();
		
		System.out.println("The note value is: " + driver.findElement(By.xpath("//*[@id='page-container']"
				+ "/div/div/div[2]/div[7]/div/div/div[2]/ul/li/div[2]/p")).getText());
		
		Thread.sleep(1000);
		
		
		
		
		testresults = noteValue.contains(notes);
		
		System.out.println(testresults);
		
		
		Thread.sleep(1000);	
		
		return testresults;
		}
		
		else
		{
			
			System.out.println("Notes has not been added for case number :" + casenumber);
			
			testresults = false;
			return testresults;
			
		}
		
	}
	
	
	
}
