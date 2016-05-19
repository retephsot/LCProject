package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchaseDetailsTab extends PageBase
{
	public PurchaseDetailsTab (WebDriver driver)
	{
		super(driver);
	}

	public RelatedDocumentsTab ClickContinueLinkwithOutFillingOut() throws InterruptedException
	{
		
		//Find Continue to Annuitant button and click on it
		driver.findElement(By.partialLinkText("Continue to Related Documents")).click();
		
		Thread.sleep(3000);	
		return new RelatedDocumentsTab(driver);
		
	}
	
	
}
